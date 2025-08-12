package Estructuras_De_datos.Ejercicios_clase;
import java.util.Scanner;
public class NumAleatorio 
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int num_aleatorio = (int) (Math.random() * 100);
        System.out.println(num_aleatorio);
        int num_adivinar;
        do{
            System.out.print("Adivine el número: ");
            num_adivinar = leer.nextInt();
            if (num_adivinar == num_aleatorio){
                System.out.println("Felicidades ha adivinado el número.");
                break;
            }
            else if (num_adivinar > num_aleatorio){
                System.out.println("Por encima del numero aleatorio, siga intentando.");
            }else{
                System.out.println("Por debajo del numero aleatorio, siga intentando."); 
            }
        }while(num_adivinar != num_aleatorio);
        leer.close();
    }    
}
