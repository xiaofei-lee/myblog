package com.xiaofei.blog.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xiaofei
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    int id;

    String username;
    String password;
}
