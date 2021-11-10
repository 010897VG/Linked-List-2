Time Complexity : O(N);
Space Complexity : O(N);




public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet();

        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB!=null){
            if(!set.add(headB))
                return headB;
            headB = headB.next;
        }


        return null;
    }
}