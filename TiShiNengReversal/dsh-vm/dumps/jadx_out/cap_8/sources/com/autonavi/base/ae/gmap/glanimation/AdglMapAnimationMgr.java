package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglMapAnimationMgr {
    private java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> list;
    private com.amap.api.maps.AMap.CancelableCallback mCancelCallback;
    private com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr.MapAnimationListener mMapAnimationListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MapAnimationListener {
        void onMapAnimationFinish(com.amap.api.maps.AMap.CancelableCallback r1);
    }

    public AdglMapAnimationMgr() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.list = r0
            return
    }

    public void addAnimation(com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation r5, com.amap.api.maps.AMap.CancelableCallback r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r0 = r4.list
            monitor-enter(r0)
            boolean r1 = r5.isOver()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r1 = r4.list     // Catch: java.lang.Throwable -> L45
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L45
            if (r1 <= 0) goto L47
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r1 = r4.list     // Catch: java.lang.Throwable -> L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L45
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation r1 = (com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r5 instanceof com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            boolean r2 = r1 instanceof com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            r2 = r5
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup r2 = (com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup) r2     // Catch: java.lang.Throwable -> L45
            r3 = r1
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup r3 = (com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup) r3     // Catch: java.lang.Throwable -> L45
            boolean r2 = r2.typeEqueal(r3)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            r2 = r5
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup r2 = (com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup) r2     // Catch: java.lang.Throwable -> L45
            boolean r2 = r2.needMove     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L47
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r2 = r4.list     // Catch: java.lang.Throwable -> L45
            r2.remove(r1)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r5 = move-exception
            goto L50
        L47:
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r1 = r4.list     // Catch: java.lang.Throwable -> L45
            r1.add(r5)     // Catch: java.lang.Throwable -> L45
            r4.mCancelCallback = r6     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r5
    }

    public synchronized void clearAnimations() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r0 = r1.list     // Catch: java.lang.Throwable -> L8
            r0.clear()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void doAnimations(com.autonavi.base.ae.gmap.GLMapState r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r0 = r2.list     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2c
            if (r0 > 0) goto Lf
            monitor-exit(r2)
            return
        Lf:
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r0 = r2.list     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2c
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation r0 = (com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation) r0     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1c
            monitor-exit(r2)
            return
        L1c:
            boolean r1 = r0.isOver()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L35
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr$MapAnimationListener r3 = r2.mMapAnimationListener     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            com.amap.api.maps.AMap$CancelableCallback r1 = r2.mCancelCallback     // Catch: java.lang.Throwable -> L2c
            r3.onMapAnimationFinish(r1)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r3 = move-exception
            goto L3a
        L2e:
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r3 = r2.list     // Catch: java.lang.Throwable -> L2c
            r3.remove(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L35:
            r0.doAnimation(r3)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }

    public synchronized int getAnimationsCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation> r0 = r1.list     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public com.amap.api.maps.AMap.CancelableCallback getCancelCallback() {
            r1 = this;
            com.amap.api.maps.AMap$CancelableCallback r0 = r1.mCancelCallback
            return r0
    }

    public void setMapAnimationListener(com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr.MapAnimationListener r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mMapAnimationListener = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public void setMapCoreListener() {
            r0 = this;
            return
    }
}
