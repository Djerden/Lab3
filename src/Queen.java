import java.util.Objects;

public class Queen extends Human implements AbleToWin, AbleToLose {
    private String[] setPhrase = {"я как всегда на высоте!",
            "в войне побеждает не тот, кто прав, а тот, кто оставлся в живых",
            "у победителей раны не болят",
            "сильнее тот, кто первый"};
    public Queen(String name, int age) {
        super(name, age, Layer.QUEEN);
    }

    @Override
    public void sayWinPhrase() {
        int rand = (int) (Math.random() * setPhrase.length);
        System.out.println(toString() + " говорит: " + setPhrase[rand]);
    }

    @Override
    public void sayLosePhrase() {
        System.out.println(toString() + " кричит: отрубить голову!");
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
        if (!super.equals(obj)) return false;
        return (obj instanceof Queen);
    }
}
