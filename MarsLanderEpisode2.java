import java.util.Scanner;

class Player {

    public static void main(String[] args) {
        int pw, ang;
        int centerX = 0;
        int centerY = 0;
        int doplandY = 10000;
        int doplandX = 0;

        Scanner s = new Scanner(System.in);
        int surfaceN = s.nextInt();
        for (int i = 0; i < surfaceN; i++) {
            int landX = s.nextInt();
            int landY = s.nextInt();
            if (landY == doplandY) {
                centerX = doplandX + 500;
                centerY = landY;
            }
            doplandX = landX;
            doplandY = landY;

        }

        while (true) {
            int X = s.nextInt();
            int Y = s.nextInt();
            int hSpeed = s.nextInt();
            int vSpeed = s.nextInt();
            int fuel = s.nextInt();
            int rotate = s.nextInt();
            int power = s.nextInt();
            X -= centerX;
            Y -= centerY;
            pw = Math.abs(X / 200);
            ang = X / 40 + hSpeed;

            if (vSpeed < -35) pw = 4;
            if (Y < 400) ang = 0;
            if (Math.abs(ang) > 40) pw = 4;
            if (pw > 3) pw = 4;
            if ((X > 3000 || X < -3000) && (Y < 700)) ang = 0;

            System.out.println(ang + " " + pw);
        }
    }
}
