package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first, second, third;
        System.out.println(first = 1);
        System.out.println(second = 10);
        System.out.println(third = 100);
        int linkToFirst, linkToSecond, linkToThird;
        linkToFirst = first;
        linkToSecond = second;
        linkToThird = third;
        System.out.println(first = 15);
        System.out.println(second = 6);
        System.out.println(third = 4);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
