public class q7 {
    public static void main(String[] args) {
        String s1 = "welcome to Java Programming";
        String s2 = "hello world";
        String s3 = "hello";
        String s4 = "good morning";
        
        // concat()
        System.out.println("s1 + s2: " + s1.concat(s2));
        
        // isempty()
        System.out.println("s1 is empty: " + s1.isEmpty());
        System.out.println("s3 is empty: " + s3.isEmpty());
        
        // split()
        String[] s1Array = s1.split(" ");
        for (String str : s1Array) {
            System.out.println(str);
        }
        
        // trim()
        String s2Trimmed = s2.trim();
        System.out.println("s2Trimmed: " + s2Trimmed);
        
        // uppercase()
        System.out.println("s1 uppercase: " + s1.toUpperCase());
        
        // lowercase()
        System.out.println("s2 lowercase: " + s2.toLowerCase());
        
        // replace()
        String s1Replaced = s1.replace("Java", "Python");
        System.out.println("s1Replaced: " + s1Replaced);
        
        // intern()
        String s1Interned = s1.intern();
        System.out.println("s1Interned: " + s1Interned);
        
        // indexof()
        int s3Index = s3.indexOf("l");
        System.out.println("Index of 'l' in s3: " + s3Index);
        
        // getbytes()
        byte[] s1Bytes = s1.getBytes();
        for (byte b : s1Bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // substring()
        String s4Substr = s4.substring(5);
        System.out.println("Substring of s4 from index 5: " + s4Substr);
    }
}
