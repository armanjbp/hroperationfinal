package com.virtusa.userinteface;

import java.util.Scanner;

import com.virtusa.view.MainMenu;

public class UserInterface {

	public static void main(String[] args) {

		MainMenu mainMenu = new MainMenu();
		try (Scanner scanner = new Scanner(System.in);)
		{
			System.out.println("please enter username");
			System.out.println("please enter password");
			String username = scanner.nextLine();
			String password = scanner.nextLine();
			if (username.equals("user") && password.equals("pass"))
			{
				mainMenu.mainView();
			}
			else
			{
				System.out.println("enter valid input");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
