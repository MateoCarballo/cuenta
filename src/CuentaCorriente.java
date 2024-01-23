public class CuentaCorriente {

    private String nombre, dni;
    private float saldo = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(){
    }
    public CuentaCorriente(String nombre){
        this.nombre = nombre;
    }

    public CuentaCorriente(String nombre, String dni){
        this.nombre=nombre;
        this.dni = dni;
    }

    public CuentaCorriente(String nombre, String dni, float saldo){
        this.nombre=nombre;
        this.saldo=saldo;
        this.saldo = saldo;
    }

    public void CrearCuenta(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
    }

    public String ingresar(float ingreso){
        if(ingreso <= 0){
            return "La operacion no ha podido ser realizada, su saldo es "+this.saldo;
        } else {
            this.saldo += ingreso;
            return "La operacion fue realizada con exito, su saldo es "+this.saldo;
        }
    }

    public String retirar(float retiro){
        if(this.saldo <= 0 || retiro < 0){
            return "La operacion no ha podido ser realizada, su saldo es "+this.saldo;
        } else {
            this.saldo -= retiro;
            return "La operacion fue realizada con exito, su saldo es "+this.saldo;
        }
    }
    public String mostrarInformacion(){
        return "El dni del titular es "+this.dni
                +"\nEl nombre del titular es "+this.nombre
                +"\nSu saldo es "+Float.toString(this.saldo);
    }
}
