class Solution 
{
    
    static class Meeting implements Comparable<Meeting> {
        int start;
        int end;
        
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        
        
        public int compareTo(Meeting m) {
            return this.end - m.end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<Meeting> meetings = new ArrayList<>();
          for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        
       
        Collections.sort(meetings);
        
        int maxMeetings = 1; // At least one meeting can be held
        
        int currentEndTime = meetings.get(0).end;
        
       
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start > currentEndTime)
            {
               maxMeetings++;
                currentEndTime = meetings.get(i).end;
            }
        }
        
        return maxMeetings;
    }
}
