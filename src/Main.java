public class Main {

    public static void main(String[] args) {
        Calculations calc = new Calculations();
        int arrForT9[]={1,2,3,4,5};
        int arrForT10[]={1,5,1,5,1};
        int arrForT11[]={4,5,3,4,2,3};

        calc.swap(1,2);
        calc.endOfLesson(3);
        calc.timeDifference(1,1,1,2,2,2);
        calc.rally(700,750);
        calc.snail(10,3,2);
        calc.findMax(8,5);
        calc.findMax(5,8);
        calc.chess(1,1,2,2);
        calc.numberOfEqual(1,2,2);
        calc.moreThenPrev(5, arrForT9);
        calc.moreThenAdjacent(5, arrForT10);
        calc.swapAdjacent(6,arrForT11);
    }

}
