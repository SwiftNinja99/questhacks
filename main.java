import java.util;
public class PlayerTester {

	public static void main(String[] args) {
        int money = 8000;
        Scanner input = new Scanner(System.in);
        System.out.println("In your apartment, you have just finished designing your first prototype of you revolutionary invention.
        Wait, what was its name again?");
        String name = input.nextLine();
        while(money>0){
            System.out.println("I have $"+ money + ", what should I do?");
            System.out.println("Should I:\n1) use a fundraising website\n2)hire someone for manufacturing\n3) buy a patent ($8000)");
            int approval = Math.random()*100;
            System.out.println(approval);
        }
    }
}