import java.util.Scanner;
import java.util.Random;
public class NewJava {

    public static void main(String[] args) {
        int money = 8000;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("In your apartment, you have just finished designing your first prototype of you revolutionary invention. Wait, what was its name again?");
        String name = input.nextLine();
        while(money>0 && money<1000000){
            System.out.println("I have $"+ money + ", what should I do?");
            System.out.println("Should I:\n1) Use a fundraising website\n2) Hire someone for manufacturing($3000)\n3) Buy a patent ($8000)");
            int approval = rand.nextInt(100);

            System.out.println("People are "+approval+"% happy with your product.");
            int option = input.nextInt();
            if(option == 1){
                if(approval>94){
                    money+=75000;
                }
                else if(approval>84){
                    money+=50000;
                }
                else if(approval>74){
                    money+=25000;
                }
                else if(approval>49){
                    money+=15000;
                }
                else{
                    money+=5000;
                }
                System.out.println("You now have "+ money + " after fundraising on Flickstarter");
            }
            else if(option == 2){
                money-=3000;
                System.out.println("You now have a large inventory. You sold " + approval + "% of the stock.");
                if(approval>94){
                    money +=100000;
                }
                else if(approval>74){
                    money+= 50000;
                }
                else if(approval>49){
                    money+=25000;
                }
                else{
                    money-=10000;
                }
            }
            else{
                System.out.println("You never tested your product! No one knows what it is, so nobody buys it.");
                money = 0;
            }
        }
        if(money<1){
            System.out.println("Your product failed, so you went bankrupt!");
        }
        else if(money>=1000000){
            System.out.println("You're a millionare! Congratulations!");
        }
    }
}