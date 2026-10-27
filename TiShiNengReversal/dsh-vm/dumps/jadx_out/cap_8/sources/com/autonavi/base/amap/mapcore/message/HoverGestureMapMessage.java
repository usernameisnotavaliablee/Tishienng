package com.autonavi.base.amap.mapcore.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HoverGestureMapMessage extends com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage> M_POOL = null;
    public float angleDelta;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.M_POOL = r0
            return
    }

    public HoverGestureMapMessage(int r1, float r2) {
            r0 = this;
            r0.<init>(r1)
            r0.angleDelta = r2
            return
    }

    public static void destory() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.M_POOL
            r0.destory()
            return
    }

    public static com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage obtain(int r1, float r2) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage) r0
            if (r0 != 0) goto L10
            com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r0 = new com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage
            r0.<init>(r1, r2)
            goto L13
        L10:
            r0.reset()
        L13:
            r0.setParams(r1, r2)
            return r0
    }

    private void setParams(int r1, float r2) {
            r0 = this;
            r0.setState(r1)
            r0.angleDelta = r2
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
            r1 = this;
            r0 = 3
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.M_POOL
            r0.release(r1)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState r4) {
            r3 = this;
            float r0 = r4.getCameraDegree()
            float r1 = r3.angleDelta
            float r0 = r0 + r1
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto Le
            r0 = 0
            goto L2f
        Le:
            r1 = 1117782016(0x42a00000, float:80.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L17
            r0 = 1117782016(0x42a00000, float:80.0)
            goto L2f
        L17:
            float r1 = r4.getCameraDegree()
            r2 = 1109393408(0x42200000, float:40.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2f
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2f
            float r1 = r4.getCameraDegree()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L2f
            r0 = 1109393408(0x42200000, float:40.0)
        L2f:
            r4.setCameraDegree(r0)
            r4.recalculate()
            return
    }
}
