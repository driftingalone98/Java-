import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        System.out.println("name = " + name);
        
        int age = scan.nextInt();
        System.out.println("age = " + age);
        
        double weight = scan.nextDouble();
        System.out.println("weight = " + weight);
        
        boolean isSingle = scan.nextBoolean();
        System.out.println("isSingle = " + isSingle);
        
        char gender = scan.next().charAt(0);
        System.out.println("gender = " + gender);
        
        System.out.println("网名："+name+"年龄："+age+"体重"+weight+"单身“"+isSingle+"性别"+gender);
    }
}