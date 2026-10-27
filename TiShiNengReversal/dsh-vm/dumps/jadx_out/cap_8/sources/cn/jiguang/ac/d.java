package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static java.security.SecureRandom f336d;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f337b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f338c;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            cn.jiguang.ac.d.f336d = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.f337b = r0
            r1.d()
            return
    }

    public d(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.f337b = r0
            r1.d()
            r1.a(r2)
            return
    }

    d(cn.jiguang.ac.b r4) {
            r3 = this;
            int r0 = r4.g()
            r3.<init>(r0)
            int r0 = r4.g()
            r3.f337b = r0
            r0 = 0
        Le:
            int[] r1 = r3.f338c
            int r2 = r1.length
            if (r0 >= r2) goto L1c
            int r2 = r4.g()
            r1[r0] = r2
            int r0 = r0 + 1
            goto Le
        L1c:
            return
    }

    private void d() {
            r1 = this;
            r0 = 4
            int[] r0 = new int[r0]
            r1.f338c = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.f337b = r0
            r0 = -1
            r1.a = r0
            return
    }

    public int a() {
            r2 = this;
            int r0 = r2.a
            if (r0 < 0) goto L5
            return r0
        L5:
            monitor-enter(r2)
            int r0 = r2.a     // Catch: java.lang.Throwable -> L16
            if (r0 >= 0) goto L18
            java.security.SecureRandom r0 = cn.jiguang.ac.d.f336d     // Catch: java.lang.Throwable -> L16
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0.nextInt(r1)     // Catch: java.lang.Throwable -> L16
            r2.a = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1c
        L18:
            int r0 = r2.a     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public void a(int r4) {
            r3 = this;
            if (r4 < 0) goto La
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r0) goto La
            r3.a = r4
            return
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DNS message ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is out of range"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    void a(cn.jiguang.ac.c r4) {
            r3 = this;
            int r0 = r3.a()
            r4.c(r0)
            int r0 = r3.f337b
            r4.c(r0)
            r0 = 0
        Ld:
            int[] r1 = r3.f338c
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            r1 = r1[r0]
            r4.c(r1)
            int r0 = r0 + 1
            goto Ld
        L1a:
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.f337b
            r0 = r0 & 15
            return r0
    }

    void b(int r4) {
            r3 = this;
            int[] r0 = r3.f338c
            r1 = r0[r4]
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r2) goto Le
            int r1 = r1 + 1
            r0[r4] = r1
            return
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "DNS section count cannot be incremented"
            r4.<init>(r0)
            throw r4
    }

    int c() {
            r1 = this;
            int r0 = r1.f337b
            return r0
    }

    public int c(int r2) {
            r1 = this;
            int[] r0 = r1.f338c
            r2 = r0[r2]
            return r2
    }

    public java.lang.Object clone() {
            r5 = this;
            cn.jiguang.ac.d r0 = new cn.jiguang.ac.d
            r0.<init>()
            int r1 = r5.a
            r0.a = r1
            int r1 = r5.f337b
            r0.f337b = r1
            int[] r1 = r5.f338c
            int[] r2 = r0.f338c
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            return r0
    }

    java.lang.String d(int r4) {
            r3 = this;
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r0 = ";; ->>HEADER<<- "
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ", id: "
            r0.append(r1)
            int r1 = r3.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            java.lang.String r0 = "; "
            r4.append(r0)
            r0 = 0
        L2d:
            r1 = 4
            if (r0 >= r1) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = cn.jiguang.ac.n.a(r0)
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            int r2 = r3.c(r0)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            int r0 = r0 + 1
            goto L2d
        L57:
            java.lang.String r4 = r4.toString()
            return r4
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.b()
            java.lang.String r0 = r1.d(r0)
            return r0
    }
}
