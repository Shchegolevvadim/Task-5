public class Tower {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
public static void doTowers( int topN, char sourse,char destination, char buffer) {
    if (topN ==1) {
        System.out.println("Disk 1 from " + sourse + " to " + destination);
        return;
    }
    doTowers( topN -1, sourse, buffer, destination);
    System.out.printf("Disk %s from %s to %s", topN, sourse, destination);
    System.out.println();
    doTowers( topN - 1, buffer, destination, sourse);
    }
}

    

