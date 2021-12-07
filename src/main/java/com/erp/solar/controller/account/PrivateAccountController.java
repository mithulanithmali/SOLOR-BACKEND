package com.erp.solar.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.account.PrivateAccount;
import com.erp.solar.service.account.privateaccount.PrivateAccountService;


@RestController
@RequestMapping("account/privateaccount")
public class PrivateAccountController {

	@Autowired
	PrivateAccountService privateAccountService;

	// add private account
	@PostMapping("/add")
	public PrivateAccount addPrivateAccount(@RequestBody PrivateAccount privateAccount) {
		return privateAccountService.addPrivateAccountService(privateAccount);

	}
	
	
	// update private account
	@PutMapping("/update")
	public PrivateAccount updateUser(@RequestBody PrivateAccount privateAccount) {
		return privateAccountService.updatePrivateAccountService(privateAccount);
	}

}
