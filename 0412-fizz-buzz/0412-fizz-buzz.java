class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ar_list = new ArrayList<>();
        for(int i = 1; i < n + 1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                ar_list.add("FizzBuzz");
            }else if(i % 3 == 0){
                ar_list.add("Fizz");
            }
            else if(i % 5 == 0){
                ar_list.add("Buzz");
            } else{
                ar_list.add(String.valueOf(i));
            }
        }
        return ar_list;
    }
}