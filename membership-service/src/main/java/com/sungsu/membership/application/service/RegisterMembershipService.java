package com.sungsu.membership.application.service;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.in.RegisterMembershipUsecase;
import com.sungsu.membership.application.port.out.RegisterMembershipPort;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RegisterMembershipService implements RegisterMembershipUsecase {

    private final RegisterMembershipPort registerMembershipPort;

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
       return registerMembershipPort.createMembership(command);
    }
}
