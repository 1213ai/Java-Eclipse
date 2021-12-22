package jp.learningdesing.javastudy;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		double quantity, price, total;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("個数は? :");
		quantity = stdIn.nextDouble();
		System.out.println("値段は? :");
		price = stdIn.nextDouble();
		
		total = quantity * price;
		
		System.out.println("合計は " + total + "　です。");
		
		
		

	}

}
