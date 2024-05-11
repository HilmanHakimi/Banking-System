package Day8;

public class Mouse {
    private final int numTeeth;
    private final int numWhiskers;
    private final int weight;

    //constructor 1 : initialized the weight and chains to constructor 2
    public Mouse(int weight){
        this(weight, 16);//Calls constructor
    }

    //constructor 2: initialized weight and numteeth chains to constructor 3
    public Mouse(int weight, int numTeeth){
        this(weight, numTeeth, 6);
    }

    //constructor 3: initialized all fields
    public Mouse(int weight, int numTeeth, int numWhiskers){
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;

    }

    //method to print the values of weight , numTeeth and numWhiskers
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }



    public static void main(String[] args) {
        String str ="hello";
        str.toUpperCase();
        System.out.println(str.toUpperCase());
        Mouse mouse = new Mouse(15);//create a mouse object using constructor 1
        mouse.print();

    }
}
