
//We are given N points in a @D plane which are location of N cars,
// If we are at the origin,print the newrest K cars ,hotels ,restotrents,pump
package heap_priorityque;

import java.util.PriorityQueue;

public class distance_near_car {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x,int y, int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq =distSq;
            this.idx =idx;

        }
        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq;

        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k =2;

        PriorityQueue<Point>pq =new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distSq =pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],distSq ,i));
        }
        //nearset k cars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
