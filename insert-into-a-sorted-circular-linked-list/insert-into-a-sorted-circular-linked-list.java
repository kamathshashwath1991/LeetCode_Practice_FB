        }
        else{
            
            while(curr.next.val < insertVal){
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
        }
        return head;
    }
    
    private Node getMaxElement(Node head){
        
        Node max = head;
        
        while(max.next!=head && max.next.val >= max.val){
            max = max.next;
        }
        
        return max;
    }
}
