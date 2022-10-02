
package telran.b7a.employer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UpdateEmployerDto {
	
	ApplicantDto applicantInfo;
	CompanyDto companyInfo;

}
