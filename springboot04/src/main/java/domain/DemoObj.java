package domain;

/**
 * @ClassName DemoObj
 * @Description TODO
 * @Author wll
 * @Date 2019/6/7 20:03
 * @Version 1.0
 **/
public class DemoObj {

    private Long id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
