public class Challenger{
    public static void main(String []args){
        int myName = 1; //numero original
        int stepOne = myName*myName;
        int stepTwo = stepOne+myName;
        int stepTree = stepTwo/myName;
        int stepFour = stepTree+17;
        int stepFive = stepFour-myName;
        int stepSix = stepFive/6;
        System.out.println (stepSix);
    }
}