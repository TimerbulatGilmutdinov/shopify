package ru.shopify.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer extends Account{
    public enum Gender {
        MALE,
        FEMALE
    }

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private Date birthdate;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
