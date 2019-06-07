package com.example.demosql.model;

import javax.persistence.*;

@Entity(name = "role_resource")
public class RolesResources {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JoinColumn(referencedColumnName = "id", name = "id_resource")
    @ManyToOne(optional = false)
    private Resources resource;
    @JoinColumn(referencedColumnName = "id",name = "id_role")
    @ManyToOne(optional = false)
    private Role role;
}
