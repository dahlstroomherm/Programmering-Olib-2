public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(122, false);

        // Opprett to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        Robot robot1 = new Robot("Bumblebee", 70,600,"B-Bot");
        Robot robot2 = new Robot("Megatron",100,1000,"Toaster");

        System.out.println(robot1.reportStatus() + " \n" + "\n" + robot2.reportStatus());

        // Sjekk om robotene kan gå til danseklubben
        System.out.println("\n" + robot1.canDanceAtClub(todaysWorld));
        System.out.println("\n" + robot2.canDanceAtClub(todaysWorld));

        // Sjekk om robotene kan gå til parken
        System.out.println("\n" + robot1.canWalkToThePark(todaysWorld));
        System.out.println("\n" + robot2.canWalkToThePark(todaysWorld));
    }
}
