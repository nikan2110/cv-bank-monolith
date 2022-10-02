package telran.b7a.employee.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterEmployeeDto {
    @Email
    @NotBlank(message = "Email is required")
	String email;
    @NotBlank(message = "First name is required")
	String firstName;
    @NotBlank(message = "Last name is required")
	String lastName;
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be minimum 6 symbols")
	String password;
}
