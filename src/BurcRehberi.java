import java.util.Scanner;
public class BurcRehberi {
    public static void main(String []args){
        int month = 1,day = 1;
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter your birth month: ");
            month = input.nextInt();
            System.out.println("Enter your birth day: ");
            day = input.nextInt();
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
        try {
            if((month >= 1 && month <=12) || (day>=1 && day<=31)){
                if(month == 1){
                    if(day <22){
                        System.out.println("Capricorn");
                    }
                    else
                    {
                        System.out.println("Aquarius");
                    }
                }
                else if(month == 2){
                    if(day<20){
                        System.out.println("Aquarius");
                    }
                    else
                    {
                        System.out.println("Pisces");
                    }
                }
                else if(month == 3){
                    if(day <21){
                        System.out.println("Pisces");
                    }
                    else
                    {
                        System.out.println("Aries");
                    }
                }
            }
            else{
                System.out.println("Please try again with day(1-31) and month (1-12)");
            }
        }catch (Exception e){
            System.out.println("Error! " + e);
        }
    }
}
