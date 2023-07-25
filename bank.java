import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        bank b1=new bank();
        b1.name="Sanjeevkumar M";
        b1.area="Dharapuram";
        b1.num=63;
        b1.acbal=1200;
        b1.pincode=638703;
        System.out.println("1.Personal info");
        System.out.println("2.Acc info");
        System.out.println("3.Withdrawl ");
        System.out.println("4.Deposit ");
        System.out.println("Enter Your Choice    :");
        Scanner inp=new Scanner(System.in);
        String k;
        k=inp.next();
        switch (k){
            case "1":
                b1.info();
                break;
            case"2":
                System.out.println("Enter Username :");
                String user=inp.next();
                System.out.println("Enter Password :");
                String pass=inp.next();
                String password="1234";
                String username="sanjeev";
                inp.close();
                if(pass.equals(password) && user.equals(username)){
                    b1.ac_info();
                }
                else{
                    System.out.println("Enter Valid Credentials");
                }
                break;
            case "3":
                System.out.println("How Much You Want To Withdarawl");
                int amnt1=inp.nextInt();
                if(amnt1<=b1.acbal){
                    b1.withdrawl(amnt1);
                    System.out.println("Take Your Cash");
                }
                else{
                    System.out.println("Insufficient Funds!!");
                    System.out.println("Please Check Your Balance");
                }
                break;
            case"4":
                System.out.println("How Much You Want To Desposit!!!!!");
                int amnt2=inp.nextInt();
                b1.deposit(amnt2);
                System.out.println("Thanking You");
                break;
            default:
                System.out.println("Please Enter Valid Details !!!");
        }
    }
}
class bank{
    String name;
    String area;
    int num;
    int pincode;
    int acbal;

    void info(){
        System.out.println("Account Holder's Name Is     :"+name);
        System.out.println("Account Holder's Area Is     :"+area);
        System.out.println("Account Holder's Number Is   :"+num);
        System.out.println("Account Holder's Pincode Is  :"+pincode);
    }
    void ac_info(){
        System.out.println("Account Holder Name Is   :"+name);
        System.out.println("Account Balance Is       :"+acbal);

    }
    void withdrawl(int x){
        acbal=acbal-x;
        System.out.println("Account Balance Is = "+acbal);
    }
    void deposit(int x){
        acbal=acbal+x;
        System.out.println("Account Balance Is = "+acbal);
    }
}