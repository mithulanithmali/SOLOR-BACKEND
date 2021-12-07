package com.erp.solar.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.account.CorporateAccount;

@Repository
public interface CorporateAccountRepository extends JpaRepository<CorporateAccount , Integer>{

}
