public class Guest {

    private String name;
    private int age;
    private double wallet;


    public Guest(String name, int age, double wallet) {
        this.name = name;
        this.age = age;
        this.wallet = 0;

    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(){
        this.wallet = wallet;
    }

}