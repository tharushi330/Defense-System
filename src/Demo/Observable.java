
package Demo;

public class Observable {

    private static Observable ob;
    private Observer[] arrayObserver;
    private final MainController main;

    public Observable() {
        ob = this;
        arrayObserver = new Observer[0];

        main = new MainController();

    }

    private void extendsObserverArray() {
        Observer[] temparrayObserver = new Observer[arrayObserver.length + 1];
        for (int i = 0; i < arrayObserver.length; i++) {
            temparrayObserver[i] = arrayObserver[i];
        }
        arrayObserver = temparrayObserver;
    }

    public void addDefenceSystem(Observer ob) {
        extendsObserverArray();
        arrayObserver[arrayObserver.length - 1] = ob;
    }

    public static Observable getReference() {
        return ob;
    }

    public void setArea(boolean b) {

        for (Observer ab1 : arrayObserver) {
            ab1.setArea(b);
        }
    }

    public void setSliderLevel(int value) {

        for (Observer ab1 : arrayObserver) {
            ab1.setPossition(value);
        }
    }

    public void setMassage(String msg) { 
        for (Observer ab1 : arrayObserver) {
            ab1.setSMS(msg);
        }
    }

    public void getMassage(String msg) {
        main.getSMS(msg);
    }

}
