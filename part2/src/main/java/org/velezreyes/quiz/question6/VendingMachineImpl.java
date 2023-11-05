package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
    private static float saldo;
    private static VendingMachine instance;
 
  public static VendingMachine getInstance() {
        instance = new VendingMachineImpl();
        return instance;
  }

    public VendingMachineImpl() {
        saldo=0;
    }
    
    public static float getSaldo() {
        return saldo;
    }
  

    @Override
    public void insertQuarter() {
        this.saldo+=0.25;
        System.out.println(this.saldo);
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        Drink drink;
        drink = null;
        if ("ScottCola".equals(name) || "KarenTea".equals(name)){
            if ("ScottCola".equals(name) && this.saldo >= 0.75) {
                drink = new DrinkImp("ScottCola",true);
                this.saldo-=0.75;
            }
            else if ("KarenTea".equals(name) && this.saldo >= 1) {
                drink = new DrinkImp("KarenTea",false);
                this.saldo-=1; 
            }
            else{throw new NotEnoughMoneyException();}
        } else {
        throw new UnknownDrinkException();
    }
        return drink;
    }
}


