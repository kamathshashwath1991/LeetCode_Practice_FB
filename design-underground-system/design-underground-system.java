class UndergroundSystem {
    
    class Register{
        int id;
        String stationName;
        int t;
        public Register(int id, String stationName, int t){
            this.id = id;
            this.stationName = stationName;
            this.t = t;
        }
    }
    
    class Average{
        double total = 0;
        int count = 0;
        
        public void update(int timeDiff){
            count++;
            total+= timeDiff;
        }
        
        public double getAverage(){
            return total/count;
        }
    }

    private Map<Integer,Register> sourceMap;
    private Map<String,Average> computeMap;
    
    public UndergroundSystem() {
        sourceMap = new HashMap<>();
        computeMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        sourceMap.put(id, new Register(id,stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Register r = sourceMap.get(id);
        sourceMap.remove(id);
        
        int timeDiff = t - r.t;
        String key = r.stationName + "," + stationName;
        Average avg = computeMap.containsKey(key) ? computeMap.get(key) : new Average();
        avg.update(timeDiff);
        computeMap.put(key,avg);
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "," + endStation;
        return computeMap.get(key).getAverage();
    }
    
    
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */