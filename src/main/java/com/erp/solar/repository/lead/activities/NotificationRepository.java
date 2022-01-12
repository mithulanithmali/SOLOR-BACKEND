package com.erp.solar.repository.lead.activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.solar.model.lead.activities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{

}
