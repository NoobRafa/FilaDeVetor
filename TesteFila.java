package com.estruturadedados2.aula02;

public class TesteFila {
	public static void main(String[] args) {

		FilaDeVetor f = new FilaDeVetor();
		
		//Enfileirar
		f.queue("A");
		f.queue("B");
		f.queue("C");
		f.queue("D");
		f.queue("E");
		
		//Imprimir
		f.print();
		
		f.unqueue();//A
		f.unqueue();//B
		
		f.print();
		
		f.queue("F");//CDEF
		f.queue("G");//CDEFG
		
		f.print();

	}

}
