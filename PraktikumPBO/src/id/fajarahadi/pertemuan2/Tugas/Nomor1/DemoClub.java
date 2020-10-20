package id.fajarahadi.pertemuan2.Tugas.Nomor1;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Manchester United");
        Club club3 = new Club("Manchester United", "Ini stadion MU");
        Club club4 = new Club("Manchester United", 1910, "Old Trafford");
        Club club5 = new Club("Manchester United", 1910, "Old Trafford", 03, "Ini stadion MU");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
