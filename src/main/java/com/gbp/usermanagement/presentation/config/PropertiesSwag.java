package com.gbp.usermanagement.presentation.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PRIVATE;

@ConfigurationProperties(prefix = "swagger.ui")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class PropertiesSwag {
    String title = "Gestion Des Utilisateurs";
    String description = "Ajout et liste les utilisateurs";
    String version = "1.0.0";
    String contactName = "ASSA MOUNAIM";
    String contactUrl = "http://localhost:8080/swagger-ui.html#/user-controller";
    String contactEmail = "assa.mounaim@gmail.com";
}
