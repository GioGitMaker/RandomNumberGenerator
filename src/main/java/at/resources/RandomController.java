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
        int rangeUp = 600;
        int rangeLow = 500;
        int diff = rangeUp - rangeLow;
        int coincidence = number.nextInt(diff + 1);
        return coincidence += rangeLow;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int getRandomNumber(){
        return randomNumber();
    }
}
