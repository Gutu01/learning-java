import java.util.Random;
public class Aluno2 {

    public class Aluno{
        //Atributos
        private String nome;
        private int idade;
        private double codigo_identificador;
        private Random aleatorio;
        //Construtor
        public Aluno(String nome, int idade){
            aleatorio = new Random();
            // O this nome referência o private String nome; da linha 6. Enquanto o nome referência o nome é o
            this.nome = nome;
            this.idade = idade;
            this.codigo_identificador = aleatorio.nextDouble();
        }
        //Métodos
        public void definirNome(String nome){
            this.nome = nome;
        }
        public void definirIdade( int idade){
            this.idade = idade;
        }
    }
}
