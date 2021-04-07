public class Ifexample {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of an alien");


            int topScore = 80;


            int secondTopScore = 81;
            if((topScore > secondTopScore) && (topScore < 100)){
                System.out.println("Greater than second top score and less than 100");
            }

            if((topScore>90)|| (secondTopScore <=90)){
                System.out.println("eithe or  both of the conditions are true");
            }

            int newValue =50;
            if (newValue == 50){
                System.out.println();
            }



        }
    }
}

