class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> outdegree = new HashMap<>();
        for (List<String> path : paths) {
            String u = path.get(0);
            String v = path.get(1);
            outdegree.put(u, outdegree.getOrDefault(u, 0) + 1);
            outdegree.putIfAbsent(v, 0);
        }
        for (String city : outdegree.keySet()) {
            if (outdegree.get(city) == 0) {
                return city;
            }
        }
        return "";
    }
}