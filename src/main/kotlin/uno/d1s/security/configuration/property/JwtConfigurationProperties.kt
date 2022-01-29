package uno.d1s.security.configuration.property

import org.springframework.boot.context.properties.ConfigurationProperties
import javax.validation.constraints.NotBlank

@ConfigurationProperties("security.jwt")
class JwtConfigurationProperties(
    @NotBlank var secret: String
)