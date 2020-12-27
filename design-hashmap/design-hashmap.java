        map[index][nestedIndex] = new Node(key,value);
    }
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);
        int nestedIndex = getNestedIndex(key);
        if (map[index] == null){
            return -1;
        }
        else{
            if(map[index][nestedIndex] != null){
                return map[index][nestedIndex].value;
            } else {
                return -1;
            }
        }
    }
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);
        int nestedIndex = getNestedIndex(key);
        if (map[index] != null && map[index][nestedIndex] != null){
            map[index][nestedIndex] = null;
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
