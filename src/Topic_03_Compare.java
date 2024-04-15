public class Topic_03_Compare {
    int number = 8;

    public static void main(String[] args) {
        //1 vùng nhớ cho biến x
        int x =  5;

        //1 vùng nhớ cho biến y
        int y = x;

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        y = 10;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        Topic_03_Compare firstVariable = new Topic_03_Compare();
        Topic_03_Compare secondVariable = firstVariable;

        System.out.println("number before= "+ firstVariable.number);
        System.out.println("number before= "+ secondVariable.number);

        secondVariable.number = 15;
        System.out.println("number after= "+ firstVariable.number);
        System.out.println("number after= "+ secondVariable.number);
    }
}
