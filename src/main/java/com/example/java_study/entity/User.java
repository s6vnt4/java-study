package com.example.java_study.entity;
//→ このクラスが entity パッケージに属していることを示す。
//DB のテーブルと対応するクラスは entity にまとめるのが一般的。

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//→ JPA（Java Persistence API）で DB と連携するためのアノテーション。
//Hibernate がこれらを読み取って SQL を発行する。

@Entity
//→ このクラスが「DB のテーブルと対応するエンティティ」であることを宣言。
//Hibernate がこのクラスを管理対象として扱う。

@Table(name = "users") 
//→ このエンティティが対応するテーブル名を指定。
//省略するとクラス名（User）から推測されるが、明示した方が安全。

public class User {

    @Id
    // → 主キー（PRIMARY KEY）であることを示す。
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // → MySQL の AUTO_INCREMENT と対応。
    //   DB 側で ID を自動採番する方式。
    
    private Long id;    // users.id に対応（AUTO_INCREMENT）

    private String name;   // users.name に対応

    // --- 以下 getter / setter ---
    // → フィールドへアクセスするためのメソッド。
    //   JPA は getter/setter を使って値を読み書きするため必須。

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
