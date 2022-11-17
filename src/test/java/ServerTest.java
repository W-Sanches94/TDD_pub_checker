import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @BeforeEach
    public void setUp() {
        server = new Server();
        char GBP = '£';
        guest = new Guest("robert", 36, 5.00, 30, false);
        guest2 = new Guest("jayden", 15, 5.00, 100, true);
        guest3 = new Guest("Ellie", 29, 3.79, 100, false);
        guest4 = new Guest("Jade", 25, 18.67, 50, false);
        guest5 = new Guest("Kay", 30, 25.00, 50, false);
        guest5 = new Guest("Tina",19,34.00,50,false,"GBP");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void LegalLimit18() {
        server.canServeGuest(guest);
        assertThat(server.canServeGuest(guest)).isFalse();
    }

    @Test
    public void NotLegalLimit18() {
        server.canServeGuest(guest2);
        assertThat(server.canServeGuest(guest2)).isFalse();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void CanServeIfHasEnoughMoney() {
        server.canServeGuest(guest);
        assertThat(server.canServeGuest(guest)).isFalse();
    }

    @Test
    public void CannotServeIfNotEnoughMoney() {
        server.canServeGuest(guest3);
        assertThat(server.canServeGuest(guest3)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void canServeSober() {
        server.canServeGuest(guest4);
        assertThat(server.canServeGuest(guest4)).isFalse();
    }

    @Test
    public void CannotServeSober() {
        server.canServeGuest(guest);
        assertThat(server.canServeGuest(guest)).isFalse();
    }


    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void CheckBan() {
        server.canServeGuest(guest5);
        assertThat(server.canServeGuest(guest5)).isEqualTo(false);
    }
    @Test
    public void CheckBanTrue() {
        server.canServeGuest(guest2);
        assertThat(server.canServeGuest(guest2)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test




    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)


}