public class p8_class{
    int age ;
    void getAge(int num){
        this.age = num;
    }
    void showData(){
        System.out.println("age :" + age);
    }
    public static void main(String[] args) {
        p8_class m1 =new p8_class();
        m1.getAge(100);
        m1.showData();
    }
}