import java.util.Scanner;

public class Painter {
    public static void main(String args[]) {
        int length;
        String painting = null;
        Painter painter = new Painter();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        for(int i=0; i<t; i++) {
            length = Integer.parseInt(sc.nextLine().trim());
            painting = sc.nextLine();
            length = painter.solve(painting.toCharArray(), length);
            System.out.println("Case #"+(i+1)+": "+length);
        }
        sc.close();
    }

    public int solve(char[] painting, int length) {
        boolean red[] = new boolean[length];
        boolean blue[] = new boolean[length];
        boolean yellow[] = new boolean[length];
        int total = 0, redTotal = 0, yellowTotal = 0, blueTotal = 0;
        boolean hasRed=false, hasYellow=false, hasBlue=false;
        for(int i=0; i<length; i++) {
            red[i] = isRed(painting[i]);
            blue[i] = isBlue(painting[i]);
            yellow[i] = isYellow(painting[i]);
        }
        for(int i=0; i<length; i++) {
            if(red[i]) {
                if(!hasRed) {
                    hasRed = true;
                    redTotal++;
                }
            } else if(hasRed) {
                hasRed = !hasRed;
            }
            if(blue[i]) {
                if(!hasBlue) {
                    hasBlue = true;
                    redTotal++;
                }
            } else if(hasBlue) {
                hasBlue = !hasBlue;
            }
            if(yellow[i]) {
                if(!hasYellow) {
                    hasYellow = true;
                    redTotal++;
                }
            } else if(hasYellow) {
                hasYellow = !hasYellow;
            }
        }
        total = redTotal + yellowTotal + blueTotal;
        return total;
    }

    public static boolean isRed(char c) {
        switch(c) {
            case 'R':
            return true;
            case 'O':
            return true;
            case 'P':
            return true;
            case 'A':
            return true;
            default:
            return false;
        }
    }

    public static boolean isBlue(char c) {
        switch(c) {
            case 'B':
            return true;
            case 'P':
            return true;
            case 'G':
            return true;
            case 'A':
            return true;
            default:
            return false;
        }
    }

    public static boolean isYellow(char c) {
        switch(c) {
            case 'Y':
            return true;
            case 'O':
            return true;
            case 'G':
            return true;
            case 'A':
            return true;
            default:
            return false;
        }
    }
}
