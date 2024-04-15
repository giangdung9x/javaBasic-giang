public class Topic_01_Variable {
    //Global variable
    static int number;
    String address = "Ho Chi Minh";
    static int studentNumber;
    static boolean status;
    static final String browserName = "Chrome"; //final thì sẽ không được gán nữa, không se bị báo lỗi
    String studentName = "Automation FC";
    public static void main(String[] args) {
        System.out.println(studentNumber);
        System.out.println(status);

        //Local variable
        int studentNumber = 0;
        System.out.println(studentNumber);

        System.out.println(number);

        Topic_01_Variable topic = new Topic_01_Variable();
        System.out.println(topic.address);
    }

    //getter: getCurrentUrl/getTitle/getText/getAttribute/getCssValue/getSize/...
    public String getStudentName(){
        return this.studentName;
    }
    //setter: click/sendkey/clear/select/back/forward/refresh/get/...
    public void setStudentNumber(String sdtName){
        this.studentName = sdtName;
    }


}