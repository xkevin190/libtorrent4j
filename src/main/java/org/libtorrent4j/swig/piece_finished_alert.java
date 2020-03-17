/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class piece_finished_alert extends torrent_alert {
  private transient long swigCPtr;

  protected piece_finished_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.piece_finished_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(piece_finished_alert obj) {
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
        libtorrent_jni.delete_piece_finished_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.piece_finished_alert_type(swigCPtr, this);
  }

  public alert_category_t category() {
    return new alert_category_t(libtorrent_jni.piece_finished_alert_category(swigCPtr, this), true);
  }

  public String what() {
    return libtorrent_jni.piece_finished_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.piece_finished_alert_message(swigCPtr, this);
  }

  public int getPiece_index() {
    return libtorrent_jni.piece_finished_alert_piece_index_get(swigCPtr, this);
  }

  public final static alert_priority priority = alert_priority.swigToEnum(libtorrent_jni.piece_finished_alert_priority_get());
  public final static int alert_type = libtorrent_jni.piece_finished_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.piece_finished_alert_static_category_get(), false);
}
