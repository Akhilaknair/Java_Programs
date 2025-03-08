public class MyString {

    String str1 = new String();
    String str2 = new String();

    MyString() {
        str1 = "Welcome to Java tutorial.";
        str2 = "Todays topic is String Handling in Java.";
        System.out.println("String str1= " + str1);
        System.out.println("String str2= " + str2);
    }

    void Concatenate() {
        String con = str1 + " " + str2;
        System.out.println("Concatenated strings: " + con);
    }

    void LowerCase() {
        String l = str1.toLowerCase();
        System.out.println("str1 in Lower Case: " + l);
    }

    void UpperCase() {
        String u = str2.toUpperCase();
        System.out.println("str2 in Upper Case: " + u);
    }

    void Equality() {
        boolean e = str1.equals(str2);
        System.out.println("Are both strings equal?: " + e);
    }

    void Location() {
        int index1 = str1.indexOf('J');
        int index2 = str2.indexOf('J');
        System.out.println("Location of 'J' in str1: " + index1);
        System.out.println("Location of 'J' in str2: " + index2);
    }

    void replace() {
        String replace1 = str1.replace('i', 'I');
        String replace2 = str2.replace('i', 'I');
        System.out.println("str1 after replacing 'i' with 'I': " + replace1);
        System.out.println("str2 after replacing 'i' with 'I': " + replace2);
    }

    void displayJava() {
        String sub = str1.substring(str1.indexOf("Java"), str1.indexOf("Java") + 4);
        System.out.println("Extract 'java' from str1: " + sub);
    }

    void display7() {
        char c = str1.charAt(6);
        System.out.println("The 7th character in str1: " + c);
    }

    void convertStr1ToArray() {
        String[] strArray = str1.split(" ");
        System.out.println("String array from str1:");
        for (String s : strArray) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        MyString s = new MyString();
        s.Concatenate();
        s.LowerCase();
        s.UpperCase();
        s.Equality();
        s.Location();
        s.replace();
        s.displayJava();
        s.display7();
        s.convertStr1ToArray();
    }
}