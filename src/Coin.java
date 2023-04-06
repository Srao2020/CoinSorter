/**
 * Coin Machine Project
 * @author Srao2020
 * @version 3/30/23
 */

public abstract class Coin {
    public abstract double getValue();
    public abstract String getName();
    public String getPluralName() {
        return getName().equals("penny") ? "pennies" : getName() + "s";

    }

    public boolean equals(Object other) {
        if (other instanceof Coin) {
            return this.getValue() == ((Coin)other).getValue();
        }
        return false;
    }
}
