package cn.jpush.android.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.util.List<cn.jpush.android.d.d> a;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.List<cn.jpush.android.d.d> f1864b;

    /* renamed from: c, reason: collision with root package name */
    private static int f1865c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f1866d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<java.lang.Integer> f1867e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1868f;



    private static final class a {
        private static final cn.jpush.android.p.b a = null;

        static {
                cn.jpush.android.p.b r0 = new cn.jpush.android.p.b
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.p.b.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.p.b a() {
                cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a.a
                return r0
        }
    }

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            cn.jpush.android.p.b.a = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            cn.jpush.android.p.b.f1864b = r0
            r0 = 10
            cn.jpush.android.p.b.f1865c = r0
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1867e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f1868f = r0
            return
    }

    /* synthetic */ b(cn.jpush.android.p.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.p.b a() {
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a.a()
            return r0
    }

    private void a(cn.jpush.android.d.d r4, boolean r5) {
            r3 = this;
            r0 = 4
            if (r5 == 0) goto Ld
            android.content.Context r5 = r3.f1866d
            java.lang.String r4 = r4.f1757d
            r1 = 2007(0x7d7, double:9.916E-321)
            cn.jpush.android.helper.c.a(r5, r4, r1, r0)
            return
        Ld:
            r5 = 40
            int r1 = r4.bt
            if (r5 != r1) goto L1d
            java.lang.String r4 = r4.f1757d
            r0 = 1603(0x643, double:7.92E-321)
            android.content.Context r5 = r3.f1866d
            cn.jpush.android.helper.c.a(r4, r0, r5)
            return
        L1d:
            android.content.Context r5 = r3.f1866d
            java.lang.String r4 = r4.f1757d
            r1 = 2002(0x7d2, double:9.89E-321)
            cn.jpush.android.helper.c.a(r5, r4, r1, r0)
            return
    }

    private void a(java.util.List<cn.jpush.android.d.d> r4) {
            r3 = this;
            int r0 = r4.size()
            int r1 = cn.jpush.android.p.b.f1865c
            if (r0 < r1) goto L2c
            r3.b(r4)
        Lb:
            int r0 = r4.size()
            int r1 = cn.jpush.android.p.b.f1865c
            if (r0 < r1) goto L29
            r0 = 0
            java.lang.Object r1 = r4.get(r0)
            cn.jpush.android.d.d r1 = (cn.jpush.android.d.d) r1
            r4.remove(r0)
            android.content.Context r0 = r3.f1866d
            java.lang.String r2 = r1.f1757d
            cn.jpush.android.ad.c.d(r0, r2)
            r0 = 1
            r3.a(r1, r0)
            goto Lb
        L29:
            r3.c(r4)
        L2c:
            return
    }

    private void a(java.util.List<cn.jpush.android.d.d> r2, cn.jpush.android.d.d r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.a(r3, r2)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "the notify message cache already, messageId: "
            r2.append(r4)
            java.lang.String r3 = r3.f1757d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InAppCacheMgr"
            cn.jpush.android.helper.Logger.d(r3, r2)
            return
        L1f:
            r1.a(r2)
            r2.add(r3)
            r1.c(r2)
            r1.c(r4, r2)
            return
    }

    private void a(java.util.List<cn.jpush.android.d.d> r1, java.lang.String r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L5
            r1.clear()
        L5:
            r0.b(r2, r1)
            r0.c(r1)
            return
    }

    private static boolean a(int r1) {
            r0 = 40
            if (r0 != r1) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private boolean a(cn.jpush.android.d.d r5, java.util.List<cn.jpush.android.d.d> r6) {
            r4 = this;
            int r0 = r6.size()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r6.next()
            cn.jpush.android.d.d r2 = (cn.jpush.android.d.d) r2
            java.lang.String r2 = r2.f1757d
            java.lang.String r3 = r5.f1757d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L10
            return r0
        L27:
            return r1
    }

    private static java.util.List<cn.jpush.android.d.d> b(int r0) {
            boolean r0 = a(r0)
            if (r0 == 0) goto L9
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a
            return r0
        L9:
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.f1864b
            return r0
    }

    private void b(java.lang.String r13, java.util.List<cn.jpush.android.d.d> r14) {
            r12 = this;
            java.lang.String r0 = "InAppCacheMgr"
            r1 = 0
            android.content.Context r2 = r12.f1866d     // Catch: java.lang.Throwable -> L64
            java.io.File r2 = cn.jpush.android.ad.c.a(r2, r13)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L9a
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L9a
            java.lang.String r2 = cn.jpush.android.ad.c.c(r2)     // Catch: java.lang.Throwable -> L64
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L9a
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L64
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f1868f     // Catch: java.lang.Throwable -> L64
            r4 = 0
            r2.set(r4)     // Catch: java.lang.Throwable -> L64
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L64
            r5 = 1
            int r2 = r2 - r5
        L2c:
            if (r2 < 0) goto L9a
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64
            cn.jpush.android.d.d r6 = cn.jpush.android.d.d.b(r6)     // Catch: java.lang.Throwable -> L64
            if (r6 != 0) goto L3d
            goto L97
        L3d:
            long r7 = r6.bP     // Catch: java.lang.Throwable -> L64
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L66
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = "loadObjects message out of date, endTime: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L64
            r9.append(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L64
            cn.jpush.android.helper.Logger.dd(r0, r7)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.atomic.AtomicBoolean r7 = r12.f1868f     // Catch: java.lang.Throwable -> L64
            r7.set(r5)     // Catch: java.lang.Throwable -> L64
            r12.a(r6, r4)     // Catch: java.lang.Throwable -> L64
            goto L97
        L64:
            r2 = move-exception
            goto La9
        L66:
            r14.add(r6)     // Catch: java.lang.Throwable -> L64
            int r6 = r14.size()     // Catch: java.lang.Throwable -> L64
            int r7 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L64
            if (r6 != r7) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "[loadObjects] reach max cache message count: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L64
            int r4 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L64
            r2.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = ", drop message count: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L64
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L64
            int r4 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L64
            int r3 = r3 - r4
            r2.append(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L64
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L64
            goto L9a
        L97:
            int r2 = r2 + (-1)
            goto L2c
        L9a:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f1868f
            boolean r2 = r2.get()
            if (r2 == 0) goto La5
        La2:
            r12.a(r13, r14)
        La5:
            cn.jpush.android.ad.m.a(r1)
            goto Lcd
        La9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r3.<init>()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r4 = "load objects error:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Le6
            r3.append(r2)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Le6
            cn.jpush.android.helper.Logger.w(r0, r2)     // Catch: java.lang.Throwable -> Le6
            r12.d(r13)     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f1868f
            boolean r2 = r2.get()
            if (r2 == 0) goto La5
            goto La2
        Lcd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "load object size: "
            r13.append(r1)
            int r14 = r14.size()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            cn.jpush.android.helper.Logger.i(r0, r13)
            return
        Le6:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f1868f
            boolean r2 = r2.get()
            if (r2 == 0) goto Lf2
            r12.a(r13, r14)
        Lf2:
            cn.jpush.android.ad.m.a(r1)
            throw r0
    }

    private void b(java.util.List<cn.jpush.android.d.d> r3) {
            r2 = this;
            if (r3 == 0) goto L12
            int r0 = r3.size()
            r1 = 1
            if (r0 > r1) goto La
            goto L12
        La:
            cn.jpush.android.p.b$1 r0 = new cn.jpush.android.p.b$1
            r0.<init>(r2)
            java.util.Collections.sort(r3, r0)
        L12:
            return
    }

    private static java.lang.String c(int r0) {
            boolean r0 = a(r0)
            if (r0 == 0) goto L9
            java.lang.String r0 = "notify_inapp_data"
            return r0
        L9:
            java.lang.String r0 = "inapp_data"
            return r0
    }

    private void c(java.lang.String r11, java.util.List<cn.jpush.android.d.d> r12) {
            r10 = this;
            java.lang.String r0 = "Action - saveObjects"
            java.lang.String r1 = "InAppCacheMgr"
            cn.jpush.android.helper.Logger.v(r1, r0)
            if (r12 == 0) goto Ld1
            int r0 = r12.size()
            if (r0 >= 0) goto L11
            goto Ld1
        L11:
            int r0 = r12.size()
            if (r0 != 0) goto L1b
            r10.d(r11)
            return
        L1b:
            android.content.Context r0 = r10.f1866d     // Catch: java.lang.Throwable -> L29
            java.io.File r11 = cn.jpush.android.ad.c.a(r0, r11)     // Catch: java.lang.Throwable -> L29
            if (r11 != 0) goto L2c
            java.lang.String r11 = "file is null"
            cn.jpush.android.helper.Logger.w(r1, r11)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r11 = move-exception
            goto Lb8
        L2c:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            int r2 = r12.size()     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + (-1)
        L3c:
            if (r2 < 0) goto La7
            java.lang.Object r3 = r12.get(r2)     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.d.d r3 = (cn.jpush.android.d.d) r3     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L47
            goto La4
        L47:
            long r4 = r3.bP     // Catch: java.lang.Throwable -> L29
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L6f
            r12.remove(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "saveObjects message out of date, endTime: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r3.f1757d     // Catch: java.lang.Throwable -> L29
            r4.append(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.dd(r1, r4)     // Catch: java.lang.Throwable -> L29
            r10.a(r3, r8)     // Catch: java.lang.Throwable -> L29
            goto La4
        L6f:
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L29
            r0.add(r8, r3)     // Catch: java.lang.Throwable -> L29
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L29
            int r4 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L29
            if (r3 != r4) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "[saveObjects] reach max cache message count: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            int r3 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L29
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = ", drop message count: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L29
            int r3 = cn.jpush.android.p.b.f1865c     // Catch: java.lang.Throwable -> L29
            int r12 = r12 - r3
            r2.append(r12)     // Catch: java.lang.Throwable -> L29
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.d(r1, r12)     // Catch: java.lang.Throwable -> L29
            goto La7
        La4:
            int r2 = r2 + (-1)
            goto L3c
        La7:
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L29
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L29
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.ad.c.a(r11, r12)     // Catch: java.lang.Throwable -> L29
            return
        Lb8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "save Objects  error:"
            r12.append(r0)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            cn.jpush.android.helper.Logger.ww(r1, r11)
            return
        Ld1:
            java.lang.String r11 = "mObjectList is null or size is 0"
            cn.jpush.android.helper.Logger.w(r1, r11)
            return
    }

    private void c(java.util.List<cn.jpush.android.d.d> r3) {
            r2 = this;
            if (r3 == 0) goto L12
            int r0 = r3.size()
            r1 = 1
            if (r0 > r1) goto La
            goto L12
        La:
            cn.jpush.android.p.b$2 r0 = new cn.jpush.android.p.b$2
            r0.<init>(r2)
            java.util.Collections.sort(r3, r0)
        L12:
            return
    }

    private void d(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.f1866d
            java.io.File r2 = cn.jpush.android.ad.c.a(r0, r2)
            if (r2 != 0) goto L10
            java.lang.String r2 = "InAppCacheMgr"
            java.lang.String r0 = "can't get files dir"
            cn.jpush.android.helper.Logger.w(r2, r0)
            return
        L10:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L19
            r2.delete()
        L19:
            return
    }

    public cn.jpush.android.d.d a(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deleteMessage msgID="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppCacheMgr"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            cn.jpush.android.d.d r1 = (cn.jpush.android.d.d) r1
            java.lang.String r2 = r1.f1757d
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1c
            return r1
        L31:
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.f1864b
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            cn.jpush.android.d.d r1 = (cn.jpush.android.d.d) r1
            java.lang.String r2 = r1.f1757d
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L37
            return r1
        L4c:
            r4 = 0
            return r4
    }

    public void a(android.content.Context r3) {
            r2 = this;
            r2.f1866d = r3
            java.util.List<cn.jpush.android.d.d> r3 = cn.jpush.android.p.b.a
            java.lang.String r0 = "notify_inapp_data"
            r1 = 1
            r2.a(r3, r0, r1)
            java.util.List<cn.jpush.android.d.d> r3 = cn.jpush.android.p.b.f1864b
            java.lang.String r0 = "inapp_data"
            r2.a(r3, r0, r1)
            return
    }

    public void a(cn.jpush.android.d.d r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = r3.bt
            int r1 = r3.ay
            if (r1 <= 0) goto La
            goto Lc
        La:
            r1 = 10
        Lc:
            cn.jpush.android.p.b.f1865c = r1
            java.util.List r1 = b(r0)
            java.lang.String r0 = c(r0)
            r2.a(r1, r3, r0)
            return
    }

    public void a(java.lang.String r1, java.util.List<cn.jpush.android.d.d> r2) {
            r0 = this;
            r0.c(r1, r2)
            return
    }

    public synchronized int b() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            java.util.List<cn.jpush.android.d.d> r1 = cn.jpush.android.p.b.f1864b     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public cn.jpush.android.d.d b(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "InAppCacheMgr"
            r1 = 0
            r2 = 0
            java.util.List<cn.jpush.android.d.d> r3 = cn.jpush.android.p.b.f1864b     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2d
        La:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.d.d r4 = (cn.jpush.android.d.d) r4     // Catch: java.lang.Throwable -> L2d
            int r5 = r4.bu     // Catch: java.lang.Throwable -> L2d
            r6 = 4
            if (r6 != r5) goto L5b
            java.util.List<java.lang.Integer> r6 = r8.f1867e     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r6.contains(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L30
            java.lang.String r4 = "Full message had show, current type message show only once in this activity"
        L29:
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L2d
            goto La
        L2d:
            r3 = move-exception
            goto Lea
        L30:
            java.lang.String r5 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L3b
            java.lang.String r3 = " full message target is null, so can show any activity"
            goto L77
        L3b:
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto La
            java.lang.String r5 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r9.contains(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto La
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "find full match target="
            r3.append(r5)     // Catch: java.lang.Throwable -> L2d
            r3.append(r9)     // Catch: java.lang.Throwable -> L2d
        L56:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            goto L77
        L5b:
            r6 = 3
            if (r6 != r5) goto L97
            java.util.List<java.lang.Integer> r6 = r8.f1867e     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r6.contains(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L6d
            java.lang.String r4 = "Interstitial message had show, current type message show only once in this activity"
            goto L29
        L6d:
            java.lang.String r5 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L7b
            java.lang.String r3 = " interstitial message target is null, so can show any activity"
        L77:
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L2d
            goto Lc1
        L7b:
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto La
            java.lang.String r5 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r9.contains(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto La
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "find interstitial match target="
            r3.append(r5)     // Catch: java.lang.Throwable -> L2d
            r3.append(r9)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L97:
            r6 = 2
            if (r6 != r5) goto La
            java.lang.String r3 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto La5
            java.lang.String r3 = " banner message target is null, so can show any activity"
            goto L77
        La5:
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto Lc2
            java.lang.String r3 = r4.bS     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r9.contains(r3)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto Lc2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "find banner match target="
            r3.append(r5)     // Catch: java.lang.Throwable -> L2d
            r3.append(r9)     // Catch: java.lang.Throwable -> L2d
            goto L56
        Lc1:
            r2 = r4
        Lc2:
            if (r2 != 0) goto Lfe
            java.util.List<cn.jpush.android.d.d> r3 = cn.jpush.android.p.b.a     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2d
            if (r3 <= 0) goto Lfe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "find notify to inapp message match target="
            r3.append(r4)     // Catch: java.lang.Throwable -> L2d
            r3.append(r9)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L2d
            java.util.List<cn.jpush.android.d.d> r3 = cn.jpush.android.p.b.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.d.d r3 = (cn.jpush.android.d.d) r3     // Catch: java.lang.Throwable -> L2d
            r2 = r3
            goto Lfe
        Lea:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get message throwable="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.d(r0, r3)
        Lfe:
            if (r2 == 0) goto L12b
            long r3 = r2.bP
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L12b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getMessage  out of date, endTime: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jpush.android.helper.Logger.dd(r0, r3)
            r8.a(r2, r1)
            java.lang.String r0 = r2.f1757d
            r8.c(r0)
            cn.jpush.android.d.d r9 = r8.b(r9)
            return r9
        L12b:
            return r2
    }

    public void b(cn.jpush.android.d.d r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f1867e     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            r1.f1867e = r0     // Catch: java.lang.Throwable -> L16
        Lb:
            java.util.List<java.lang.Integer> r0 = r1.f1867e     // Catch: java.lang.Throwable -> L16
            int r2 = r2.bu     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L16
            r0.add(r2)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public void c() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f1867e
            r0.clear()
            return
    }

    public boolean c(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deleteMessage msgID="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppCacheMgr"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            cn.jpush.android.d.d r2 = (cn.jpush.android.d.d) r2
            java.lang.String r4 = r2.f1757d
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L1c
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a
            r0.remove(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "deleteMessage  mNotifyInAppList remove msgID="
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r6)
            java.lang.String r6 = "notify_inapp_data"
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.a
        L4e:
            r5.a(r6, r0)
            return r3
        L52:
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.f1864b
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r0.next()
            cn.jpush.android.d.d r2 = (cn.jpush.android.d.d) r2
            java.lang.String r4 = r2.f1757d
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L58
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.f1864b
            r0.remove(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "deleteMessage  mInAppList remove msgID="
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r6)
            java.lang.String r6 = "inapp_data"
            java.util.List<cn.jpush.android.d.d> r0 = cn.jpush.android.p.b.f1864b
            goto L4e
        L8a:
            r6 = 0
            return r6
    }
}
