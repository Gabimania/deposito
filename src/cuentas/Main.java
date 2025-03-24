public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        ingresarEnCuenta(cuenta1,2300);
        operativa_cuenta(cuenta1,695);
        System.out.println("El saldo actual es "+ cuenta1.getSaldo() );

    }

    /**
     * Realiza las operaciones de ingreso y retiro en la cuenta.
     *
     * @param cuenta La cuenta con la que se va a operar.
     * @param cantidad La cantidad a retirar e ingresar.
     */

    public static void ingresarEnCuenta(CCuenta cuenta, double cantidad){
        try{
            cuenta.ingresar(cantidad);
            System.out.println("Se ha ingresado "+ cantidad+ " en la cuenta");
        }catch (Exception e){
            System.out.println("No se ha podido ingresar la cantidad"+ e.getMessage());
        }

    }

    public static void operativa_cuenta(CCuenta cuenta, double cantidad){
        try{
            cuenta.retirar(cantidad);
            System.out.println("Se ha retirado correctamente "+ cantidad + " de la cuenta");
        }catch (Exception e){
            System.out.println("Fallo al retirar "+ e.getMessage());
        }


    }
}