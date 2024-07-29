package bankaccount;
import java.util.Scanner;
//public class Account {
//
//
//        int AccountId;
//        String HolderName;
//
//        int balance;
//        int credited;
//        int negativebal;
//
//        public Account(int accountId, String holderName, int balance,int credited) {
//            this.AccountId = accountId;
//            this.HolderName = holderName;
//            this.balance = balance;
//            this.credited = credited;
////        this.negativebal = negativebal;
//        }
//        public Account(int negativebal)
//        {
//            this.negativebal = negativebal;
//        }
//
//        public int setBalance(int balance,int credited){
//            return balance + credited;
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int AccountId = sc.nextInt();
//            sc.nextLine();
//
//            String HolderName = sc.nextLine();
//            int balance = sc.nextInt();
//            int credited = sc.nextInt();
//            int negativebal = sc.nextInt();
//
//
//            if(balance < 0)
//            {
//                balance = 0;
//            }
//
//            if(AccountId < 100 &&  AccountId > 999)
//            {
//                AccountId = -1;
//            }
//
//            Account a = new Account(AccountId,HolderName,balance,credited);
//            VIPAccount vip = new VIPAccount(negativebal);
//
//            System.out.println(AccountId+" "+HolderName+" "+balance);
//            System.out.println(a.setBalance(balance,credited));
//            vip.setBalance();
//
//        }
//
//
//}

class Account
{
  int accountid;
  String holdername;
  int balance;

    public Account(int accountid, String holdername, int balance) {
        this.accountid = accountid;
        this.holdername = holdername;
        this.balance = balance;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}