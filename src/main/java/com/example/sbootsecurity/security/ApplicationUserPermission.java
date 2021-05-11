package com.example.sbootsecurity.security;

import lombok.Getter;

@Getter
public enum ApplicationUserPermission {

    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;


    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}