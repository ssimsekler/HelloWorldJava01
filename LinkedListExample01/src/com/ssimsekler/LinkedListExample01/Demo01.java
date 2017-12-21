package com.ssimsekler.LinkedListExample01;

import java.util.Scanner;

public class Demo01 {

	private static MyList myListExample;
	private static Scanner scanner;

	public static void main(String[] args) {

		init();

		start();

	}

	private static void init() {

		myListExample = new MyList(null);
		scanner = new Scanner(System.in);

		addInitialItems();

	}

	private static void addInitialItems() {
		String inputString = "Turkey:UK:Germany:USA:Canada:Austria:UAE:South Korea:Italy:New Zealand:France";

		String[] inputData = inputString.split(":");

		for (String inputDataItem : inputData) {
			myListExample.addItem(new MyListItem(inputDataItem, null, null));
		}
	}

	private static void start() {
		printOptions();

		boolean quit = false;
		while (!quit) {
			switch (scanner.next()) {
			case "1":
				myListExample.printItems();
				break;
			case "2":
				myListExample.addItem(new MyListItem(scanner.next(), null, null));
				break;
			case "3":
				System.out.println((myListExample.getItem(scanner.next()) == null) ? "Does not exist" : "exists");
				break;
			case "4":
				myListExample.removeItem(myListExample.getItem(scanner.next()));
				break;
			case "5":
				myListExample.removeAll();
				break;
			case "6":
				addInitialItems();
				break;
			case "7":
				init();
				break;
			case "9":
				quit = true;
				break;
			default:
				printOptions();
			}

		}
	}

	private static void printOptions() {
		System.out.println("1: Print items\n" + "2: Add item\n" + "3: Check item exists\n" + "4: Remove item\n"
				+ "5: Remove all items\n" + "6: Add initial items\n" + "7: Initialise\n" + "9: Exit");
	}

}
