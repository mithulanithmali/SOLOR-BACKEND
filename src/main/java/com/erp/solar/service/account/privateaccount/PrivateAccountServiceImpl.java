package com.erp.solar.service.account.privateaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.exception.ResourceNotFoundException;
import com.erp.solar.model.account.PrivateAccount;
import com.erp.solar.repository.account.PrivateAccountRepository;

@Service
public class PrivateAccountServiceImpl implements PrivateAccountService {

	@Autowired
	private PrivateAccountRepository privateAccountRepo;

	@Override
	public PrivateAccount addPrivateAccountService(PrivateAccount privateAccount) {
		return privateAccountRepo.save(privateAccount);
		
	}

	@Override
	public PrivateAccount updatePrivateAccountService(PrivateAccount privateAccount) {
		
	
		 
		PrivateAccount existingPrivateAcc = privateAccountRepo.findById(privateAccount.getId())
					.orElseThrow(() -> new ResourceNotFoundException("account not found with id :" + privateAccount.getId()));
		existingPrivateAcc.setAccount_id(privateAccount.getAccount_id());
		existingPrivateAcc.setHouseNumber(privateAccount.getHouseNumber());
		existingPrivateAcc.setStreet(privateAccount.getStreet());
		existingPrivateAcc.setCity(privateAccount.getCity());
		existingPrivateAcc.setPostal_code(privateAccount.getPostal_code());
		existingPrivateAcc.setAccount_code(privateAccount.getAccount_code());
		existingPrivateAcc.setAbc_classification(privateAccount.getAbc_classification());
		existingPrivateAcc.setStatus(privateAccount.getStatus());
		existingPrivateAcc.setPhone(privateAccount.getPhone());
		existingPrivateAcc.setEmail_main_com(privateAccount.getEmail_main_com());
		existingPrivateAcc.setAccount_title(privateAccount.getAccount_title());
		existingPrivateAcc.setFirst_name(privateAccount.getFirst_name());
		existingPrivateAcc.setLast_name(privateAccount.getLast_name());
		existingPrivateAcc.setProfession(privateAccount.getProfession());
		existingPrivateAcc.setGender(privateAccount.getGender());
		existingPrivateAcc.setDateOfBirth(privateAccount.getDateOfBirth());
		existingPrivateAcc.setMobile(privateAccount.getMobile());
		existingPrivateAcc.setWhatsapNumber_main_com(privateAccount.getWhatsapNumber_main_com());
		existingPrivateAcc.setMethod_of_main_com(privateAccount.getMethod_of_main_com());
		return privateAccountRepo.save(existingPrivateAcc);
	
	}
	

}
