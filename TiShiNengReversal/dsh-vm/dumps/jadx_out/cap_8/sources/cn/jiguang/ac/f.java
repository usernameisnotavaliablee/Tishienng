package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class f {
    private static java.lang.Integer[] a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.HashMap f343b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.HashMap f344c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f345d;

    /* renamed from: e, reason: collision with root package name */
    private int f346e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f347f;

    /* renamed from: g, reason: collision with root package name */
    private int f348g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f349h;

    static {
            r0 = 64
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            cn.jiguang.ac.f.a = r0
            r0 = 0
        L7:
            java.lang.Integer[] r1 = cn.jiguang.ac.f.a
            int r2 = r1.length
            if (r0 >= r2) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L7
        L15:
            return
    }

    public f(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f345d = r1
            r0.f346e = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f343b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f344c = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f348g = r1
            return
    }

    private java.lang.String a(java.lang.String r3) {
            r2 = this;
            int r0 = r2.f346e
            r1 = 2
            if (r0 != r1) goto La
            java.lang.String r3 = r3.toUpperCase()
            return r3
        La:
            r1 = 3
            if (r0 != r1) goto L11
            java.lang.String r3 = r3.toLowerCase()
        L11:
            return r3
    }

    public static java.lang.Integer b(int r2) {
            if (r2 < 0) goto La
            java.lang.Integer[] r0 = cn.jiguang.ac.f.a
            int r1 = r0.length
            if (r2 >= r1) goto La
            r2 = r0[r2]
            return r2
        La:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    public void a(int r1) {
            r0 = this;
            r0.f348g = r1
            return
    }

    public void a(int r2, java.lang.String r3) {
            r1 = this;
            r1.c(r2)
            java.lang.Integer r2 = b(r2)
            java.lang.String r3 = r1.a(r3)
            java.util.HashMap r0 = r1.f343b
            r0.put(r3, r2)
            java.util.HashMap r0 = r1.f344c
            r0.put(r2, r3)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f349h = r1
            return
    }

    public void c(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.f348g
            if (r4 > r0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f345d
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "is out of range"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String d(int r3) {
            r2 = this;
            r2.c(r3)
            java.util.HashMap r0 = r2.f344c
            java.lang.Integer r1 = b(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = r2.f347f
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f347f
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L2b:
            return r3
    }
}
