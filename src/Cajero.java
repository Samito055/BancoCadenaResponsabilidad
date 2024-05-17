public class Cajero  extends BaseBanco{

    @Override
    public void ManejarAutorizacion(double cantidad) {
        if(cantidad <=1000){
            System.out.println("Retirando " + cantidad + " desde un cajero");
        } else {
            pasarSiguienteManejador(cantidad);
        }
    }
}
