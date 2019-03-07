package ssh.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category", schema = "test", catalog = "")
public class CategoryEntity {
    private short id;
    private String name;
    private Set<BooksEntity> booksEntitySet;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    public Set<BooksEntity> getBooksEntitySet() {
        return booksEntitySet;
    }

    public void setBooksEntitySet(Set<BooksEntity> booksEntitySet) {
        this.booksEntitySet = booksEntitySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", booksEntitySet=" + booksEntitySet +
                '}';
    }
}
