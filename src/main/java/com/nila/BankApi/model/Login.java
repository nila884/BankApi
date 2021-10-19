package com.nila.BankApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="LOGIN_ID")
    private Long id;
     private String email;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();

//    public <E> Login(Object o, String john_travolta, String john, String s, ArrayList<E> es) {
//    }
}
