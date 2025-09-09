package calculatoralex;
import java.util.Scanner;

public class CalculatorAlex {

    public CalculatorAlex(){

    }
    
    public double sumar(double x, double y){
        return (x + y);//retorna la suma de las variables
    }

    public double restar(double x, double y){
        return (x - y);//retorna la resta de las variables
    }
    
    public double multiplicar(double x, double y){
        return (x * y);//retorna la multiplicación de las variables
    } 

    public double dividir(double x, double y){
        return (x / y);//retorna la división de las variables
    }
    
    public double modulo(double x, double y){
        return (x % y);//retorna la suma de las variables
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CalculatorAlex cal1 = new CalculatorAlex();//crea objeto cal1
        boolean aux = true;//bandera
        int opc = 0;
        
        do{
            System.out.println("Bienvenido a calculadoraAlex\n"
                    + "Digite una opcion valida.\n1. Sumar.\n2. Restar.\n3. Multiplicar.\n"
                    + "4. Dividir.\n5. Modulo.\n 6. Salir.");//imprime menú
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Digite dos numeros: ");//pide numeros
                    System.out.println("La suma es " + cal1.sumar(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Digite dos numeros: ");//pide numeros
                    System.out.println("La resta es " + cal1.restar(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 3:
                    System.out.println("Digite dos numeros: ");//pide numeros
                    System.out.println("La multiplicacion es " + cal1.sumar(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Digite dos numeros: ");//pide numeros
                    System.out.println("La division es " + cal1.dividir(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 5:
                    System.out.println("Digite dos numeros: ");//pide numeros
                    System.out.println("El modulo es " + cal1.sumar(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 6:
                    aux = false;
                    break;
                default: System.out.println("Digite un valor valido!");
            }
         
            
        }while(aux == true);
    }
    
}
