package Poly;

public class Ford extends Car {

    @Override
    public String startEngine() {
        return "Ford-> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford->accelerate()";
    }

    @Override
    public String brake() {
        return "Ford->brake()";
    }

    public Ford(int cylinders, String name) {
        super(cylinders, name);





    }
}




