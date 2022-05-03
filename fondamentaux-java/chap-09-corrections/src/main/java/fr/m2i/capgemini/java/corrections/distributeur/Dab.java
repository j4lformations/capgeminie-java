package fr.m2i.capgemini.java.corrections.distributeur;

import java.util.Scanner;

public class Dab {

    private Compte[] comptes;

    public Dab() {
        comptes = init();
    }

    public Compte[] getComptes() {
        if (comptes == null)
            comptes = init();
        return comptes;
    }

    public boolean virer(String cptACrediter, String cptAdebiter, int somme) {
        boolean ok = false;
        boolean exist1 = false;
        boolean exist2 = false;

        Compte compte1 = null;
        Compte compte2 = null;

        for (Compte compte : getComptes()) {
            if (compte.getNumero().equals(cptACrediter)) {
                exist1 = true;
                compte1 = compte;
            }

            if (compte.getNumero().equals(cptAdebiter)) {
                exist2 = true;
                compte2 = compte;
            }
        }

        if (exist1 && exist2) {
            compte1.retirer(somme);
            compte2.deposer(somme);
            ok = true;
        }
        return ok;
    }

    private Compte[] init() {
        Compte[] cpts = new Compte[10];
        int[] soldes = {125, 365, 948, 578, 142, 9875, 623, 1023, 968, 2314};

        for (int i = 0; i < cpts.length; i++) {
            cpts[i] = new Compte("CPT" + (i + 1), soldes[i]);
        }
        return cpts;
    }

    private boolean compteExits(String numero) {
        boolean ok = false;
        for (Compte compte : getComptes()) {
            if (compte.getNumero().equalsIgnoreCase(numero)) {
                ok = true;
                break;
            }
        }
        return !ok;
    }

    public Compte getCompteByNumero(String numero) {
        Compte cpte = null;
        for (Compte compte : comptes) {
            if (compte.getNumero().equalsIgnoreCase(numero)) {
                cpte = compte;
                break;
            }
        }
        return cpte;
    }

    public void activer() {
        Scanner scanner = new Scanner(System.in);

        String numero;

        do {
            System.out.print("Entrez votre N° de compte ou Q pour arreter le progragmme: ");
            numero = scanner.next();

            if (numero.equals("Q")) {
                System.out.println("Vous avez decider de quitter le programme. Au revoir\n");
                System.exit(0);
            }

            if (compteExits(numero)) {
                System.out.println("Attention ce compte est inexitant dans cette bank !!!\n");
            }
        } while (compteExits(numero));

        Compte compte = getCompteByNumero(numero);

        String saisie;

        do {
            System.out.printf("\n1 - %s\n", Menu.RETRAIT);
            System.out.printf("2 - %s\n", Menu.DEPOT);
            System.out.printf("3 - %s\n", Menu.SOLDE);
            System.out.printf("4 - %s\n", Menu.QUITTER);

            System.out.print("\nFaites votre choix : ");
            saisie = scanner.next();

            StringBuilder affiche;
            affiche = new StringBuilder("Vous avez fait le choix ");

            switch (saisie) {
                case "1" -> {
                    System.out.println(affiche.toString() + 1);
                    System.out.print("Montant du retrait: ");

                    if (scanner.hasNextInt()) {
                        int montantDuRetrait = scanner.nextInt();
                        if (montantDuRetrait > compte.getSolde()) {
                            System.out.println("Désolé, ce retait n'est pas possible !!!");
                        } else {
                            compte.retirer(montantDuRetrait);
                            System.out.println("Retrait effectué avec succès !!!");
                        }
                    } else {
                        System.out.println("La somme à retirer doit être un entier !!!");
                        scanner = new Scanner(System.in);
                    }
                }
                case "2" -> {
                    System.out.println(affiche.toString() + 2);
                    System.out.print("Montant du retrait: ");

                    if (scanner.hasNextInt()) {
                        int montantDuDepot = scanner.nextInt();
                        if (montantDuDepot < 0) {
                            System.out.println("Désolé, ce depôt n'est pas possible !");
                        } else {
                            compte.deposer(montantDuDepot);
                            System.out.println("Depôt effectué avec succès !!!");
                        }
                    } else {
                        System.out.println("La somme à deposer doit être un entier positif !!!");
                        scanner = new Scanner(System.in);
                    }
                }
                case "3" -> {
                    System.out.println(affiche.toString() + 3);
                    System.out.print("Votre N° de compte : ");
                    System.out.print("Votre solde est : " + compte.getSolde() + "€\n");
                }
                case "4" -> {
                    System.out.println(affiche.toString() + 4);
                    System.out.print("Fin des opérations\n");
                }
                default -> System.out.println("Vous devez rentrer un choix valide !!!");
            }
        } while (!saisie.equals("4"));
        scanner.close();
    }
}