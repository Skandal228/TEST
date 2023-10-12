
    public class Main {
        public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        public static int[] resultArray;
        public static int[] copy ( int[] a, int[] b, int[] c) {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        }

        public static void main(String[] args) {


                //напишите тут ваш код
            for (int i = 0; i < resultArray.length; i++) {
                    System.out.print(copy(firstArray, secondArray, resultArray) + " ");
                }

            }


            }



