package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m9 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f3685b;

    /* renamed from: c, reason: collision with root package name */
    public int f3686c;

    /* renamed from: d, reason: collision with root package name */
    public int f3687d;

    /* renamed from: e, reason: collision with root package name */
    public long f3688e;

    /* renamed from: f, reason: collision with root package name */
    public long f3689f;

    /* renamed from: g, reason: collision with root package name */
    public short f3690g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3691h;

    public m9(boolean r3) {
            r2 = this;
            r2.<init>()
            r0 = -113(0xffffffffffffff8f, float:NaN)
            r2.f3686c = r0
            r0 = 0
            r2.f3689f = r0
            r2.f3691h = r3
            return
    }

    public static long a(java.lang.String r13) {
            r0 = 0
            if (r13 == 0) goto L60
            int r2 = r13.length()
            if (r2 != 0) goto Lb
            goto L60
        Lb:
            int r2 = r13.length()
            int r2 = r2 + (-1)
            r3 = 0
            r4 = r0
        L13:
            if (r2 < 0) goto L5a
            char r6 = r13.charAt(r2)
            long r6 = (long) r6
            r8 = 48
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L2c
            r10 = 57
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 > 0) goto L2c
        L26:
            long r6 = r6 - r8
            long r6 = r6 << r3
            long r4 = r4 + r6
            int r3 = r3 + 4
            goto L57
        L2c:
            r8 = 97
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L3b
            r8 = 102(0x66, double:5.04E-322)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L3b
            r8 = 87
            goto L26
        L3b:
            r8 = 65
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L4a
            r8 = 70
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L4a
            r8 = 55
            goto L26
        L4a:
            r8 = 58
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L57
            r8 = 124(0x7c, double:6.13E-322)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L57
            return r0
        L57:
            int r2 = r2 + (-1)
            goto L13
        L5a:
            r13 = 48
            if (r3 == r13) goto L5f
            return r0
        L5f:
            return r4
        L60:
            return r0
    }

    public static java.lang.String c(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L1b
            r0 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            goto L1b
        L10:
            byte[] r3 = com.amap.api.col.p0003l.v9.b(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = com.amap.api.col.p0003l.v9.a(r3, r4)
            return r3
        L1b:
            r3 = 0
            return r3
    }

    private com.amap.api.col.p0003l.m9 d() {
            r3 = this;
            com.amap.api.col.3l.m9 r0 = new com.amap.api.col.3l.m9
            boolean r1 = r3.f3691h
            r0.<init>(r1)
            long r1 = r3.a
            r0.a = r1
            java.lang.String r1 = r3.f3685b
            r0.f3685b = r1
            int r1 = r3.f3686c
            r0.f3686c = r1
            int r1 = r3.f3687d
            r0.f3687d = r1
            long r1 = r3.f3688e
            r0.f3688e = r1
            long r1 = r3.f3689f
            r0.f3689f = r1
            short r1 = r3.f3690g
            r0.f3690g = r1
            boolean r1 = r3.f3691h
            r0.f3691h = r1
            return r0
    }

    public final java.lang.String b() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r3.f3691h
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.col.3l.m9 r0 = r1.d()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AmapWifi{mac="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", ssid='"
            r0.append(r1)
            java.lang.String r1 = r3.f3685b
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", rssi="
            r0.append(r1)
            int r1 = r3.f3686c
            r0.append(r1)
            java.lang.String r1 = ", frequency="
            r0.append(r1)
            int r1 = r3.f3687d
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.f3688e
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateUtcMills="
            r0.append(r1)
            long r1 = r3.f3689f
            r0.append(r1)
            java.lang.String r1 = ", freshness="
            r0.append(r1)
            short r1 = r3.f3690g
            r0.append(r1)
            java.lang.String r1 = ", connected="
            r0.append(r1)
            boolean r1 = r3.f3691h
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
