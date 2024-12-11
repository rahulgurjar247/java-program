public class p7_factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = fact(num);
        // for(int i=num ;i>0 ;i--){
        //     fact = fact * i;
        // }

        System.out.println("fact:"+fact);
    }
    static int fact(int num ){
        if(num==1){
            return num;
        }
        return num * fact(num-1);
    }
}
