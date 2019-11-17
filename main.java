import processing.core.PApplet;
import processing.core.PImage;
import java.util.Scanner;
import java.util.Random;

public class buisnessSim extends PApplet {

    public PImage imgApartment;
    public PImage leftHand;
    public PImage rightHand;
    public PImage withPhone;
    public PImage Office;
    public PImage winScreen;
    public PImage loseScreen;
    int timer = 0;
    boolean patented = false;
    boolean fundraised = false;
    int money = 8000;

    public static void main(String[] args) {
        PApplet.main("buisnessSim");

    }


    public void settings() {
        size(600, 400);
    }

    public void setup() {
        imgApartment = loadImage("./img/apartmentPhone.png");
        imgApartment.resize(600, 400);
        Office = loadImage("./img/Office.png");
        Office.resize(600,400);
        leftHand = loadImage("./img/leftHand.png");
        leftHand.resize(120, 120);
        rightHand = loadImage("./img/rightHand.png");
        rightHand.resize(120, 120);
        withPhone = loadImage("./img/withPhone.png");
        withPhone.resize(120, 120);
        winScreen = loadImage("./img/victory screen.png");
        winScreen.resize(600,400);
        background(imgApartment);
        loseScreen = loadImage("./img/lose screen.png");
        loseScreen.resize(600,400);
        animationNoPhone();
    }

    public void draw(){
        while(money>0 && money<1000000){
            Scanner input = new Scanner(System.in);
            Random rand = new Random();

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
                        System.out.println("HUAWEI did what you did and your company starts losing money. You cant continue your buisness.");
                    }
                }
            }
            else if(option == 1){
                money-=3000;
                System.out.println("You now have a large inventory. You sold " + approval + "% of the items.");
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
                        background(Office);


                    }
                }
            }
            else{
                System.out.println("You never tested your product! No one knows what it is, so nobody buys it.");
                money = 0;
                break;

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
            background(loseScreen);
        }
        else if(money>=1000000){
            System.out.println("You're a millionare! Congratulations!");
            background(winScreen);
        }
    }

    public void animationNoPhone() {
        if (timer == 30) {
            timer = 1;
        }
        else {
            timer++;

        }
        if (timer <= 5) {
            image(leftHand, 480, 150);
        }
        else if (timer <= 10) {
            image(rightHand, 480, 150);
        }
        else if (timer <= 15) {
            image(leftHand, 480, 150);
        }
        else if (timer <= 20) {
            image(rightHand, 480, 150);
        }
        else if (timer <= 25) {
            image(leftHand, 480, 150);
        }
        else if (timer <= 30) {
            image(rightHand, 480, 150);
        }


    }





}