public class Guest {

    private String name;
    private int age;
    private double wallet;

    private int sobriety;

    public boolean ban;


    public Guest(String name, int age, double wallet, int sobriety, Boolean ban) {
        this.name = name;
        this.age = age;
        this.wallet = 0;
        this.sobriety = 0;
        this.ban = ban;

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

    public int getSobriety() {
        return this.sobriety;
    }

    public void setSobriety(){
        this.sobriety = sobriety;
    }

    public boolean getBan(){
        return this.ban;
    }

    public void SetBan(){
        this.ban = ban;
    }

}