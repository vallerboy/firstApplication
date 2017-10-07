package pl.oskarpolak.firstApplication.models.forms;

public class VehicleForm {
    public int productionYear;
    public String mark;
    public String model;


    public VehicleForm(int productionYear, String mark, String model) {
        this.productionYear = productionYear;
        this.mark = mark;
        this.model = model;
    }

    public VehicleForm() { }


    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
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
