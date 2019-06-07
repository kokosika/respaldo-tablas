package com.example.demosql.model;

import javax.persistence.*;

@Entity(name = "user_api_role")
public class UserApiRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JoinColumn(referencedColumnName = "id", name = "id_user_api")
    @ManyToOne(optional = false)
    private UserApi userApi;
    @JoinColumn(referencedColumnName = "id", name = "id_role")
    @ManyToOne(optional = false)
    private Role role;
}
