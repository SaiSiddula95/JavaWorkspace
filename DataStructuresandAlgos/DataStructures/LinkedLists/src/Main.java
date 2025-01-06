import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedListlist = new LinkedList<String>();


        linkedListlist.offer("A");
        linkedListlist.offer("B");
        linkedListlist.offer("C");
        linkedListlist.offer("D");
        linkedListlist.offer("F");





        System.out.println(linkedListlist);

        linkedListlist.poll();
        System.out.println(linkedListlist);

        // Insertion
        linkedListlist.add(4,"E");
        linkedListlist.remove("E");

        linkedListlist.indexOf("B");

        /*
        Advvangtages:
        1. Dynamic Data Structure - Allocates needed memory while running
        2. Insertion and Deletion of Notes is easy O(1)
        3. No/low memory waste

        Disadvantages:
        1. Greater memory usage - than arrays ( additional pointer)
        2. No random access of elements (noi index[i]
        3. Accessing/searching elements is more time consuming O(n)

        Useage:
        1. Implement Stacks/Queues
        2. GPS navigation
        3. Music Playlist
         */




    }
}