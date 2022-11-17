public class Server {
    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 19){
            return false;
        }
        if(guest.getWallet() <= 5){
            return false;
        }
        return true;
    }

}
