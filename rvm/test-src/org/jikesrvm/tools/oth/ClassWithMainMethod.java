/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package org.jikesrvm.tools.oth;

/**
 * The solo purpose of this class is to be loaded via a test case for the
 * OptTestHarness.
 */
public abstract class ClassWithMainMethod {

  public static void main(String[] args) {
    for (String s : args) {
      System.out.println(s);
    }
  }

}
