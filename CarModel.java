public class CarModel implements Comparable<CarModel> {
    private String customername;
    private int customerid;
    private int carid;
    private int carprice;
    private int carresalevalue;
    private String carmodel;

    public String getCustomername() {
        return customername;
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getCarid() {
        return carid;
    }

    public int getCarprice() {
        return carprice;
    }

    public int getCarresalevalue() {
        return carresalevalue;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public void setCarresalevalue(int carresalevalue) {
        this.carresalevalue = carresalevalue;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public CarModel(String customername, int customerid, int carid, int carprice, int carresalevalue, String carmodel) {
        this.customername = customername;
        this.customerid = customerid;
        this.carid = carid;
        this.carprice = carprice;
        this.carresalevalue = carresalevalue;
        this.carmodel = carmodel;
    }

    @Override
    public int compareTo(CarModel o) {
        int compareInt = this.customername.compareTo(o.customername);
        if(compareInt<0) return -1;
        if(compareInt>0) return  1;
        return 0;
    }
}

