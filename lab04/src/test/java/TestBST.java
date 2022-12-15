import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestBST {
    Map<Integer,String> tree;

    @BeforeEach
    void treeInit() {
        tree = new HashMap<>();

        tree.put(15,"Tom");
        tree.put(19,"Clark");
        tree.put(11,"Ilan");
        tree.put(26,"Ignatius");
        tree.put(13,"Cyrus");
        tree.put(12,"Zachariah");
        tree.put(24,"DeAndre");
        tree.put(27,"Bruce");
        tree.put(16,"Lukas");
        tree.put(20,"Major");
        tree.put(10,"Jake");
        tree.put(21,"Cash");
        tree.put(18,"Hayden");
        tree.put(17,"Westin");
        tree.put(8,"Timothy");
        tree.put(9,"Felix");
        tree.put(25,"Tripp");
        tree.put(23,"Desmond");
        tree.put(22,"Yitzchak");
        tree.put(14,"Fisher");
    }

    private BSTNode mapTransferBstnode() {
        BSTNode bstTree = new BSTNode();

        for (Map.Entry<Integer,String> item: tree.entrySet()) {
            bstTree.put(item.getKey(), item.getValue());
        }
        return bstTree;
    }

    @Test
    void TestCase1() {
        BSTNode bstTree = mapTransferBstnode();

        Assertions.assertEquals(20,tree.size());
    }

    @Test
    void TestCase2() {
        BSTNode bstTree = mapTransferBstnode();

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(20,tree.size());
    }

    @Test
    void TestCase3() {
        BSTNode bstTree = mapTransferBstnode();

        Assertions.assertEquals("Cash",bstTree.get(21));
        Assertions.assertNull(bstTree.get(99));
        Assertions.assertEquals("Clark",bstTree.get(19));
        Assertions.assertNull(bstTree.get(51));
    }

    @Test
    void TestCase4() {
        BSTNode bstTree = new BSTNode();

        for (Map.Entry<Integer,String> item: tree.entrySet()) {
            if(item.getKey()!=20) {
                bstTree.put(item.getKey(), item.getValue());
            }
        }


        bstTree.put(20,"Major");

        System.out.println(bstTree.get(20));
        Assertions.assertEquals("Major",bstTree.get(20));
        bstTree.put(20,"Anton");

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(20,bstTree.size());

        System.out.println(bstTree.get(20));
        Assertions.assertEquals("Anton",bstTree.get(20));
    }
    @Test
    void TestCase5() {
        BSTNode bstTree = mapTransferBstnode();

        bstTree.delete(16);

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(19,bstTree.size());

    }
}
