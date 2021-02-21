package com.lierlin.DesignPatterns;

public class ZhuangShiZheDesign {

    //-------------------
   static abstract class BreakFast{
        public String description="Î´Öª";

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
            description="ÍÁË¾";
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
            return super.getDescription()+"ÆðË¾";
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
            return super.getDescription()+"»ðÍÈ";
        }

        @Override
        public double cost() {
            return super.cost()+10;
        }
    }
    //------------------------

    public static void main(String[] args) {
        BreakFast breakFast1 = new Toast();
        System.out.println("Ôç²ÍÃèÊö->"+breakFast1.getDescription()+"Ôç²Í¼Û¸ñ"+breakFast1.cost());
        //=========================
        CondimentDecorator condimentDecorator = new Cheese(breakFast1);
        System.out.println("Ôç²ÍÃèÊö->"+condimentDecorator.getDescription()+"Ôç²Í¼Û¸ñ"+condimentDecorator.cost());
        CondimentDecorator condimentDecorator1 =new Ham(condimentDecorator);
        System.out.println("Ôç²ÍÃèÊö->"+condimentDecorator1.getDescription()+"Ôç²Í¼Û¸ñ"+condimentDecorator1.cost());

    }
}
