package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class i implements java.io.Serializable, java.lang.Cloneable, java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    private static final java.text.DecimalFormat f361e = null;
    protected cn.jiguang.ac.g a;

    /* renamed from: b, reason: collision with root package name */
    protected int f362b;

    /* renamed from: c, reason: collision with root package name */
    protected int f363c;

    /* renamed from: d, reason: collision with root package name */
    protected long f364d;

    static {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            r0.<init>()
            cn.jiguang.ac.i.f361e = r0
            r1 = 3
            r0.setMinimumIntegerDigits(r1)
            return
    }

    protected i() {
            r0 = this;
            r0.<init>()
            return
    }

    static cn.jiguang.ac.i a(cn.jiguang.ac.b r7, int r8) {
            cn.jiguang.ac.g r0 = new cn.jiguang.ac.g
            r0.<init>(r7)
            int r1 = r7.g()
            int r2 = r7.g()
            if (r8 != 0) goto L14
            cn.jiguang.ac.i r7 = a(r0, r1, r2)
            return r7
        L14:
            long r3 = r7.h()
            int r5 = r7.g()
            r6 = r7
            cn.jiguang.ac.i r7 = a(r0, r1, r2, r3, r5, r6)
            return r7
    }

    public static cn.jiguang.ac.i a(cn.jiguang.ac.g r2, int r3, int r4) {
            r0 = 0
            cn.jiguang.ac.i r2 = a(r2, r3, r4, r0)
            return r2
    }

    public static cn.jiguang.ac.i a(cn.jiguang.ac.g r7, int r8, int r9, long r10) {
            boolean r0 = r7.a()
            if (r0 == 0) goto L10
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            cn.jiguang.ac.i r7 = a(r1, r2, r3, r4, r6)
            return r7
        L10:
            r1 = r7
            cn.jiguang.ac.j r7 = new cn.jiguang.ac.j
            r7.<init>(r1)
            throw r7
    }

    private static cn.jiguang.ac.i a(cn.jiguang.ac.g r7, int r8, int r9, long r10, int r12, cn.jiguang.ac.b r13) {
            if (r13 == 0) goto L9
            r0 = 1
            r6 = 1
        L4:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto Lc
        L9:
            r0 = 0
            r6 = 0
            goto L4
        Lc:
            cn.jiguang.ac.i r7 = a(r1, r2, r3, r4, r6)
            if (r13 == 0) goto L38
            int r8 = r13.b()
            if (r8 < r12) goto L30
            r13.a(r12)
            r7.a(r13)
            int r8 = r13.b()
            if (r8 > 0) goto L28
            r13.c()
            return r7
        L28:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "invalid record length"
            r7.<init>(r8)
            throw r7
        L30:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "truncated record"
            r7.<init>(r8)
            throw r7
        L38:
            return r7
    }

    private static final cn.jiguang.ac.i a(cn.jiguang.ac.g r0, int r1, int r2, long r3, boolean r5) {
            cn.jiguang.ac.m r5 = new cn.jiguang.ac.m
            r5.<init>()
            r5.a = r0
            r5.f362b = r1
            r5.f363c = r2
            r5.f364d = r3
            return r5
    }

    private void a(cn.jiguang.ac.c r3, boolean r4) {
            r2 = this;
            cn.jiguang.ac.g r0 = r2.a
            r0.a(r3)
            int r0 = r2.f362b
            r3.c(r0)
            int r0 = r2.f363c
            r3.c(r0)
            if (r4 == 0) goto L17
            r0 = 0
        L13:
            r3.a(r0)
            goto L1a
        L17:
            long r0 = r2.f364d
            goto L13
        L1a:
            int r4 = r3.a()
            r0 = 0
            r3.c(r0)
            r0 = 0
            r1 = 1
            r2.a(r3, r0, r1)
            int r0 = r3.a()
            int r0 = r0 - r4
            int r0 = r0 + (-2)
            r3.a(r0, r4)
            return
    }

    private byte[] a(boolean r2) {
            r1 = this;
            cn.jiguang.ac.c r0 = new cn.jiguang.ac.c
            r0.<init>()
            r1.a(r0, r2)
            byte[] r2 = r0.b()
            return r2
    }

    void a(long r1) {
            r0 = this;
            r0.f364d = r1
            return
    }

    abstract void a(cn.jiguang.ac.b r1);

    void a(cn.jiguang.ac.c r1, int r2, cn.jiguang.ac.a r3) {
            r0 = this;
            cn.jiguang.ac.g r2 = r0.a
            r2.a(r1, r3)
            int r2 = r0.f362b
            r1.c(r2)
            int r2 = r0.f363c
            r1.c(r2)
            return
    }

    abstract void a(cn.jiguang.ac.c r1, cn.jiguang.ac.a r2, boolean r3);

    public boolean a(cn.jiguang.ac.i r3) {
            r2 = this;
            int r0 = r2.f()
            int r1 = r3.f()
            if (r0 != r1) goto L1c
            int r0 = r2.f363c
            int r1 = r3.f363c
            if (r0 != r1) goto L1c
            cn.jiguang.ac.g r0 = r2.a
            cn.jiguang.ac.g r3 = r3.a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public byte[] a() {
            r3 = this;
            cn.jiguang.ac.c r0 = new cn.jiguang.ac.c
            r0.<init>()
            r1 = 0
            r2 = 1
            r3.a(r0, r1, r2)
            byte[] r0 = r0.b()
            return r0
    }

    abstract java.lang.String b();

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b()
            return r0
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r5) {
            r4 = this;
            cn.jiguang.ac.i r5 = (cn.jiguang.ac.i) r5
            r0 = 0
            if (r4 != r5) goto L6
            return r0
        L6:
            cn.jiguang.ac.g r1 = r4.a
            cn.jiguang.ac.g r2 = r5.a
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L11
            return r1
        L11:
            int r1 = r4.f363c
            int r2 = r5.f363c
            int r1 = r1 - r2
            if (r1 == 0) goto L19
            return r1
        L19:
            int r1 = r4.f362b
            int r2 = r5.f362b
            int r1 = r1 - r2
            if (r1 == 0) goto L21
            return r1
        L21:
            byte[] r1 = r4.a()
            byte[] r5 = r5.a()
        L29:
            int r2 = r1.length
            if (r0 >= r2) goto L3e
            int r2 = r5.length
            if (r0 >= r2) goto L3e
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r5[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 - r3
            if (r2 == 0) goto L3b
            return r2
        L3b:
            int r0 = r0 + 1
            goto L29
        L3e:
            int r0 = r1.length
            int r5 = r5.length
            int r0 = r0 - r5
            return r0
    }

    public cn.jiguang.ac.g d() {
            r1 = this;
            cn.jiguang.ac.g r0 = r1.a
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.f362b
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2e
            boolean r1 = r4 instanceof cn.jiguang.ac.i
            if (r1 != 0) goto L8
            goto L2e
        L8:
            cn.jiguang.ac.i r4 = (cn.jiguang.ac.i) r4
            int r1 = r3.f362b
            int r2 = r4.f362b
            if (r1 != r2) goto L2e
            int r1 = r3.f363c
            int r2 = r4.f363c
            if (r1 != r2) goto L2e
            cn.jiguang.ac.g r1 = r3.a
            cn.jiguang.ac.g r2 = r4.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            goto L2e
        L21:
            byte[] r0 = r3.a()
            byte[] r4 = r4.a()
            boolean r4 = java.util.Arrays.equals(r0, r4)
            return r4
        L2e:
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.f362b
            return r0
    }

    public int g() {
            r1 = this;
            int r0 = r1.f363c
            return r0
    }

    public long h() {
            r2 = this;
            long r0 = r2.f364d
            return r0
    }

    public int hashCode() {
            r5 = this;
            r0 = 1
            byte[] r0 = r5.a(r0)
            r1 = 0
            r2 = 0
        L7:
            int r3 = r0.length
            if (r1 >= r3) goto L15
            int r3 = r2 << 3
            r4 = r0[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r4
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L7
        L15:
            return r2
    }

    cn.jiguang.ac.i i() {
            r1 = this;
            java.lang.Object r0 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            cn.jiguang.ac.i r0 = (cn.jiguang.ac.i) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            cn.jiguang.ac.g r1 = r4.a
            r0.append(r1)
            int r1 = r0.length()
            r2 = 8
            java.lang.String r3 = "\t"
            if (r1 >= r2) goto L17
            r0.append(r3)
        L17:
            int r1 = r0.length()
            r2 = 16
            if (r1 >= r2) goto L22
            r0.append(r3)
        L22:
            r0.append(r3)
            java.lang.String r1 = r4.b()
            java.lang.String r2 = ""
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L37
            r0.append(r3)
            r0.append(r1)
        L37:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
