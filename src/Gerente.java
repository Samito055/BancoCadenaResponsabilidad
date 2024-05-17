public class Gerente extends BaseBanco{

    @Override
    public void ManejarAutorizacion(double cantidad) {
        if(cantidad <=10000){
            System.out.println("Retiro de " + cantidad + " realizado con gerente");
        } else{
            pasarSiguienteManejador(cantidad);
        }
    }
}
