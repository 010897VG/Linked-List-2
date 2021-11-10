
//Time Complexity : O(N);
//Space Complexity : O(N);
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null|)
            return;
        Stack<ListNode> stack=new Stack<ListNode>();
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        while(!stack.empty()&&stack.peek()!=head){
            ListNode next=head.next;
            ListNode nextNode=stack.pop();
            head.next=nextNode;
            if(nextNode==next){
                head=nextNode;
                break;
            }
            head=next;
            nextNode.next=head;
        }
        head.next=null;

    }
}