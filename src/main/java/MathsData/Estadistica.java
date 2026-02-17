package MathsData;

import java.util.Collection;

public class Estadistica {

    /*Devuelve el número (Double) elevado al exponente (int) */
    private static Double getPotencia(Double number, int exponente){

        //Caso excepcional
        if (exponente == 0)
            return 1.0;

        Double numberRaised = 1.0;
        for (int i = 1; i <= exponente; i++) numberRaised *= number;

        return numberRaised;
    }

    /*Devuelve el sumatorio de los elementos (Double) elevados a un mismo exponente (int) */
    private static Double getSumatorio(Collection<Double> reales, int exponente){

        Double sumPoweredDoubles = 0.0;
        for (Double real : reales){
            Double poweredReal = getPotencia(real,exponente);
            sumPoweredDoubles += poweredReal;
        }

        return sumPoweredDoubles;
    }


    /*Devuelve la media aritmética de la colección de Doubles*/
    public  static Double media(Collection<Double> reales){


        if (reales == null) throw new NullPointerException();
        if (reales.isEmpty()) return 0.0;

        Double sumaReales = getSumatorio(reales,1);
        return sumaReales/reales.size();

    }

    /*Devuelve la varianza de la colección (fórmula equivalente)*/
    public static Double varianza(Collection<Double> reales){

        Double media = media(reales);
        Double sumatorioCuadrados = getSumatorio(reales,2);

        return sumatorioCuadrados/reales.size() - getPotencia(media,2);

    }

    /*Devuelve la desiación típica de la colección*/
    public  static Double desviacionTipica(Collection<Double> reales){

        Double varianza = varianza(reales);

        return Math.sqrt(varianza);
    }


}
