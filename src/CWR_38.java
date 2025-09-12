import java.util.*;

class TreeNode {
    int data;
    List<TreeNode> children = new ArrayList<>();
    TreeNode(int data) {
        this.data = data;
    }
}

public class CWR_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root value: ");
        TreeNode root = new TreeNode(sc.nextInt());
        buildTree(root, sc);

        System.out.print("Preorder: ");
        preOrder(root);
        System.out.print("\nPostorder: ");
        postOrder(root);
    }

    static void buildTree(TreeNode node, Scanner sc) {
        System.out.print("Enter number of children for " + node.data + ": ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter child " + (i+1) + " of " + node.data + ": ");
            TreeNode child = new TreeNode(sc.nextInt());
            node.children.add(child);
            buildTree(child, sc);
        }
    }

    static void preOrder(TreeNode node) {
        System.out.print(node.data + " ");
        for (TreeNode child : node.children) {
            preOrder(child);
        }
    }

    static void postOrder(TreeNode node) {
        for (TreeNode child : node.children) {
            postOrder(child);
        }
        System.out.print(node.data + " ");
    }
}