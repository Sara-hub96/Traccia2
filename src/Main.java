public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{
         new Person("Gianluca", 18),
         new Person("Barbara", 19)
        };

        String[] nameArray = new String[2];
        nameArray[0] = people[0].getName();
        nameArray[1] = people[1].getName();

        printFirstFiveLetters(nameArray);
        System.out.println(thirdLettersChains(nameArray,1,2));
    }

    public static void printFirstFiveLetters(String[] object){
        for (String element : object) {
            System.out.println(String.format("Le prime cinque lettere sono: %s", element.substring(0,5)));
        }
    }

    public static String thirdLettersChains(String[] object2, int k, int n){
        String str = "";
        for (int i = k; i < n; i++){
            String str2 = object2[i];
            str += str2.charAt(3);
        }
        return str;
    }
}