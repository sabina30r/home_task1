public class Calculations {

    public void swap(int a, int b){
        b ^= (a ^= b);
        a ^= b;
        System.out.println("|TASK 1| Output: " + a + " " + b);
    }

    public void endOfLesson(int lessonNumber){
        int count = lessonNumber * 45 + (lessonNumber / 2) * 5
                + ((lessonNumber - 1) / 2) * 15;
        int endHour = 9 + count / 60;
        int endMinutes = count % 60;
        System.out.println("|TASK 2| Output: " + endHour + ":" + endMinutes);
    }

    public void timeDifference(int h, int m, int s, int h1, int m1, int s1){
        int diff = (h1 - h) * 3600 + (m1 - m) * 60 + (s1 - s);
        System.out.println("|TASK 3| Output: " + diff);
    }

    public void rally(int n, int m){
        int countDays = (m + n - 1) / n;
        System.out.println("|TASK 4| Output: " + countDays);
    }

    public void snail(int h, int a, int b){
        int h1 = h-a;
        int step = a - b;
        int countDays = 1+h1/step+(h1%step+step-1)/step;
        System.out.println("|TASK 5| Output: " + countDays);
    }

    public void findMax(int a, int b){
        int count = (a * (a / b) + b * (b / a))
                / ((b / a) + (a / b));
        System.out.println("|TASK 6| Output: " + count);
    }

    public void chess(int x, int y, int x1, int y1){

        if (x==x1 | y==y1 )
            System.out.println("Output: YES");
        else System.out.println("|TASK 7| Output: NO");
    }

    public void numberOfEqual(int a, int b, int c){
        if (a == b && a == c)
            System.out.println("|TASK 8| Output: 3");
        if (a == b || a == c || b == c)
            System.out.println("|TASK 8| Output: 2");
        else
            System.out.println("|TASK 8| Output: 0");
    }

    public void moreThenPrev(int N, int [] arr){
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1])
                count++;
        }
        System.out.println("|TASK 9| Output: " + count);
    }

    public void moreThenAdjacent(int N, int [] arr){
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i]>arr[i - 1] && arr[i]>arr[i + 1])
                count++;
        }
        System.out.println("|TASK 10| Output: " + count);
    }

    public void swapAdjacent(int N, int [] arr){
        for (int i = 1; i < N; i+=2){
            arr[i] = (arr[i] ^ arr[i - 1]) ^ (arr[i - 1] = arr[i]);
        }
        System.out.print("|TASK 11| Output: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

    }


}
