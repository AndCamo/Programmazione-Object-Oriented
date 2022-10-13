public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(double consumptionRate){
        this.gas = 0;
        this.consumptionRate = consumptionRate;
    }

    public double getGas() {
        return this.gas;
    }

    public void addGas(double gas) {
        this.gas += gas;
    }

    public void drive(double km) {
        double autonomia = gas / consumptionRate;
        if(km > autonomia) {
            System.out.println("Non hai abbastanza carburante!");
        }
        else {
            double consumo = consumptionRate * km;
            gas = gas - consumo;
        }
    }
}