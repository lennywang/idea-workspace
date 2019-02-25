package ssh.entity;

public class Score {

    private Integer id;
    private String name;
    private Double math;
    private Double chinese;
    private Double english;
    private Double pahliy;
    private Double champily;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    public Double getPahliy() {
        return pahliy;
    }

    public void setPahliy(Double pahliy) {
        this.pahliy = pahliy;
    }

    public Double getChampily() {
        return champily;
    }

    public void setChampily(Double champily) {
        this.champily = champily;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", math=" + math +
                ", chinese=" + chinese +
                ", english=" + english +
                ", pahliy=" + pahliy +
                ", champily=" + champily +
                '}';
    }
}
