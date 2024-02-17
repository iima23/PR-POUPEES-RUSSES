class PoupeeRusse extends Poupee {
    private PoupeeRusse poupee1;

    public PoupeeRusse(int size) {
        super(size);
    }
    @Override
    public void openPoupee() {
        if (!isOpen()) {
            setOpen(true);
            System.out.println("The doll who who has this " + getSize() + " is open");
        } else {
            System.out.println("The doll is already open.");
        }
    }

    @Override
    public void closePoupee() {
        if (isOpen()) {
            setOpen(false);
            System.out.println("The doll is closed");
        } else {
            System.out.println("The doll is already closed.");
        }
    }

    @Override
    public void placeIn(Poupee P) {
        if (this.poupee1 == null && this.getSize() > P.getSize()) {
            this.poupee1 = (PoupeeRusse)P;
            System.out.println("The first doll who has the size "+ P.getSize()  + " inside the poupee " + getSize());
        } else if (!isOpen()) {
            System.out.println("The doll is closed.");
        } else {
            System.out.println("The doll is not placed in.");
        }
        poupee1 =(PoupeeRusse) P;  //Casting
    }

    @Override
    public void takeOut(Poupee P) {
        if (this.poupee1 == null){
            this.poupee1 = (PoupeeRusse)P ;
            System.out.println("the doll who has the size " + P.getSize() + " is token out " );
        } else {
            System.out.println("the doll is not token out .");
        }
    }
}
