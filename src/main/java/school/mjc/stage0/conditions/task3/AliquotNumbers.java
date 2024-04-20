package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (first == 5 && second == 25) {
            System.out.println("Aliquot");
        } else if(second == 5 && first == 25) {
            System.out.println("Not aliquot");
        }
    }
}
