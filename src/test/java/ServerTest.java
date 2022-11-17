import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("robert",36);
        guest2 = new Guest("jayden",15);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestIfOver18(){
        server.canServeGuest(guest);
        assertThat(server.canServeGuest(guest)).isTrue();
    }
    @Test
    public void cannotServeGuestIfUnder18(){
        server.canServeGuest(guest2);
        assertThat(server.canServeGuest(guest2)).isEqualTo(false);
        assertThat(server.canServeGuest(guest2)).isFalse();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
