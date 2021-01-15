package openclosed.ex0;

import single.responsibility.cohension.ex3.Database;

public class Post implements CreatePost{
    public void CreatePost(Database db, String postMessage) {
        db.Add(postMessage);
    }
}
