public class p2 {
    public static void main(String[]args){
        // int i = 0;
        // double salary = 450000.54;
        // String name = "rahul gurjar";

        // System.out.println(++i);
        // System.out.println(name);
        // System.out.println(salary+20);

        for(int i=0;i<100;i++){
            if(i%2 == 0){
                System.out.println("even");
                // break;
                continue;
            }
            System.out.println(i);
        }
        int ans = AddNum(150, 400);
        System.out.println("Addition: " + ans);
    }

    public static int AddNum(int a,int b){
        return a+b;
    }
}

