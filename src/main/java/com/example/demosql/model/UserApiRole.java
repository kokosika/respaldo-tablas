package com.example.demosql.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "user_api_role")
public class UserApiRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @JoinColumn(referencedColumnName = "id", name = "id_user_api")
    @ManyToOne(optional = false)
    private UserApi userApi;
    @JoinColumn(referencedColumnName = "id", name = "id_role")
    @ManyToOne(optional = false)
    private Role role;
}
