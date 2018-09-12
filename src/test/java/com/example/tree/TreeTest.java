package japapino.securityexample;

import com.example.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void firstTest() {
        Node six = new Node(6, null, null);
        Node four= new Node(4, null, null);
        Node five = new Node(5, six, four);

        assertEquals(five.value, 5);
        assertEquals(five.getLeftChild().getValue(), 6);
        assertEquals(five.getRightChild().getValue(), 4);
    }

//    @Test
//    public void testDelayedConstruction() {
//
//        Node five = new Node(5, six, four);
//        Node six = new Node(6, null, null);
//        Node four= new Node(4, null, null);
//
//        assertEquals(five.value, 5);
//        assertEquals(five.getLeftChild().getValue(), 6);
//        assertEquals(five.getRightChild().getValue(), 4);
//    }

    @Test
    public void addChild(){
        Node six = new Node(6, null, null);
        six.addChild(7);

        Node foo = six.getRightChild();
        int bar = foo.getValue();
        assertEquals(bar, 7);
    }

    @Test
    public void addAnotherChild(){
        Node six = new Node(6, null, null);
        six.addChild(5);

        Node foo = six.getLeftChild();
        int bar = foo.getValue();
        assertEquals(bar, 5);
    }


    @Test
    public void addTwoChildren(){
        Node six = new Node(6, null, null);
        six.addChild(5);
        boolean wasAdded = six.addChild(7);

        Node foo = six.getLeftChild();
        int bar = foo.getValue();
        assertEquals(bar, 5);
        assertTrue(wasAdded );
    }

    @Test
    public void addTwoOtherChildren(){
        Node six = new Node(6, null, null);
        boolean addedFirst = six.addChild(5);
        boolean wasAdded = six.addChild(4);

        assertTrue(addedFirst);
        assertFalse(wasAdded );
    }

    @Test
    public void addDeepChildren(){
        Node six = new Node(6, null, null);
        boolean addedFirst = six.addChild(7);
        boolean wasAdded = six.addChild(5);
        boolean thirdAdded = six.addChild(3);

        assertTrue(addedFirst);
        assertFalse(wasAdded );
    }
}