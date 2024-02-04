class C extends A {
    public B objB;

    C(int a, int b){
        super(a);
        this.objB = new B(b);
    }

    public int getAtributoB(){
        return objB.getAtr();
    }
}