/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_List;

/**
 *
 * @author Mind_Coder
 */
public class Sort_Double_Linked_List {
    public static void main(String arg[]){
        /*
            https://www.geeksforgeeks.org/sort-k-sorted-doubly-linked-list/
        */
    }
    static class Node
    {
            int data;
            Node next, prev;
            Node(int d)
            {
            data = d;
            next = prev = null;
            }
    }
    Node sortAKSortedDLL( Node head, int k) {
	if(head == null || head.next == null)
		return head;

	// perform on all the nodes in list
	for(Node i = head.next; i != null; i = i.next) {
		Node j = i;
		// There will be atmost k swaps for each element in the list
		// since each node is k steps away from its correct position
		while(j.prev != null && j.data < j.prev.data) {
			// swap j and j.prev node
            Node prevKaPrev =  j.prev.prev;
            Node currKaPrev = j.prev;
            Node currKaNext = j.next;
			j.prev.next = currKaNext;
			j.prev.prev = j;//current
			j.prev = prevKaPrev;
			j.next = currKaPrev;
			if(prevKaPrev != null)
				prevKaPrev.next = j;
			if(currKaNext != null)
				currKaNext.prev = currKaPrev;
		}
		// if j is now the new head
	// then reset head
		if(j.prev == null)
			head = j;
	}
	return head;
}
}
