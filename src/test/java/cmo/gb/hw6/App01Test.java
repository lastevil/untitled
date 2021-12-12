package cmo.gb.hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class App01Test {
    //пробовал сделать 2й метод параметризированным через @ParameterizedTest
    //   и @MethodSource, однако не удается в качестве параметров передать новый массив new int[]{...}.
    private App01 app01;
    @BeforeEach
    public void init(){
        app01=new App01();
    }

    @Test
    public void massTransformTest1(){
        Assertions.assertArrayEquals(new int[]{},app01.massTransform(new int[]{1, 2, 3, 4}));
    }
    @Test
    public void messTransformExceptionTest(){
        Assertions.assertThrows(RuntimeException.class,()->
        {
            app01.massTransform(new int[]{1,2,3});
        });
    }
    @Test
    public void massTransformTest2(){
        Assertions.assertArrayEquals(new int[]{3,1,6},
                app01.massTransform(new int[]{1, 2, 3, 4, 1, 2, 5, 7, 4, 3, 1, 6})
        );
    }
    @Test
    public void massTransformTest3(){
        Assertions.assertArrayEquals(new int[]{1, 2, 5, 7, 8, 3, 1, 6},
                app01.massTransform(new int[]{1, 2, 3, 4, 1, 2, 5, 7, 8, 3, 1, 6})
        );
    }

    @Test
    public void massCheckTest1() {
        Assertions.assertEquals(app01.massCheck(new int[]{1, 1, 4, 4, 1, 4, 4}),true);
    }

    @Test
    public void massCheckTest2() {
        Assertions.assertEquals(app01.massCheck(new int[]{1, 1, 1, 1, 1, 1, 1}),false);
    }

    @Test
    public void massCheckTest3() {
        Assertions.assertEquals(app01.massCheck(new int[]{4, 4, 4, 4}),false);
    }

    @Test
    public void massCheckTest4() {
        Assertions.assertEquals(app01.massCheck(new int[]{1, 2, 4, 3, 1, 4, 4}),false);
    }

}