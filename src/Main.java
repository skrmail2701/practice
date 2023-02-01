public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast("Sanjeev");
        myLinkedList.addLast("is");
        myLinkedList.addLast("name");
        myLinkedList.addLast("My");
        myLinkedList.addFirst("Hey");
        myLinkedList.addMiddle("am",5);
        myLinkedList.delete(3);
        myLinkedList.printList();
        myLinkedList.reverseLinkedList();
        myLinkedList.printList();

        MyLinkedList l2=new MyLinkedList();
        l2.addLast("Sanjeev");
        l2.addLast("is");
        l2.printList();
        l2.reverseLinkedList();
        l2.printList();

        MyLinkedList l3=new MyLinkedList();
        l3.addLast("Sanjeev");
        l3.printList();
        l3.reverseLinkedList();
        l3.printList();
    }
}
