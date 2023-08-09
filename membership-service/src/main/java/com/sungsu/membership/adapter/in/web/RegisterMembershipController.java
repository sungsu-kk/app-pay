package com.sungsu.membership.adapter.in.web;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.in.RegisterMembershipUsecase;
import com.sungsu.membership.common.WebAdapter;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class RegisterMembershipController {

    private final RegisterMembershipUsecase registerMembershipUsecase;
    @PostMapping("/register")
    Membership registerMembership(@RequestBody RegisterMembershipRequest request){
        //1. request --> Command
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(true)
                .isCorp(request.isCorp())
                .build();

        //2. usecase call
       return  registerMembershipUsecase.registerMembership(command);

    }
}
