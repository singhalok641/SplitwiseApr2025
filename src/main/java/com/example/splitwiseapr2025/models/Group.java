package com.example.splitwiseapr2025.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "spgroups")
public class Group extends BaseModel {
    private String name;

    @ManyToOne
    private User admin;

    @ManyToMany
    private List<User> members;

    @OneToMany
    @JoinColumn(name = "spgroup_id")
    private List<Expense> expenses;

}

/*
  1             1
Group --- admin/created => M:1
  M              1
 */
