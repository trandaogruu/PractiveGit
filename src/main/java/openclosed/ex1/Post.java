package openclosed.ex1;


import openclosed.ex0.IPost;
import single.responsibility.cohension.ex3.Database;

public class Post  implements IPost {


    @Override
    public void CreatePost(Database db, String postMessage) {
        db.Add(postMessage);
    }
}
