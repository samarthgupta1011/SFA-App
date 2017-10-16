package com.samarthgupta.sfa_app.POJO;

/**
 * Created by samarthgupta on 28/07/17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobTicket {

    @SerializedName("wt")
    @Expose
    private String wt;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("deliveryDate")
    @Expose
    private String deliveryDate;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("Machine")
    @Expose
    private Machine machine;
    @SerializedName("Client")
    @Expose
    private Client client;
    @SerializedName("Job")
    @Expose
    private Job job;
    @SerializedName("Paper")
    @Expose
    private Paper paper;
    @SerializedName("Plate")
    @Expose
    private Plate plate;
    @SerializedName("Processes")
    @Expose
    private Processes processes;

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = date;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public Processes getProcesses() {
        return processes;
    }

    public void setProcesses(Processes processes) {
        this.processes = processes;
    }
}