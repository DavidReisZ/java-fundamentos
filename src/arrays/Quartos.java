package arrays;

import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        String[] nomes = new String[10];
        String[] email = new String[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("Rent #" + (i+1)+ ":");


            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String gmail = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();

            nomes[room] = nome;
            email[room] = gmail;


            }
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (nomes[i] == null){


        }else{
                System.out.println(i + ": " + nomes[i] + ", " + email[i]);

            }


        }




    }
}
