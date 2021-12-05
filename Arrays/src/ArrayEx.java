import java.lang.reflect.Array;
import java.util.*;

public class ArrayEx {

    int nElementInList(int[] list, Integer elementList) {
        int returnResult = 0;
        for (int value : list) {
            if (elementList == value) {
                returnResult++;
            }
        }
        return returnResult;
    }

    boolean hasRepeat(int[] list) {
        Set tempSet = new HashSet();
        for (int i : list) {
            if (!tempSet.add(i)) {
                return true;
            }
        }
        return false;
    }

    int nroRepeat(int[] list) {
        Set tempSet = new HashSet();
        int nroRepeatElements = 0;
        for (int i : list) {
            if (!tempSet.add(i)) {
                nroRepeatElements++;
            }
        }
        return nroRepeatElements;
    }

    List<Integer> listRepeat(int[] list) {
        Arrays.sort(list);
        int i = 0;
        Set tempSet = new HashSet();
        List<Integer> tempList = new ArrayList();
        for (int number : list) {
            if (!tempSet.add(number)){
                if(number == list[i-1] && !tempSet.contains(list[i-1])){
                    tempList.add(list[i-1]);
                }
            }
            i++;
        }
        return tempList;
    }
}
