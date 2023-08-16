package com.sungsu.membership.adapter.out.persistence;

import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.application.port.out.RegisterMembershipPort;
import com.sungsu.membership.common.MembershipMapper;
import com.sungsu.membership.common.PersistenceAdapter;
import com.sungsu.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import static com.sungsu.membership.common.MembershipMapper.*;

@PersistenceAdapter
@RequiredArgsConstructor
@Transactional
public class MembershipPersistenceAdapter implements RegisterMembershipPort {

    private final MembershipRepository membershipRepository;
    private final MembershipMapper membershipMapper;
    @Override
    public Membership createMembership(RegisterMembershipCommand command) {

        MembershipEntity membershipEntity = membershipRepository.save(membershipMapper.of(command));
        return membershipMapper.of(membershipEntity);
    }
}
