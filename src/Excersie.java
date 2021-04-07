public class Excersie {
    public static void main(String[] args) {
       double D1 = 20.00d;
       double D2 = 80.00d;
        double Total = (D1 + D2) *100.0d;
        System.out.println("toala value = "+ Total);
        double Theremainder = Total % 40.00d;
        System.out.println("The remainder ="+ Theremainder);
        boolean isNoemainder = (Theremainder == 0) ? true : false;
        System.out.println("is not the reaimnder = "+ isNoemainder);
        if( !isNoemainder ){
            System.out.println("got some remainder =" );
        }






    }
}
