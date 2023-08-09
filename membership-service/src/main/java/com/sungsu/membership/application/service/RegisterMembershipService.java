package com.sungsu.membership.application.service;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.in.RegisterMembershipUsecase;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterMembershipService implements RegisterMembershipUsecase {

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        //command -> DB



        //biz logic -> DB


        // external system port, adapter

        return null;
    }
}
