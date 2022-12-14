package com.boot.crud.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "TBL_PERSON")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
    @SequenceGenerator(name = "SEQUENCE", sequenceName = "HIBERNATE_SEQUENCE", allocationSize = 1)
    @Column(name = "PERSON_ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 255)
    private String name;

    @Column(name = "FAMILY", length = 500)
    private String family;

    @Column(name = "NATIONAL_CODE", length = 10)
    private String nationalCode;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "EMAIL")
    private String email;

    @OneToMany(mappedBy = "person")
    private Set<Address> addresses;

}
