public  class A {
    static final int w;
    final int x=200;
    final int y;
    final int z;
    static {
        w = 100;
    }
    {
        y = 300;
    }


    A(int z){
        this.z = z;
    }
    A(){
        this .z = 100;
    }

    public  void print(){
        System.out.println("A class");
    }
}
