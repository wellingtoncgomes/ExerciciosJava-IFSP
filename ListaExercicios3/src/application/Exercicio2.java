package application;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		
	//	2) Crie uma lista de Strings que represente uma lista de compras. Adicione alguns itens à
	//  lista e, em seguida, use um loop para imprimir todos os itens. Finalmente, remova um item
	//  da lista e imprima a lista novamente para verificar se o item foi removido.
		
		List<String> listaCompra;

		listaCompra = new ArrayList<String>();

		listaCompra.add("Arroz");
		listaCompra.add("Feijão");
		listaCompra.add("Macarrão");
		listaCompra.add("Leite");
		listaCompra.add("Café");
		System.out.println("------Imprimindo lista compra ------");
		for (String elemento :listaCompra) {
			System.out.println(elemento);
		}
		System.out.println("------Removendo um item leite ------");
		listaCompra.remove("Leite");
		System.out.println("------Imprimindo lista compra com item removido ------");
		for (String elemento :listaCompra) {
			System.out.println(elemento);
		}
	}

}
