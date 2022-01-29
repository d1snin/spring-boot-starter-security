package uno.d1s.security.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

data class SimpleApplicationCreationDto(
    @Pattern(regexp = "^(?!.*[-_]{2,})(?=^[^-_].*[^-_]$)[\\w\\s-]{3,9}$") val name: String,
    @NotEmpty val authorities: List<String>,
    @NotNull val enabled: Boolean
)