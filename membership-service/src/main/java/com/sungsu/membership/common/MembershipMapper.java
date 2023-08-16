package com.sungsu.membership.common;

import com.sungsu.membership.adapter.in.web.RegisterMembershipRequest;
import com.sungsu.membership.adapter.out.persistence.MembershipEntity;
import com.sungsu.membership.application.port.in.RegisterMembershipCommand;
import com.sungsu.membership.domain.Membership;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.WARN
)
public interface MembershipMapper {

    //Request To command
    RegisterMembershipCommand of(RegisterMembershipRequest request);

   //Command To Entity
    MembershipEntity of(RegisterMembershipCommand command);

    //Entity To Domain
    Membership of(MembershipEntity entity);

}
