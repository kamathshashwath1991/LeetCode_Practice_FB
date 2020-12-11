        if (pos < 0){
            if (map[index] == null){
                map[index] = new ArrayList<Pair<Integer,Integer>>();
            }
            map[index].add(new Pair(key,value));
        }
        else{
            map[index].set(pos,new Pair(key,value));
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);
        int pos = getPos(key,index);
        if (pos < 0){
            return -1;
        }
        else{
            return map[index].get(pos).getValue();
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);
        int pos = getPos(key,index);
        if (pos >= 0){
            map[index].remove(pos);
        }
    }
}
​
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
