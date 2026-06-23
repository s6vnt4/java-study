package com.example.java_study.controller;
//→ このクラスが controller パッケージに属していることを示す。
//URL を受け取るクラスは controller にまとめるのが一般的な構造。

import java.util.List;
//→ DB から取得したユーザー一覧を List<User> で扱うために必要。

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//→ Web API を作るためのアノテーション。
//@RestController は「戻り値を JSON として返す」役割。

import com.example.java_study.entity.User;
import com.example.java_study.repository.UserRepository;
//→ User エンティティと、DB にアクセスする Repository を使うために import。

@RestController
//→ このクラスが「Web リクエストを受け取って JSON を返す Controller」であることを示す。
public class UserController {

    private final UserRepository userRepository;
    // → DB にアクセスするための UserRepository を保持するフィールド。
    //   final にすることで「コンストラクタで必ずセットされる」ことを保証。

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // → コンストラクタインジェクション。
    //   Spring が UserRepository の実体を自動で注入してくれる。
    //   これにより、UserController は DB にアクセスできるようになる。

    @GetMapping("/users")
    // → ブラウザやクライアントが /users に GET アクセスしたときに実行される。
    //   http://localhost:8080/users
    
    public List<User> getUsers() {
        return userRepository.findAll();
        // → User テーブルの全データを取得して、そのまま JSON として返す。
        //   Spring Data JPA の findAll() は「SELECT * FROM user」を実行する。
    }
}
