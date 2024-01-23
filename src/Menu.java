import java.util.Scanner;

public class Menu {
    private boolean salir = true;

    public Menu(){}
    public boolean isSalir() {
        return salir;
    }

    public void mostrarMenu(){
        System.out.println("Escoja una opcion:\n"+
                "1.Crear cuenta\n"+
                "2.Realizar ingreso\n"+
                "3.Realizar retiro\n"+
                "4.Mostrar saldo\n"+
                "5.Salir");
    }

    public void escoger(){
        Scanner scanner = new Scanner(System.in);
        CuentaCorriente nuevaCuenta = new CuentaCorriente();
        switch (scanner.nextInt()){
            case 1:
                nuevaCuenta.CrearCuenta("default","default");
                System.out.println("Introduce tu nombre");
                nuevaCuenta.setNombre(scanner.next());
                System.out.println("Introduce tu dni");
                nuevaCuenta.setDni(scanner.next());
                break;
            case 2:
                System.out.println("Escriba el ingreso");
                System.out.println(nuevaCuenta.ingresar(scanner.nextFloat()));
                break;
            case 3:
                System.out.println("Escriba el retiro");
                System.out.println(nuevaCuenta.retirar(scanner.nextFloat()));
                break;
            case 4:
                System.out.println(nuevaCuenta.getDni());
                System.out.println(nuevaCuenta.mostrarInformacion());
                break;
            case 5:
                salir = false;
                break;
        }
    }

}