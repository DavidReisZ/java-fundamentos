package arrays;

public class Funcionario {

        final int id;
        String nome;
         double salario;

         Funcionario(int id, String nome, double salario){
             this.id = id;
             this.nome = nome;
             this.salario = salario;
        }
        void aumentarSalario(double percentual){
            salario = salario + (salario* percentual / 100);
        }
        @Override
    public String toString(){
             return id +", " + nome +", " + salario;
        }
    }



