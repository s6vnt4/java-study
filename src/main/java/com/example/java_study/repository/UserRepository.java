package com.example.java_study.repository;
// → このクラス（インターフェース）が repository パッケージに属していることを示す。
//   DB にアクセスするクラスは repository にまとめるのが一般的。

import org.springframework.data.jpa.repository.JpaRepository;
// → Spring Data JPA が提供する「DB 操作を自動生成してくれる仕組み」を使うための import。
//   これを継承するだけで CRUD メソッドが全部使えるようになる。

import com.example.java_study.entity.User;
// → この Repository が扱う Entity（User クラス）を指定するために import。

public interface UserRepository extends JpaRepository<User, Long> {
// → Repository はクラスではなく「インターフェース」で作る。
//   JpaRepository<User, Long> を継承すると、User テーブルを扱うための
//   基本的な DB 操作（CRUD）が自動で使えるようになる。

    // 例えば以下のメソッドが自動で使えるようになる：
    // - findAll()        → SELECT * FROM users
    // - findById(id)     → SELECT * FROM users WHERE id = ?
    // - save(user)       → INSERT or UPDATE
    // - deleteById(id)   → DELETE FROM users WHERE id = ?
    // これらは書かなくても Spring が勝手に作ってくれる。

}
