/*
Sealed classes concept is used to define which class have the permission to extends the particular class
 */

package com.javafeature.java15;

sealed class A permits B,C {

}

final class B extends A {

}

final class C extends A {

}

sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

public class TestSealedClass {


}
