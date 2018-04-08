package com.example.demo.models

import com.example.demo.validators.ValidateRolesKotlin
import javax.validation.constraints.NotNull

class KotlinBodyDTO {
    @NotNull
    @ValidateRolesKotlin
    var roles: Set<String> = emptySet()
}