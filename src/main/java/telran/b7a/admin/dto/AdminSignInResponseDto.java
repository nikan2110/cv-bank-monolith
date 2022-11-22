package telran.b7a.admin.dto;

import java.util.ArrayList;
import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import telran.b7a.admin.dto.expert.AddUpdateExpertDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminSignInResponseDto {
    SkillsVerificationDto skillsVerification = new SkillsVerificationDto();
    CompaniesDto companies = new CompaniesDto();
    Collection<AddUpdateExpertDto> experts = new ArrayList<>();


}


