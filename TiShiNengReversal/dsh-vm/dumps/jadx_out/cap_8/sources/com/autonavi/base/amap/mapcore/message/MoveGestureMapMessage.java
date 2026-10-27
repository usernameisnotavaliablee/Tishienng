package com.autonavi.base.amap.mapcore.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MoveGestureMapMessage extends com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage> M_POOL = null;
    static int newCount;
    public float touchDeltaX;
    public float touchDeltaY;
    public int touchX;
    public int touchY;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.M_POOL = r0
            return
    }

    public MoveGestureMapMessage(int r1, float r2, float r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.touchX = r1
            r0.touchY = r1
            r0.touchDeltaX = r2
            r0.touchDeltaY = r3
            int r1 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.newCount
            int r1 = r1 + 1
            com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.newCount = r1
            return
    }

    public static void destory() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.M_POOL
            r0.destory()
            return
    }

    public static synchronized com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage obtain(int r2, float r3, float r4, float r5, float r6) {
            java.lang.Class<com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.class
            monitor-enter(r0)
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage> r1 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.M_POOL     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.acquire()     // Catch: java.lang.Throwable -> L13
            com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r1 = (com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r1 = new com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r2 = move-exception
            goto L23
        L15:
            r1.reset()     // Catch: java.lang.Throwable -> L13
            r1.setParams(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
        L1b:
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L13
            r1.touchX = r2     // Catch: java.lang.Throwable -> L13
            int r2 = (int) r6     // Catch: java.lang.Throwable -> L13
            r1.touchY = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r1
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    private void setParams(int r1, float r2, float r3) {
            r0 = this;
            r0.setState(r1)
            r0.touchDeltaX = r2
            r0.touchDeltaY = r3
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.M_POOL
            r0.release(r1)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState r9) {
            r8 = this;
            float r0 = r8.touchDeltaX
            int r0 = (int) r0
            float r1 = r8.touchDeltaY
            int r1 = (int) r1
            int r2 = r8.touchX
            int r2 = r2 - r0
            int r0 = r8.touchY
            int r0 = r0 - r1
            com.autonavi.amap.mapcore.IPoint r1 = com.autonavi.amap.mapcore.IPoint.obtain()
            int r3 = r8.touchX
            int r4 = r8.touchY
            r8.win2geo(r9, r3, r4, r1)
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()
            r8.win2geo(r9, r2, r0, r3)
            com.autonavi.amap.mapcore.IPoint r0 = com.autonavi.amap.mapcore.IPoint.obtain()
            r9.getMapGeoCenter(r0)
            int r2 = r0.x
            int r4 = r3.x
            int r5 = r1.x
            int r4 = r4 - r5
            int r2 = r2 + r4
            double r4 = (double) r2
            int r2 = r0.y
            int r6 = r3.y
            int r7 = r1.y
            int r6 = r6 - r7
            int r2 = r2 + r6
            double r6 = (double) r2
            r9.setMapGeoCenter(r4, r6)
            r9.recalculate()
            r0.recycle()
            r1.recycle()
            r3.recycle()
            return
    }
}
