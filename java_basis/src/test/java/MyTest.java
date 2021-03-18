import org.junit.Test;

public class MyTest {



    @Test
    public void test1(){
        System.out.println(tryCatchTest());
    }

    public int tryCatchTest(){
        try {
            return 1;
        }catch (Exception e){

            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("finally");


        }
    }


    @Test
    public void test(){
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        //声明为 final 的变量会被 JVM 优化，因此第三句在编译时就会优化为 b6 = 10，不会出现问题。
        b6 = b4 + b5;
        // byte -> int 低转高 自动
        // int -> byte 需要强制
        b3 = (byte) (b1 + b2);

        /*
        * 所有的byte,short,char型的值将被提升为int型
          如果有一个操作数是long型，计算结果是long型
          如果有一个操作数是float型，计算结果是float型
          如果有一个操作数是double型，计算结果是double型
                  * */

//        float f1 = 0.000001f;
//        System.out.println(Math.abs(f1));
//        assert Math.abs(f1) < 0.00001f;
//
//        float f2 = 7 / 0.0f;
//        System.out.println(f2);
//        assert f2 == 0;


        /*
        * 如果两个操作数无法转换，则不进行转换，返回 Object 对象
          如果两个操作数是正常的类型，那么按照正常情况进行类型转换，比如int => long => float => double
          如果两个操作数都是字面量数字，那么返回范围较大的类型
        * */
        int i = 40;
        String s1 = String.valueOf(i < 50 ? 233 : 666);
        String s2 = String.valueOf(i < 50 ? 233 : 666.0);
        System.out.println(s1);
        System.out.println(s2);
        assert  s1.equals(s2);


    }
}
