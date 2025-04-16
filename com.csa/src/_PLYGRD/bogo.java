package _PLYGRD;
import java.util.ArrayList;

public class bogo {
        public static void main(String[] args) {
            int iter = 0;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> bogo = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            bogo.add(5);
            bogo.add(4);
            bogo.add(3);
            bogo.add(2);
            bogo.add(1);
            bogo.add(6);
            bogo.add(7);
            bogo.add(8);

            int x = (int) (Math.random() * 100);
            // make bogo size = x

            System.out.print(list);
            while (list != bogo) {
                for (int x=0;x<list.size();x++) {
                    int change = (int) (Math.random() * 5+0);
                    int diff = bogo.get(change);
                    bogo.set(change, bogo.get(x));
                    bogo.set(x, diff);
                }
                System.out.println(bogo);
                iter++;
                if (checker(list, bogo)) {
                    break;
                }
            }
            System.out.print("\nThis bogo sort took " + iter + " tries to get sorted.");
        }


        public static boolean checker (ArrayList<Integer> data1, ArrayList<Integer> data2) {
            for (int x = 0; x<data1.size(); x++) {
                if (data1.get(x) != data2.get(x)) {
                    return false;
                }
            }
            return true;
        }
    }
