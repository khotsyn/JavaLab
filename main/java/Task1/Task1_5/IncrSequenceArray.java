//package Task1.Task1_5;
//
//public class IncrSequenceArray {
//
//    int[] array;
//    int[] maxSequence;
//
//    {
//        int n = (int) (20 + Math.random() * 51);
//        array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (1 + Math.random() * 101);
//        }
//    }
//
//    public int createMaxSequence() {
//        int[] length = new int[array.length];
//        int[] predecessor = new int[array.length];
//        for (int i = 0; i < length.length; i++) {
//            length[i] = 1;
//            predecessor[i] = 0;
//        }
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] > array[i]) {
//                    if (length[i] + 1 > length[j]) {
//                        length[j] = length[i] + 1;
//                        predecessor[j] = i;
//                    }
//                }
//            }
//        }
//        return length[length.length - 1];
//    }
//}
