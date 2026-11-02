/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node nextNode = curr.next;
                Node childNode = flatten(curr.child);
                curr.next = childNode;
                childNode.prev = curr;
                curr.child = null;
                Node tail = childNode;

                while (tail.next != null) {
                    tail = tail.next;
                }
                if (nextNode != null) {
                    tail.next = nextNode;
                    nextNode.prev = tail;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}