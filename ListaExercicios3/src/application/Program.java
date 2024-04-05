package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
	//	1) Crie uma lista de inteiros e adicione 5 números à lista. Em seguida, imprima todos os
	// números na lista.
		
		List<Integer> list;
		
		list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(4);
		list.add(50);
		
		for(Integer element: list) {
			System.out.println(element);
		}
	}
}
