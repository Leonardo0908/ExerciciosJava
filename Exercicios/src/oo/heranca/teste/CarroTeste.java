package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari(400);
		Civic c2 = new Civic(230);
		
		System.out.println("Ferrari esta a " + c1.velocidade + "km/h");
		System.out.println("Civic esta a " + c2.velocidade + "km/h");
		
		c1.ligarTurbo();
		c1.ligarAr();
		c1.deligarAr();
		c1.acelerar();
		c1.frear();
		System.out.println(c1);
		c1.acelerar();
		c1.frear();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println(c1.velocidadeDoAr());

		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
					
//		c1.frear();
//		c1.frear();
//		
//		c2.frear();
//		
//		System.out.println(c1);
//		System.out.println(c2);
		
	}
}
