package openclosed.ex0;

import single.responsibility.cohension.ex3.Database;

public interface IPost {
    void CreatePost(Database db, String postMessage);
}
