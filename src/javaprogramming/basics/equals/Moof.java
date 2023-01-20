package javaprogramming.basics.equals;

public class Moof {

    private int moofValue;

    public Moof(int moofValue){
        this.moofValue = moofValue;
    }

    public void setMoofValue(int moofValue){
        this.moofValue = moofValue;
    }

    public int getMoofValue(){
        return moofValue;
    }

    public boolean equals(Object o){
       if(this == o) {
           System.out.println("o is Object");
           return true;
       }
       if(o == null || getClass() != o.getClass()){
           System.out.println("getClass() = " + getClass());
           System.out.println("o.getClass() = " + o.getClass());
            return false;
        }

       Moof moof = (Moof) o;
       return moofValue == moof.moofValue;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println(getClass());
        System.out.println("o.getClass() = " + o.getClass());
        if (o == null || getClass() != o.getClass()) return false;
        Moof moof = (Moof) o;
        return moofValue == moof.moofValue;
    }*/
}
