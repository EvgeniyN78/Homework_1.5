public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Урок 1.5 Массивы");
        System.out.println();
        System.out.println("Задание 1 и 2");
        System.out.println();

        int[] think = new int[3];
        think[0]= 1;
        think[1]= 2;
        think[2]= 3;

        for (int i = 0; i < think.length - 1; i++) {
            System.out.print(think[i] + ", ");
        }
        System.out.println(think[think.length - 1]);
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};

        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.println(numbers[2]);

        System.out.println();

        int[] boxes = {4, 7, 2, 8, 1};
        for (int i = 0; i < boxes.length - 1; i++) {

            System.out.print(boxes[i] + ", ");

        }
        System.out.println(boxes[boxes.length -1]);

        System.out.println();

        System.out.println("Задание 3");
        System.out.println();

        for (int i = think.length - 1; i > 0; i--) {
            System.out.print(think[i] + ", ");
        }
        System.out.println(think[0]);
        System.out.println();


        for (int i = numbers.length - 1; i > 0; i--) {

            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[0]);
        System.out.println();

        for (int i = boxes.length -1; i > 0; i--) {

            System.out.print(boxes[i] + ", ");

        }
        System.out.println(boxes[0]);

        System.out.println();

        System.out.println("Задание 4");
        System.out.println();

      //  while (think[think.length-1] < think.length)
        for (int i = 0; i < think.length; i++) {
            if (think[i]%2 == 0){
                System.out.print(think[i] + ", ");
            } else {
                think[i] = think[i] + 1;
                System.out.print(think[i] + ", ");
            }

        }
        System.out.println();






       /* int[] weights = {90, 92, 91, 90, 89, 88, 87, 86, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
          //  System.out.println(weights[i]);

        }*/
    }
}