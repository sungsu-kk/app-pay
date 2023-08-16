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
    private final Boolean isValid;
    private final Boolean isCorp;

}

