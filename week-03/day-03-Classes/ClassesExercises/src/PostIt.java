public class PostIt {


    String backgroundColor;
    String text;
    String textColor;

    public void setPostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }


    public static void main(String[] args) {
        PostIt postIt1 = new PostIt();
        postIt1.setPostIt("Orange", "Idea 1", "Blue");

        PostIt postIt2 = new PostIt();
        postIt2.setPostIt("Pink", "Awesome", "Black");

        PostIt postIt3 = new PostIt();
        postIt3.setPostIt("Yellow", "Superb", "Green");

    }
}

