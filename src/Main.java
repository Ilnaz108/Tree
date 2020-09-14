import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;
    public class Main {
        public static void main(String[] args) {
            Node tree = new LeafNode();
            System.out.println(tree.count()); // 1

            tree = new NonLeafNode(new LeafNode(), new LeafNode());
            System.out.println(tree.count()); // 2

            tree = new NonLeafNode(
                    new NonLeafNode(new LeafNode(), new NullNode()), new NullNode());
            System.out.println(tree.count()); // 2
        }
    }


