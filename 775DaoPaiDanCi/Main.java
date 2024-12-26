import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine();
        String[] inputs=input.split(" ");
        for(int i=inputs.length-1;i>=0;--i){
            System.out.printf("%s ",inputs[i]);
        }
    }
}
