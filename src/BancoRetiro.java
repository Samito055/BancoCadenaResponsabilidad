public class BancoRetiro {
    public static void main(String[] args) {

        BaseBanco cajero = new Cajero();
        BaseBanco gerente = new Gerente();
        BaseBanco director = new Director();

        cajero.setSiguienteManejador(gerente);
        gerente.setSiguienteManejador(director);

        double cuenta1 = 500;
        double cuenta2 = 5000;
        double cuenta3 = 15000;
        double cuenta4 = 110000;

        cajero.ManejarAutorizacion(cuenta1);
        cajero.ManejarAutorizacion(cuenta2);
        cajero.ManejarAutorizacion(cuenta3);
        cajero.ManejarAutorizacion(cuenta4);
    }
}
