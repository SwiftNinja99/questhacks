import java.util.Scanner;
import java.util.Random;
public class NewJava {

    public static void main(String[] args) {
        boolean patented = false;
        boolean fundraised = false;
        int money = 8000;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("In your apartment, you have just finished designing your first prototype of you revolutionary invention. Wait, what was its name again?");
        String name = input.nextLine();
        while(money>0 && money<1000000){
            System.out.println("You have $"+ money + ", what should I do?");
            System.out.println("Should you:\n1) Hire someone for manufacturing($3000)");
            if(fundraised == false){
                System.out.println("2) Use a fundraising website");
            }
            if(patented == false){
                System.out.println("3) Buy a patent ($8000)");
            }
            int approval = rand.nextInt(100);
            System.out.println("People are "+approval+"% happy with your product.");
            int option = input.nextInt();
            if(option == 2){
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
                System.out.println("Now, you can either:\n1) Patent the product\n2) Begin manufacturing");
                int afterWeb = input.nextInt();
                if (afterWeb == 1){
                    money -=8000;
                    patented = true;
                }
                else{
                    if(approval>74){
                        money +=20000;
                    }
                    else if(approval>49){
                        money+= 15000;
                    }
                    else if(approval>24){
                        money+=10000;
                    }
                    else{
                        money-=5000;
                    }
                }
                System.out.println("A company named WUAWEI has stolen your idea! Will you sue for $100,000?(1:Yes, 2:No)");
                int sue = input.nextInt();
                if(sue == 1){
                    money-=100000;
                    if(patented == true){
                        System.out.println("You won the lawsuit! You got $1000000!");
                        money+=1000000;
                    }
                    else{
                        System.out.println("You lost the lawsuit since you never patented your product.");
                    }
                }
            }
            else if(option == 1){
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
                if(money>10000){
                    System.out.println("Would you like to buy a house for $10000?(1 for yes)");
                    if(input.nextInt() == 1){
                        money-=10000;
                        // UPGRADE HOUSE HERE
                    }
                }
            }
            else{
                System.out.println("You never tested your product! No one knows what it is, so nobody buys it.");
                money = 0;
            }
            int buyNum = rand.nextInt(2);
            String buyer = "Sooubway";
            int price = 1000000;
            if (buyNum == 1){
                buyer = "Fries";
                price = 500000;
            }
            else if(buyNum == 2){
                buyer = "Safety Way";
                price = 900000;
                
            }
            System.out.println("You have been approached by a company that wants to aquire your company named "+buyer);
            System.out.println("They are offering "+price+" for your company.");
            System.out.println("You have $"+ money + ", what should I do?");
            System.out.println("Do you accept?(1 for yes, 2 for no)");
            int accept = input.nextInt();
            if(accept == 1){
                money+=price;
                break;
            }
        }
        if(money<1){
            System.out.println("You didn't make it to a million dollars, and your product failed, so you went bankrupt!");
        }
        else if(money>=1000000){
            System.out.println("You're a millionare! Congratulations!");
        }
    }
}