package com;

public class HelloT {
    private String name;
    public HelloT(String name) {
        System.out.println("HelloT创建成功"+ name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("HelloT,"+ name );
    }
}
