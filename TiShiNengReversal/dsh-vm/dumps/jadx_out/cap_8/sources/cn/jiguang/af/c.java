package cn.jiguang.af;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f431b;

    /* renamed from: c, reason: collision with root package name */
    public int f432c;

    /* renamed from: d, reason: collision with root package name */
    public byte f433d;

    /* renamed from: e, reason: collision with root package name */
    public long f434e;

    /* renamed from: f, reason: collision with root package name */
    public int f435f;

    /* renamed from: g, reason: collision with root package name */
    public long f436g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f437h;

    public c(boolean r3, byte[] r4) {
            r2 = this;
            r2.<init>()
            r2.f437h = r3     // Catch: java.lang.Throwable -> L3e
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch: java.lang.Throwable -> L3e
            short r0 = r4.getShort()     // Catch: java.lang.Throwable -> L3e
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            r2.a = r0     // Catch: java.lang.Throwable -> L3e
            byte r0 = r4.get()     // Catch: java.lang.Throwable -> L3e
            r2.f431b = r0     // Catch: java.lang.Throwable -> L3e
            byte r0 = r4.get()     // Catch: java.lang.Throwable -> L3e
            r2.f432c = r0     // Catch: java.lang.Throwable -> L3e
            byte r0 = r4.get()     // Catch: java.lang.Throwable -> L3e
            r2.f433d = r0     // Catch: java.lang.Throwable -> L3e
            r4.get()     // Catch: java.lang.Throwable -> L3e
            r4.getInt()     // Catch: java.lang.Throwable -> L3e
            short r0 = r4.getShort()     // Catch: java.lang.Throwable -> L3e
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3e
            r2.f434e = r0     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L38
            int r3 = r4.getInt()     // Catch: java.lang.Throwable -> L3e
            r2.f435f = r3     // Catch: java.lang.Throwable -> L3e
        L38:
            long r3 = r4.getLong()     // Catch: java.lang.Throwable -> L3e
            r2.f436g = r3     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[JHead] - len:"
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", version:"
            r0.append(r1)
            int r1 = r3.f431b
            r0.append(r1)
            java.lang.String r1 = ", command:"
            r0.append(r1)
            int r1 = r3.f432c
            r0.append(r1)
            java.lang.String r1 = ", rid:"
            r0.append(r1)
            long r1 = r3.f434e
            r0.append(r1)
            boolean r1 = r3.f437h
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", sid:"
            r1.append(r2)
            int r2 = r3.f435f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L47
        L45:
            java.lang.String r1 = ""
        L47:
            r0.append(r1)
            java.lang.String r1 = ", juid:"
            r0.append(r1)
            long r1 = r3.f436g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
