import java.util.Objects;

public abstract class Human {

    private String name;
    private int age;
    private Layer layer;

    public Human(String name, int age, Layer layer) {
        this.name = name;
        this.age = age;
        this.layer = layer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Layer getLayer() {
        return layer;
    }

    public void setLayer(Layer layer) {
        this.layer = layer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, layer);
    }

    @Override
    public boolean equals(Object obj) {
        //если обе переменные ссылаются на один обьект
        if (this == obj) return true;
        //если явный параметр имеет пустое значение или не совпадают классы
        if (obj == null || getClass() != obj.getClass()) return false;
        //если все переменные равны
        Human other = (Human) obj;
        return name.equals(other.getName()) && age == other.getAge() && layer.equals(other.getLayer());
    }

    @Override
    public String toString() {
        return layer + " " + name;
    }
}
