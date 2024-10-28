class TEST_CHAR_UNICODE {
    public static void main(String args[]){
        char cHar1 = 64, cHar2 = 88, cHar3 = 'h';

        System.out.println("cHar1 = " + cHar1 + " cHar2 = " + cHar2);
        System.out.println("Char3 = " + cHar3);
        
        for(char caracter = 'h'; caracter != 'z'; ++caracter){
            System.out.println("cHar3 now = " + caracter);
        }
    }
}