package com.nila.BankApi.domain;

import com.nila.BankApi.model.Role;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LoginDetail {

    private Long id;
    private String email;
    private String password;
    private Collection<Role> roles = new ArrayList<>();
}
