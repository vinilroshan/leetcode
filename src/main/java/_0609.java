import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/find-duplicate-file-in-system/description
public class _0609 {
    public List<List<String>> findDuplicate(String[] paths) {
        final var tracker = new HashMap<String, List<String>>();
        // "root/a 1.txt(abcd) 2.txt(efgh)"
        for (final var path : paths) {
            final var pathParts = path.split(" ");
            final var directory = pathParts[0];

            for (var i = 1; i < pathParts.length; i ++) {
                final var fileName = pathParts[i].substring(0, pathParts[i].indexOf('('));
                final var content = pathParts[i].substring(pathParts[i].indexOf('(') + 1, pathParts[i].indexOf(')'));

                tracker.putIfAbsent(content, new ArrayList<>());
                tracker.get(content).add(directory + '/' + fileName);
            }
        }
        final var result = new ArrayList<List<String>>();
        for (final var group: tracker.values()) {
            if (group.size() > 1) {
                result.add(group);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0609();
        System.out.println(solution.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"}));
        System.out.println(solution.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"}));
    }
}
