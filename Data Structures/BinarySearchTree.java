public class BinarySearchTree {
	private int[] tree = new int[100];
	private boolean[] isSet = new boolean[100];
	private int root;

	public void insert(int value) {
		insert(value, 0);
	}

	public void insert(int value, int root) {
		// variant of binary search
		// when first called, index of start = root is index 0

		// check if tree has no root (no values added yet)
		if(isSet[0] == false){
			tree[0] = value;
			isSet[0] = true;
		}

		//check if value is larger than root.  if so: add this value to the left sub-tree
        else if (value < tree[root]) {
			//check if root has left child
			if (isSet[(root * 2) + 1] == false) {
				// node * 2 + 1 = left child of the node

                // there is currently no left child, so
				// make this new node the left child
				tree[(root * 2) + 1] = value;
				isSet[(root * 2) + 1] = true;

            } else {
                // there is already a left child, so
                // ask the left node to insert the value
                insert(value, (root * 2) + 1);
            }
		} 
		
		else { // value >= this.value
            //check if root has right child
			if (isSet[(root * 2) + 2] == false) {
				// node * 2 + 2 = right child of the node

                // there is currently no right child, so
				// make this new node the right child
				tree[(root * 2) + 2] = value;
				isSet[(root * 2) + 2] = true;

            } else {
                // there is already a right child, so
                // ask the right node to insert the value
				insert(value, (root * 2) + 2);
			}
        }
    }

	public int getLeftChild(int index) {
        return (index * 2) + 1;
    }

    public int getRightChild(int index) {
        return (index * 2) + 2;
    }
	
	//Code from ArrayBinaryTree.java Lecture GitHub
	public void print(int index, int depth){
		if ((index < 0 || index >= tree.length) || isSet[index] == false) {
			return null; //exit as there's no more tree left
		}

		// in-order traversal (but in reverse - smaller values at the bottom)

		// recursively traverse the right sub-tree
		print(getRightChild(index), depth + 1);

		// 'visit' the parent node
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println(tree[index]);

		// recursively traverse the left sub-tree
		print(getLeftChild(index), depth + 1);
	}


	public boolean isEmpty(){
		//return true if root is null, else false
		if (this.tree.length == 0){
			return true;
		}else{
			return false;
		}
	}
}