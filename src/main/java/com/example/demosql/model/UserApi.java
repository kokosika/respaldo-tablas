package com.example.demosql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "USER_API")
public class UserApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, unique = true, nullable = false)
    private String username;
    @Column(length = 100,  nullable = true)
    private String password;
    @Column(nullable = false)
    private Boolean enabled;
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @JoinColumn(referencedColumnName = "id", name = "id_profile")
    @ManyToOne(optional = false)
    private Profiles profiles;

    @JoinColumn(referencedColumnName = "id", name = "id_client")
    @ManyToOne(optional = false)
    private ClientEntity client;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userApi")
    @JsonIgnore
    private Set<UserApiRole> userApiRoles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userApi")
    @JsonIgnore
    private Set<LogUserApi> logUserApis;

}
