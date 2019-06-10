package cn.edu.swufe.dpsquery;

public class DpsItem {

    private int id;
    private String curName;
    private String curDps;

    public DpsItem() {
        this.curName = "";
        this.curDps = "";
    }

    public DpsItem(String curName, String curDps) {
        this.curName = curName;
        this.curDps = curDps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public String getCurDps() {
        return curDps;
    }

    public void setCurDps(String curDps) {
        this.curDps = curDps;
    }
}
