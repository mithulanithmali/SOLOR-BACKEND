package com.erp.solar.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.account.CorporateAccount;
import com.erp.solar.service.account.corporateaccount.CorporateAccountService;

@RestController
@RequestMapping("account/corporateaccount")
public class CorporateAccountController {
	@Autowired
	CorporateAccountService corporateAccountService;

	@PostMapping("/add")
	public CorporateAccount addAccount(@RequestBody CorporateAccount corporateAccount) {
		return corporateAccountService.addCorporateAccountService(corporateAccount);

	}
}
