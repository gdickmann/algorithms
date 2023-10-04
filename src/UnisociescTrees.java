public class UnisociescTrees {
    public static void main(String[] args) {
		int[] values = { 8, 3, 6, 10, 14, 1, 7 };
		
		Node root = new Node(values[0]);
		
		for (int i = 1; i < values.length; i++) {
			createSearchBinaryTree(root, values[i]);
		}
    }

    /**
     * Cria uma árvore binária de busca com base na raíz especificada.
     * @param node é a raíz da árvore de busca.
     * @param value é o valor para ser inserido na árvore de busca.
     */
    private static void createSearchBinaryTree(Node node, int value) {
        if (value < node.value) {
            if (node.left == null)
                node.left = new Node(value);
            else
                createSearchBinaryTree(node.left, value);
        } else {
            if (node.right == null)
                node.right = new Node(value);
            else
                createSearchBinaryTree(node.right, value);
        }
	}

    public static class Node {

        /** 
         * O valor do nó.
         */
		public int value;

        /**
         * Referência ao nó esquerdo.
         */
		public Node left;

        /**
         * Referência ao nó direito.
         */
		public Node right;
		
		public Node(int value) {
			this.value = value;			
		}
	}
}