// ���Ծ�Ψһ ID: 604028A173919B433F2315E853DFAF99, �����޸ı�������
/* ע��, ���ﲻҪд����. ���� */
/* ��������õ���������, �ǵ�Ҫ����, ������벻�� */

import java.util.*;

/**
 * �ش�ʽ: ֱ�ӱ�����߸��Ʊ�java�ļ�, Ȼ����ԭ������. ������������ meta-java-<����>.java
 * ѡ����ı�����ֵ���ַ���
 * ʵ������ԭ���ĺ������ﷵ����ȷ��, ע�ⲻҪ�Ķ������ṹ. ����һ��Java�ļ����
 * ����ֱ���ô����о�, û���˹���Ԥ. ��ʽ����, �﷨����, ��ʽ�Ķ��ᵼ���Ծ���Ч
 * <p>
 * ע: һ��java�ļ������ж����, ��ֻ����һ��public��. �������ʵ���п��Խ��ڲ���, ������. ����javac����ȷ���Լ��﷨����
 * ���´�public static���ε�ʵ���ⷽ��, ��Ҫ�ı����ǩ��
 * <p>
 * <p>
 * ���ﲻҪ����Ĭ�ϵ�����, Ҳ��Ҫ�������η���Ҫ��public. ��������Ϊ MetaJavaQuestionSheet
 * ���Ը��ļ���, �����Ϊ meta-java-<����>.java
 */
class MetaJavaQuestionSheet {

    /* qn0:
        ֻ������! ���øĶ�

        A. ��ѡ��

        B. Ҳѡ��, ѡ�Ҿ͵÷�

        C. ��ѡ��

        D. ѡ��, ѡ�Ҿ͵÷�
    */
    public static String qn0 = "BD";
    /* qn1:
        ������γ���n=10�������()
      1 public int calc(int n) {
      2     try {
      3         n+=1;
      4         if(n/0 > 0) {
      5             n+=1;
      6         } else {
      7             n-=10;
      8         }
      9         return n;
      10     } catch(Exception e) {
      11         n++;
      12     }
      13     n++;
      14     return n++;

        A. 14

        B. 0

        C. 13

        D. 12

        E. �׳��쳣
    */
    public static String qn1 = null;
    /* qn2:
        ���´������ʱ��һ�л����

        1 package com.metaapp.solution;
        2 public class Solution {
        3     int p1 = 0;
        4     int p2 = 0;
        5     public Solution(int arg){
        6         p1 = arg;
        7     }
        8     public static void main(String args[]){
        9         Solution s1,s2;
       10         int m,n;
       11         m=1;n=2;
       12         s1 = new Solution();
       13         s2 = new Solution(n);
       14     }
       15 }

        A. Line 9

        B. Line 12

        C. Line 2

        D. Line 6
    */
    public static String qn2 = "B";
    /* qn3:
        ��������ֱ���������Ľ��:
          public static void main(String[] args) {
              Thread t = new Thread() {
                  public void run() {
                      cnn();
                  }
              };
              t.run();
              System.out.print("FakeNews ");
          System.out.print("; ");
              t.start();
              System.out.print("FakeNews ");
          }
          static void cnn() {
              System.out.print("CNN ");
          }

        A. CNN FakeNews ; CNN FakeNews

        B. CNN FakeNews ; CNN FakeNews ��FakeNews CNN ���п���

        C. CNN FakeNews ��FakeNews CNN ���п��� ; CNN FakeNews ��FakeNews CNN ���п���

        D. CNN FakeNews ��FakeNews CNN ���п��� ; CNN FakeNews
    */
    public static String qn3 = "D";
    /* qn4:
        main()�������£�try�п��Բ����������͵��쳣������ڸ÷��������в�����һ��IOException��������������Ľ��:
          public static void main(String[] args) {
              System.out.print(method(0));
          }
          private static Integer method(Integer i){
              try{
                  if(i++ > 0)
                      throw new IOException();
                  return i++;
              }catch (IOException e){
                  i++;
                  return i++;
              }catch (Exception e){
                  i++;
                  return i++;
              }finally {
                  return i++;
              }
          }

        A. 2

        B. 4

        C. 3

        D. ���״� û�����
    */
    public static String qn4 = "A";
    /* qn5:
        ��֪һ����ȫ�������ĵ�6����3��Ҷ�ӽ�㣬�������������Ľ���������

        A. 121

        B. 45

        C. 122

        D. 34
    */
    public static String qn5 = "A";
    /* qn6:
        ����ջ����Ϊa��b��c��d��e��f����ջ�ͳ�ջ���Դ�����У��򲻿��ܳ��ֵĳ�ջ������()

        A. b��d��c��a��e��f

        B. b��c��e��a��f��d

        C. c��b��d��a��f��e

        D. d��c��b��a��e��f
    */
    public static String qn6 = "B";
    /* qn7:
        ��������ֱ���������Ľ��:
        String s = new String(new char[] {'û','��','��','��','��','��','j','a','v','a'});
        String si = "û�˱��Ҹ���java";
        System.out.println(s == si);
        System.out.println(s.intern() == "û�˱��Ҹ���java");
        System.out.println(s == si.intern());

        A. false true false

        B. true false true

        C. false true true

        D. true true true
    */
    public static String qn7 = "A";
    /* qn8:
        ����Ĵ�����java(jdk8)���ջ��������String����:
        String a = "û��";
        String b = "����";
        String c = "����";
        String d = "java";
        String s = a + b + c + d;

        A. 7

        B. 5

        C. 8

        D. 6
    */
    public static String qn8 = "B";
    /* qn9:
        ��������ֱ���������Ľ��:
          public static void main(String[] args) {
              Map<String, Object> map = new HashMap<>();
              String str = "û�˱��Ҹ���java";
              StrObject obj = new StrObject("û�˱��Ҹ���java");
              map.put("str", str);
              map.put("obj", obj);

              str = "���û�˱��Ҹ���java";
              System.out.printf(map.get("str").toString()+"; ");

              StrObject new_obj = (StrObject) map.get("obj");
              new_obj.setStr("���û�˱��Ҹ���java");
              System.out.printf(map.get("obj").toString()+"; ");
          }
          static class StrObject{
              String str;
              public StrObject(String str){
                  this.str = str;
              }
              public void setStr(String str){
                  this.str = str;
              }
              @Override
              public String toString() {
                  return str;
              }
          }

        A. û�˱��Ҹ���java; û�˱��Ҹ���java;

        B. ���û�˱��Ҹ���java; ���û�˱��Ҹ���java;

        C. ���û�˱��Ҹ���java; û�˱��Ҹ���java;

        D. û�˱��Ҹ���java; ���û�˱��Ҹ���java;
    */
    public static String qn9 = "D";
    /* qn10:
        method()�������£�method()�����������5����ͬ��update()��������ЩSQL�ᱻ�ع� (��ѡ):
        @Service
        public class TestService {
            @Resource
          TestService testService;

          public void method() {
            1. update1();
            ======================
            2. testService.update2();
            ======================
            3. testService.update3();
            ======================
            4. testService.update4();
            ======================
            5. testService.update5();
          }
          @Transactional
          public void update1() {
            //SQL_1
            throw new Exception();
          }
          @Transactional
          public void update2() {
            //SQL_2
            throw new Exception();
          }
          @Transactional
          private void update3() {
            //SQL_3
            throw new Exception();
          }
          @Transactional
          public void update4() {
            //SQL_4
            throw new Error();
          }
          @Transactional
          public void update5() {
            //SQL_5
            throw new IOException();
          }
        }

        A. SQL_5

        B. SQL_4

        C. SQL_3

        D. SQL_1

        E. SQL_2
    */
    public static String qn10 = "ABCE";
    /* qn11:
        "û�˱��Ҹ���java".toCharArray(), ��java(jdk8)�й�������ַ�����char[], ����˵����ȷ����:

        A. ����˵��������

        B. ����ַ������ڴ����ܹ�ռ�� 16 byte

        C. ����ַ������ڴ����ܹ�ռ�� 20 byte

        D. ����ַ������ڴ����ܹ�ռ�� 10 byte
    */
    public static String qn11 = "B";
    /* qn12:
        ���д������������������:
        private static volatile int s = 0;
        private static final ThreadPoolExecutor async = new ThreadPoolExecutor(
                0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>());
        public static void main(String[] args) throws InterruptedException {
            for (int i = 0; i < 10000; i++) {
                async.execute(()-> s++);
            }
            Thread.sleep(5000L);
            System.out.println(s);
        }

        A. 9999

        B. 10000

        C. 10001

        D. 9998
    */
    public static String qn12 = "C";
    /* qn13:
        public class Queue {
          private int size;
          private int[] data;
          private int front, rear;

          public Queue(int size) {
              this.size = size;
              data = new int[size];
              front = 0; rear = 0;
          }
      }
      int MaxSize=10;
      Quene q = new Queue(MaxSize);

      ����q��˵���������ж϶�������������()

        A. q.front + q.rear == MaxSize;

        B. q.front == q.rear;

        C. q.front == (q.rear+1) % MaxSize;

        D. q.front - q.rear == MaxSize;
    */
    public static String qn13 = "C";
    /* qn14:
        һ�ö�������������Ľڵ�˳����: 6 4 5 2 7 3 1 �����������: 6 4 2 5 1 3 7 ����ǰ��������Ϊ:

        A. 1 2 4 6 5 7 3

        B. 1 2 4 6 5 3 7

        C. 1 2 4 5 6 3 7

        D. 1 2 3 4 5 6 7
    */
    public static String qn14 = "B";
    /* qn15:
        ����������������Ľ��:
        public class A {

            class Inner {
                public String  v1 = "Fake News";
                public String v2 = "Go ahead";
            }

            private static String GetVal() {
                try {
                    return Inner.class.newInstance().v1;
                } catch (Exception e) {
                    try {
                        return Inner.class.getDeclaredConstructor(A.class).newInstance((A)null).v2;
                    } catch (Exception ee) {
                        ee.printStackTrace();
                        return "Fake News, Go ahead";
                    }
                }
            }
            public static void main(String[] args) {

                System.out.println(GetVal());
            }
        }

        A. Fake News

        B. Go ahead

        C. Fake News, Go ahead

        D. ���϶�����
    */
    public static String qn15 = "B";

    /*
     * ������ʵ����
     */

    /**
     * <b>ע��! ���ⲻҪ������ά����. Ҫ��ʱ�临�Ӷ��ϸ����n^2, ������Ϊ���÷� </b>
     * <p>
     * ����һ��n*n�Ķ�ά����������nums��ÿ��Ԫ�ر�֤������ÿ��Ԫ�ر�֤��������ĳ������x�Ƿ�����ڸö�ά�����У���Ҫ�����Ż�ʱ��Ϳռ临�Ӷȣ�
     *
     * @param int[][] nums
     * @param int     x Ŀ����
     * @return boolean
     */
    public static boolean searchMatrix(int[][] nums, int x) {
        // Todo your code goes here...
        if (nums == null || nums.length == 0) {
            return false;
        }
        int m = nums.length, n = nums[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (nums[row][col] > x) {
                col--;
            } else if (nums[row][col] < x) {
                row++;
            } else {
                return true;
            }
        }
        return false;

    }

    /**
     * ������һ��Map<String, Object>, �� key Ϊ String,
     * �� value Ϊ Map<String, Object> Object[] Number String �е�����һ��,
     * ��ȻҶ�ӽڵ��� value ����Ϊ Number �� String�Ľڵ�,
     * �� Map תΪ�����ַ���, ÿ���ַ����������һ��Ҷ�ӽڵ�,
     * ����:
     * {"a":{"b":["v",2,{"c":0}]},"d":[1,null,3]}
     * ��ת��Ϊ������Щ�ַ���
     * a.b[0] = v
     * a.b[1] = 2
     * a.b[2].c = 0
     * d[0] = 1
     * d[1] = null
     * d[2] = 3
     *
     * @param map ������ map
     * @return ���е��ַ���
     */
    public static Set<String> showMap(Map<String, Object> map) {
        //TODO your code goes here...
        return null;
    }

    /**
     * ����һ��������, ������Ƿ��Ǿ���ԳƵ�
     * ���������Ǿ���ԳƵ�
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     * <p>
     * ����������Ǿ���ԳƵ�
     * 1
     * / \
     * 2   2
     * \   \
     * 3   3
     * <p>
     * TreeNode��Ķ���:
     *
     * @param TreeNode һ�Ŷ�����
     * @return boolean �Ƿ��ǶԳƵ�
     */

    // ���¸���TreeNode��, �����޸�
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isTreeSymmetric(TreeNode root) {
        //TODO your code goes here...
        if (root == null)
            return true;
        boolean flag = helper(root.left, root.right);
        //return false;
        return flag;
    }

    static boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return root1.val == root2.val && helper(root1.left, root2.right) &&
                helper(root1.right, root2.left);
    }
}
