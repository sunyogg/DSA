public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Sunyog";
        searchString(name, 'u');
    }

    public static int searchString(String str, char chr) {
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == chr) {
                System.out.println("Found " + chr + " at " + i);
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }
}