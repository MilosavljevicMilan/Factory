
package main.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        Car audi8 = new Car();
        audi8.printAttributes();
        
        audi8.setModel("Audi broj 8");
        audi8.setBuildYear(2003);
        audi8.setCcm(2000);
        audi8.setColour("Zelena");
        
        audi8.printAttributes();
        
        Car fiatPunto = new Car();
        fiatPunto.setModel("Fiat");
        fiatPunto.setBuildYear(2019);
        
        fiatPunto.printAttributes();
        
        Car lada = new Car("Lada Niva", 1990, "green", 120, 50);
        lada.printAttributes();
        
        Car opel = new Car("opel", 2002, 200, 1300, 7, 150000);
        opel.printAttributes();
        opel.goToTravel(200);
        opel.printAttributes();
        opel.goToTravel(400);
        opel.printAttributes();
    }
}