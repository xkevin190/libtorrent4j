/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class ip_route_vector extends java.util.AbstractList<ip_route> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ip_route_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ip_route_vector obj) {
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
        libtorrent_jni.delete_ip_route_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ip_route_vector(ip_route[] initialElements) {
    this();
    reserve(initialElements.length);

    for (ip_route element : initialElements) {
      add(element);
    }
  }

  public ip_route_vector(Iterable<ip_route> initialElements) {
    this();
    for (ip_route element : initialElements) {
      add(element);
    }
  }

  public ip_route get(int index) {
    return doGet(index);
  }

  public ip_route set(int index, ip_route e) {
    return doSet(index, e);
  }

  public boolean add(ip_route e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, ip_route e) {
    modCount++;
    doAdd(index, e);
  }

  public ip_route remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public ip_route_vector() {
    this(libtorrent_jni.new_ip_route_vector__SWIG_0(), true);
  }

  public ip_route_vector(ip_route_vector other) {
    this(libtorrent_jni.new_ip_route_vector__SWIG_1(ip_route_vector.getCPtr(other), other), true);
  }

  public long capacity() {
    return libtorrent_jni.ip_route_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.ip_route_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.ip_route_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.ip_route_vector_clear(swigCPtr, this);
  }

  public ip_route_vector(int count, ip_route value) {
    this(libtorrent_jni.new_ip_route_vector__SWIG_2(count, ip_route.getCPtr(value), value), true);
  }

  private int doSize() {
    return libtorrent_jni.ip_route_vector_doSize(swigCPtr, this);
  }

  private void doAdd(ip_route x) {
    libtorrent_jni.ip_route_vector_doAdd__SWIG_0(swigCPtr, this, ip_route.getCPtr(x), x);
  }

  private void doAdd(int index, ip_route x) {
    libtorrent_jni.ip_route_vector_doAdd__SWIG_1(swigCPtr, this, index, ip_route.getCPtr(x), x);
  }

  private ip_route doRemove(int index) {
    return new ip_route(libtorrent_jni.ip_route_vector_doRemove(swigCPtr, this, index), true);
  }

  private ip_route doGet(int index) {
    return new ip_route(libtorrent_jni.ip_route_vector_doGet(swigCPtr, this, index), false);
  }

  private ip_route doSet(int index, ip_route val) {
    return new ip_route(libtorrent_jni.ip_route_vector_doSet(swigCPtr, this, index, ip_route.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    libtorrent_jni.ip_route_vector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
