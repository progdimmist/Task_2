package ru.vsu.cs.pavlenkodm;

public class MyList {
    public int data;
    public MyList next;
    private int size = 0;
    private MyList head;

    private class SimpleLinkedListNode {
        public int data;
        public SimpleLinkedListNode next;

        public SimpleLinkedListNode(int data, SimpleLinkedListNode next) {
            this.data = data;
            this.next = next;
        }

        public SimpleLinkedListNode(int data) {
            this(data, null);
        }
    }

    public void addFirst(int data) {
        MyList newNode = new MyList();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        size--;
    }

    public void addLast(int data) {
        if(size==0){
            MyList newNode = new MyList();
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }else{MyList current = head;
        while(current.next != null) {
            current = current.next;
        }
        MyList newNode = new MyList();
        newNode.data = data;
        current.next = newNode;}
        size++;
    }

    public void deleteLast() {
        MyList current = head;
        MyList temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
        size--;
    }

    public void addAfter(MyList after,int data) {
        MyList current = head;
        MyList temp = head;
        while (temp.data != after.data ) {
            temp = current;
            current = current.next;
        }
        MyList newNode = new MyList();
        newNode.data = data;
        temp.next = newNode;
        newNode.next = current;
        size++;
    }

    public void deleteAfter(MyList after) {
        MyList current = head;
        while (current.data != after.data) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    private MyList getNode(int index) {
        MyList curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public int get(int index)  {
        return getNode(index).data;
    }

    public void remove(int index)  {
        if (index == 0) {
            deleteFirst();
        } else {
            MyList prev = getNode(index - 1);
            prev.next = prev.next.next;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public void task(MyList list){
        MyList.SimpleLinkedListNode simple = new MyList.SimpleLinkedListNode(list.get(0));
        boolean k=false;
        for(int i=1;i< list.size();i++){
            if(list.get(i) > simple.data){
                simple = new MyList.SimpleLinkedListNode(list.get(i));
                k=true;
            }
        }
        MyList node = new MyList();
        node.data = simple.data;
        if(k){list.addAfter(node, -1*simple.data);
        }else {
            list.addFirst(-1*get(0));
            list.addFirst(-1*get(0));
            list.remove(2);
        }
    }
}
