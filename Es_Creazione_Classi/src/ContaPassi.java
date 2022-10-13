public class ContaPassi {

    public ContaPassi(){
        numeroPassi = 0;
    }

    public void aggiungiPasso(){
        numeroPassi++;
    }

    public int getNumeroPassi() {
        return numeroPassi;
    }

    public void resetNumeroPassi() {
        numeroPassi = 0;
    }

    private int numeroPassi;
}
