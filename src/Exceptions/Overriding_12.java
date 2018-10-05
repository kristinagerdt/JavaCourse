package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Overriding_12 {

//    При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
//    Но он должен быть «не сильнее» списка предка:
//    public class Parent {
//        // предок может бросить IOException и InterruptedException
//        public void f() throws IOException, InterruptedException {}
//    }
//    class Child extends Parent {
//        // а потомок сужает область и бросает только потомка IOException
//        @Override
//        public void f() throws FileNotFoundException {}
//    }


//    Однако тут мы попытались «расширить тип» бросаемых исключений
//    public class Parent {
//        public void f() throws IOException, InterruptedException {}
//    }
//
//    class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {}
//    }


//    Почему можно сужать тип, но не расширять?
//    Рассмотрим следующую ситуацию:
//    public class Parent {
//    // предок пугает Exception
//        public void f() throws Exception {}
//    }

//    // тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
//    public class Child extends Parent {
//    // потомок расширил Exception до Throwable
//        public void f() throws Throwable {}
//    }

//    public static class Demo {
//        public static void test(Parent ref) {
//    // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//            try {
//                ref.f();
//            } catch(Exception e) {}
//        }
//    }

//    public class App {
//        public  void main(String[] args) {
//    // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
//            Demo.test(new Child());
//        }
//    }

//  Посмотрите на этот пример — если бы потомок мог расширять тип бросаемого исключения предка,
//  то те места, которые «ждут» предка, а получают экземпляр потомка с расщиренным исключением, могли бы неконтролируемо
//  выбрасывать проверяемые исключения

}
