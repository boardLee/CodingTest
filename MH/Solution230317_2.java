import java.util.Scanner;

public class Solution230317_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
        String result = "";
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                result += "*";
            }
            System.out.println(result);
            result = "";
        }
    }
}
