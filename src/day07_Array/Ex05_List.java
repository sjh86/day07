package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("설탕");
		food.add("소금");
		food.add("아멘");
		food.add("계한");
	    System.out.println(food);
	    System.out.print("찾을 값 입력 : ");
	    String n = input.next();
	    System.out.println(n + "위치 : " +food.indexOf(n));

	}

}
