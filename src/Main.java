public class Main {
    public static void main(String[] args) {
        int currentBalance = 500 ;
        int addedFunds = 1500 ;
        int totalBalance = 2000 ;
        int bonus ;

        if (addedFunds > 1000) {
            bonus = addedFunds / 100 ;
        } else bonus = 0 ;

        System.out.println("Итоговый бонус:" + bonus);
        

    }
}