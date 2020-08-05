package ex1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        aluno1.nome = "Maria";
        aluno1.idade = 30;
        aluno1.matricula = "CR82733";
        aluno1.endereco = "45, rua Santos";

        aluno2.nome = "Pedro";
        aluno2.idade = 34;
        aluno2.matricula = "CR92813";
        aluno2.endereco = "109, rua Chagas";

        professor1.nome = "Marcos";
        professor1.idade = 56;
        professor1.disciplina = "Química";
        professor1.endereco = "10, Largo do Machado";

        professor2.nome = "Fabrícia";
        professor2.idade = 41;
        professor2.disciplina = "Matemática";
        professor2.endereco = "187, rua Junqueira";


        aluno1.mostraAsInformacoesNaTela(); //Maria
        System.out.println("***************************");
        aluno2.mostraAsInformacoesNaTela(); //Pedro
        System.out.println("***************************");
        professor1.mostraAsInformacoesNaTela(); //Marcos
        System.out.println("***************************");
        professor2.mostraAsInformacoesNaTela(); //Fabrícia
        System.out.println("***************************");
    }
}