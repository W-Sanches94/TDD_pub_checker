public class Server {
    public boolean canServeGuest(Guest guest){
        if(guest.getAge() <= 18){
            return false;
        }
        if(guest.getWallet() <= 5){
            return false;
        }
        if(guest.getSobriety() <= 50){
            return false;
        }
        if(guest.getBan() == false){
            return false;
        }
        return true;
    }

}
