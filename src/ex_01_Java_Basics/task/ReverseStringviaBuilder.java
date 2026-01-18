package ex_01_Java_Basics.task;
import java.util.Scanner;
public class ReverseStringviaBuilder {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            // Reverse and print the string
            StringBuilder sb = new StringBuilder("");
            for(int i=str.length()-1; i >=0; i--){
                char c = str.charAt(i);
                sb.append(c);
            }
            System.out.println(sb.toString());

        }
    }

