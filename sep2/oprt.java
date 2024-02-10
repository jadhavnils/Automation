package sep2;

public class oprt {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        String s1 ="pramod";
        String s2= "datta";
        System.out.println(a+b);
        System.out.println(a-b);
    // here who is bigger they are excute.(first string then int)
        System.out.println(s1+s2+a+b);   //pramoddatta2030
        System.out.println(s1+s2+(a+b)); // pramoddatta50
        boolean c1= !true;
       boolean c2 = !false;
        System.out.println(c1);
        System.out.println(c2);


    }
}
