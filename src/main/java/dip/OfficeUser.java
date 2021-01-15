package dip;

import openclosed.ex0.CreatePost;
import openclosed.ex0.IPost;
import openclosed.ex0.Post;
import single.responsibility.cohension.ex3.Database;

public class OfficeUser {
    private CreatePost createPost;


    public OfficeUser(CreatePost createPost) {
        this.createPost = createPost;
    }

    public void publishNewPost() {
        Database db = new Database();
        String postMessage = "example message";

        createPost.CreatePost(db, postMessage);
    }
}
