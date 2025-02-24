package MVC;

import java.util.Scanner;

public class View {

     private static final Scanner scanner = new Scanner(System.in);

    private String getStr(String str){
        System.out.println(str);
        return scanner.next();
    }
    public double getValue(String str){
        System.out.println(str);
        return  scanner.nextDouble();

    }
    public void printResult(Double result){
        System.out.println("Result: " + result);

    }
    public void print_msg(String msg){
        System.out.println(msg);
    }
    public void print_Menu(){
        System.out.println("------ CHOOSE OPERATION ------");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
        System.out.println("5. exit");

    }
}
