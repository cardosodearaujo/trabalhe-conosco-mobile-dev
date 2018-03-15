package br.com.everaldocardosodearaujo.picpay.Object;

/**
 * Created by E. Cardoso de Araújo on 15/03/2018.
 */

public class Transaction {
    private String card_number;
    private long ccv;
    private double value;
    private String expiry_date;
    private long destination_user_id;

    public Transaction(){
        this.card_number = "";
        this.ccv = 0;
        this.value = 0.00;
        this.expiry_date = "";
        this.destination_user_id = 0;
    }

    public Transaction(String card_number, long ccv, double value, String expiry_date,long destination_user_id){
        this.card_number = card_number;
        this.ccv = ccv;
        this.value = value;
        this.expiry_date = expiry_date;
        this.destination_user_id = destination_user_id;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public long getCcv() {
        return ccv;
    }

    public void setCcv(long ccv) {
        this.ccv = ccv;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public long getDestination_user_id() {
        return destination_user_id;
    }

    public void setDestination_user_id(long destination_user_id) {
        this.destination_user_id = destination_user_id;
    }
}
