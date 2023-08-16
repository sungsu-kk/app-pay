package com.sungsu.membership.adapter.out.persistence;

import com.sungsu.membership.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "membership")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipEntity extends BaseTimeEntity {

    @Id
    @Column(name = "membershipId")
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String address;
    private Boolean isValid;
    private Boolean isCorp;

}
