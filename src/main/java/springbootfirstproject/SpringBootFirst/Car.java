package springbootfirstproject.SpringBootFirst;

import static ch.qos.logback.core.joran.action.ActionConst.NULL;

public class Car {
    private String model = NULL;
    private String mark = NULL;

    public Car() {}

    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }



    public void setModel(String model) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }
}
