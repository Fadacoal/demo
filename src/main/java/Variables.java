abstract class Variables {
    int sum;

    public int getSum(){
        return sum;
    }

    public final void setSum(){
        int sum = this.sum;
    }

    abstract void testClass();
}
