package telran.b7a.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import telran.b7a.employee.dto.InfoEmployeeDto;
import telran.b7a.employee.dto.RegisterEmployeeDto;
import telran.b7a.employee.dto.UpdateEmployeeDto;
import telran.b7a.employee.service.EmployeeAccountService;

@RestController
@RequestMapping("/cvbank/employee")
@CrossOrigin(origins = "*", methods = { RequestMethod.DELETE, RequestMethod.GET, RequestMethod.OPTIONS,
		RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = "*", exposedHeaders = "*")

public class EmployeeAccountingController {
	EmployeeAccountService employeeAccountService;

	@Autowired
	public EmployeeAccountingController(EmployeeAccountService employeeAccountService) {
		this.employeeAccountService = employeeAccountService;
	}

	@PostMapping("/signup")
	public InfoEmployeeDto registerEmployee(@RequestBody @Valid RegisterEmployeeDto newEmployee)  {
		return employeeAccountService.registerEmployee(newEmployee);
	}

	@PostMapping("/signin")
	public InfoEmployeeDto loginEmployee(Authentication authentication) {
		return employeeAccountService.getEmployee(authentication.getName());
	}

	@PutMapping("/{id}")
	public InfoEmployeeDto updateEmployee(@RequestBody UpdateEmployeeDto employeeData, @PathVariable String id) {
		return employeeAccountService.updateEmployee(employeeData, id);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeAccountService.deleteEmployee(id);
	}

	@GetMapping("/{id}")
	public InfoEmployeeDto findEmployee(@PathVariable String id) {
		return employeeAccountService.getEmployee(id);
	}

	@PutMapping("/login")
	public InfoEmployeeDto updateLogin(Authentication authentication, @RequestHeader("X-Login") String newLogin) {
		return employeeAccountService.changeEmployeeLogin(authentication.getName(), newLogin);
	}
	
	@PutMapping("/pass")
	public void updatePassword(Authentication authentication, @RequestHeader("X-Password") String newPassword) {
		employeeAccountService.changeEmployeePassword(authentication.getName(), newPassword);
	}
}