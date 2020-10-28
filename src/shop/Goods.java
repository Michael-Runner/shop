package shop;

public class Goods implements Comparable <Goods>{
    private String name;
    private int quantity;
    private int price;

    public Goods()
    {
        this.name = "null";
        this.quantity = 0;
        this.price = 0;
    }

    public Goods(String name, int quantity, int price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void quantityMinus()
    {
        this.quantity--;
    }

    @Override
    public int compareTo(Goods o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Goods tmp = (Goods) obj;

        if(this.name.equals(tmp.getName()) && tmp.quantity > 0)
        {
            flag = true;
        }
        return flag;
    }
}
