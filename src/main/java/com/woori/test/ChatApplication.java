package com.woori.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}
	@Controller
	public static class MainController {
		@GetMapping("/")
		public String main() {
			return "redirect:/chat/rooms";
		}
	}
}

/*
	https://dev-gorany.tistory.com/235?category=901854
	https://supawer0728.github.io/2018/03/30/spring-websocket/
	https://github.com/supawer0728/simple-websocket
*/