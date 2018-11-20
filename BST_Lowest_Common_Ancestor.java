    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.

        Node current = root;
        while (true) {
            if (current.data > v1 && current.data > v2) {
                current = current.left;
            } else if (current.data < v1 && current.data < v2) {
                current = current.right;
            } else {
                break;
            }
        }
        return current;
    }
