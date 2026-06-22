package com.example.java_study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity                 // 「これはDBのテーブルと対応するクラスだよ」という宣言
@Table(name = "users")  // 対応するテーブル名（MySQL側の名前）
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // users.id に対応（AUTO_INCREMENT）

    private String name;   // users.name に対応

    // --- 以下 getter / setter ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
