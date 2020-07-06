package single.responsibility.cohension.ex3;

import java.io.File;

class User {
    public void CreatePost(Database db, String postMessage) {
        try {
            db.Add(postMessage);
        } catch (Exception ex) {
            db.logError("An error occured: ", ex.toString());
            FileUtil.writeAllText("LocalErrors.txt", ex.toString());
        }
    }
}