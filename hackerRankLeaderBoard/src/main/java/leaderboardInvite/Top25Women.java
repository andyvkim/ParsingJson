package leaderboardInvite;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Andy on 2017-08-03.
 */
public class Top25Women {

    ArrayList<String> top25WomenEmails = new ArrayList<String>();
    public ArrayList<String> top25WomenInvites(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);

        try {
            User[] user = mapper.readValue(new File("C:\\Users\\Andy\\Desktop\\theKitchen\\openbracketapp\\hackerRankLeaderBoard\\src\\main\\java\\leaderboardInvite\\userlist.json"), User[].class);
            int emailCount = 0;
            for (int i = 50; user[i].getRank() <= 200 ; i++) {
                if (user[i].getGender().contains("f")) {
                    top25WomenEmails.add(user[i].getEmail());
                    emailCount++;
                }
                if (emailCount == 25){
                   return top25WomenEmails;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return top25WomenEmails;
    }
}
