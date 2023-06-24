/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icev.maxwelljogo2;
import java.util.Scanner;

public class Mercador {
    private int moedasTransporte;
    
    public void iniciarEncontro() {
        Scanner scanner = new Scanner(System.in);

        // pergunta das moedas
        System.out.println("Quantas moedas de transporte você tem?");
        moedasTransporte = scanner.nextInt();

        // perguntas das cidades
        System.out.println("De onde você vem? (Informe a cidade de origem)");
        int cidadeOrigem = scanner.nextInt();

        System.out.println("Para onde você vai? (Informe a cidade destino)");
        int cidadeDestino = scanner.nextInt();

        System.out.println("Deseja trocar suas moedas por limiar na jóia? (Digite 'sim' ou 'não')");
        String respostaTrocarMoedas = scanner.next();

        // verificação do fluxo de decisão com base nas respostas
        if (moedasTransporte < 5) {
            int distancia = Math.abs(cidadeDestino - cidadeOrigem);

            if (distancia < 3 && respostaTrocarMoedas.equals("sim")) {
                moedasTransporte -= 1;
                System.out.println("Você perdeu 1 moeda e ganhou 1 de limiar na jóia.");
            } else if (distancia < 3) {
                moedasTransporte -= 1;
                System.out.println("Você perdeu 1 moeda.");
            } else if (respostaTrocarMoedas.equals("sim")) {
                moedasTransporte -= 1;
                System.out.println("Você perdeu 1 moeda e ganhou 2 de limiar na jóia.");
            } else {
                moedasTransporte += 2;
                System.out.println("Você ganhou 2 moedas.");
            }
        } else {
            int distancia = Math.abs(cidadeDestino - cidadeOrigem);

            if (distancia < 3 && respostaTrocarMoedas.equals("sim")) {
                moedasTransporte -= 3;
                System.out.println("Você perdeu 3 moedas e ganhou 2 de limiar na jóia.");
            } else if (distancia < 3) {
                moedasTransporte -= 2;
                System.out.println("Você perdeu 2 moedas.");
            } else {
                System.out.println("Não houve alteração nas moedas de transporte.");
            }
        }

        boolean missaoAtiva = false;
        if (cidadeOrigem == 8 && !missaoAtiva) {
            oferecerMissao1();
        } else if (cidadeOrigem == 10 && !missaoAtiva) {
            oferecerMissao2();
        } else if (cidadeOrigem == 11 && !missaoAtiva) {
            oferecerMissao3();
        }

        if (missaoAtiva = true) {
            String missaoAtual;
            System.out.println("Você possui uma missão ativa: " + missaoAtual);
            System.out.println("Deseja cancelar a missão? (Digite 'sim' ou 'não')");
            String respostaMissao = scanner.next();

            if (respostaMissao.equals("sim")) {
                cancelarMissao();
            } else {
                // bloco vazio
            }
        }

        System.out.println("Moedas de transporte restantes: " + moedasTransporte);
    }

    private void oferecerMissao1() {
        String nomeMissao1 = "missao1";
        missaoAtual = nomeMissao1;
        System.out.println("Precisa de uma mãozinha?");
        System.out.println("Aceitar a missão? (Digite 'sim' ou 'não')");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.next();

        if (resposta.equals("sim")) {
            boolean missaoAtiva = true;
            String missaoAtual = "Precisa de uma mãozinha";
            moedasTransporte += 4;
        }
    }

    private void oferecerMissao2() {
        System.out.println("Na sola da bota");
        System.out.println("Aceitar a missão? (Digite 'sim' ou 'não')");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.next();

        if (resposta.equals("sim")) {
            boolean missaoAtiva = true;
            String missaoAtual = "Na sola da bota";
            moedasTransporte += 6;
        }
    }

    private void oferecerMissao3() {
        System.out.println("Quem é vivo sempre aparece");
        System.out.println("Aceitar a missão? (Digite 'sim' ou 'não')");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.next();

        if (resposta.equals("sim")) {
            boolean missaoAtiva = true;
            String missaoAtual = "Quem é vivo sempre aparece";
            moedasTransporte += 1;
        }
    }

    private void completarMissao(int limiarJoia) {
        String missaoAtual;
        System.out.println("Missão completada: " + missaoAtual);
        boolean missaoAtiva = false;

        if (missaoAtual.equals("Precisa de uma mãozinha")) {
            moedasTransporte += 2;
            limiarJoia = limiarJoia+ 2;
        } else if (missaoAtual.equals("Na sola da bota")) {
            moedasTransporte += 3;
            limiarJoia = limiarJoia++;
        } else if (missaoAtual.equals("Quem é vivo sempre aparece")) {
            moedasTransporte += 10;
            limiarJoia = limiarJoia- 4;
        }
    }

    private void cancelarMissao() {
        String missaoAtual;
        System.out.println("Missão cancelada: " + missaoAtual);
        boolean missaoAtiva = false;
    }

    public static void main(String[] args) {
        Mercador mercador = new Mercador();
        mercador.iniciarEncontro();
    }
}
