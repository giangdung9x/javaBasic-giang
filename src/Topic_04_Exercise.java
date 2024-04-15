import java.sql.SQLOutput;
import java.util.Scanner;

public class Topic_04_Exercise {
/*
1 - Viét chuong trinh nhâp vão tên, tuôi cúa môt ngudi. Sau dó hién thi ra man hinh:
- After 15 years, age of {P1} will be {P2}
   Vói {P1} là tên cúa ngudi dó, (P2} là tuói cúa nguói dó sau 15 nám.
• Ví du nêu ban nhâp: Tuan 23                           -
o Thi màn hinh sé hiên thi lên: After 15 years, age of Tuan will be 38

2- Cho 2 bien kieu so nguyên a và b   viêt chuong trinh hoán doi giá tri cúa bien a va bien b. Sau dó  hiên thi ra màn hinh:
After swapping then a = (P1}, b = {P2}                                                            0
- Vói {P1} và (P2} lán luot là giá a tri cúa a va b sau khi dã b hoán doi
 Vi du néu ban nhâp a = 3, b = 4 nhu bên duói:  3 4
• Thi chuong trinh sê hién thi ra:
After swapping then a = 4, b = 3                                                           -

3 - Cho hai bien a va b kiêu sô nguyên - viêt chuong trinh hiën thi ra man hinh true nêu a lón hon b, nguóc lai hién thi ra false.
Ví du nêu ban nhâp a = 5, b = 4 gióng nhu sau:   5 4
Thi man hinh se hiên thi ra: true             -
• Ví du khác, nêu ban nhâp a = 3, b = 4 gióng nhu sau: 3 4
Thi man hinh se hiên thi ra:  false
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BAI 1
        System.out.println("Bai tap 1");

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();

        int ageafter = age +15;
        System.out.println("Afrer " + age + " years, age of " + name + " will be " + ageafter);
        System.out.println("----------------------------------");


        //BAI 2
        System.out.println("Bai tap 2");
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a sau khi hoan doi -> P1 = " + a);
        System.out.println("b sau khi hoan doi -> P2 = " + b);
        System.out.println("----------------------------------");

        //BAI 3
        System.out.println("Bai tap 3");
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        System.out.print("Nhập d: ");
        int d = scanner.nextInt();

        boolean bValue;
        bValue = (c>d) ? true: false;
        System.out.println("Ket qua a > b la " + bValue);

        System.out.println("----------------------------------");



    }

}
