package com.examly.springapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "media", schema = "test")

public class MediaValutModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "media_id", length = 11)
    private Integer id;
    private String valutId;
    private String mediaName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "user_id")
    private UserModel user;

}
