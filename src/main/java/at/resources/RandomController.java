package at.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/generateNumber")
public class RandomController {

    public int randomNumber(){
        Random number = new Random();
        int range = 1000;
        int coincidence = number.nextInt(range);
        return coincidence;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int getRandomNumber(){
        return randomNumber();
    }
}
