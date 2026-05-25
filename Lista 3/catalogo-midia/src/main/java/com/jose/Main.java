package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc, opc_mida, ano;
        int cont_filme, cont_musica, cont_podcast, cont_total;
        String nome;

        Scanner scan = new Scanner(System.in);
        ArrayList<Midia> midias = new ArrayList<>();
        
        midias.add(new Podcast("Flow Podcast - ep. 451", 2026));
        midias.add(new Filme("Openheimer", 2024));
        midias.add(new Filme("Authentic Games no Império Desconectado", 2026));
        midias.add(new Musica("Alan Walker - Better Of (Alone pt.III)", 2026));
        midias.add(new Podcast("Ticaracaticast - ep. 212", 2024));
        midias.add(new Musica("Vicetone - Nevada", 2018));

        do {
            System.out.println("[ 1 ] CADASTRAR MIDIA");
            System.out.println("[ 2 ] LISTAR MIDIAS");
            System.out.println("[ 3 ] LISTAR APENAS FILMES");
            System.out.println("[ 4 ] TOTAL DE MIDAS");
            System.out.println("[ 0 ] SAIR");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.printf("Qual sua opção: ");
            opc = Integer.parseInt(scan.nextLine());
            
            switch (opc) {
                case 1:
                    System.out.printf("Nome da midia: ");
                    nome = scan.nextLine();

                    System.out.printf("Ano da midia: ");
                    ano = Integer.parseInt(scan.nextLine());
                
                    System.out.println("[ 1 ] FILME");
                    System.out.println("[ 2 ] MUSICA");
                    System.out.println("[ 3 ] PODCAST");
                    System.out.printf("Qual o tipo da midia: ");

                    opc_mida = Integer.parseInt(scan.nextLine());

                    switch (opc_mida) {
                        case 1:
                            midias.add(new Filme(nome, ano));
                            break;
                        case 2:
                            midias.add(new Musica(nome, ano));
                            break;
                        case 3:
                            midias.add(new Podcast(nome, ano));
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA!");
                            break;
                    }
                    break;

                case 2:
                    for (Midia m : midias) {
                        m.exibir();
                    }
                    break;

                case 3:
                    for (Midia m : midias) {
                        if (m instanceof Filme) {
                            m.exibir();
                        }
                    }
                    break;

                case 4: 
                    cont_filme = cont_musica = cont_podcast = cont_total = 0;
                    for (Midia m : midias) {
                        if (m instanceof Filme) {
                            cont_filme++;
                        } else if (m instanceof Musica) {
                            cont_musica++;
                        } else if (m instanceof Podcast) {
                            cont_podcast++;
                        }
                        cont_total++;
                    }
                    System.out.printf("Filmes: %d\n", cont_filme);
                    System.out.printf("Muscias: %d\n", cont_musica);
                    System.out.printf("Podcasts: %d\n", cont_podcast);
                    System.out.printf("TOTAL = %d\n", cont_total);
                    break;

                case 0:
                    System.out.println("ENCERRANDO PROGRAMA!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        } while (opc != 0);

        scan.close();
    }
}