package Week2.day6.IPLTeam;

public class IPLDriver {
    public static void main(String[] args) {
        IPL match1 = new ChennaiSuperKings();
        match1.tournamentWonBy();

        IPL match2 = new MumbaiIndians();
        match2.tournamentWonBy();

        IPL match3 = new RoyalChallengersBanglore();
        match3.tournamentWonBy();


    }
}
