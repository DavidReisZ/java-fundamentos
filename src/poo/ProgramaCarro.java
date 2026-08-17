package poo;

 class ProgramaCarro {
     public static void main(String[] args) {
         Carro meu = new Carro();
         meu.modelo = "Ferrari";
         meu.cor = "Vermelho";

         meu.acelerar();
         meu.acelerar();
         meu.frear();
         System.out.println(meu);

     }

 }
