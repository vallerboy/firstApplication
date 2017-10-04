package pl.oskarpolak.firstApplication.models.forms;

public class VehicleForm {
    public String productionYear;
    public String mark;
    public String model;


    public VehicleForm(String productionYear, String mark, String model) {
        this.productionYear = productionYear;
        this.mark = mark;
        this.model = model;
    }

    public VehicleForm() { }


    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
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
