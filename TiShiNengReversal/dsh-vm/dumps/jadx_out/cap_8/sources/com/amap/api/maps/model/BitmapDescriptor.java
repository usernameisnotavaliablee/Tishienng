package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BitmapDescriptor implements android.os.Parcelable, java.lang.Cloneable {
    public static final com.amap.api.maps.model.BitmapDescriptorCreator CREATOR = null;
    int a;

    /* renamed from: b, reason: collision with root package name */
    int f4996b;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected java.lang.Object mBitmap;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String mId;

    static {
            com.amap.api.maps.model.BitmapDescriptorCreator r0 = new com.amap.api.maps.model.BitmapDescriptorCreator
            r0.<init>()
            com.amap.api.maps.model.BitmapDescriptor.CREATOR = r0
            return
    }

    private BitmapDescriptor(android.graphics.Bitmap r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.f4996b = r3
            r0.mBitmap = r1
            r0.mId = r4
            return
    }

    BitmapDescriptor(android.graphics.Bitmap r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f4996b = r0
            if (r3 == 0) goto L32
            int r0 = r3.getWidth()     // Catch: java.lang.Throwable -> L26
            r2.a = r0     // Catch: java.lang.Throwable -> L26
            int r0 = r3.getHeight()     // Catch: java.lang.Throwable -> L26
            r2.f4996b = r0     // Catch: java.lang.Throwable -> L26
            android.graphics.Bitmap$Config r0 = r3.getConfig()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 != 0) goto L28
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L26
            android.graphics.Bitmap r3 = r3.copy(r0, r1)     // Catch: java.lang.Throwable -> L26
            r2.mBitmap = r3     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r3 = move-exception
            goto L35
        L28:
            android.graphics.Bitmap$Config r0 = r3.getConfig()     // Catch: java.lang.Throwable -> L26
            android.graphics.Bitmap r3 = r3.copy(r0, r1)     // Catch: java.lang.Throwable -> L26
            r2.mBitmap = r3     // Catch: java.lang.Throwable -> L26
        L32:
            r2.mId = r4     // Catch: java.lang.Throwable -> L26
            return
        L35:
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    public final com.amap.api.maps.model.BitmapDescriptor clone() {
            r5 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = new com.amap.api.maps.model.BitmapDescriptor     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r5.mBitmap     // Catch: java.lang.Throwable -> L1c
            r2 = r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap$Config r1 = r1.getConfig()     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            android.graphics.Bitmap r1 = r2.copy(r1, r3)     // Catch: java.lang.Throwable -> L1c
            int r2 = r5.a     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.f4996b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r5.mId     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            r0 = 0
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m7clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.mBitmap
            r1 = 0
            if (r0 == 0) goto L4f
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto Le
            goto L4f
        Le:
            if (r4 != 0) goto L11
            return r1
        L11:
            if (r3 != r4) goto L15
            r4 = 1
            return r4
        L15:
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r0 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.Class r2 = r4.getClass()
            if (r0 == r2) goto L1e
            return r1
        L1e:
            com.amap.api.maps.model.BitmapDescriptor r4 = (com.amap.api.maps.model.BitmapDescriptor) r4
            java.lang.Object r0 = r4.mBitmap
            if (r0 == 0) goto L4f
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L2d
            goto L4f
        L2d:
            int r0 = r3.a
            int r2 = r4.getWidth()
            if (r0 != r2) goto L4f
            int r0 = r3.f4996b
            int r2 = r4.getHeight()
            if (r0 == r2) goto L3e
            goto L4f
        L3e:
            java.lang.Object r0 = r3.mBitmap     // Catch: java.lang.Throwable -> L4b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.mBitmap     // Catch: java.lang.Throwable -> L4b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r0.sameAs(r4)     // Catch: java.lang.Throwable -> L4b
            return r4
        L4b:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
        L4f:
            return r1
    }

    public final android.graphics.Bitmap getBitmap() {
            r1 = this;
            java.lang.Object r0 = r1.mBitmap
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
    }

    public final int getHeight() {
            r1 = this;
            int r0 = r1.f4996b
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public final int getWidth() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public final void recycle() {
            r1 = this;
            java.lang.Object r0 = r1.mBitmap     // Catch: java.lang.Throwable -> L8
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L8
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.mId
            r2.writeString(r0)
            java.lang.Object r0 = r1.mBitmap
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.writeParcelable(r0, r3)
            int r3 = r1.a
            r2.writeInt(r3)
            int r3 = r1.f4996b
            r2.writeInt(r3)
            return
    }
}
