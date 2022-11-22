package telran.b7a.admin.service;

import telran.b7a.admin.dto.AdminSignInResponseDto;

public interface AdminService {

    AdminSignInResponseDto adminSignIn(String login);

}
