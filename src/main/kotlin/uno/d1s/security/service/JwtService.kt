package uno.d1s.security.service

import com.nimbusds.jwt.JWTClaimsSet

interface JwtService {

    fun validate(jwt: String): Boolean

    fun claims(jwt: String): JWTClaimsSet
}