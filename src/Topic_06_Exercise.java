import java.util.Scanner;

public class Topic_06_Exercise {
/*
1- Viet chuong trinh nhap vao tu ban phim so nguyen n
Sau do kiem tra xem neu n la so chan thi hien thi: n la so chan
neu n la so le thi hien thi: n la so le

2- Viet chuong trinh nhap vao tu ban phim 2 so nguyen a va b, sau do hien  thi ra man hinh
- Neu a>b hoac a=b thi hien thi a>= b
- Neu a<b thi hien thi a<b

3 - Viet chuong trinh nhap ten cua 2 nguoi, hay kiem tra ten cua 2 nguoi nay giong nhau k
- Neu co thi hien thi ra: 2 nguoi la cung ten
- Nguoc lai hien thi ra: 2 nguoi la khac ten

4- Viet chuong trinh nhap vao tu ban phim 3 so nguyen. Sau do hien thi ra so lon nhat trong 3 so nay
vi du neu nhap 4 7 3
man hinh hien thij 7
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BAI 1
        System.out.println("Bai tap 1");

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int sodu = n%2;

        if(sodu == 0) {
            System.out.println(n + " la so chan");
        } else{
            System.out.println(n + " la so le");
        }
        System.out.println("----------------------------------");

        //BAI 2
        System.out.println("Bai tap 2");
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        if(a>b||a==b){
            if(a>b) {
                System.out.println(a + " lon hon " + b);
            } else {
                System.out.println(a + " bang " + b);
            }
        } else {
            System.out.println(a + " nho hon " + b);
        }
        System.out.println("----------------------------------");

        //BAI 3
        System.out.println("Bai tap 3");
        System.out.print("ten user 1: ");
        String user1 = scanner.nextLine();
        System.out.print("ten user 2: ");
        String user2 = scanner.nextLine();

        if(user1.equals(user2)){
            System.out.println("user 1 va user 2 la cung ten");
        } else {
            System.out.println("user 1 va user 2 la khac ten");

        }
        System.out.println("----------------------------------");


        //BAI 4
        System.out.println("Bai tap 4");
        System.out.println("Nhập ba số từ bàn phím:");
        System.out.print("Số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Số thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.print("Số thứ ba: ");
        int num3 = scanner.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Số lớn nhất là: " + max);
        System.out.println("----------------------------------");

/*
5- Viet chuong trinh nhap tu ban phim so nguyen a. ban hay kiem tra xem a co nam trong doan [10,100] khong?
- neu co thi hien thi ra man hinh {P} nam trong [10,100]
- va nguoc lai

6- Viet chuong trinh nhap vao diem cua sinh vien, hay kiem tra xem diem nhap vao tuong ung voi xep hang nao
0<5: D;
5<7.5: C;
7.5 < 8.5: B
8.5-10: A

7- Viet chuong trinh nhap vao mot thang, hien thi so ngay cua thang do:
*/
        //BAI 5
        System.out.println("Bai tap 5");
        System.out.print("So nguyen A: ");
        int A = scanner.nextInt();
        if(A>=10 && A<=100){
            System.out.println(A + " nằm trong đoạn [10, 100]");
        } else {
            System.out.println(A + " không nằm trong đoạn [10, 100]");
        }
        System.out.println("----------------------------------");

        //BAI 6
        System.out.println("Bai tap 6");
        System.out.print("Nhập điểm của sinh viên: ");
        double diem = scanner.nextDouble();

        if (diem >= 0 && diem < 5) {
            System.out.println("Điểm tương ứng: D");
        } else if (diem >= 5 && diem < 7.5) {
            System.out.println("Điểm tương ứng: C");
        } else if (diem >= 7.5 && diem < 8.5) {
            System.out.println("Điểm tương ứng: B");
        } else if (diem >= 8.5 && diem <= 10) {
            System.out.println("Điểm tương ứng: A");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
        System.out.println("----------------------------------");


        //BAI 7
        System.out.println("Bai tap 7");
        System.out.print("Nhập vào một tháng (1-12): ");
        int thang = scanner.nextInt();

        int soNgay;

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            soNgay = 31;
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            soNgay = 30;
        } else if (thang == 2) {
            System.out.print("Nhập vào năm: ");
            int nam = scanner.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                soNgay = 29;
            } else {
                soNgay = 28;
            }
        } else {
            System.out.println("Tháng không hợp lệ!");
            scanner.close();
            return;
        }

        System.out.println("Số ngày của tháng " + thang + " là: " + soNgay);

    }


}
