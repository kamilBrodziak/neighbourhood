package neighbourhood.models;

public class Commune {
    private final String name;
    private final int id;

    public Commune(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
