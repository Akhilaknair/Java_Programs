class Main_Thread1 {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Welcome to java" + t);
        t.setName("MCA SecA");
        System.out.println("Welcome to java" + t);
        t.setPriority(7);
        System.out.println("Welcome to java" + t);
    }
}
