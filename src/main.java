package encapsulation;

public class main {

    String nama, team, umur;
    int penampilan, suara, attitude, nilai;

    public void setNama(String n) {

        nama = n;

    }

    public String getNama() {

        return nama;

    }

    public void setUmur(String n) {

        umur = n;

    }

    public String getUmur() {

        return umur;

    }

    public void setTeam(String n) {

        team = n;

    }

    public String getTeam() {

        return team;

    }

    public void setPenampilan(int m) {

        penampilan = m;

    }

    public int getPenampilan() {

        return penampilan;
    }

    public void setSuara(int m) {

        suara = m;

    }

    public int getSuara() {

        return suara;
    }

    public void setAttitude(int m) {

        attitude = m;

    }

    public int getAttitude() {

        return attitude;
    }

    public int getNilai() {
        return (this.penampilan + this.suara + this.attitude) / 3;
    }

}
