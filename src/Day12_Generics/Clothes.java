package Day12_Generics;

public abstract class Clothes {
    private String label;
    private String name;
    private String size;

    protected Clothes(String label, String name, String size) {
        this.label = label;
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Name: %-20s Size %-3s Label: %s",name,size,label);
    }
}
