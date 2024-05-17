public class Director extends BaseBanco{

    @Override
    public void ManejarAutorizacion(double cantidad) {
        if(cantidad <=100000){
            System.out.println("Retiro de " + cantidad + " realizado con el director");
        } else {
            pasarSiguienteManejador(cantidad);
        }
    }

}
