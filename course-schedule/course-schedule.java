        }
        return count == numCourses;
    }
    
    private int[] buildIndegree(int numCourses, int[][] prerequisites){
        int indegree[] = new int[numCourses];
        for (int course[] :prerequisites){
            int main = course[0];
            indegree[main]++;
        }
        
        return indegree;
    }
    
    private HashMap<Integer,LinkedList<Integer>> buildGraph(int numCourses, int[][] prerequisites){
        HashMap<Integer,LinkedList<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++){
            map.put(i, new LinkedList<Integer>());
        }
        for (int courses[] : prerequisites){
            int main = courses[0];
            int pre = courses[1];
            map.get(pre).add(main);
        }
        return map;
    }
}
