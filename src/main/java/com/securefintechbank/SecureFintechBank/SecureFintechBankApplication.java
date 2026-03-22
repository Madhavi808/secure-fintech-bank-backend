package com.securefintechbank.SecureFintechBank;

import com.securefintechbank.SecureFintechBank.auth_users.entity.User;
import com.securefintechbank.SecureFintechBank.enums.NotificationType;
import com.securefintechbank.SecureFintechBank.notification.dtos.NotificationDTO;
import com.securefintechbank.SecureFintechBank.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class SecureFintechBankApplication {

//	private final NotificationService notificationService;

	public static void main(String[] args) {

		SpringApplication.run(SecureFintechBankApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(){
//        return args -> {
//            NotificationDTO notificationDTO = NotificationDTO.builder()
//                    .recipient("madhavivaghela1@gmail.com")
//                    .subject("Hello testing email")
//                    .body("Hey, this is a test email 😁")
//                    .type(NotificationType.EMAIL)
//                    .build();
//
//            notificationService.sendEmail(notificationDTO, new User());
//        };
//    }

}
