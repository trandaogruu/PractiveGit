package openclosed.ex1;


import single.responsibility.cohension.ex3.Database;

public class Post {
    void CreatePost(Database db, String postMessage) {
        if (postMessage.startsWith("#")) {

            /* bussiness code here very long code


             */
            db.addAsTag(postMessage);
        }
        if (postMessage.startsWith("mention")) {

            /* bussiness code here very long code


             */
            db.addAsMentionPost(postMessage);
        } else {
            /* bussiness code here very long code


             */
            db.Add(postMessage);
        }
    }
}
