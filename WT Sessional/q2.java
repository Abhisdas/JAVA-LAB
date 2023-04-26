import java.util.Scanner;

class Invalid_Date_Exception extends Exception{
    Invalid_Date_Exception(String s){
        super(s);
    }
}
class Number_Name_Exception extends Exception{
    Number_Name_Exception(String a){
        super(a);
    }
}
public class q2{
    static void displace(String date)throws Number_Name_Exception{
        try{
            String []res = date.split("-");
            int a = Integer.parseInt(res[0]);
            int b  = Integer.parseInt(res[1]);
        }catch(NumberFormatException e){
            throw new Number_Name_Exception("It contain letters");
        }
    }
    static void find_time(String date)throws Invalid_Date_Exception{
        try{
            String []res = date.split("-");
            int a = Integer.parseInt(res[0]);
            int b = Integer.parseInt(res[1]);
            int c = Integer.parseInt(res[2]);
            if(a >0 && a<=30 && b>0 && b<=12 && c>0 && c<=2022){
                System.out.println("This is the correct date format");
            }
            else{
                throw new Invalid_Date_Exception("This is an invalid date");
            }
        }catch(Invalid_Date_Exception o){
            System.out.println(o.getMessage());
        }
    }
    public static void main(String[] args) {
        String date;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in dd:mm:yyyy format:\t");
        date = sc.nextLine();
        try{
            try {
                displace(date);
            } catch (Number_Name_Exception e) {
                 System.out.println(e.getMessage());
                System.exit(0);
            }
            find_time(date);
        }catch(Invalid_Date_Exception o){};
    }
}