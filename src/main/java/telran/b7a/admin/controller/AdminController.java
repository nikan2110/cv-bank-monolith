package telran.b7a.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import telran.b7a.admin.dto.AdminSignInResponseDto;
import telran.b7a.admin.service.AdminService;

@RestController
@RequestMapping("/cvbank/admin")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.PUT},
        allowedHeaders = "*", exposedHeaders = "*")
public class AdminController {
    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/signin")
    public AdminSignInResponseDto adminLogin(Authentication authentication) {
        return adminService.adminSignIn(authentication.getName());
    }

}
