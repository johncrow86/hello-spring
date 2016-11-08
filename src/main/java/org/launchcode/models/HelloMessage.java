package org.launchcode.models;

//view
public class HelloMessage {

	public static String getMessage(String name, String language) {
		switch (language) {
			case "english":
				return "Hello " + name + "!";
			case "french":
				return "Salut " + name + "!";
			case "spanish":
				return "Hola " + name + "!";
		}
		return null;
	}
}
