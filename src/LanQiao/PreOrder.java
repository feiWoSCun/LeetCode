package LanQiao;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
 this.right = right;
      }
  }


        public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        solution(arr,root);
        return arr;
        }
        public void solution(List arr,TreeNode root) {
            arr.add(root.val);
            if (root != null) {
                solution(arr, root.left);
            } else{
                solution(arr, root.right);
        }

        }
    }

