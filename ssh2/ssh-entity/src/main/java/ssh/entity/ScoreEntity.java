package ssh.entity;

import javax.persistence.*;

@Entity
@Table(name = "score", schema = "test", catalog = "")
public class ScoreEntity {
    private int id;
    private String name;
    private Double math;
    private Double chinese;
    private Double english;
    private Double pahliy;
    private Double champily;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "MATH")
    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    @Basic
    @Column(name = "CHINESE")
    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    @Basic
    @Column(name = "ENGLISH")
    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    @Basic
    @Column(name = "PAHLIY")
    public Double getPahliy() {
        return pahliy;
    }

    public void setPahliy(Double pahliy) {
        this.pahliy = pahliy;
    }

    @Basic
    @Column(name = "CHAMPILY")
    public Double getChampily() {
        return champily;
    }

    public void setChampily(Double champily) {
        this.champily = champily;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoreEntity that = (ScoreEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (math != null ? !math.equals(that.math) : that.math != null) return false;
        if (chinese != null ? !chinese.equals(that.chinese) : that.chinese != null) return false;
        if (english != null ? !english.equals(that.english) : that.english != null) return false;
        if (pahliy != null ? !pahliy.equals(that.pahliy) : that.pahliy != null) return false;
        if (champily != null ? !champily.equals(that.champily) : that.champily != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (math != null ? math.hashCode() : 0);
        result = 31 * result + (chinese != null ? chinese.hashCode() : 0);
        result = 31 * result + (english != null ? english.hashCode() : 0);
        result = 31 * result + (pahliy != null ? pahliy.hashCode() : 0);
        result = 31 * result + (champily != null ? champily.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ScoreEntity{" +
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
