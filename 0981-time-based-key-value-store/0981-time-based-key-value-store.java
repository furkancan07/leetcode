/*
Verilen timestamp’e eşit olan varsa → onu döndür
Eşit yoksa → timestamp'ten küçük olan en büyük zamanlı kaydı bul
Hiçbiri yoksa → "" döndür (boş string)
 */

class TimeMap {
    class Pair{
        String value;
        int time;

        public Pair(String value,int time){
            this.value=value;
            this.time=time;
        }
    }

    Map<String,List<Pair>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));    
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        List<Pair> m=map.get(key);

        int left=0;
        int right=m.size()-1;

        String result="";

        while(left<=right){
            int mid=left+(right-left)/2;
            

            if(m.get(mid).time<=timestamp){
                result=m.get(mid).value;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */