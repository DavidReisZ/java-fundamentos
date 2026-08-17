package poo;

import java.util.Scanner;
 class ProgramaStudent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student meu = new Student();
        meu.student = scanner.nextLine();
        System.out.println(meu.student);
        meu.nota1 = scanner.nextDouble();
        meu.nota2 = scanner.nextDouble();
        meu.nota3 = scanner.nextDouble();
        meu.notaFinal();


if(meu.notaFinal() >= 60){
    System.out.println("FINAL GRADE = " + meu.notaFinal());
    System.out.println("PASS");

}else {

    double notaTotal = 60 - meu.notaFinal();
    System.out.println("FINAL GRADE = " + meu.notaFinal());
    System.out.println("FAILED");
    System.out.println("MISSING " + notaTotal + " POINTS");
        }
scanner.close();
    }



}
