package dip;

import openclosed.ex0.IPost;
import openclosed.ex0.Post;
import single.responsibility.cohension.ex3.Database;

public class OfficeUser {
    private IPost iPost;

    public OfficeUser(IPost iPost) {
        this.iPost = iPost;
    }

    public void publishNewPost() {
        Database db = new Database();
        String postMessage = "example message";

        iPost.CreatePost(db, postMessage);
    }
}
