package codingchallanges.interviewquestions;

public class EpamElementWithHighesNumberofOccurance {

    public static void main(String[] args) {
        int arr[] = {5, 7, 5, 7, 5, 7, 2, 7}; // {1,2,3,4,4,4}
// print 5
        System.out.println("highest = "+solution(arr));
    }

    public static int solution(int[] arr) {

        int max = 0;

        /*Map<Integer, Long> map = List.of(5, 7, 5, 7, 5, 7, 2, 7).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Integer> integer = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
        if(integer.isPresent())
            max = integer.get();

        System.out.println(max);

        int highest = 0;
        int high = 0;
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if (intMap.containsKey(arr[i])){
                intMap.put(arr[i], intMap.get(arr[i])+ 1);
            } else {
                intMap.put(arr[i], 1);
            }
        }
*/
       /* for(int a: intMap.keySet()){
            if(intMap.get(a) > highest) {
                highest = intMap.get(a);
                high = a;
            }
        }
        return high;*/
        return max;
    }
}
