package com.sungsu.membership.adapter.in.web;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMembershipRequest {

    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String email;
    @AssertFalse
    private Boolean isCorp;

}
