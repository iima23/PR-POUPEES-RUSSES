abstract class Poupee {
    private int size;
    private boolean open;

    public Poupee(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public abstract void openPoupee();

    public abstract void closePoupee();

    public abstract void placeIn(Poupee P);

    public abstract void takeOut(Poupee P);
}
