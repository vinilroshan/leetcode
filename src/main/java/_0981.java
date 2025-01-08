import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/time-based-key-value-store
public class _0981 {
    static class TimeMap {
        final Map<String, TreeMap<Integer, String>> store;
        public TimeMap() {
            store = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!store.containsKey(key)) {
                store.put(key, new TreeMap<>());
            }

            final var values = store.get(key);
            values.put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (store.containsKey(key)) {
                final var values = store.get(key);
                Integer result = values.floorKey(timestamp);
                if (result == null) {
                    return "";
                }
                return values.get(result);
            } else {
                return "";
            }
        }
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("love", "high", 10);
        timeMap.set("love", "low", 20);
        System.out.println(timeMap.get("love", 5));
    }
}
