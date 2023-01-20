package javaprogramming.stringpractice;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * String created as literal will be created in `string constant pool`.
         * This allows JVM to optimize initialization of string literal
         */
        String s = "GeeksForGeeks";

        s.concat(" learnings");

        System.out.println("s = " + s);
        /**
         * String created using new Operator will be created dynamically.
         * They are assigned new memory location in heap.
         * They are not stored in string constant pool.
         */
        String s1 = new String("GeeksForGeeks");
        
        String s3 = s1.intern();

        System.out.println("s.equals(s1) = " + s.equals(s1));
        System.out.println("(s == s1) = " + (s == s1));

        System.out.println(" s3 == s = " +  s3 == s);

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        String sr ="k";
        sr = sr.repeat(10);
        System.out.println("sr = " + sr);
    }
}
