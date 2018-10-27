package neighbourhood.models;

public class Administration {
    private final String name;
    private final int id;

    public Administration(String name, int id) {
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
