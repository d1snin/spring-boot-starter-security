package uno.d1s.security.autoconfiguration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import uno.d1s.security.filter.JwtOncePerRequestFilter
import uno.d1s.security.service.ApplicationService

@Configuration
@ConditionalOnBean(ApplicationService::class)
class WebSecurityAutoConfiguration : WebSecurityConfigurerAdapter() {

    @Autowired
    private lateinit var jwtOncePerRequestFilter: JwtOncePerRequestFilter

    override fun configure(http: HttpSecurity) {
        http.cors().disable()
            .csrf().disable()
            .formLogin().disable()
            .httpBasic().disable()
            .logout().disable()
            .x509().disable()
            .sessionManagement().disable()
            .rememberMe().disable()
            .authorizeHttpRequests {
                it.anyRequest().authenticated()
            }.addFilter(jwtOncePerRequestFilter)
    }
}