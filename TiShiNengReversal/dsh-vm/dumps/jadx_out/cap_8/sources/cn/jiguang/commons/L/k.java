package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class k {
    private static final java.lang.ThreadLocal a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.ThreadLocal f894c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal f895d = null;

    class a extends java.lang.ThreadLocal {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.ref.WeakReference a() {
                r3 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Lc
                java.lang.String r1 = cn.jiguang.commons.a.d.f944g     // Catch: java.lang.Exception -> Lc
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> Lc
                r0.<init>(r1)     // Catch: java.lang.Exception -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "failed to init md5 digest: "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "DigestUtils"
                cn.jiguang.commons.w.a.f(r1, r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.a()
                return r0
        }
    }

    class b extends java.lang.ThreadLocal {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.ref.WeakReference a() {
                r3 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Lc
                java.lang.String r1 = cn.jiguang.commons.a.d.f945h     // Catch: java.lang.Exception -> Lc
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> Lc
                r0.<init>(r1)     // Catch: java.lang.Exception -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "failed to init sha1 digest: "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "DigestUtils"
                cn.jiguang.commons.w.a.f(r1, r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.a()
                return r0
        }
    }

    class c extends java.lang.ThreadLocal {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.ref.WeakReference a() {
                r3 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Lc
                java.lang.String r1 = cn.jiguang.commons.a.d.f946i     // Catch: java.lang.Exception -> Lc
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> Lc
                r0.<init>(r1)     // Catch: java.lang.Exception -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "failed to init sha256 digest: "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "DigestUtils"
                cn.jiguang.commons.w.a.f(r1, r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.a()
                return r0
        }
    }

    static {
            cn.jiguang.commons.L.k$a r0 = new cn.jiguang.commons.L.k$a
            r0.<init>()
            cn.jiguang.commons.L.k.a = r0
            cn.jiguang.commons.L.k$b r0 = new cn.jiguang.commons.L.k$b
            r0.<init>()
            cn.jiguang.commons.L.k.f894c = r0
            cn.jiguang.commons.L.k$c r0 = new cn.jiguang.commons.L.k$c
            r0.<init>()
            cn.jiguang.commons.L.k.f895d = r0
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(byte[] r1) {
            r0 = 0
            java.lang.String r1 = a(r1, r0, r0)
            return r1
    }

    public static java.lang.String a(byte[] r1, char r2) {
            r0 = 1
            java.lang.String r1 = a(r1, r0, r2)
            return r1
    }

    private static java.lang.String a(byte[] r6, boolean r7, char r8) {
            if (r6 == 0) goto L49
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L49
        L6:
            r0 = 0
            r1 = 1
            if (r8 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            int r3 = r6.length
            if (r2 == 0) goto L14
            int r3 = r3 * 3
            int r3 = r3 - r1
            goto L16
        L14:
            int r3 = r3 * 2
        L16:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
        L1b:
            int r3 = r6.length
            if (r0 >= r3) goto L44
            r3 = r6[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5 = 16
            if (r3 >= r5) goto L2b
            r5 = 48
            r4.append(r5)
        L2b:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            if (r7 == 0) goto L35
            java.lang.String r3 = r3.toUpperCase()
        L35:
            r4.append(r3)
            if (r2 == 0) goto L41
            int r3 = r6.length
            int r3 = r3 - r1
            if (r0 >= r3) goto L41
            r4.append(r8)
        L41:
            int r0 = r0 + 1
            goto L1b
        L44:
            java.lang.String r6 = r4.toString()
            return r6
        L49:
            java.lang.String r6 = ""
            return r6
    }

    private static java.security.MessageDigest a(java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = cn.jiguang.commons.a.d.f944g     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.equals(r3)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L2a
            java.lang.ThreadLocal r3 = cn.jiguang.commons.L.k.a     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.get()     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1a
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r3 = move-exception
            goto L84
        L1d:
            r2 = r0
        L1e:
            if (r2 != 0) goto L7e
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            goto L4f
        L2a:
            java.lang.String r1 = cn.jiguang.commons.a.d.f945h     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.equals(r3)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L54
            java.lang.ThreadLocal r3 = cn.jiguang.commons.L.k.f894c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.get()     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L43
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1a
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2     // Catch: java.lang.Throwable -> L1a
            goto L44
        L43:
            r2 = r0
        L44:
            if (r2 != 0) goto L7e
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
        L4f:
            r3.set(r2)     // Catch: java.lang.Throwable -> L1a
            r2 = r1
            goto L7e
        L54:
            java.lang.String r1 = cn.jiguang.commons.a.d.f946i     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L7d
            java.lang.ThreadLocal r3 = cn.jiguang.commons.L.k.f895d     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.get()     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1a
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2     // Catch: java.lang.Throwable -> L1a
            goto L6e
        L6d:
            r2 = r0
        L6e:
            if (r2 != 0) goto L7e
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            r3.set(r1)     // Catch: java.lang.Throwable -> L1a
            goto L7e
        L7d:
            r2 = r0
        L7e:
            if (r2 == 0) goto L83
            r2.reset()     // Catch: java.lang.Throwable -> L1a
        L83:
            return r2
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to get digest: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "DigestUtils"
            cn.jiguang.commons.w.a.f(r1, r3)
            return r0
    }

    public static byte[] c(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.lang.Exception -> Lf
            byte[] r3 = c(r3)     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "md5 encoding error: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "DigestUtils"
            cn.jiguang.commons.w.a.f(r1, r3)
            return r0
    }

    public static byte[] c(byte[] r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = cn.jiguang.commons.a.d.f944g
            java.security.MessageDigest r1 = a(r1)
            if (r1 == 0) goto L11
            byte[] r2 = r1.digest(r2)
            return r2
        L11:
            return r0
    }

    public static java.lang.String d(java.lang.String r0) {
            byte[] r0 = c(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = a(r0)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String d(byte[] r0) {
            byte[] r0 = c(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = a(r0)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static byte[] e(byte[] r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = cn.jiguang.commons.a.d.f945h
            java.security.MessageDigest r1 = a(r1)
            if (r1 == 0) goto L11
            byte[] r2 = r1.digest(r2)
            return r2
        L11:
            return r0
    }

    public static byte[] f(byte[] r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = cn.jiguang.commons.a.d.f946i
            java.security.MessageDigest r1 = a(r1)
            if (r1 == 0) goto L11
            byte[] r2 = r1.digest(r2)
            return r2
        L11:
            return r0
    }

    public static java.lang.String g(byte[] r0) {
            byte[] r0 = f(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = a(r0)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String h(byte[] r0) {
            byte[] r0 = e(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = a(r0)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }
}
