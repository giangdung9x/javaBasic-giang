public class Topic_02_Exercise {
//Câu 1: Viết chương trình tính toán và hiển thị thông tin với các phép toán số học
//    a = 6
//    b = 2
// Tính và hiển thị kết quả của các phép toán
//            P1 = a + b  # Tổng của a và b
//            P2 = a - b  # Hiệu của a và b
//            P3 = a * b  # Tích của a và b
//            P4 = a / b  # Thương của a và b
// Trong đó P1 là tổng của a và b, P2 là hiệu, P3 là tích, P4 là thương


//# Câu 2: Viết chương trình tính và hiển thị diện tích của hình chữ nhật có chiều dài 7.5 rộng 3.8. Viết ctrinh hiển thị diện tích HCN
    // Area = {P}
    // Với {P} là diện tích HCN



//# Câu 3: Viết chương trình hiển thị thông điệp chào với tên được định nghĩa trước
//    name = "Automation Testing"
//   thưcj hiệnin ra màn hình dòng chữ Hello Automation Testing

    public static void main(String[] args) {
        //Bai 1
        System.out.println("Ex1:");
        int a = 6;
        int b = 2;
        System.out.println("P1 ="+ (a+b));
        System.out.println("P2 ="+ (a-b));
        System.out.println("P3 ="+ (a*b));
        System.out.println("P4 ="+ (a/b));
        System.out.println("-----------------------------");


        //Bai 2
        System.out.println("Ex2:");
        double length = 7.5;
        double width = 3.8;
        System.out.println("Area="+ (length*width));
        System.out.println("-----------------------------");


        //Bai 3
        System.out.println("Ex3:");
        String name = "Automation Testing";
        System.out.println("Hello "+ name);
        System.out.println("-----------------------------");


    }

}
