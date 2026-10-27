package com.autonavi.aps.amapapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.autonavi.aps.amapapi.a> CREATOR = null;
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f5659b;

    /* renamed from: c, reason: collision with root package name */
    private long f5660c;

    /* renamed from: d, reason: collision with root package name */
    private long f5661d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5662e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5663f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5664g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5665h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5666i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5667j;


    static {
            com.autonavi.aps.amapapi.a$1 r0 = new com.autonavi.aps.amapapi.a$1
            r0.<init>()
            com.autonavi.aps.amapapi.a.CREATOR = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f5659b = r0
            r2.f5660c = r0
            r2.f5661d = r0
            java.lang.String r0 = "first"
            r2.f5664g = r0
            java.lang.String r0 = ""
            r2.f5665h = r0
            r2.f5666i = r0
            r0 = 0
            r2.f5667j = r0
            return
    }

    public final long a() {
            r9 = this;
            long r0 = r9.f5661d
            long r2 = r9.f5660c
            long r4 = r0 - r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto Ld
            return r6
        Ld:
            long r0 = r0 - r2
            return r0
    }

    public final void a(long r1) {
            r0 = this;
            r0.f5660c = r1
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f5666i = r1
            return
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f5666i
            return r0
    }

    public final void b(long r1) {
            r0 = this;
            r0.f5661d = r1
            return
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.f5667j = r1
            return
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f5667j
            return r0
    }

    public final void c(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void c(java.lang.String r1) {
            r0 = this;
            r0.f5662e = r1
            return
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f5662e
            return r0
    }

    public final void d(long r1) {
            r0 = this;
            r0.f5659b = r1
            return
    }

    public final void d(java.lang.String r1) {
            r0 = this;
            r0.f5663f = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f5663f
            return r0
    }

    public final void e(java.lang.String r1) {
            r0 = this;
            r0.f5664g = r1
            return
    }

    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f5664g
            return r0
    }

    public final void f(java.lang.String r1) {
            r0 = this;
            r0.f5665h = r1
            return
    }

    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f5665h
            return r0
    }

    public final long h() {
            r5 = this;
            long r0 = r5.f5659b
            long r2 = r5.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lb
            r0 = 0
            return r0
        Lb:
            long r0 = r0 - r2
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.f5662e     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.f5663f     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.f5664g     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.f5665h     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.f5667j     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
            long r0 = r2.a     // Catch: java.lang.Throwable -> L32
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L32
            long r0 = r2.f5659b     // Catch: java.lang.Throwable -> L32
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L32
            long r0 = r2.f5660c     // Catch: java.lang.Throwable -> L32
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L32
            long r0 = r2.f5661d     // Catch: java.lang.Throwable -> L32
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.f5666i     // Catch: java.lang.Throwable -> L32
            r3.writeString(r4)     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }
}
