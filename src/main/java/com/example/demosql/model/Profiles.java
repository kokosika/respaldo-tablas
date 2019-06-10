package com.example.demosql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "profiles" )
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false, unique = true)
    private String name;
    @Column(length = 200, nullable = false)
    private String description;
    private Boolean enabled;
    @Temporal(TemporalType.DATE)
    private Date createdDate;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profiles")
    @JsonIgnore
    private Set<UserApi> userApis;

}
