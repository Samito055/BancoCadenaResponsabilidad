public abstract class BaseBanco implements ManejarAutorizacion {

    protected ManejarAutorizacion siguienteManejador;

    public void setSiguienteManejador(ManejarAutorizacion siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    protected void pasarSiguienteManejador(double cantidad){
        if(siguienteManejador != null){
            siguienteManejador.ManejarAutorizacion(cantidad);
        } else {
            System.out.println("No se puede procesar el monto");
        }
    }
}
