public class Robot {
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    String name;
    int batteryLevel;
    int distancetoPark;
    String botType;

    public Robot(String name, int batteryLevel, int distancetoPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;

    }

    public String reportStatus() {
        // Metode for å rapportere statusen til robotten

        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "Dette er bot " + name + " av typen " + botType + "\n" +
                "Denne enheten har " + batteryLevel +
                "% batterikapasitet igjen og bor " + distancetoPark +" meter fra parken.";}

    public boolean canWalkToThePark(World world) {
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene
       System.out.println(name + " sjekker om det er mulig å gå til parken idag:");

        // Sjekk om det regner
        if (world.getIsRaining()) {
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            System.out.println("Roboten kan ikke gå i parken idag siden det regner.");
            return false;
        }

        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
            if (!world.isSunday()){
                return false;
            }

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.
        if (batteryLevel < distancetoPark / 100){
            return false;

        }

        return true;
    }

public boolean canDanceAtClub(World world) {
    System.out.println("\n" + name + " Sjekker om det er mulig å dra til danseklubben idag:");
        if (!botType.equals("B-Bot")){
            return false;
        }

        if (batteryLevel < 50){
        return false;
        }

        if (world.getDay() % 7 == 1){
            return false;
        }
        return true;
    }
    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.
}
