
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        // Tendo como dado de entrada a altura (h) de uma pessoa 
        // construa um algoritmo que 
        // calcule seu peso ideal
        // utilizando as seguintes fórmulas
        // Para homens: (72.7*h) - 58
        // Para mulheres: (62.1*h) - 44.7
        double altura;
        double peso_ideal_para_homens; 
        double peso_ideal_para_mulheres; 
        String sexo; 

        System.out.println("Informe a sua altura: ");
        Scanner teclado = new Scanner(System.in); 
        altura = teclado.nextDouble(); 
        System.out.println("Informe o seu sexo: ");
        sexo = teclado.next(); 

        peso_ideal_para_homens = (72.7 * altura) - 58; 
        peso_ideal_para_mulheres = (62.1 * altura) - 44.7; 

        if (sexo.equals("feminino")) {
            System.out.println("Seu peso ideal é: " + peso_ideal_para_mulheres);
            
        }
        else if(sexo.equals("masculino")){
            System.out.println("Seu peso ideal é: " + peso_ideal_para_homens);
        }

        

        
    }
}
