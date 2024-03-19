/**
 * Pair
 */
public class Pair<T,U> {
    T el1;
    U el2;
    public Pair(T first, U second) {
        this.el1 = first;
        this.el2 = second;
    }
    public T getFirst(){return el1;}
    public U getSecond(){return el2;}
    
    @Override
    public String toString(){
        return String.format("\n%s %d", el1, el2);
    }
    public void setFirst(T first){ //// через .remove() + .add() или через .set()
        
        el1 = first;
        

    }
    public void setSecond(U second){
        el2 = second;
    }
    public void print(){
        //this.getFirst();
        //System.out.println(getFirst());
        System.out.println("Стало " + el1);
        //this.getSecond();
        //System.out.println(getSecond());
        System.out.println("Стало " + el2);
    }
    
}