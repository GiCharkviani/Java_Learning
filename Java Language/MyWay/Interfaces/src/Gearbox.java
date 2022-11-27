public class Gearbox {
    private boolean clutchIsIn;


    public void operateClutch(boolean inOrOut) {
//        this.clutchIsIn = inOrOut.equalsIgnoreCase("in"); // if equals, true, if inOrOut is a string;
        this.clutchIsIn = inOrOut;
    }
}
