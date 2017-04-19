package linkedList;

/**
 *
 * @author Jason
 */
public class LinkedList {

    private Link first;
    public int length;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void push(Friend data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
        length++;
    }

    public Link pop() {
        if (length > 0) {
            Link temp = first;
            first = first.next;
            length--;
            return temp;
        }
        return null;
    }

    public Link peek() {
        return first;
    }

    public Link remove(){
        return null; //doesnt work yet
    }
    
    public Link find(String key) {
        Link current = first;
        while (current.data.getName() != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int index) {
        Link current = first;
        Link previous = first;

        if (!isEmpty()) {
            int count = 0;
            while (count != index) {
                if (current.next == null) {
                    return null;
                } else {
                    previous = current;
                    current = current.next;
                }
                count++;
            }

            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
            length--; //fix later
        }
        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Link current = first;

        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(new Friend("Tom", 5));
        list.push(new Friend("Jon", 3));
        list.push(new Friend("Jane", 10));
        System.out.println(list);
        System.out.println("Length of list is: "+ list.length);
        
        System.out.println("Peek = " + list.peek());

        System.out.println("Match for item Tom: " + list.find("Tom"));
        System.out.println("Match for item Jon: " + list.find("Jon"));
        System.out.println("Match for item Jane: " + list.find("Jane"));
        System.out.println("Match for item God: " + list.find("God"));

        Link link = list.pop();
        System.out.println("Pop = " + link);
        System.out.println(list);
//
//        if (list.delete(0) != null) {
//            System.out.println("Item deleted\n" + list);
//        } else {
//            System.out.println("Null value on delete");
//        }

//        if (list.delete(0) != null) {
//            System.out.println("Item deleted\n" + list);
//        } else {
//            System.out.println("Null value on delete");
//        }
//
//        if (list.delete(0) != null) {
//            System.out.println("Item deleted\n" + list);
//        } else {
//            System.out.println("Null value on delete");
//        }
//
//        if (list.delete(0) != null) {
//            System.out.println("Item deleted\n" + list);
//        } else {
//            System.out.println("Null value on delete");
//        }
    }
}
