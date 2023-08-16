package com.sungsu.membership.adapter.in.web;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.in.RegisterMembershipUsecase;
import com.sungsu.membership.common.MembershipMapper;
import com.sungsu.membership.common.WebAdapter;
import com.sungsu.membership.domain.Membership;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

import static com.sungsu.membership.common.MembershipMapper.*;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class RegisterMembershipController {

    private final RegisterMembershipUsecase registerMembershipUsecase;
    private final MembershipMapper membershipMapper;

    @PostMapping("/register")
    Membership registerMembership(@RequestBody @Valid RegisterMembershipRequest request){
        //1. request --> Command
        RegisterMembershipCommand command = membershipMapper.of(request);
        //2. usecase call
       return  registerMembershipUsecase.registerMembership(command);
    }
}
