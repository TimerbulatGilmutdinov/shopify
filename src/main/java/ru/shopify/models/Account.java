package ru.shopify.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    public enum State {
        ACTIVE, BANNED, CONFIRMED, NOT_CONFIRMED
    }

    public enum Role {
        USER, MODERATOR, ADMIN
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String passwordHash;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private State state;

    public boolean isConfirmed() {
        return this.state==State.CONFIRMED;
    }

    public boolean isBanned() {
        return this.state==State.BANNED;
    }
}
