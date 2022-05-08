package HW3;

import javax.swing.tree.TreeNode;

public class BST<K extends Comparable<K>, V> {
    private Node root;
    private class Node
    {
        private K key;
        private V val;
        private Node left,right;
        public Node(K key,V value)
        {
            this.key = key;
            this.val = value;
        }
    }
    public void put(K key, V val) {
        Node curr = root;
        Node rod;
        Node NewNode = new Node(key, val);
        if (root == null) {
            root = NewNode;
        }
        else {
            do {
                rod = curr;
                if(val == curr.val()) {
                    return;
                }
               else if (key < curr.key()) {
                    return curr = curr.left();
                    if (curr == null){
                        rod.left(NewNode);
                        return;
                }
                   else if (curr == null) {
                        rod.left(NewNode);
                        return;
                    }
                }
                else {
                    curr = curr.right();
                    if (curr == null) {
                        rod.right(NewNode);
                        return;
                    }
                }
            }
            while(true);
        }
    }


    public V get(K key){
        Node curr = root;
            while(curr.key() != key){
            if (curr == null) {
                return null;
            }
            else if (key < curr.key) {
               return curr = curr.left();
            }
            else {
               return curr = curr.right();
            }
        }
        return curr;

    }

    public void delete(K key){

    }

    public Iterable<K> iterator(){

    }
}
