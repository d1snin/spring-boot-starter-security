package uno.d1s.security.domain

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

data class SimpleApplication(
    val name: String,
    val id: String,
    val authorities: MutableList<SimpleGrantedAuthority>,
    val enabled: Boolean
) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = authorities

    override fun getPassword(): String? = null // application has no password.

    override fun getUsername(): String = name

    override fun isAccountNonExpired(): Boolean = true // always non expired

    override fun isAccountNonLocked(): Boolean = true // always non locked

    override fun isCredentialsNonExpired(): Boolean = true // always non expired

    override fun isEnabled(): Boolean = enabled
}
