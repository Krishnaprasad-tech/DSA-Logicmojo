package Arrays_LinkedLists.BackTracking;

public class towerOfHanoi {
    public static void findNumberOfOccurrences(int n, char source, char destination, char aux){
        if(n==1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        findNumberOfOccurrences(n-1, source, aux, destination); //A-->B using C
        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        findNumberOfOccurrences(n-1, aux, destination, source); //B-->C using A

    }
    
    public static void main(String[] args) {
        int n = 2;
        char sourcePeg = 'A';
        char destinationPeg = 'C';
        char auxPeg = 'B';
        findNumberOfOccurrences(n, sourcePeg, destinationPeg, auxPeg);
    }
}
