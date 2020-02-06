package com.example.Whathg_Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.Mapper_Imalmation.CompanyLMP;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.repository.CompanyRepository;



@Service
public class CompanyService {
	
	

@Autowired
CompanyRepository companyRepository;

private static final CompanyLMP companyLMP = new CompanyLMP();

	public CompanyDTO createCompanyDTO(CompanyDTO companyDTO) {
		
		
		Company company = Company.builder()
				
				.email(companyDTO.getEmail())
	            .phoneNumber(companyDTO.getPhoneNumber())
	            .address(companyDTO.getAddress())
	            .password(companyDTO.getPassword())
	            
	            
				.cR(companyDTO.getCR())
				.comanyName(companyDTO.getComanyName())
	            .startDate(companyDTO.getStartDate())
	            .endDate(companyDTO.getEndDate())
	            
	            .build();
		
		Company saveCompany= companyRepository.save(company);
	    return companyLMP.domainToDto(saveCompany);
	    
	}
	
	
	
	
	
	public CompanyDTO updateEmailcompanyDTO(String cr, String email) {
		Company company = Company.builder().cR(cr).email(email)
				
				.build();
	
		companyRepository.updateEmail(company.getCR(),company.getEmail());
       return companyLMP.domainToDto(company);
	}
	
	
	
	

	/*
	 * public CompanyDTO FindID_comany (int iDD) throws Exception {
	 * 
	 * return companyRepository .findById(iDD) .map(companyLMP::domainToDto)
	 * 
	 * orElseThrow(() -> new Exception("Refund request not found"));
	 * 
	 * 
	 * }
	 */}
