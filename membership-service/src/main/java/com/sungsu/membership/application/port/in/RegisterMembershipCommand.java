package com.sungsu.membership.application.port.in;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterMembershipCommand {

    private  String name;
    private  String email;
    private  String address;
    private  Boolean isValid;
    private  Boolean isCorp;

}
