package com.sungsu.membership.adapter.out.persistence;

import com.sungsu.membership.domain.Membership;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {

    Membership mapToDomainEntity(MembershipEntity membershipEntity) {
        return Membership.builder()
                .id(membershipEntity.getId()+"")
                .name(membershipEntity.getName())
                .email(membershipEntity.getEmail())
                .address(membershipEntity.getAddress())
                .isValid(membershipEntity.getIsValid())
                .isCorp(membershipEntity.getIsCorp())
                .build();
    }
}
