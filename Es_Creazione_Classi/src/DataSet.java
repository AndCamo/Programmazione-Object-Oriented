public class DataSet {

    public DataSet(){
        sommaValori = 0;
        valoreMassimo = Double.MIN_VALUE;
        valoreMinimo = Double.MAX_VALUE;
        contatore = 0;
    }

    public void add(double valore)
    {
        sommaValori = sommaValori + valore;
        contatore++;
        if(valore > valoreMassimo)
            valoreMassimo = valore;
        if(valore < valoreMinimo)
            valoreMinimo = valore;
    }

    public double getValoreMassimo() {
        return valoreMassimo;
    }

    public double getValoreMinimo() {
        return valoreMinimo;
    }

    public double getMedia() {
        return sommaValori / contatore;
    }

    private double sommaValori;
    private double valoreMinimo;
    private double valoreMassimo;
    private int contatore;
}
