package com.securefintechbank.SecureFintechBank.notification.repo;

import com.securefintechbank.SecureFintechBank.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification, Long> {


}
