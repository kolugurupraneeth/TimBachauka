package Composition;

public class Main {
    public static void main(String[] args) {

        Case lsCase = new Case("225e","Dell","240v",new Dimensions(20,20,5));
        Monitor theMonitor =  new Monitor("27 inch beast","Acer",27,new Resolution(2540,4559));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","ASUS",4,6,"2.44");
        PC thePC = new PC(lsCase,theMonitor,theMotherBoard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherBoard().loadProgram("windows 10.0");
        thePC.getLsCase().pressPowerButton();
    }
}
