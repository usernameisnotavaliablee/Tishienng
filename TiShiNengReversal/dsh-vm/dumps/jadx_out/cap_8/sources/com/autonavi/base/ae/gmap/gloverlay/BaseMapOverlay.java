package com.autonavi.base.ae.gmap.gloverlay;

import com.autonavi.base.ae.gmap.gloverlay.GLOverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BaseMapOverlay<T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay, E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected android.content.Context mContext;
    protected int mEngineID;
    protected T mGLOverlay;
    protected java.util.Vector<E> mItemList;
    protected int mLastFocusedIndex;
    protected com.autonavi.base.amap.api.mapcore.IAMapDelegate mMapView;

    public BaseMapOverlay(int r2, android.content.Context r3, com.autonavi.amap.mapcore.interfaces.IAMap r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mItemList = r0
            r1.mEngineID = r2
            r1.mContext = r3
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r4     // Catch: java.lang.Throwable -> Le
            r1.mMapView = r4     // Catch: java.lang.Throwable -> Le
        Le:
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r1.mItemList = r2
            r1.iniGLOverlay()
            return
    }

    public abstract void addItem(E r1);

    public boolean clear() {
            r1 = this;
            java.util.Vector<E> r0 = r1.mItemList     // Catch: java.lang.Exception -> L11
            r0.clear()     // Catch: java.lang.Exception -> L11
            r1.clearFocus()     // Catch: java.lang.Exception -> L11
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto Lf
            r0.removeAll()     // Catch: java.lang.Exception -> L11
        Lf:
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public void clearFocus() {
            r1 = this;
            r0 = -1
            r1.mLastFocusedIndex = r0
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            r0.clearFocus()
            return
    }

    public T getGLOverlay() {
            r1 = this;
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            return r0
    }

    public final E getItem(int r4) {
            r3 = this;
            r0 = 0
            java.util.Vector<E> r1 = r3.mItemList     // Catch: java.lang.IndexOutOfBoundsException -> L1f
            monitor-enter(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1f
            if (r4 < 0) goto L1b
            java.util.Vector<E> r2 = r3.mItemList     // Catch: java.lang.Throwable -> L19
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L19
            int r2 = r2 + (-1)
            if (r4 <= r2) goto L11
            goto L1b
        L11:
            java.util.Vector<E> r2 = r3.mItemList     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            r4 = move-exception
            goto L1d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r0
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.IndexOutOfBoundsException -> L1f
        L1f:
            return r0
    }

    public java.util.List<E> getItems() {
            r1 = this;
            java.util.Vector<E> r0 = r1.mItemList
            return r0
    }

    public int getSize() {
            r1 = this;
            java.util.Vector<E> r0 = r1.mItemList
            int r0 = r0.size()
            return r0
    }

    protected abstract void iniGLOverlay();

    public boolean isClickable() {
            r1 = this;
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            if (r0 == 0) goto L9
            boolean r0 = r0.isClickable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            if (r0 == 0) goto L9
            boolean r0 = r0.isVisible()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void releaseInstance() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.getGLOverlay()
            if (r0 == 0) goto L1f
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.mMapView
            if (r0 == 0) goto L15
            boolean r0 = r0.isMaploaded()
            if (r0 == 0) goto L15
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.mMapView
            r0.removeEngineGLOverlay(r1)
        L15:
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.getGLOverlay()
            r0.releaseInstance()
            r0 = 0
            r1.mGLOverlay = r0
        L1f:
            return
    }

    public boolean removeAll() {
            r1 = this;
            boolean r0 = r1.clear()
            return r0
    }

    public void removeItem(int r2) {
            r1 = this;
            if (r2 < 0) goto L23
            java.util.Vector<E> r0 = r1.mItemList     // Catch: java.lang.IndexOutOfBoundsException -> L23
            int r0 = r0.size()     // Catch: java.lang.IndexOutOfBoundsException -> L23
            int r0 = r0 + (-1)
            if (r2 <= r0) goto Ld
            goto L23
        Ld:
            int r0 = r1.mLastFocusedIndex     // Catch: java.lang.IndexOutOfBoundsException -> L23
            if (r2 != r0) goto L17
            r0 = -1
            r1.mLastFocusedIndex = r0     // Catch: java.lang.IndexOutOfBoundsException -> L23
            r1.clearFocus()     // Catch: java.lang.IndexOutOfBoundsException -> L23
        L17:
            java.util.Vector<E> r0 = r1.mItemList     // Catch: java.lang.IndexOutOfBoundsException -> L23
            r0.remove(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L23
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay     // Catch: java.lang.IndexOutOfBoundsException -> L23
            if (r0 == 0) goto L23
            r0.removeItem(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L23
        L23:
            return
    }

    public void removeItem(E r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L14
        L3:
            java.util.Vector<E> r0 = r2.mItemList     // Catch: java.lang.IndexOutOfBoundsException -> L14
            monitor-enter(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L14
            java.util.Vector<E> r1 = r2.mItemList     // Catch: java.lang.Throwable -> L11
            int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> L11
            r2.removeItem(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.IndexOutOfBoundsException -> L14
        L14:
            return
    }

    public abstract void resumeMarker(android.graphics.Bitmap r1);

    public void setClickable(boolean r2) {
            r1 = this;
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            if (r0 == 0) goto L7
            r0.setClickable(r2)
        L7:
            return
    }

    public abstract void setVisible(boolean r1);
}
