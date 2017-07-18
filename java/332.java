public class Solution {
    public List<String> findItinerary(String[][] tickets) {
        List<String> result = new ArrayList<String>();
        if(tickets.length==0) return result;
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(int i = 0;i<tickets.length;i++){
            String[] ticket = tickets[i];
            List<String> list = map.get(ticket[0]);
            if(list==null) map.put(ticket[0],new ArrayList<String>());
            map.get(ticket[0]).add(ticket[1]);
            Collections.sort(map.get(ticket[0]));
            if(map.get(ticket[1])==null){
                map.put(ticket[1],new ArrayList<String>());
            }
        }
        result.add("JFK");
        List<String> list = map.get("JFK");
        int index = 1;
        while(tickets.length+1>result.size()){
            List<String> t = new ArrayList<String>();
            while(list.size()>0){
                String next = list.get(0);
                t.add(next);
                list.remove(0);
                list = map.get(next);
            }
            result.addAll(index,t);
            for(int i = result.size()-1;i>=0;i--){
                if(map.get(result.get(i)).size()>0){
                    list = map.get(result.get(i));
                    index = i+1;
                    break;
                }    
            }
            
        }
        
        
        return result;
    }
}
