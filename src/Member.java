package encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {

    public static ArrayList<main> member = new ArrayList<>();

    public static void main(String[] args) {
        main s1 = new main();
        s1.setNama("Riska");
        s1.setTeam("Kelas E");
        s1.setUmur("18");
        s1.setPenampilan(85);
        s1.setSuara(85);
        s1.setAttitude(80);

        main s2 = new main();
        s2.setNama("Dinda");
        s2.setTeam("Kelas E");
        s2.setUmur("18");
        s2.setPenampilan(85);
        s2.setSuara(85);
        s2.setAttitude(85);

        main s3 = new main();
        s3.setNama("Zidny");
        s3.setTeam("Kelas E");
        s3.setUmur("19");
        s3.setPenampilan(90);
        s3.setSuara(85);
        s3.setAttitude(80);

        main s4 = new main();
        s4.setNama("Dyah");
        s4.setTeam("Kelas E");
        s4.setUmur("18");
        s4.setPenampilan(80);
        s4.setSuara(85);
        s4.setAttitude(85);

        member.add(s1);
        member.add(s2);
        member.add(s3);
        member.add(s4);
        Member.Output();
    }

    public static void Output() {
        for (int i = 0; i < member.size(); i++) {
            System.out.println("Nama\t: " + member.get(i).getNama());
            System.out.println("Team\t: " + member.get(i).getTeam());
            System.out.println("Umur\t: " + member.get(i).getUmur());
            System.out.println("Nilai\t: " + member.get(i).getNilai());
            System.out.println("========================");

        }

    }
}
