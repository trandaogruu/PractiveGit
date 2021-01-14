package openclosed.ex1;

import single.responsibility.cohension.ex3.Database;

public class PostDetail extends Post{
    void createTagPost(Database db, String postMessage){
        if (postMessage.startsWith("#")) {

            /* bussiness code here very long code


             */
            db.addAsTag(postMessage);
        }
    }

    void createMentionPost(Database db, String postMessage){
        if (postMessage.startsWith("mention")) {

            /* bussiness code here very long code


             */
            db.addAsMentionPost(postMessage);
        }
    }
}
