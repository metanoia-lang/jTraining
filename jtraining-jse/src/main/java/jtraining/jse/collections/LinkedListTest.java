package jtraining.jse.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by mlang on 2017/3/26 15:29.
 */
public class LinkedListTest {

    /**
     * merge the words from b to a
     *
     * @param a
     * @param b
     */
    private void mergeB2A(List<String> a, List<String> b) {
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }

            if (bIter.hasNext()) {
                aIter.add(bIter.next());
            }
        }
        System.out.println(a);
    }

    /**
     * remove every second word from list
     *
     * @param list
     */
    private void removeSecondWord(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();

            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    /**
     * remove all words in b from a
     *
     * @param a
     * @param b
     */
    private void aRemoveB(List<String> a, List<String> b) {
        a.removeAll(b);
        System.out.println(a);
    }

    public static void main(String... args) {
        List<String> a = new LinkedList<>();
        a.add("a");
        a.add("c");
        a.add("e");

        List<String> b = new LinkedList<>();
        b.add("b");
        b.add("d");
        b.add("f");
        b.add("g");

        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.mergeB2A(a, b);
        linkedListTest.removeSecondWord(b);
        linkedListTest.aRemoveB(a, b);
    }
}
