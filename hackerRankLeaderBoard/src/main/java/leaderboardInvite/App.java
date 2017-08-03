package leaderboardInvite;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;

/**
 * Created by Andy on 2017-08-03.
 */
public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        try {
            MyPojo[] mypojo = mapper.readValue(new File("C:\\Users\\Andy\\Desktop\\theKitchen\\openbracketapp\\hackerRankLeaderBoard\\src\\main\\java\\leaderboardInvite\\userlist.json"), MyPojo[].class);
            System.out.println(mypojo[0]);
            
             }catch (IOException e){
                e.printStackTrace();
        }
    }
}

