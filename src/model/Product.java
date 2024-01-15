package model;

public  class Product {
    public int id;
    public String name;
    public int cost;
    public String discription;

    public Product() {
    }

    public Product(int id, String name, int cost, String discription) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", discription='" + discription + '\'' +
                '}';
    }
}
