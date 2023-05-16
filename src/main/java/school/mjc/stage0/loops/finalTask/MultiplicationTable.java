package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 1; i <= numberTableToPrint; i++) {
                System.out.print("" + i + " * " + numberTableToPrint + " = " + i * numberTableToPrint);
            
            System.out.println();
        }
    }
}
