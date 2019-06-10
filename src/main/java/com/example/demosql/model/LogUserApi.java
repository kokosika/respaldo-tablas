package com.example.demosql.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "log_user_api")
public class LogUserApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
    @Column(length = 200) private String typeResource;
    @Column(length = 500) private String resource;
    @Column(length = 200) private String comment;
    @Column(length = 200) private String status;
    @Column(length = 200) private String ip;
    private Boolean completed;
    @Column(length = 500) private String error;
    @Temporal(TemporalType.DATE) private Date createdDate;

    @JoinColumn(referencedColumnName = "id", name = "id_user_api") @ManyToOne(optional = false) private UserApi userApi;
}
