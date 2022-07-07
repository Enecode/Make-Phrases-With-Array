public class MakePhrasesWithArray {

    public static void main(String[] args) {
        String[] listOfWordsOne = {"24/7","Web development", "B-to-B", "Win-win", "Front-End", "Web-based", "pervasive", "Smart", "Dynamic", "Critical-path", "Six-Sigma"};
        String[] listOfWordsTwo = {"Empowered", "sticky", "Value-Added", "Oriented", "Centric", "Distributed", "Clustered", "Branded", "Outside-the-box", "positioned", "networked", "Focused", "leveraged","aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] listOfWordsThree = {"process", "tipping-point", "solution", "architecture", "core-competence", "strategy", "mind-share", "portal", "space", "vision", "paradigm", "mission"};

        int oneLength = listOfWordsOne.length;
        int twoLength = listOfWordsTwo.length;
        int threeLength = listOfWordsThree.length;

        int oneRandomNumber = (int) (Math.random() * oneLength);
        int twoRandomNumber = (int) (Math.random() * twoLength);
        int threeRandomNumber = (int) (Math.random() * threeLength);

        String phrase = listOfWordsOne[oneRandomNumber] + " " + listOfWordsTwo[twoRandomNumber] + " " + listOfWordsThree[threeRandomNumber];
        System.out.println(phrase);
    }
}
