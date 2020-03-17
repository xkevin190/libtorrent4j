/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class char_array_64 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected char_array_64(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(char_array_64 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_char_array_64(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public char_array_64() {
    this(libtorrent_jni.new_char_array_64__SWIG_0(), true);
  }

  public char_array_64(char_array_64 other) {
    this(libtorrent_jni.new_char_array_64__SWIG_1(char_array_64.getCPtr(other), other), true);
  }

  public long size() {
    return libtorrent_jni.char_array_64_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return libtorrent_jni.char_array_64_isEmpty(swigCPtr, this);
  }

  public void fill(char u) {
    libtorrent_jni.char_array_64_fill(swigCPtr, this, u);
  }

  public char get(int i) {
    return libtorrent_jni.char_array_64_get(swigCPtr, this, i);
  }

  public void set(int i, char val) {
    libtorrent_jni.char_array_64_set(swigCPtr, this, i, val);
  }

}
