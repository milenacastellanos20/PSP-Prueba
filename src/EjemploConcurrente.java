public class EjemploConcurrente extends Thread{
    private String nombreHilo;

    public EjemploConcurrente(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("hilo " + nombreHilo + " - paso " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
