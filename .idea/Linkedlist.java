public class Main {

    public static void main(String[] args)
    {
        Linkedlist<Integer> linkedlist = new Linkedlist();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);

        linkedlist.addfirst(0);
        linkedlist.addpos(100,3);
        linkedlist.printlist();

        linkedlist.delete(0);
        linkedlist.deletefirst();
        linkedlist.deletelast();
        linkedlist.printlist();


    }
}


public class Linkedlist<T>
{
    private T value;
    private Linkedlist next;
    private Linkedlist head;
    private Linkedlist tail;

    public Linkedlist(T value, Linkedlist next)
    {
        this.value = value;
        this.next = next;
    }

    public Linkedlist() {}



    public void add(T value)
    {
        if(head == null)
        {
            Linkedlist head_list =new Linkedlist(value, null);
            head = head_list;
            tail = head_list;
            return;
        }
        Linkedlist list_end = tail;
        Linkedlist new_add = new Linkedlist(value,null);
        list_end.next = new_add;
        tail = new_add;
    }

    public void delete(T value)
    {
        Linkedlist node = head;
        if(node == null)
            return;
        Linkedlist prev_node = node;
        while (node!=null)
        {
            if(node.value == value)
            {
                if(node == head)
                {
                    deletefirst();
                    return;
                }

                prev_node.next = node.next;
                if (node == tail)
                    tail = prev_node.next;
                node = null;
                return;
            }
            prev_node = node;
            node = node.next;
        }
        System.out.println("No Node match");
    }


    public void printlist() {

        if (head == null)
        {
            System.out.println("empty list. Add some elements");
            return;
        }
        Linkedlist linkedlist = head;
        System.out.println(linkedlist.value);
        linkedlist = linkedlist.next;
        while (linkedlist != null && linkedlist!=head) {
            System.out.println(linkedlist.value);
            linkedlist = linkedlist.next;
        }
        System.out.println("Completed printing");
    }

    public void addfirst(T value)
    {
        Linkedlist node = new Linkedlist(value,null);
        node.next = head;
        head = node;
    }

    public void addpos(T value,int pos)
    {
        Linkedlist node = head;

        if(node == null)
        {
            System.out.println("There are not enough nodes to insert at " + pos + "th position.Inserted at first");
            addfirst(value);
            return;
        }

        Linkedlist prev_node = null;
        int temp = 0;
        while (node!=null && temp+1<pos)
        {
            temp++;
            prev_node = node;
            node = node.next;
        }

        if(temp+1!=pos)
        {
            System.out.println("Not enough values. Inserting at last position");
            add(value);
            return;
        }
        Linkedlist new_node = new Linkedlist(value,null);
        new_node.next = node;
        prev_node.next = new_node;
    }

    public void deletefirst()
    {
        Linkedlist node = head;
        head = head.next;
        node = null;
    }

    public void deletelast()
    {
        Linkedlist node = head;

        Linkedlist prev_node = null;
        while (node.next!=null)
        {
            prev_node = node;
            node = node.next;
        }
        prev_node.next = null;
        tail = prev_node;
    }


}
