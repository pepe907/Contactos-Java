import java.util.Scanner;

public class Error {
    private Scanner sc;

    public Error(Scanner sc){
        this.sc = sc;
    }

    public int leerEntero(String mensaje){
        while (true){
            try {
                System.out.println(mensaje);
                return Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Error debes introducir un numero. ");
            }
        }
    }

    public String leerTexto(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
