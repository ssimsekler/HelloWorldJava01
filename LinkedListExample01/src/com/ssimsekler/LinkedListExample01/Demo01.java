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

		myListExample = new MyList(new MyListItem(new String("Turkey"), null, null));
		scanner = new Scanner(System.in);

		String inputString = "UK:Germany:USA:Canada:Austria:UAE:South Korea:Italy:New Zealand:France";

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
				myListExample.removeItem(myListExample.getItem(scanner.next()));
				break;
			case "4":
				System.out.println((myListExample.getItem(scanner.next()) == null) ? "Does not exist" : "exists");
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
		System.out.println(
				"1: Print items\n" + "2: Add item\n" + "3: Remove item\n" + "4: Check item exists\n" + "9: Exit");
	}

}
