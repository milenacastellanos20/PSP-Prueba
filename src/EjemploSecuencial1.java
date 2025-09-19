import java.sql.SQLOutput;

public class EjemploSecuencial1 {
    public static void main(String[] args) {
        /*System.out.println("Iniciando el programa...");

        for (int i = 0; i <= 5 ; i++) {
            System.out.println("\tNumero: " + i);
            try{
                Thread.sleep(1000); //espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Terminando el programa...");*/

        EjemploConcurrente o1 = new EjemploConcurrente("Guillermo");
        EjemploConcurrente o2 = new EjemploConcurrente("Antonio");

        o1.start();
        o2.start();
    }
}
