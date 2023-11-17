class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<List<Integer>> willVisit = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        willVisit.add(rooms.get(0));
        visited.add(0);

        while(!willVisit.isEmpty()){
            List<Integer> aux = willVisit.remove();
            for(int room:aux){
                if(visited.add(room)){
                    willVisit.add(rooms.get(room));
                }
            }
        }
        
        for(int i = 0; i < rooms.size(); i++){
            if(!visited.contains(i)){
                return false;
            }
        }
        return true;
    }
}