package springbootfirstproject.SpringBootFirst;

import static ch.qos.logback.core.joran.action.ActionConst.NULL;

public class Car {
    private String model = NULL;
    private String mark = NULL;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

    public Car() {
    }

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

    @Override
    public boolean equals(Object obj){
        return model.equals(((Car)obj).getModel()) && mark.equals(((Car)obj).getMark());
    }


}
