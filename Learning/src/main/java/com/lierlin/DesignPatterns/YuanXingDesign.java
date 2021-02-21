package com.lierlin.DesignPatterns;

public class YuanXingDesign {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("����", "ͬѧ����2016ѧ���һѧ���б������㣬����Ϊ����ѧ����", "�ܿ�ʦ��ѧԺ");
        obj1.display();
        citation obj2 = (citation) obj1.clone();
        obj2.setName("����");
        obj2.display();
    }
}
//��״��
class citation implements Cloneable {
    String name;
    String info;
    String college;
    citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("��״�����ɹ���");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return (this.name);
    }
    void display() {
        System.out.println(name + info + college);
    }
    public Object clone() throws CloneNotSupportedException {
        System.out.println("��״�����ɹ���");
        return (citation) super.clone();
    }
}
