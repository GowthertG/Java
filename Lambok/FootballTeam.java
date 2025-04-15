
// Using Lombok and Builder pattern
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FootballTeam {
  private String coach;
  private String goalkeeper;
  private String[] defenders;

  @Builder
  public FootballTeam(String coach, String goalkeeper, String[] defenders) {
    this.coach = coach;
    this.goalkeeper = goalkeeper;
    this.defenders = defenders;
  }

  public static void main(String[] args) {
    FootballTeam team = FootballTeam.builder()
        .coach("Terry A. Davis")
        .goalkeeper("Linus Torvalds")
        .defenders(new String[] { "Richard Stallman", "Dennis Ritchie" })
        .build();
    System.out.println(team);
  }
}
