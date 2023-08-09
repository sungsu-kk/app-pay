package com.sungsu.membership.adapter.out.persistence;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.out.RegisterMembershipPort;
import com.sungsu.membership.common.PersistenceAdapter;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort {

    private final MembershipRepository membershipRepository;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership createMembership(RegisterMembershipCommand command) {
        MembershipEntity membershipEntity = membershipRepository.save(
                new MembershipEntity.MembershipEntityBuilder()
                        .name(command.getName())
                        .email(command.getEmail())
                        .address(command.getAddress())
                        .isValid(command.getIsValid())
                        .isCorp(command.getIsCorp())
                        .build()
        );

        return membershipMapper.mapToDomainEntity(membershipEntity);
    }
}
