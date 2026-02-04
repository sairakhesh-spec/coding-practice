import java.util.*;
public class UsValidYearMonthDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        if((year <= 0)||(month > 12)||(month < 1)){
            System.out.println("It is not a Valid YEAR OR MONTH !!");
        }
        else {
            int Days;

            if (month==2) {
               if((year%4==0 && year%100!=0)||(year%400==0))
               Days = 29;
            else
                Days = 28;
            }   
            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                Days=31;
            }
            else {
                Days = 30;
            }

            System.out.println("Number of days :" +Days);

        }

    }
}
    

