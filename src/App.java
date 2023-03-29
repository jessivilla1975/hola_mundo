
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //JOptionPane.showMessageDialog(null, "pikachu", "Univalle", 1);
                                                                                                  //Icono
        //JOptionPane.showMessageDialog(null, "pikachu", "Univalle", JOptionPane.QUESTION_MESSAGE);
        //System.out.println("Hello, World xd!");
        
        Scanner ingreso = new Scanner(System.in);
        /*System.out.println("Ingrese edad: ");
        byte edad = ingreso.nextByte();
        System.out.println("Edad: "+edad);*/

        //ejemplo de array
        /*int edades[] = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Ingrese edad ["+i+"]: ");
            edades[i] = ingreso.nextByte();
        }

        for(int i=0;i<3;i++){
            System.out.println("Edad["+i+"]: "+edades[i]);
        }*/

        //ejemplo de matriz
        String datos[][] = new String[2][4]; //fila-columna
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("Ingrese el dato ["+i+"]: ");
                datos[i][j]= ingreso.next();  
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(datos[i][j]+"\t"); 
            }
            
            System.out.println();
        }
    }
}
