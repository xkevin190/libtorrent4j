/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class storage_moved_failed_alert extends torrent_alert {
  private transient long swigCPtr;

  protected storage_moved_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.storage_moved_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(storage_moved_failed_alert obj) {
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
        libtorrent_jni.delete_storage_moved_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.storage_moved_failed_alert_type(swigCPtr, this);
  }

  public alert_category_t category() {
    return new alert_category_t(libtorrent_jni.storage_moved_failed_alert_category(swigCPtr, this), true);
  }

  public String what() {
    return libtorrent_jni.storage_moved_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.storage_moved_failed_alert_message(swigCPtr, this);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.storage_moved_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public String file_path() {
    return libtorrent_jni.storage_moved_failed_alert_file_path(swigCPtr, this);
  }

  public void setOp(operation_t value) {
    libtorrent_jni.storage_moved_failed_alert_op_set(swigCPtr, this, value.swigValue());
  }

  public operation_t getOp() {
    return operation_t.swigToEnum(libtorrent_jni.storage_moved_failed_alert_op_get(swigCPtr, this));
  }

  public final static alert_priority priority = alert_priority.swigToEnum(libtorrent_jni.storage_moved_failed_alert_priority_get());
  public final static int alert_type = libtorrent_jni.storage_moved_failed_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.storage_moved_failed_alert_static_category_get(), false);
}
