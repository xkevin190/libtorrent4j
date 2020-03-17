/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class int_string_map extends java.util.AbstractMap<Integer, String> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected int_string_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(int_string_map obj) {
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
        libtorrent_jni.delete_int_string_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public int size() {
    return sizeImpl();
  }

  public boolean containsKey(java.lang.Object key) {
    if (!(key instanceof Integer)) {
      return false;
    }

    return containsImpl((Integer)key);
  }

  public String get(java.lang.Object key) {
    if (!(key instanceof Integer)) {
      return null;
    }

    Iterator itr = find((Integer) key);
    if (itr.isNot(end())) {
      return itr.getValue();
    }

    return null;
  }

  public String put(Integer key, String value) {
    Iterator itr = find((Integer) key);
    if (itr.isNot(end())) {
      String oldValue = itr.getValue();
      itr.setValue(value);
      return oldValue;
    } else {
      putUnchecked(key, value);
      return null;
    }
  }

  public String remove(java.lang.Object key) {
    if (!(key instanceof Integer)) {
      return null;
    }

    Iterator itr = find((Integer) key);
    if (itr.isNot(end())) {
      String oldValue = itr.getValue();
      removeUnchecked(itr);
      return oldValue;
    } else {
      return null;
    }
  }

  public java.util.Set<Entry<Integer, String>> entrySet() {
    java.util.Set<Entry<Integer, String>> setToReturn =
        new java.util.HashSet<Entry<Integer, String>>();

    Iterator itr = begin();
    final Iterator end = end();
    while (itr.isNot(end)) {
      setToReturn.add(new Entry<Integer, String>() {
        private Iterator iterator;

        private Entry<Integer, String> init(Iterator iterator) {
          this.iterator = iterator;
          return this;
        }

        public Integer getKey() {
          return iterator.getKey();
        }

        public String getValue() {
          return iterator.getValue();
        }

        public String setValue(String newValue) {
          String oldValue = iterator.getValue();
          iterator.setValue(newValue);
          return oldValue;
        }
      }.init(itr));
      itr = itr.getNextUnchecked();
    }

    return setToReturn;
  }

  public int_string_map() {
    this(libtorrent_jni.new_int_string_map__SWIG_0(), true);
  }

  public int_string_map(int_string_map other) {
    this(libtorrent_jni.new_int_string_map__SWIG_1(int_string_map.getCPtr(other), other), true);
  }

  static protected class Iterator {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Iterator(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Iterator obj) {
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
          libtorrent_jni.delete_int_string_map_Iterator(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    private int_string_map.Iterator getNextUnchecked() {
      return new int_string_map.Iterator(libtorrent_jni.int_string_map_Iterator_getNextUnchecked(swigCPtr, this), true);
    }
  
    private boolean isNot(int_string_map.Iterator other) {
      return libtorrent_jni.int_string_map_Iterator_isNot(swigCPtr, this, int_string_map.Iterator.getCPtr(other), other);
    }
  
    private int getKey() {
      return libtorrent_jni.int_string_map_Iterator_getKey(swigCPtr, this);
    }
  
    private String getValue() {
      return libtorrent_jni.int_string_map_Iterator_getValue(swigCPtr, this);
    }
  
    private void setValue(String newValue) {
      libtorrent_jni.int_string_map_Iterator_setValue(swigCPtr, this, newValue);
    }
  
  }

  public boolean isEmpty() {
    return libtorrent_jni.int_string_map_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.int_string_map_clear(swigCPtr, this);
  }

  private int_string_map.Iterator find(int key) {
    return new int_string_map.Iterator(libtorrent_jni.int_string_map_find(swigCPtr, this, key), true);
  }

  private int_string_map.Iterator begin() {
    return new int_string_map.Iterator(libtorrent_jni.int_string_map_begin(swigCPtr, this), true);
  }

  private int_string_map.Iterator end() {
    return new int_string_map.Iterator(libtorrent_jni.int_string_map_end(swigCPtr, this), true);
  }

  private int sizeImpl() {
    return libtorrent_jni.int_string_map_sizeImpl(swigCPtr, this);
  }

  private boolean containsImpl(int key) {
    return libtorrent_jni.int_string_map_containsImpl(swigCPtr, this, key);
  }

  private void putUnchecked(int key, String value) {
    libtorrent_jni.int_string_map_putUnchecked(swigCPtr, this, key, value);
  }

  private void removeUnchecked(int_string_map.Iterator itr) {
    libtorrent_jni.int_string_map_removeUnchecked(swigCPtr, this, int_string_map.Iterator.getCPtr(itr), itr);
  }

}
