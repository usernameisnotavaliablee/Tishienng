package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s6 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.huawei.hms.scankit.p.s6> CREATOR = null;
    private final java.lang.String a;
    private final byte[] b;
    private final int c;
    private com.huawei.hms.scankit.p.u6[] d;
    private com.huawei.hms.scankit.aiscan.common.BarcodeFormat e;
    private final long f;
    private boolean g;
    private final boolean h;
    private final float i;
    private int j;
    private java.util.List<android.graphics.Rect> k;
    private boolean l;
    private int m;
    private java.util.List<android.graphics.Rect> n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.os.Parcelable.Creator<com.huawei.hms.scankit.p.s6> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.huawei.hms.scankit.p.s6 a(android.os.Parcel r2) {
                r1 = this;
                com.huawei.hms.scankit.p.s6 r0 = new com.huawei.hms.scankit.p.s6
                r0.<init>(r2)
                return r0
        }

        public com.huawei.hms.scankit.p.s6[] a(int r1) {
                r0 = this;
                com.huawei.hms.scankit.p.s6[] r1 = new com.huawei.hms.scankit.p.s6[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.scankit.p.s6 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.huawei.hms.scankit.p.s6 r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.scankit.p.s6[] newArray(int r1) {
                r0 = this;
                com.huawei.hms.scankit.p.s6[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            com.huawei.hms.scankit.p.s6$a r0 = new com.huawei.hms.scankit.p.s6$a
            r0.<init>()
            com.huawei.hms.scankit.p.s6.CREATOR = r0
            return
    }

    public s6(float r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.g = r0
            r3.q = r0
            r3.r = r0
            r3.i = r4
            r4 = 0
            r3.a = r4
            byte[] r4 = new byte[r0]
            r3.b = r4
            r3.c = r0
            com.huawei.hms.scankit.p.u6[] r4 = new com.huawei.hms.scankit.p.u6[r0]
            r3.d = r4
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.o
            r3.e = r4
            r1 = 0
            r3.f = r1
            r3.h = r0
            r3.j = r0
            r3.l = r0
            r3.m = r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.k = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.n = r4
            return
    }

    public s6(float r4, boolean r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.g = r0
            r3.q = r0
            r3.r = r0
            r3.i = r4
            r4 = 0
            r3.a = r4
            byte[] r4 = new byte[r0]
            r3.b = r4
            r3.c = r0
            com.huawei.hms.scankit.p.u6[] r4 = new com.huawei.hms.scankit.p.u6[r0]
            r3.d = r4
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.o
            r3.e = r4
            r1 = 0
            r3.f = r1
            r3.h = r0
            r3.j = r0
            r3.l = r0
            r3.m = r0
            r3.r = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.k = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.n = r4
            return
    }

    protected s6(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.g = r0
            r4.q = r0
            r4.r = r0
            java.lang.String r1 = r5.readString()
            r4.a = r1
            byte[] r1 = r5.createByteArray()
            r4.b = r1
            int r1 = r5.readInt()
            r4.c = r1
            android.os.Parcelable$Creator<com.huawei.hms.scankit.p.u6> r1 = com.huawei.hms.scankit.p.u6.CREATOR
            java.lang.Object[] r1 = r5.createTypedArray(r1)
            com.huawei.hms.scankit.p.u6[] r1 = (com.huawei.hms.scankit.p.u6[]) r1
            r4.d = r1
            java.lang.Class<com.huawei.hms.scankit.p.s6> r1 = com.huawei.hms.scankit.p.s6.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r5.readParcelable(r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = (com.huawei.hms.scankit.aiscan.common.BarcodeFormat) r2
            r4.e = r2
            long r2 = r5.readLong()
            r4.f = r2
            int r2 = r5.readInt()
            r3 = 1
            if (r2 != r3) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            r4.g = r2
            int r2 = r5.readInt()
            if (r2 != r3) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r4.h = r2
            float r2 = r5.readFloat()
            r4.i = r2
            int r2 = r5.readInt()
            r4.j = r2
            java.util.List<android.graphics.Rect> r2 = r4.k
            if (r2 != 0) goto L68
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.k = r2
        L68:
            java.util.List<android.graphics.Rect> r2 = r4.k
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r5.readList(r2, r1)
            long r1 = r5.readLong()
            r4.o = r1
            long r1 = r5.readLong()
            r4.p = r1
            int r5 = r5.readInt()
            if (r5 != r3) goto L84
            r0 = 1
        L84:
            r4.q = r0
            return
    }

    public s6(java.lang.String r2, byte[] r3, int r4, com.huawei.hms.scankit.p.u6[] r5, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r6, long r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r1.q = r0
            r1.r = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.i = r2
            r1.h = r0
            return
    }

    public s6(java.lang.String r8, byte[] r9, com.huawei.hms.scankit.p.u6[] r10, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r11) {
            r7 = this;
            long r5 = java.lang.System.currentTimeMillis()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public s6(java.lang.String r10, byte[] r11, com.huawei.hms.scankit.p.u6[] r12, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r13, long r14) {
            r9 = this;
            if (r11 != 0) goto Lb
            r0 = 0
            r4 = 0
        L4:
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            goto L10
        Lb:
            int r0 = r11.length
            int r0 = r0 * 8
            r4 = r0
            goto L4
        L10:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    public void a() {
            r1 = this;
            r0 = 0
            com.huawei.hms.scankit.p.u6[] r0 = new com.huawei.hms.scankit.p.u6[r0]
            r1.d = r0
            return
    }

    public void a(float r3) {
            r2 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La
            r2.j = r1
            return
        La:
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L14
            r3 = 2
            r2.j = r3
            return
        L14:
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1e
            r3 = 1
            r2.j = r3
            return
        L1e:
            r0 = 1124859904(0x430c0000, float:140.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L27
            r2.j = r1
            return
        L27:
            r0 = 1128136704(0x433e0000, float:190.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L31
            r3 = -1
            r2.j = r3
            return
        L31:
            r0 = 1132396544(0x437f0000, float:255.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L3a
            r3 = -2
            r2.j = r3
        L3a:
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.i2 r6) {
            r5 = this;
            float r0 = r6.d()
            int r0 = (int) r0
            float r1 = r6.e()
            int r1 = (int) r1
            float r2 = r6.f()
            int r2 = (int) r2
            float r6 = r6.c()
            int r6 = (int) r6
            java.util.List<android.graphics.Rect> r3 = r5.k
            android.graphics.Rect r4 = new android.graphics.Rect
            int r2 = r2 + r0
            int r6 = r6 + r1
            r4.<init>(r0, r1, r2, r6)
            r3.add(r4)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.u6[] r5) {
            r4 = this;
            com.huawei.hms.scankit.p.u6[] r0 = r4.d
            if (r0 != 0) goto L7
            r4.d = r5
            return
        L7:
            if (r5 == 0) goto L1d
            int r1 = r5.length
            if (r1 <= 0) goto L1d
            int r1 = r0.length
            int r2 = r5.length
            int r1 = r1 + r2
            com.huawei.hms.scankit.p.u6[] r1 = new com.huawei.hms.scankit.p.u6[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r3, r1, r0, r2)
            r4.d = r1
        L1d:
            return
    }

    public long b() {
            r2 = this;
            long r0 = r2.p
            return r0
    }

    public void b(float r2) {
            r1 = this;
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto La
            r2 = 2
            r1.m = r2
            return
        La:
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L14
            r2 = 1
            r1.m = r2
            return
        L14:
            r0 = 1124859904(0x430c0000, float:140.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1e
            r2 = 0
            r1.m = r2
            return
        L1e:
            r0 = 1128136704(0x433e0000, float:190.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L28
            r2 = -1
            r1.m = r2
            return
        L28:
            r0 = 1132396544(0x437f0000, float:255.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L31
            r2 = -2
            r1.m = r2
        L31:
            return
    }

    public void b(long r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void b(com.huawei.hms.scankit.p.i2 r6) {
            r5 = this;
            float r0 = r6.d()
            int r0 = (int) r0
            float r1 = r6.e()
            int r1 = (int) r1
            float r2 = r6.f()
            int r2 = (int) r2
            float r6 = r6.c()
            int r6 = (int) r6
            java.util.List<android.graphics.Rect> r3 = r5.n
            android.graphics.Rect r4 = new android.graphics.Rect
            int r2 = r2 + r0
            int r6 = r6 + r1
            r4.<init>(r0, r1, r2, r6)
            r3.add(r4)
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void b(com.huawei.hms.scankit.p.u6[] r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public com.huawei.hms.scankit.aiscan.common.BarcodeFormat c() {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r1.e
            return r0
    }

    public void c(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public java.util.List<android.graphics.Rect> d() {
            r1 = this;
            java.util.List<android.graphics.Rect> r0 = r1.k
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long e() {
            r2 = this;
            long r0 = r2.o
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public java.util.List<android.graphics.Rect> g() {
            r1 = this;
            java.util.List<android.graphics.Rect> r0 = r1.n
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public byte[] i() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    public com.huawei.hms.scankit.p.u6[] j() {
            r1 = this;
            com.huawei.hms.scankit.p.u6[] r0 = r1.d
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public float l() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public boolean m() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    public boolean n() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public boolean o() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    public boolean p() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r0 = r2.a
            r3.writeString(r0)
            byte[] r0 = r2.b
            r3.writeByteArray(r0)
            int r0 = r2.c
            r3.writeInt(r0)
            com.huawei.hms.scankit.p.u6[] r0 = r2.d
            r3.writeTypedArray(r0, r4)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r2.e
            r3.writeParcelable(r0, r4)
            long r0 = r2.f
            r3.writeLong(r0)
            boolean r4 = r2.g
            r3.writeInt(r4)
            boolean r4 = r2.h
            r3.writeInt(r4)
            float r4 = r2.i
            r3.writeFloat(r4)
            int r4 = r2.j
            r3.writeInt(r4)
            java.util.List<android.graphics.Rect> r4 = r2.k
            r3.writeList(r4)
            long r0 = r2.o
            r3.writeLong(r0)
            long r0 = r2.p
            r3.writeLong(r0)
            boolean r4 = r2.q
            r3.writeInt(r4)
            return
    }
}
