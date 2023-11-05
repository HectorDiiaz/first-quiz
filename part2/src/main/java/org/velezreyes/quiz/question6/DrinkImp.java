
package org.velezreyes.quiz.question6;
public class DrinkImp implements Drink{
    private String name;
    private boolean isFizzy;
    
    public DrinkImp(String name, boolean isFizzy) {
        this.name = name;
        this.isFizzy = isFizzy;
    }

    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFizzy() {
        return this.isFizzy;
    }
    
}
