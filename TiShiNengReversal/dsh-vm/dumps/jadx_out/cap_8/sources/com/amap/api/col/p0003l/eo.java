package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class eo extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final android.os.Parcelable.Creator<com.amap.api.col.p0003l.eo> CREATOR = null;

    /* renamed from: b, reason: collision with root package name */
    private float f3259b;

    /* renamed from: c, reason: collision with root package name */
    private float f3260c;

    /* renamed from: d, reason: collision with root package name */
    private float f3261d;

    /* renamed from: e, reason: collision with root package name */
    private float f3262e;

    /* renamed from: f, reason: collision with root package name */
    private float f3263f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3264g;

    /* renamed from: h, reason: collision with root package name */
    private int f3265h;

    /* renamed from: i, reason: collision with root package name */
    private double f3266i;

    /* renamed from: j, reason: collision with root package name */
    private java.util.List<com.amap.api.col.p0003l.l3> f3267j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<com.amap.api.col.p0003l.eo> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static com.amap.api.col.p0003l.eo a(android.os.Parcel r1) {
                com.amap.api.col.3l.eo r0 = new com.amap.api.col.3l.eo
                r0.<init>(r1)
                return r0
        }

        private static com.amap.api.col.p0003l.eo[] b(int r0) {
                com.amap.api.col.3l.eo[] r0 = new com.amap.api.col.p0003l.eo[r0]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003l.eo createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.amap.api.col.3l.eo r1 = a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003l.eo[] newArray(int r1) {
                r0 = this;
                com.amap.api.col.3l.eo[] r1 = b(r1)
                return r1
        }
    }

    static {
            com.amap.api.col.3l.eo$a r0 = new com.amap.api.col.3l.eo$a
            r0.<init>()
            com.amap.api.col.p0003l.eo.CREATOR = r0
            return
    }

    public eo() {
            r2 = this;
            r2.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r2.f3259b = r0
            r0 = 1101004800(0x41a00000, float:20.0)
            r2.f3260c = r0
            r0 = 1
            r2.f3261d = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.f3262e = r0
            r0 = 1128792064(0x43480000, float:200.0)
            r2.f3263f = r0
            r0 = 1
            r2.f3264g = r0
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
            r2.f3265h = r0
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            r2.f3266i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f3267j = r0
            java.lang.String r0 = "ContourLineOptions"
            r2.type = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected eo(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r3.f3259b = r0
            r0 = 1101004800(0x41a00000, float:20.0)
            r3.f3260c = r0
            r0 = 1
            r3.f3261d = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.f3262e = r0
            r0 = 1128792064(0x43480000, float:200.0)
            r3.f3263f = r0
            r0 = 1
            r3.f3264g = r0
            r1 = -3355444(0xffffffffffcccccc, float:NaN)
            r3.f3265h = r1
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            r3.f3266i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f3267j = r1
            float r1 = r4.readFloat()
            r3.f3259b = r1
            float r1 = r4.readFloat()
            r3.f3260c = r1
            float r1 = r4.readFloat()
            r3.f3261d = r1
            float r1 = r4.readFloat()
            r3.f3262e = r1
            float r1 = r4.readFloat()
            r3.f3263f = r1
            boolean[] r0 = new boolean[r0]
            r4.readBooleanArray(r0)
            r1 = 0
            boolean r0 = r0[r1]
            r3.f3264g = r0
            int r0 = r4.readInt()
            r3.f3265h = r0
            double r0 = r4.readDouble()
            r3.f3266i = r0
            java.lang.Class<com.amap.api.col.3l.l3> r0 = com.amap.api.col.p0003l.l3.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r4 = r4.readArrayList(r0)
            r3.f3267j = r4
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            float r4 = r2.f3259b
            r3.writeFloat(r4)
            float r4 = r2.f3260c
            r3.writeFloat(r4)
            float r4 = r2.f3261d
            r3.writeFloat(r4)
            float r4 = r2.f3262e
            r3.writeFloat(r4)
            float r4 = r2.f3263f
            r3.writeFloat(r4)
            boolean r4 = r2.f3264g
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r4
            r3.writeBooleanArray(r0)
            int r4 = r2.f3265h
            r3.writeInt(r4)
            double r0 = r2.f3266i
            r3.writeDouble(r0)
            java.util.List<com.amap.api.col.3l.l3> r4 = r2.f3267j
            r3.writeList(r4)
            return
    }
}
