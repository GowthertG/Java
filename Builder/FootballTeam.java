// builder pattren 
public class FootballTeam {
  private String coach;
  private String goalkeeper;
  private String[] defenders;
  private String[] midfielders;
  private String[] forwards;

  private FootballTeam(Builder builder) {
    this.coach = builder.coach;
    this.goalkeeper = builder.goalkeeper;
    this.forwards = builder.forwards;
    this.midfielders = builder.midfielders;
    this.defenders = builder.defenders;
  }

  public static class Builder {
    private String coach;
    private String goalkeeper;
    private String[] defenders = new String[4];
    private String[] midfielders = new String[4];
    private String[] forwards = new String[2];

    public FootballTeam build() {
      return new FootballTeam(this);
    }

    public Builder setCoach(String coach) {
      this.coach = coach;
      return this;
    }

    public Builder setGoalkeeper(String goalkeeper) {
      this.goalkeeper = goalkeeper;
      return this;
    }

    public Builder setDefenders(String... defenders) {
      this.defenders = defenders;
      return this;
    }

    public Builder setMidfielders(String... midfielders) {
      this.midfielders = midfielders;
      return this;
    }

    public Builder setForwards(String... forwards) {
      this.forwards = forwards;
      return this;
    }
  }

  public String info() {
    return "FootballTeam{" +
        "coach=" + coach +
        ", goalkeeper=" + goalkeeper +
        ", defenders=" + String.join(", ", defenders) +
        ", midfielders=" + String.join(", ", midfielders) +
        ", forwards=" + String.join(", ", forwards) +
        '}';
  }
}
