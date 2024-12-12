public class p10_overloding {
    void add(int a,int b){
        System.out.println("addition is "+ (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("addition is "+ (a+b+c));
    }
    public static void main(String[] args) {
            p10_overloding obj =  new p10_overloding(); 
            obj.add(5, 10);
            obj.add(10, 15, 30);     
    }
}
