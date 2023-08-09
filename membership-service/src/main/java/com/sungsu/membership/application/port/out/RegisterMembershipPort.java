package com.sungsu.membership.application.port.out;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.domain.Membership;

public interface RegisterMembershipPort {

    Membership createMembership(RegisterMembershipCommand command);

}
