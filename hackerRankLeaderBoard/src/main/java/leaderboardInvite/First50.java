package leaderboardInvite;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Andy on 2017-08-03.
 */
public class First50 {

    public String[] firstFiftyInvites(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        String[] emails = new String[50];
        try {
            User[] user = mapper.readValue(new File("C:\\Users\\Andy\\Desktop\\theKitchen\\openbracketapp\\hackerRankLeaderBoard\\src\\main\\java\\leaderboardInvite\\userlist.json"), User[].class);
            for (int i = 0; user[i].getRank() <= 50; i++){
                emails[i] = user[i].getEmail();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(emails));
        return emails;
    }
}
