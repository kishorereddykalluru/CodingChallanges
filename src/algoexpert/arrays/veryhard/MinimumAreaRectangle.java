package algoexpert.arrays.veryhard;

import java.util.*;

public class MinimumAreaRectangle {

    public int minimumAreaRectangle(int[][] points){
        HashMap<Integer, int[]> columns = initializeColumns(points);
        int minimumAreaFound = Integer.MAX_VALUE;
        HashMap<String, Integer> edgesParallelToYAxis = new HashMap<>();

        ArrayList<Integer> sortedColumns = new ArrayList<>(columns.keySet());
        Collections.sort(sortedColumns);

        for(Integer x : sortedColumns){
            int[] yValuesInCurrentColumn = columns.get(x);
            Arrays.sort(yValuesInCurrentColumn);

            for(int currentIdx = 0; currentIdx < yValuesInCurrentColumn.length; currentIdx++){
                int y2 = yValuesInCurrentColumn[currentIdx];
                for(int previousIdx=0; previousIdx < currentIdx; previousIdx++){
                    int y1 = yValuesInCurrentColumn[previousIdx];
                    String pointString = String.valueOf(y1) + ":" + String.valueOf(y2);

                    if(edgesParallelToYAxis.containsKey(pointString)) {
                        int currentArea = (x - edgesParallelToYAxis.get(pointString) * (y2 - y1));
                        minimumAreaFound = Math.min(minimumAreaFound, currentArea);
                    }

                    edgesParallelToYAxis.put(pointString, x);
                }
            }
        }
        return minimumAreaFound != Integer.MAX_VALUE ? minimumAreaFound: 0;
    }

    private HashMap<Integer,int[]> initializeColumns(int[][] points) {
        HashMap<Integer, int[]> columns = new HashMap<>();
        for(int[] point: points){
            int x = point[0];
            int y = point[1];

            if(!columns.containsKey(x)){
                columns.put(x, new int[] {});
            }
            int[] column = columns.get(x);
            int[] newColumn = new int[column.length + 1];
            for(int i = 0; i < column.length; i++){
                newColumn[i] = column[i];
            }
            newColumn[column.length] = y;
            columns.put(x, newColumn);
        }

        return columns;
    }

    public int minimumAreaRectangle2(int[][] points) {
        HashSet<String> pointSet = createPointSet(points);
        int minimumAreaFound = Integer.MAX_VALUE;

        for(int currentIdx = 0; currentIdx < points.length; currentIdx++){
            int p2x = points[currentIdx][0];
            int p2y = points[currentIdx][1];

            for(int previousIdx = 0; previousIdx < currentIdx; previousIdx++){
                int p1x = points[previousIdx][0];
                int p1y = points[previousIdx][1];
                boolean pointsShareValue = p1x == p2x || p1y == p2y;

                if(pointsShareValue) continue;

                boolean point1OnOppositeDiagonalExists = pointSet.contains(convertPointToString(p1x, p2y));
                boolean point2OnOppositeDiagonalExists = pointSet.contains(convertPointToString(p2x, p1y));
                boolean oppositeDiagonalExists = point1OnOppositeDiagonalExists && point2OnOppositeDiagonalExists;

                if(oppositeDiagonalExists){
                    int currentArea = Math.abs(p2x - p1x) * Math.abs(p2y - p1y);
                    minimumAreaFound = Math.min(minimumAreaFound, currentArea);

                }

            }
        }
        return minimumAreaFound != Integer.MAX_VALUE ? minimumAreaFound: 0;
    }

    public String convertPointToString(int x, int y){
        return String.valueOf(x) + ":" + String.valueOf(y);
    }
    public HashSet<String> createPointSet(int[][] points){
        HashSet<String> pointSet = new HashSet<>();
        for(int[] point: points){
            int x= point[0];
            int y = point[1];
            String pointString = convertPointToString(x, y);
            pointSet.add(pointString);
        }
        return pointSet;
    }

    public static void main(String[] args) {


    }
}
