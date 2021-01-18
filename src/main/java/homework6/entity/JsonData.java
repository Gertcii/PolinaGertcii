package homework6.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonData {

    @JsonProperty("data_1")
    private Data data1;
    @JsonProperty("data_2")
    private Data data2;
    @JsonProperty("data_3")
    private Data data3;
    @JsonProperty("data_4")
    private Data data4;
    @JsonProperty("data_5")
    private Data data5;

    public Data getData1() {
        return data1;
    }

    public Data getData2() {
        return data2;
    }

    public Data getData3() {
        return data3;
    }

    public Data getData4() {
        return data4;
    }

    public Data getData5() {
        return data5;
    }

    public void setData1(Data data1) {
        this.data1 = data1;
    }

    public void setData2(Data data2) {
        this.data2 = data2;
    }

    public void setData3(Data data3) {
        this.data3 = data3;
    }

    public void setData4(Data data4) {
        this.data4 = data4;
    }

    public void setData5(Data data5) {
        this.data5 = data5;
    }
}
