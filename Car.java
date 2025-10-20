public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private double price;
    private String RegistrNumber;
    

    public car(int id, String mark, String model, int year, String color, double price, String RegistNubmer) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.RegistrNumber = RegistNubmer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getmark() {
        return mark;
    }
    public void setmark(String mark) {
        this.mark = mark;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public int getyear() {
        return year;
    }
    public void setyear(int year) {
        this.year = year;
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public String getRegistNumber() {
        return RegistrNumber;
    }
    public void setRegisterNumber(String RegistNubmer) {
        this.RegistrNumber = RegistNubmer;
    }
    }
