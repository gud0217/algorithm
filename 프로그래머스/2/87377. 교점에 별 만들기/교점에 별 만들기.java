import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 좌표를 나타내는 클래스
    private static class Point {
        public final long x, y;
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 교점 좌표 구하기 메서드
    private Point intersection(long a, long b, long e, long c, long d, long f) {
        
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);
        
        if(x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        
        return new Point((long) x , (long) y);
    }
    
    // 최댓값 구하기
    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    // 최솟값 구하기
    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    public String[] solution(int[][] line) {
        // 교점 리스트
        List<Point> points = new ArrayList<>();
        
        // 모든 직선 쌍에 대해 반복
        for(int i = 0; i < line.length; i++) {
            for(int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                
                // 정수인 경우만 저장
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }
        
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);
                
        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);
                
        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }
                
        for (Point p : points) {
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String (arr[i]);
        }
        
        return answer;
    }
}