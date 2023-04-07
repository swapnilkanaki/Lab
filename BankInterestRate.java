package comPack.labWork6_4;
// Bank Parent Class
class Bank {
    float getInterestRate(){
        System.out.println("Main Bank");
        return 0.0f;
    }
}
// SBI Child Class of Bank
class SBI extends Bank {
    @Override
    float getInterestRate() {
        return 8.0f;
    }
}

// ICICI Child Class of Bank
class ICICI extends Bank {
    @Override
    float getInterestRate() {
        return 7.0f;
    }
}

// AXIS Child Class of Bank
class AXIS extends Bank {
    @Override
    float getInterestRate() {
        return 9.0f;
    }
}


public class BankInterestRate {
    public static void main(String[] args) {
        Bank bank = new SBI(); // create an object of SBI bank
        System.out.println("SBI bank interest rate: " + bank.getInterestRate() + "%");  // get the interest rate

        bank = new ICICI(); // create an object of ICICI bank
        System.out.println("ICICI bank interest rate: " + bank.getInterestRate() + "%"); // get the interest rate

        bank = new AXIS(); // create an object of AXIS bank
        System.out.println("AXIS bank interest rate: " + bank.getInterestRate() + "%"); // get the interest rate
    }
}
