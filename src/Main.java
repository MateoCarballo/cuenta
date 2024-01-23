public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        do{
            menu.mostrarMenu();
            menu.escoger();
        }while(menu.isSalir());


    }
}