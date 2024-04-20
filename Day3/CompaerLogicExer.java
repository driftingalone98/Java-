public class CompaerLogicExer{
    public static void main(String[] args){
        int a = 20, b = 20;
        boolean bo1 = (++a % 3 == 0) && ( a++ % 7 == 0);
        System.out.println("a:"+a+"bo1:"+bo1);
        System.out.println("----------------------");
        boolean bo2 = (b++ % 3 == 0) && ( ++b % 7 == 0);
        System.out.println("b:"+b+"bo2:"+bo2);
    }
}