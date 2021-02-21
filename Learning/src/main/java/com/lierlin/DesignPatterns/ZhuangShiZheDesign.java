package com.lierlin.DesignPatterns;

public class ZhuangShiZheDesign {

    //-------------------
   static abstract class BreakFast{
        public String description="δ֪";

        public String getDescription(){
            return description;
        }
        public abstract double cost();
    }
    //-------------------
   static abstract class CondimentDecorator extends  BreakFast{
        BreakFast myfood;
        public CondimentDecorator(BreakFast myfood){
            this.myfood=myfood;
        }

        @Override
        public String getDescription() {
            return myfood.description;
        }

        @Override
        public double cost() {
            return myfood.cost();
        }
    }
    //--------------------

    public static class Toast extends BreakFast{

        public Toast(){
            description="��˾";
        }

        @Override
        public double cost() {
            return 10;
        }
    }
    //--------------
    public static class Cheese extends CondimentDecorator{

        public Cheese(BreakFast myfood) {
            super(myfood);
        }

        @Override
        public String getDescription() {
            return super.getDescription()+"��˾";
        }

        @Override
        public double cost() {
            return super.cost()+5;
        }
    }
    //--------------------
    public static class Ham extends CondimentDecorator{

        public Ham(BreakFast myfood) {
            super(myfood);
        }

        @Override
        public String getDescription() {
            return super.getDescription()+"����";
        }

        @Override
        public double cost() {
            return super.cost()+10;
        }
    }
    //------------------------

    public static void main(String[] args) {
        BreakFast breakFast1 = new Toast();
        System.out.println("�������->"+breakFast1.getDescription()+"��ͼ۸�"+breakFast1.cost());
        //=========================
        CondimentDecorator condimentDecorator = new Cheese(breakFast1);
        System.out.println("�������->"+condimentDecorator.getDescription()+"��ͼ۸�"+condimentDecorator.cost());
        CondimentDecorator condimentDecorator1 =new Ham(condimentDecorator);
        System.out.println("�������->"+condimentDecorator1.getDescription()+"��ͼ۸�"+condimentDecorator1.cost());

    }
}
