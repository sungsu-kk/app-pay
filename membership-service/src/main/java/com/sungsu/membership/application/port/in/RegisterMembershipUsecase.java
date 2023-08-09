package com.sungsu.membership.application.port.in;

import com.sungsu.membership.common.UseCase;
import com.sungsu.membership.domain.Membership;

@UseCase
public interface RegisterMembershipUsecase {
    Membership registerMembership(RegisterMembershipCommand command);
}
