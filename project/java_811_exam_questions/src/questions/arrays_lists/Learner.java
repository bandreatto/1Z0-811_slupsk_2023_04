package questions.arrays_lists;

class Learner {

    public static void main(String[] args) {
        String[] dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try {
            for (String data : dataArr) {
                System.out.print(data.concat(" "));
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
