package com.erp.solar.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.account.PrivateAccount;


@Repository
public interface PrivateAccountRepository extends JpaRepository<PrivateAccount , Integer>{

}
