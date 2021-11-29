import java.util.Objects;

public class Soldier extends Human implements PerformMilitaryService {
    public Soldier(String name, int age) {
        super(name, age, Layer.SOLDIER);
    }

    @Override
    public void arrest() {
        System.out.println(toString() + " производит арест");
    }

    @Override
    public String toString() {
       return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return false;
        return (obj instanceof Soldier);
    }
}
