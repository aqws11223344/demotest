package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//	1. 建立一個Spring Boot應用程式,啟動一個Web伺服器監聽端口8080。在root路徑("/")回傳一個簡單的"Hello, World!"訊息。
//
//			2. 製作自訂的 404 錯誤頁面
//
//	在 Spring Boot 應用程式中,建立一個自訂的 HTML 頁面來顯示 404 錯誤訊息
//	設定 Spring Boot 的錯誤處理機制,將所有 404 錯誤導向到自訂的錯誤頁面
//
//3. 實作 RESTful API 端點
//	建立一個 RESTful API 端點,例如 /api/users 來處理使用者資料

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
