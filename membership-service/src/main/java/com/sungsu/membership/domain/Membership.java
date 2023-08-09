package com.sungsu.membership.domain;


import lombok.*;

@Builder
@ToString
@Getter
@EqualsAndHashCode
public class Membership {

    private final String id;
    private final String name;
    private final String email;
    private final String address;
    private final boolean isValid;
    private final boolean isCorp;

}

