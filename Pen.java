public class Pen {

    private boolean isClicked;

    public boolean isClicked() {
        return isClicked;
    }

    public void click(){
        isClicked = true;
    }
    public void unClick(){
        isClicked = false;
    }
}
