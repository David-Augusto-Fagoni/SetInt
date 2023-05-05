package view;

import modelInt.ISetInt;
import modelInt.SetInt;

public class Principal {
	public static void main(String[] args) {
		ISetInt Set = new SetInt();
		
		try {
			Set.addFirst(0);
			Set.addFirst(0);
			Set.add(1, 0);
			Set.add(1, 0);
			Set.addLast(2);
			Set.addLast(2);
			int tam = Set.size();
			for (int J=0;J<tam;J++) {
				System.out.println(Set.get(J));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
