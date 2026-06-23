package com.example.java_study;
//→ このクラスが属するパッケージ（フォルダのようなもの）。

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//→ Spring MVC（Web 機能）を使うためのアノテーションを読み込んでいる。
//URL とメソッドを結びつけるための道具。

@RestController
//→ このクラスが「Web のリクエストを受け取って返す役割（Controller）」であることを示す。
//戻り値をそのまま HTTP レスポンスとして返す（＝画面に文字が出る）。
public class HelloController {
// → Controller クラス本体。
//  この中に「どの URL にアクセスされたら何を返すか」を書く。

    @GetMapping("/hello")
    // → ブラウザで「/hello」にアクセスされたとき、このメソッドを実行する。
    //   http://localhost:8080/hello
    
    public String hello() {
    	// → 実際に処理を行うメソッド。
    //   今回は特に計算などはせず、文字列を返すだけ。
    	
        return "Hello, Shunta!";
        // → ブラウザに表示される文字列。
        //   @RestController のおかげで、この文字がそのままレスポンスになる。
    }
}
