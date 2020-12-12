            }
            return -1;
        }
    }
    
    public void add(int key) {
        int index = getIndex(key);
        int pos = getPos(key,index);
        if (pos < 0){
            if (set[index] == null){
                set[index] = new ArrayList<Integer>();
            }
            set[index].add(key);
        }
        else{
            set[index].set(pos,key);
        }
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        int pos = getPos(key,index);
        if (pos >= 0){
            set[index].remove(pos);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = getIndex(key);
        int pos = getPos(key,index);
        return pos >= 0;
    }
}
​
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
