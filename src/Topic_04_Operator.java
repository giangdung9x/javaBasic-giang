public class Topic_04_Operator {
    public static void main(String[] args) {
        int number = 10;

        number += 5;
        System.out.println(number);

        number = number +5;
        System.out.println(number);

        System.out.println(number / 6); //lay phan nguyen
        System.out.println(number % 6); //lay phan du

        System.out.println(number++);
        //In number ra truoc = 10
        // ++ = tang number len 11 =11

        System.out.println(++number);
        //++ truoc: tang number len 1 -> tu 11 thanh 12
        //sau do in number = 12 ra man hinh



    }
}
