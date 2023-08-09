package com.sungsu.membership.adapter.out.persistence;

import com.sungsu.membership.application.port.out.RegisterMembershipPort;
import com.sungsu.membership.common.PersistenceAdapter;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort {
    private final MembershipRepository membershipRepository;
    @Override
    public void createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        //
        membershipRepository.save(
                new MembershipEntity(
                        membershipName.getName(),
                        membershipAddress.getAddress(),
                        membershipEmail.getEmail(),
                        membershipIsValid.getIsValid(),
                        membershipIsCorp.getIsCorp()
                )
        );
    }
}
