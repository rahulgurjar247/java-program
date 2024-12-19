import java.util.*;

public class P12_marks {
    public static void main(String args[]) {
        method obj = new method();
        obj.getMarks();
        obj.result();

    }
}

class method {
    int itpc, dbms, dsa, lld, hld;

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for itpc,dbms,dsa,lld,hld");
        itpc = sc.nextInt();
        dbms = sc.nextInt();
        dsa = sc.nextInt();
        lld = sc.nextInt();
        hld = sc.nextInt();
    }

    void obtainMarks() {
        System.out.println("itps 100 :" + itpc);
        System.out.println("dbms 100 :" + dbms);
        System.out.println("dsa 100  :" + dsa);
        System.out.println("lld 100  :" + lld);
        System.out.println("hld 100  :" + hld);
    }

    void totalMarks() {
        System.out.println("total : " + (itpc + dbms + dsa + lld + hld));
    }

    int getPercentage(int num) {
        return num;
    }

    String grade(int num) {
        if (num > 90) {
            return "A+";
        } else if (num > 75) {
            return "b";
        } else if (num > 50) {
            return "c";
        } else {
            return "Fail";
        }

    }
    int getTotalpercentage(){
        return (((itpc+dbms+dsa+lld+hld) *100)/500);
    }

    void result() {
        System.out.println("Total  " + "  obtain  " + "  grade" + "  percentage");
        System.out.println("100 " + "     " + itpc + "        " + grade(itpc) + "     " + getPercentage(itpc));
        System.out.println("100 " + "     " + dbms + "        " + grade(dbms) + "     " + getPercentage(dbms));
        System.out.println("100 " + "     " + dsa + "        " + grade(dsa) +   "     " + getPercentage(dsa));
        System.out.println("100 " + "     " + lld + "        " + grade(lld) +   "     " + getPercentage(lld));
        System.out.println("100 " + "     " + hld + "        " + grade(hld) +   "     " + getPercentage(hld));
        System.out.println("\n total percentage : " + getTotalpercentage() );

    }

}
