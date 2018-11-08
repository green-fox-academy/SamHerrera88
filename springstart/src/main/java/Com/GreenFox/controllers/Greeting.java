package Com.GreenFox.controllers;


public class Greeting {

    long _id;
    String content;

    public Greeting(long _id, String content) {
        this._id = _id;
        this.content = content;
    }

    public long get_id() {
        return _id;
    }

    public String getContent() {
        return content;
    }
}


