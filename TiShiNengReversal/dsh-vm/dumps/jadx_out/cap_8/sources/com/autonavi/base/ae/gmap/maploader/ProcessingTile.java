package com.autonavi.base.ae.gmap.maploader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ProcessingTile {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.ae.gmap.maploader.ProcessingTile> M_POOL = null;
    public long mCreateTime;
    public java.lang.String mKeyName;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 30
            r0.<init>(r1)
            com.autonavi.base.ae.gmap.maploader.ProcessingTile.M_POOL = r0
            return
    }

    public ProcessingTile(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCreateTime = r0
            r2.setParams(r3)
            return
    }

    public static com.autonavi.base.ae.gmap.maploader.ProcessingTile obtain(java.lang.String r1) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.ae.gmap.maploader.ProcessingTile> r0 = com.autonavi.base.ae.gmap.maploader.ProcessingTile.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.ae.gmap.maploader.ProcessingTile r0 = (com.autonavi.base.ae.gmap.maploader.ProcessingTile) r0
            if (r0 == 0) goto Le
            r0.setParams(r1)
            return r0
        Le:
            com.autonavi.base.ae.gmap.maploader.ProcessingTile r0 = new com.autonavi.base.ae.gmap.maploader.ProcessingTile
            r0.<init>(r1)
            return r0
    }

    private void setParams(java.lang.String r5) {
            r4 = this;
            r4.mKeyName = r5
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4.mCreateTime = r0
            return
    }

    public void recycle() {
            r2 = this;
            r0 = 0
            r2.mKeyName = r0
            r0 = 0
            r2.mCreateTime = r0
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.ae.gmap.maploader.ProcessingTile> r0 = com.autonavi.base.ae.gmap.maploader.ProcessingTile.M_POOL
            r0.release(r2)
            return
    }
}
