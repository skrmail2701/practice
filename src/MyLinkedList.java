public class MyLinkedList {
    Node headNode;
    int size;



    void addFirst(String s){
        Node newNode= new Node(s);
        if(size==0){
            this.headNode=newNode;
            size++;
            return;

        }
        size++;
        newNode.nextNode=headNode;
        headNode=newNode;
    }
    void addLast(String s){

        Node newNode= new Node(s);
        if(this.size==0){
            this.headNode=newNode;
            size++;
            return;

        }
        size++;
        Node currNode= headNode;
        while (currNode.nextNode!=null){
            currNode=currNode.nextNode;
        }
        currNode.nextNode=newNode;

    }
    void addMiddle(String s, Integer pos){
        Node newNode= new Node(s);
        if(this.size==0){
            this.headNode=newNode;
            size++;
            return;
        }
        size++;
        Node curNode= headNode;
        for(int i=0;i<pos-2;i++){
            curNode=curNode.nextNode;
        }
        newNode.nextNode=curNode.nextNode;
        curNode.nextNode= newNode;

    }
    void delete(int index){
        if(size==0){
            System.out.println("Linked List is already empty");
            return;
        }
        if(index==0){
            headNode=headNode.nextNode;
            size--;
            return;
        }
        size--;
        Node prevNode= headNode;
        Node currentNode=headNode;
        for(int i=0;i<index;i++){
            prevNode=currentNode;
            currentNode=currentNode.nextNode;
        }
        prevNode.nextNode=currentNode.nextNode;

    }
    void printList(){
        if(this.size==0){
            System.out.println("This Linked is empty");
            return;
        }
        Node currentNode= headNode;
        while(currentNode!=null){
            System.out.print(currentNode.data+ " -> ");
            currentNode=currentNode.nextNode;
        }
        System.out.println("null");
    }

    void reverseLinkedList(){
        if(this.size==0) {
            System.out.println("This Linked is empty");
            return;
        }
        if(this.size==1){
            return;
        }
        Node prevNode= headNode;
        Node currentNode= headNode.nextNode;
        Node nextNode= currentNode.nextNode;
        if(this.size==2) {
            headNode.nextNode=null;
            headNode = currentNode;
            currentNode.nextNode = prevNode;

            return;
        }
        while(currentNode!=null){
            headNode.nextNode=null;
            currentNode.nextNode=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
            if(currentNode!=null) {
                nextNode = currentNode.nextNode;
            }
            else{
                headNode=prevNode;
                return;
            }
        }
    }

}
