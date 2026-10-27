package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ko implements java.io.Serializable {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f3646b;

    /* renamed from: c, reason: collision with root package name */
    public int f3647c;

    /* renamed from: d, reason: collision with root package name */
    public int f3648d;

    /* renamed from: e, reason: collision with root package name */
    public long f3649e;

    /* renamed from: f, reason: collision with root package name */
    public long f3650f;

    /* renamed from: g, reason: collision with root package name */
    public int f3651g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3652h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3653i;

    public ko() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.a = r0
            r2.f3646b = r0
            r0 = 99
            r2.f3647c = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.f3648d = r0
            r0 = 0
            r2.f3649e = r0
            r2.f3650f = r0
            r0 = 0
            r2.f3651g = r0
            r0 = 1
            r2.f3653i = r0
            return
    }

    public ko(boolean r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.a = r0
            r2.f3646b = r0
            r0 = 99
            r2.f3647c = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.f3648d = r0
            r0 = 0
            r2.f3649e = r0
            r2.f3650f = r0
            r0 = 0
            r2.f3651g = r0
            r2.f3652h = r3
            r2.f3653i = r4
            return
    }

    private static int a(java.lang.String r0) {
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            com.amap.api.col.p0003l.p9.a(r0)
            r0 = 0
            return r0
    }

    public abstract com.amap.api.col.p0003l.ko a();

    public final void a(com.amap.api.col.p0003l.ko r3) {
            r2 = this;
            java.lang.String r0 = r3.a
            r2.a = r0
            java.lang.String r0 = r3.f3646b
            r2.f3646b = r0
            int r0 = r3.f3647c
            r2.f3647c = r0
            int r0 = r3.f3648d
            r2.f3648d = r0
            long r0 = r3.f3649e
            r2.f3649e = r0
            long r0 = r3.f3650f
            r2.f3650f = r0
            int r0 = r3.f3651g
            r2.f3651g = r0
            boolean r0 = r3.f3652h
            r2.f3652h = r0
            boolean r3 = r3.f3653i
            r2.f3653i = r3
            return
    }

    public final int b() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = a(r0)
            return r0
    }

    public final int c() {
            r1 = this;
            java.lang.String r0 = r1.f3646b
            int r0 = a(r0)
            return r0
    }

    public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.col.3l.ko r0 = r1.a()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AmapCell{mcc="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", mnc="
            r0.append(r1)
            java.lang.String r1 = r3.f3646b
            r0.append(r1)
            java.lang.String r1 = ", signalStrength="
            r0.append(r1)
            int r1 = r3.f3647c
            r0.append(r1)
            java.lang.String r1 = ", asulevel="
            r0.append(r1)
            int r1 = r3.f3648d
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateSystemMills="
            r0.append(r1)
            long r1 = r3.f3649e
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateUtcMills="
            r0.append(r1)
            long r1 = r3.f3650f
            r0.append(r1)
            java.lang.String r1 = ", age="
            r0.append(r1)
            int r1 = r3.f3651g
            r0.append(r1)
            java.lang.String r1 = ", main="
            r0.append(r1)
            boolean r1 = r3.f3652h
            r0.append(r1)
            java.lang.String r1 = ", newapi="
            r0.append(r1)
            boolean r1 = r3.f3653i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
