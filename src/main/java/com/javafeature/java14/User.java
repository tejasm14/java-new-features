/*
As we can see, we are making use of a new keyword, record, here.
This simple declaration will automatically add a constructor, getters, equals, hashCode and toString methods for us.
 */

package com.javafeature.java14;

public record User(int id, String password) {

}
