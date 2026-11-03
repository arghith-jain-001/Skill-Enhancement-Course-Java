abstract class Bank {
    abstract double getInterestRate();
    public void displayMessage() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

void main(String[] args) {
    Bank sbi = new SBI();
    sbi.displayMessage();
    System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
    
    Bank hdfc = new HDFC();
    hdfc.displayMessage();
    System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
}
