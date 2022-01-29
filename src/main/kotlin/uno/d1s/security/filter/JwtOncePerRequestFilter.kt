package uno.d1s.security.filter

import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import uno.d1s.security.constant.AUTHORIZATION_HEADER
import uno.d1s.security.constant.JWT_PREFIX
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class JwtOncePerRequestFilter : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val jwt: String? = request.getHeader(AUTHORIZATION_HEADER)?.removePrefix(JWT_PREFIX)

        jwt ?: run {
            filterChain.doFilter(request, response)
        }


    }

    private fun getAuthentication(jwt: String): Authentication {
        val claims =

        return object : AbstractAuthenticationToken() {

            override fun getCredentials(): Any {
                TODO("Not yet implemented")
            }

            override fun getPrincipal(): Any {
                TODO("Not yet implemented")
            }
        }
    }
}