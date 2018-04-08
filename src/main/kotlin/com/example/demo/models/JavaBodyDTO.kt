package com.example.demo.models

import com.example.demo.validators.ValidateRolesJava
import javax.validation.constraints.NotNull

class JavaBodyDTO {
    @NotNull
    @ValidateRolesJava
    var roles: Set<String> = emptySet()
}
