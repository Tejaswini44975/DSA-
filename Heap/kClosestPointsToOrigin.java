class Solution {
    public int[][] kClosest(int[][] points, int k) {
         PriorityQueue<Pair<Integer, int[]>> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getKey(), a.getKey())
        );

        List<int[]> ans = new ArrayList<>();
        for (int[] p : points) {
            int distance = p[0] * p[0] + p[1] * p[1];
            maxHeap.offer(new Pair<>(distance, p));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        while (!maxHeap.isEmpty()) {
            ans.add(maxHeap.poll().getValue());
        }

        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    
    }
}
