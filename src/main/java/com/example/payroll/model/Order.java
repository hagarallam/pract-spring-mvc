package com.example.payroll.model;

import com.example.payroll.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private Status status;

    Order(){

    }

    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.description,this.status);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(!(obj instanceof Order))
            return false ;
        Order order = (Order) obj;
        return Objects.equals(this.id,order.id) &&
                Objects.equals(this.description,order.description)&&
                Objects.equals(this.status,order.status);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + this.id + ", description='" +
                this.description + '\'' + ", status=" + this.status + '}';
    }
}
