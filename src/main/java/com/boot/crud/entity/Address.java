package com.boot.crud.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_ADDRESS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
    @SequenceGenerator(name = "SEQUENCE", sequenceName = "HIBERNATE_SEQUENCE", allocationSize = 1)
    @Column(name = "ADDRESS_ID", nullable = false)
    private Long id;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ALLEY")
    private String alley;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "PROVINCE")
    private String province;

    @ManyToOne
    @JoinColumn(name = "PERSON_ADDRESS", foreignKey = @ForeignKey(name = "FK_PERSON_ADDRESS"))
    private Person person;



}
