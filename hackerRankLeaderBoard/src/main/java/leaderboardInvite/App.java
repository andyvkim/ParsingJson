package leaderboardInvite;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;

/**
 * Created by Andy on 2017-08-03.
 */
public class App {
    public static void main(String[] args) {
        First50 first50 = new First50();
        first50.firstFiftyInvites();
    }
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
//        try {
//            User[] user = mapper.readValue(new File("C:\\Users\\Andy\\Desktop\\theKitchen\\openbracketapp\\hackerRankLeaderBoard\\src\\main\\java\\leaderboardInvite\\userlist.json"), User[].class);
//            System.out.println(user[0]);
//
//             }catch (IOException e){
//                e.printStackTrace();
//        }
//    }
}

