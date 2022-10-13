public class Employee {

    public Employee( String nome, int pagaOraria) {
        this.nome = nome;
        this.pagaOraria = pagaOraria;
        straordinariPrecedenti = 0;
    }

    public int getPagaOraria() {
        return pagaOraria;
    }

    public String getNome() {
        return nome;
    }

    public int calcoloPaga(int oreLavoro)
    {
        int straordinariCorrenti;
        int paga;
        if(oreLavoro <= 40)
        {
            paga = oreLavoro * pagaOraria;
            straordinariCorrenti = 0;
        }
        else
        {
            straordinariCorrenti = oreLavoro - 40;
            paga = (40 * pagaOraria) + straordinariCorrenti * (pagaOraria + pagaOraria/2);
        }
        if ((straordinariPrecedenti + straordinariCorrenti) >= 30)
            System.out.println("Troppi Straordinari");
        straordinariPrecedenti = straordinariCorrenti;

        return paga;
    }

    private String nome;
    private int pagaOraria;
    private int straordinariPrecedenti;
}
