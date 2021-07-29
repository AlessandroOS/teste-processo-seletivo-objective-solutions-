package com.company.codigo_estruturado_esboco;
import com.company.model.Elemento;
import java.util.Scanner;

/*
Esse codigo é um esboço da minha primeira tentativa de criar o teste,
foi feito de forma estruturada e sem se preocupar com padroes de projeto,
resolvi deixar só pra mostar como foi o inicio e o fim do desenvolvimento.
Essa classe e esse pacote não tem ligação com o resto do projeto.
*/

//public class CodigoOriginalEsboco {
//
//    private static final Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        criarElemento();
//        do {
//            criarElemento();
//        } while (true);
//    }
//
//    public static void criarElemento() {
//        Elemento<String> raiz =
//                new Elemento<>("O prato que vc pensou é massa?",
//                        new Elemento<>("O prato que vc pensou é bolo de chocolate? ", null, null),
//                        new Elemento<>("O prato que vc pensou é lasanha?", null, null));
//
//        String resposta;
//        System.out.println(raiz.getValor());
//        System.out.println("digite S ou N");
//        resposta = sc.nextLine();
//
//        while (!resposta.equals("S") && !resposta.equals("N")) {
//            System.out.println("digite S ou N");
//            resposta = sc.nextLine();
//        }
//        if (resposta.equals("S")) {
//            System.out.println(raiz.getSim().getValor());
//
//            System.out.println("digite S ou N");
//            resposta = sc.nextLine();
//
//            while (!resposta.equals("S") && !resposta.equals("N")) {
//                System.out.println("digite S ou N");
//                resposta = sc.nextLine();
//            }
//
//            if (resposta.equals("S")) {
//                System.out.println("ACERTEI!");
//            } else {
//                System.out.println("Qual prato vc pensou?");
//            }
//
//        } else {
//            System.out.println(raiz.getNao().getValor());
//
//            System.out.println("digite S ou N");
//            resposta = sc.nextLine();
//
//            while (!resposta.equals("S") && !resposta.equals("N")) {
//                System.out.println("digite S ou N");
//                resposta = sc.nextLine();
//            }
//
//            if (resposta.equals("S")) {
//                System.out.println("ACERTEI!");
//            } else {
//                System.out.println("Qual prato vc pensou?");
//                String novoPrato = sc.nextLine();
//                System.out.println("prato antigo é _______ mas? novoPrato não");
//                String novaPergunta = sc.nextLine();
//                Elemento<String> novoElemento = new Elemento<>(novaPergunta,
//                        new Elemento<>("O prato que vc pensou é  " + novoPrato, null, null),
//                        raiz);
//            }
//        }
//    }
//}
