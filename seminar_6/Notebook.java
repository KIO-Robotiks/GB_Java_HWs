public class Notebook {
    private String name;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public Notebook(String name, Integer ram, Integer hdd, String os, String color) {
        if (name == "") this.name = "any";
            else this.name = name;
        if (os == "") this.os = "any";
            else this.os = os;
        if (color == "") this.color = "any";
            else this.color = color;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String name = "Название ноутбука: " + this.name + "\n";
        String ram = "RAM: " + String.format("%d", this.ram) + "\n";
        String hdd = "HDD: " + String.format("%d", this.hdd) + "\n";
        String os = this.os + "\n";
        String color = this.color + "\n";
        return name + ram + hdd + os + color;
    }
}
