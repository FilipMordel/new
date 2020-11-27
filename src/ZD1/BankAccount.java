package ZD1;

public class BankAccount {
    private int number;
    private double cash = 0;

    public BankAccount(int numer){
        this.number = numer;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void depositCash(double x) {
        if (x>0){
        this.cash = this.cash + x;
        }
        else{
            //
        }
    }
    public void withdrawCash(double y){
        if (y<cash){
            this.cash= this.cash - y;
        }
        else if (y > 0){
            this.cash= this.cash - y;
        }
        else if (y>cash){
            this.cash= this.cash;
        }
    }
    public String toString(){
        return "Numer konta: " + this.number + "\nStan konta: " + this.cash;
    }
}
