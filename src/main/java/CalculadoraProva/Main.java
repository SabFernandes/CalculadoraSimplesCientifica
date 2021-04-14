package CalculadoraProva;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
        
  int escolha;
  int opcao;
  float valorA;
  float valorB;
  double resultado = 0;
        
  Scanner sc = new Scanner(System.in);
  Calculadora calc = new Calculadora();
  CalculadoraCientifica calcCie = new CalculadoraCientifica();
        
  System.out.println("BEM VINDO A CALCULADORA\n");
  System.out.println("Deseja fazer uma operacao:\n1 - Calculadora Simples\n2 - Calculadora Cientifica\n3 - Sair");
  escolha = sc.nextInt();
  
  
    switch(escolha) {
      case 1:
      System.out.println("VOCE ESCOLHEU A OPCAO: CALCULADORA SIMPLES");
      System.out.println("Escolha a operacao:\n0 - Somar\n1 - Subtracao\n2 - divisao\n3 - Multiplicacao\n");
      opcao = sc.nextInt();
        if(opcao == 0){
            System.out.println("Digite dois valores:\nPrimeiro valor:");
            valorA = sc.nextFloat();
            System.out.println("\nSegundo valor:");
            valorB = sc.nextFloat();
            resultado = calc.soma(valorA, valorB);
            System.out.println(resultado);
        }else if(opcao == 1){
            System.out.println("Digite dois valores:\nPrimeiro valor:");
            valorA = sc.nextFloat();
            System.out.println("\nSegundo valor:");
            valorB = sc.nextFloat();
            resultado = calc.subtracao(valorA, valorB);
            System.out.println(resultado);
        }else if(opcao == 2){
            System.out.println("Digite dois valores:\nPrimeiro valor:");
            valorA = sc.nextFloat();
            System.out.println("\nSegundo valor:");
            valorB = sc.nextFloat();
            resultado = calc.divisao(valorA, valorB);
            System.out.println(resultado);
        }else if(opcao == 3){
            System.out.println("Digite dois valores:\nPrimeiro valor:");
            valorA = sc.nextFloat();
            System.out.println("\nSegundo valor:");
            valorB = sc.nextFloat();
            resultado = calc.multiplicacao(valorA, valorB);
            System.out.println(resultado);
        }
      break;

      case 2:
      System.out.println("VOCE ESCOLHEU A OPCAO: CALCULADORA CIENTIFICA");
      System.out.println("Escolha a operacao:\n0 - Raiz Quadrada\n1 - Pontenciacao\n");
      opcao = sc.nextInt();
      if(opcao == 0){
            System.out.println("Digite o valor:");
            valorA = sc.nextFloat();
            resultado = calcCie.raizQuadrada(valorA);
            System.out.println(resultado);
        }else if(opcao == 1){
            System.out.println("Digite dois valores:\nValor base: ");
            valorA = sc.nextFloat();
            System.out.println("\nExpoente");
            valorB = sc.nextFloat();
            resultado = calcCie.potencia(valorA, valorB);
            System.out.println(resultado);
        }
       break;

      case 3:
      System.out.println("VOCE ESCOLHEU A OPCAO: SAIR");
      break;

      default:
      System.out.println("|ERROR| OPCAO INVALIDA");
      break;
      }
    
  }
    
}