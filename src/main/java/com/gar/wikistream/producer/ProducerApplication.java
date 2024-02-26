package com.gar.wikistream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
		System.out.println("Java Version : " + System.getProperty("java.version"));
		System.out.println("\n" +
				".______    __          ___   ____    ____         _______.___________..______       _______     ___      .___  ___.  _______ .______         .______   .______        ______    _______   __    __    ______  _______ .______      \n" +
				"|   _  \\  |  |        /   \\  \\   \\  /   /        /       |           ||   _  \\     |   ____|   /   \\     |   \\/   | |   ____||   _  \\        |   _  \\  |   _  \\      /  __  \\  |       \\ |  |  |  |  /      ||   ____||   _  \\     \n" +
				"|  |_)  | |  |       /  ^  \\  \\   \\/   /        |   (----`---|  |----`|  |_)  |    |  |__     /  ^  \\    |  \\  /  | |  |__   |  |_)  |       |  |_)  | |  |_)  |    |  |  |  | |  .--.  ||  |  |  | |  ,----'|  |__   |  |_)  |    \n" +
				"|   ___/  |  |      /  /_\\  \\  \\_    _/          \\   \\       |  |     |      /     |   __|   /  /_\\  \\   |  |\\/|  | |   __|  |      /        |   ___/  |      /     |  |  |  | |  |  |  ||  |  |  | |  |     |   __|  |      /     \n" +
				"|  |      |  `----./  _____  \\   |  |        .----)   |      |  |     |  |\\  \\----.|  |____ /  _____  \\  |  |  |  | |  |____ |  |\\  \\----.   |  |      |  |\\  \\----.|  `--'  | |  '--'  ||  `--'  | |  `----.|  |____ |  |\\  \\----.\n" +
				"| _|      |_______/__/     \\__\\  |__|        |_______/       |__|     | _| `._____||_______/__/     \\__\\ |__|  |__| |_______|| _| `._____|   | _|      | _| `._____| \\______/  |_______/  \\______/   \\______||_______|| _| `._____|\n" +
				"                                                                                                                                                                                                                                   \n");
	}

}
