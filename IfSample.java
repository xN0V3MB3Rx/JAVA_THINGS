class IfSample {
    public static void main(String args[]){
        int x = 10, y = 20;
        if(x < y) System.out.println("X is less than y");

        x *= 2;
        if(x == y) System.out.println("x now equal to y");

        x *= 2;
        if(x > y) System.out.println("x now greater than y");

        if(x == y) System.out.println("you won't see this");
    }
    
}
