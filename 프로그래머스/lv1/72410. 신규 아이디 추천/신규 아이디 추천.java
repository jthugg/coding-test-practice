class Solution {
    public String solution(String new_id) {
        new_id = (" " + new_id.toLowerCase()
                        .replaceAll("[^-|_|.|a-z|0-9]", "")
                        .replaceAll("[.]+", ".")
                        .replaceAll(" ", "") + " ")
                .replace(" .", "").replace(". ", "").trim();
        if (new_id.length() == 0) {
            new_id = "a";
        }
        if (new_id.length() > 15) {
            new_id = (new_id.substring(0, 15) + " ")
                    .replace(". ", "").trim();
        }
        if (new_id.length() < 3) {
            new_id = new_id
                    + (new_id.charAt(new_id.length() - 1) + "")
                    .repeat(3 - new_id.length());
        }
        return new_id;
    }
}