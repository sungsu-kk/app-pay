package com.sungsu.membership.application.port.in;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
public class RegisterMembershipCommand {

    private final String name;
    private final String email;
    private final String address;
    private final Boolean isValid;
    private final Boolean isCorp;

}
