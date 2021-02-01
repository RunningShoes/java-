package practiceNew;

/**
 * 这个类演示了文档注释
 *
 * @author Ayan Amhed
 * @version 1.2
 */
public class RankAlgorithm {

    public static void main(String[] args) {
        Integer int1[] = {1,2,3,4,5,6,7,8,9,10};
        RankAlgorithm one = new RankAlgorithm();
        one.Show(int1);
    }

    public <Temp> void Show(Temp [] temp1){
        for (Temp i : temp1){
            System.out.print(i);
            System.out.print("  ");
        }
        System.out.println();
    }
    public <E> void BubbleSort(E [] one){

    }
}
