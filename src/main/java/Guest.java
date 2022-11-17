public class Guest {

    private String name;
    private int age;
    private double wallet;

    private int sobriety;


    public Guest(String name, int age, double wallet, int sobriety) {
        this.name = name;
        this.age = age;
        this.wallet = 0;
        this.sobriety = 0;

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
        return this.wallet;
    }

    public void setWallet(){
        this.wallet = wallet;
    }

}