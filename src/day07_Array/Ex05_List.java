package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("����");
		food.add("�ұ�");
		food.add("�Ƹ�");
		food.add("����");
	    System.out.println(food);
	    System.out.print("ã�� �� �Է� : ");
	    String n = input.next();
	    System.out.println(n + "��ġ : " +food.indexOf(n));

	}

}
