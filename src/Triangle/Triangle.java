package Triangle;

public class Triangle {

   private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) throws IllegalAccessException {
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalAccessException("Wrong arguments to create triangle with sides "
            + sideA + " " + sideB + " " + sideC);
        }
    }
}
