package linkedList;

/**
 * Represents a single link object.
 *
 * @author Jason
 */
public class Link {

    public Friend data; // can replace this with any kind of object
    public Link next;

    public Link(Friend data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return data.toString();
    }
}