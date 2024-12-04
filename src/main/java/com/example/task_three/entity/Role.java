package com.example.task_three.entity;

public enum Role {
    ADMIN, USER;

    public String getRoleName() {
        return "ROLE_" + this.name();
    }
}
