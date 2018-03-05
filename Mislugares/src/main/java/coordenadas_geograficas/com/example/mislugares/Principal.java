package coordenadas_geograficas.com.example.mislugares;

/**
 * Created by Victor on 07/02/2018.
 */

public class Principal {
    public static void main(String[] main) {
        /*Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656, TipoLugar.EDUCACION,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar " + lugar.toString());*/
        Lugares lugares = new LugaresVector();
        for (int i=0; i<lugares.tamanyo(); i++) {
            System.out.println(lugares.elemento(i).toString());
        }
    }
}
