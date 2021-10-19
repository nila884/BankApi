package com.nila.BankApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginAccountXRef {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="LOGIN_ACCOUNT_XREF_ID")
    private Long id;

    private Long accountNumber;

    private Long loginID;
}
