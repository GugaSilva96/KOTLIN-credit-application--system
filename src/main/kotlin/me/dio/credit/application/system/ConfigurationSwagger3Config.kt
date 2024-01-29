package me.dio.credit.application.system

import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationSwagger3Config {
    @Bean
    fun publicApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("springcreditapplicationsystem-public")
            .packagesToScan("me.dio.credit.application.system")
            .pathsToMatch("/api/customers/**", "/api/credits/**")
            .build()
    }
}
