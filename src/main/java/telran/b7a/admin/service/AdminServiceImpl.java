package telran.b7a.admin.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import telran.b7a.admin.dao.AdminMongoRepository;
import telran.b7a.admin.dao.ExpertMongoRepository;
import telran.b7a.admin.dto.AdminRegisterDto;
import telran.b7a.admin.dto.AdminRegisterResponseDto;
import telran.b7a.admin.dto.AdminSignInResponseDto;
import telran.b7a.admin.dto.exceptions.AdminAlreadyExistException;
import telran.b7a.admin.dto.exceptions.AdminNotFoundException;
import telran.b7a.admin.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

    AdminMongoRepository adminRepo;
    ExpertMongoRepository expertRepo;
    ModelMapper modelMapper;
    PasswordEncoder passwordEncoder;

    @Autowired
    public AdminServiceImpl(AdminMongoRepository adminRepo, ExpertMongoRepository expertRepo, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.adminRepo = adminRepo;
        this.expertRepo = expertRepo;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public AdminSignInResponseDto adminSignIn(String login) {
        Admin admin = adminRepo.findById(login).orElseThrow(AdminNotFoundException::new);
        return new AdminSignInResponseDto();
    }

}
