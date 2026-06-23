package com.example.java_study;
// このクラスが属するパッケージ名（フォルダのようなもの）。

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Spring Boot を起動するために必要なクラスを読み込んでいる。
//「アプリを動かすための道具を持ってくる」イメージ。

@SpringBootApplication
//→ Spring Boot アプリの“起動設定”をまとめて有効にするアノテーション。
//これ1つで以下が自動で有効になる：
//- @Configuration（設定クラスとして扱う）
//- @EnableAutoConfiguration（自動設定をオンにする）
//- @ComponentScan（Controller などを自動で探す）

public class JavaStudyApplication {
// → アプリ全体の“入口”となるクラス。
//  Spring Boot はこのクラスからスタートする。	

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		// → Spring Boot アプリを起動するメソッド。
        //   内部で組み込みサーバー（Tomcat）を立ち上げて、
        //   Controller の読み込み、設定の読み込みなどを全部やってくれる。
        //   実質「アプリをスタート！」の一行。
	}

}
