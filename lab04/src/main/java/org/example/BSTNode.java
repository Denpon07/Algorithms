package org.example;

public class BSTNode {
    private Node root;
    private class Node {
        private int key;
        private String val;
        private Node left,right;
        private int N;

        public Node(int key, java.lang.String val, int n) {
            this.key = key;
            this.val = val;
            N = n;
        }
    }

    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if(x == null)
            return 0;
        else
            return x.N;
    }

    public String get(int key) {
        return get(root,key);
    }
    private String get(Node x, int key) {
        if (x == null) {
            return null;
        }
        if (key > x.key) {
            return get(x.right,key);
        } else if (key < x.key) {
            return get(x.left,key);
        } else {
            return x.val;
        }
    }

    public void put(int key, String val) {
        root = put(root,key,val);
    }

    private Node put(Node x, int key, String val) {
        if (x == null) {
            return new Node(key,val,1);
        }
        if (key > x.key) {
            x.right = put(x.right,key,val);
        } else if (key < x.key) {
            x.left = put(x.left,key,val);
        } else {
             x.val = val;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    private Node min(Node x) {
        if (x.left == null) {
            return x;
        }
        return min(x.left);
    }
    private Node deleteMin(Node x) {
        if(x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void delete(int key) {
        root = delete(root,key);
    }
    private Node delete(Node x,int key) {
        if (x == null) {
            return null;
        }
        if (key > x.key) {
            x.right = delete(x.right,key);
        } else if (key < x.key) {
            x.left = delete(x.left,key);
        } else {
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }
            Node t = x;
            x=min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
    public void depthOrderTraversal() {
        depthTraversal(root);
    }

    private void depthTraversal(Node  x) {
        if (x!=null) {
            System.out.print("Key = " + x.key + " Value = " + x.val + "\n");
            depthTraversal(x.left);
            depthTraversal(x.right);
        }
    }


}
