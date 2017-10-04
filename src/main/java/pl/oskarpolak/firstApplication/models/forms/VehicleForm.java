package pl.oskarpolak.firstApplication.models.forms;

public class VehicleForm {
    public String producitionYear;
    public String mark;
    public String model;


    public VehicleForm(String producitionYear, String mark, String model) {
        this.producitionYear = producitionYear;
        this.mark = mark;
        this.model = model;
    }

    public VehicleForm() { }

    public String getProducitionYear() {
        return producitionYear;
    }

    public void setProducitionYear(String producitionYear) {
        this.producitionYear = producitionYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
