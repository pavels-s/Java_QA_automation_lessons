package lecture3.task4;

public class LightColorDetector {

    public void detect(int waveLength) {

        if ((waveLength >= 380) && (waveLength <= 449)) {
            System.out.println("Violet");
        }

        if ((waveLength >= 450) && (waveLength <= 494)) {
            System.out.println("Blue");
        }

        if ((waveLength >= 495) && (waveLength <= 569)) {
            System.out.println("Green");
        }

        if ((waveLength >= 570) && (waveLength <= 589)) {
            System.out.println("Yellow");
        }

        if ((waveLength >= 590) && (waveLength <= 619)) {
            System.out.println("Orange");
        }

        if ((waveLength >= 620) && (waveLength <= 750)) {
            System.out.println("Red");
        }

        if ((waveLength < 380) || (waveLength >750)) {
            System.out.println("Invisible light");
        }

    }
}
