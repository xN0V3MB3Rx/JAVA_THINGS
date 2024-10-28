class TEST_TYPES_OF_DATA{

    static public void main(String args[]){
        int iNum = 10;
        //byte bNum = 0;
        double dNum = 2.45;
        char cChar = '@';
        Boolean bYesNo = true;

        System.out.println("Integer: " + iNum);
        System.out.println("Double: " + dNum);
        System.out.println("Char: " + cChar);
        System.out.println("Boolean: " + bYesNo);

        //Variable overflow
        for(byte iStep = 1; iStep < 127; ++iStep){
            System.out.println("iStep = " + iStep);
        }

    }
}