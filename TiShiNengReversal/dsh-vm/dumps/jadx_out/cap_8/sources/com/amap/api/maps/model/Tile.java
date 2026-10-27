package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Tile implements android.os.Parcelable {
    public static final com.amap.api.maps.model.b CREATOR = null;
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.amap.api.maps.model.Tile> M_POOL = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public final byte[] data;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public final int height;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private final boolean isBitmap;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private final int mVersionCode;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public final int width;

    static {
            com.amap.api.maps.model.b r0 = new com.amap.api.maps.model.b
            r0.<init>()
            com.amap.api.maps.model.Tile.CREATOR = r0
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 18
            r0.<init>(r1)
            com.amap.api.maps.model.Tile.M_POOL = r0
            return
    }

    Tile(int r1, int r2, int r3, byte[] r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.mVersionCode = r1
            r0.width = r2
            r0.height = r3
            r0.data = r4
            if (r4 == 0) goto L1c
            int r1 = r4.length     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r4, r2, r1)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r1)     // Catch: java.lang.Throwable -> L1c
            r0.bitmapDescriptor = r2     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0.isBitmap = r5
            return
    }

    public Tile(int r7, int r8, byte[] r9) {
            r6 = this;
            r1 = 1
            r5 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Tile(int r7, int r8, byte[] r9, boolean r10) {
            r6 = this;
            r1 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static com.amap.api.maps.model.Tile obtain(int r1, int r2, byte[] r3) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.amap.api.maps.model.Tile> r0 = com.amap.api.maps.model.Tile.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.amap.api.maps.model.Tile r0 = (com.amap.api.maps.model.Tile) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.amap.api.maps.model.Tile r0 = new com.amap.api.maps.model.Tile
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.amap.api.maps.model.Tile> r0 = com.amap.api.maps.model.Tile.M_POOL
            r0.release(r1)
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.mVersionCode
            r1.writeInt(r2)
            int r2 = r0.width
            r1.writeInt(r2)
            int r2 = r0.height
            r1.writeInt(r2)
            byte[] r2 = r0.data
            r1.writeByteArray(r2)
            boolean r2 = r0.isBitmap
            r1.writeInt(r2)
            return
    }
}
