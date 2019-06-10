package com.example.demosql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "resources")
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 200, nullable = false)
    private String description;
    private Boolean enabled;
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(length = 200, nullable = true)
    private String resourceType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    @JsonIgnore
    private Set<RolesResources> rolesResources;

}
