import java.util.ArrayList;
import java.util.Objects;

public class Citizen extends Human implements AbleToWin {
    private double chance;
    private String[] setPhrase = {"не все ли равно, хитростью или доблестью победил ты врага?",
            "нет ничего радостнее победы",
            "победа над другими дает силу, победа над собой - бесстрашие", "пришел, увидел, победил!",
            "Величайшая победа - победа над самим собой!",
            "или умейте побеждать, или умейте дружить с победителем",
            "задача полководца - побеждать столько же умом, сколько мечом"};

    public Citizen(String name, int age, Layer layer, double chance) {
        super(name, age, layer);
        this.chance = chance;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    public boolean chanceForForgiveness() {
        if(Math.random() < chance) {
            System.out.println(this.toString() + " помилован королевой");
            return true;
        }
        else {
            System.out.println(this.toString() + " не будет помилован королевой");
            return false;
        }
    }

    @Override
    public void sayWinPhrase() {
        int rand = (int) (Math.random() * setPhrase.length);
        System.out.println(toString() + " говорит: " + setPhrase[rand]);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(chance).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Citizen other = (Citizen) obj;
        return chance == other.getChance();
    }
}

