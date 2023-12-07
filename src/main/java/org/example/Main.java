package org.example;
import org.example.Pessoas.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    static Scanner input = new Scanner(System.in);

    public static List<Pessoa> pessoaList = new ArrayList<>();


    public static void main(String[] args) {


        while (true) {


            System.out.println(" ---- Biblioteca de Pessoas ----");
            System.out.println(" ");
            System.out.println("Digite a opção que deseja acessar: ");

            System.out.println("1-Adicionar pessoa a biblioteca ");
            System.out.println("2-Consultar pessoas na biblioteca ");
            System.out.println("3-Sair ");

    try {
        Integer opcao = input.nextInt();
        if (opcao > 3) {
            System.out.println("Opção inválida");
        }

        if (opcao == 1) {
            System.out.println("Digite o nome da pessoa:");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Agora digite o sexo da pessoa: (1) Masculino, (2) Feminino, (3) Outro");
            Integer sexo = input.nextInt();
            System.out.println("Digite a idade da pessoa: ");
            Integer idade = input.nextInt();

            pessoaList.add(
                    new Pessoa(nome, sexo, idade)
            );



        } else if (opcao == 2) {

            if (pessoaList.isEmpty()){
                System.out.println("Não existem pessoas na biblioteca");
                break;
            }

            System.out.println("1- Consultar por nome: ");
            System.out.println("2- Consultar por sexo: ");
            System.out.println("3- Consultar por idade: ");
            Integer opcao2 = input.nextInt();

            if (opcao2 == 1){
                pessoaList.stream()
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .map(Pessoa::getNome)
                        .forEach(System.out::println);

            } else if (opcao2 == 2) {
                System.out.println("Lista masculina:");
                pessoaList.stream()
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .filter(pessoa -> pessoa.getSexo() == 1)
                        .forEach(System.out::println);

                System.out.println("Lista feminina:");
                List<Pessoa> listaFeminina = pessoaList.stream()
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .filter(pessoa -> pessoa.getSexo() == 2)
                        .collect(Collectors.toList());
                System.out.println(listaFeminina);


                System.out.println("Outros:");
                pessoaList.stream()
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .filter(pessoa -> pessoa.getSexo() == 3)
                        .forEach(System.out::println);
            } else if (opcao2 == 3) {
                pessoaList.stream()
                        .sorted(Comparator.comparing(Pessoa::getIdade))
                        .forEach(System.out::println);

            }


        } else if (opcao == 3) {
            break;

        }


    }catch (InputMismatchException e){
        System.out.println("Opção inválida");
        break;
    }
        }





    }
}