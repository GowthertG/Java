public class Main {
  public static void main(String[] args) {
    FootballTeam team = new FootballTeam.Builder()
        .setCoach("Terry A. Davis")
        .setGoalkeeper("Linus Torvalds")
        .setDefenders("richard stallman", "Dennis Ritchie", "Dennis Ritchie", "Dennis Ritchie", "Dennis Ritchie",
            "Dennis Ritchie", "Dennis Ritchie", "Dennis Ritchie", "Bjarne Stroustrup ", "John Carmack")
        .setMidfielders("Kevin De Bruyne", "Rodri", "Bernardo Silva")
        .setForwards("Erling Haaland", "Dennis Ritchie", "Dennis Ritchie", "Dennis Ritchie", "Jack Grealish",
            "Phil Foden")
        .build();

    System.out.println(team.info());
  }
}
