/*****************************************************************************************
 * Universidade do Tocantins
 * Matéria: Algoritmos II
 * Autor: Samuell Oliveira
 * Data: 21-10-2020
 * Descrição: Desenvolva uma classe chamada Matemática e implemente as operações (somar,
 *	subtrair, dividir e multiplicar). Utilizando polimorfismo (Sobrecarga), implemente 3
 *	métodos para cada operação matemática. Construa uma classe principal e faça os
 *	testes de todos os métodos
 *
 ********************************************************************************************/

package teste;

import polimorfismo.Cast;
import polimorfismo.Matematica;
import cadastro.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Testando o Método Multiplicar usando polimorfismo
		 * 
		 * */
		
		// Chamando a classe Matemática
		Matematica soma = new Matematica();
		Matematica subtrair = new Matematica();
		Matematica multiplicar = new Matematica();
		Matematica dividir = new Matematica();
		
		// Somando
		System.out.println(soma.somar(2.5f, 3.1f));
		System.out.println(soma.somar(2, 10));
		System.out.println(soma.somar(2.1599856301, 3.1018972554));
		
		System.out.println("-----------------------------------------------");
		
		// Subtrair
		System.out.println(subtrair.subtrair(5, 2));
		System.out.println(subtrair.subtrair(99.4f, 36.2f));
		System.out.println(subtrair.subtrair(5.5869730571, 2.3369855637820));
		
		System.out.println("-----------------------------------------------");
		
		// Multiplicar
		System.out.println(multiplicar.multiplicar(5, 2));
		System.out.println(multiplicar.multiplicar(99.4f, 36.2f));
		System.out.println(multiplicar.multiplicar(5.5869730571, 2.3369855637820));
		
		System.out.println("-----------------------------------------------");
		
		// Dividir
		System.out.println(dividir.dividir(81, 3));
		System.out.println(dividir.dividir(677.73f, 12.3f));
		System.out.println(dividir.dividir(773.897366502, 31.4768956031));
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * 
		 * Testando o Método Multiplicar usando Cast para converter a inteiro
		 * 
		 * */
		
		// Chamando a classe Cast
		Cast multipliCast = new Cast();
		
		// Multiplicar
		System.out.println(multipliCast.multiplicar(5, 2.1));
		System.out.println(multipliCast.multiplicar(99.1f, 36.2966875021));
		System.out.println(multipliCast.multiplicar(5, 2.3369855637820));
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * 
		 * Imprimindo Pessoa com o Cast e instanceof
		 * 
		 * */
		
		// Cadastrando pessoa
		Pessoa p1 = new Pessoa(1, "Pedro da Silva", "j.silva@gmail.com");
		PessoaFisica pf = new PessoaFisica(2, "Marcia Cardoso", "marcia.cardoso12@gmail.com", "047.554.968-63", "(63) 9 8455-5858");
		PessoaJuridica pj = new PessoaJuridica(3, "SAM Tecnologias LTDA", "contato@acomil.com.br", "01.587.963/0001-54", "01.254.986", "(63) 3215-6547");
		
		// Imprimindo Pessoa
		p1.imprimir();
		System.out.println("-----------------------------------------------");
		// Imprimindo Pessoa Fisica
		pf.imprimir();
		System.out.println("-----------------------------------------------");
		// Imprimindo Pessoa Jurídica
		pj.imprimir();
		
		// Imprimindo Pessoa Física e Jurídica usando toString.
		System.out.println("-----------------------------------------------");
		System.out.println(pf);
		System.out.println("-----------------------------------------------");
		System.out.println(pj);
		
		
	}

}
