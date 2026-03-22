package com.securefintechbank.SecureFintechBank.notification.services;

import com.securefintechbank.SecureFintechBank.auth_users.entity.User;
import com.securefintechbank.SecureFintechBank.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}
