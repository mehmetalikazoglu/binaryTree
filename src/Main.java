
public class Main {
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();

        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,4);
        bt.root=bt.insert(bt.root,12);

        System.out.println("Kökün datası: "    + bt.root.data);
        System.out.println("Kökün sağındaki: " + bt.root.right.data);
        System.out.println("Kökün solundaki: " + bt.root.left.data);
        System.out.println("Kökün sağındakinin sağı: " + bt.root.right.right.data);
        System.out.println("Kökün solundakinin solu: " + bt.root.left.left.data);



    }
}