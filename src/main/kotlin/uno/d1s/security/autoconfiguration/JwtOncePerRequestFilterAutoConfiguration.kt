package uno.d1s.security.autoconfiguration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import uno.d1s.security.filter.JwtOncePerRequestFilter

@Configuration
class JwtOncePerRequestFilterAutoConfiguration {

    @Bean
    fun jwtOncePerRequestFilter() = JwtOncePerRequestFilter()
}