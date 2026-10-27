package cn.jiguang.commons.i;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e {
    public static java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1154c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f1155d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f1156e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f1157f;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.String f1158g;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f1159h;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f1160i;

    static {
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = ""
            java.lang.String r1 = "IDUtils"
            java.lang.String r2 = "+Fc+/S0DV5xukan0E/9N4RvXQpEI8h8+6y3k9NAvwjLhqIYeN+juscczCl6Sq6PxwLAq9CdDlLtmxsbD83akRg=="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Throwable -> L47
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L11
            return r0
        L11:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L47
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "+Fc+/S0DV5xukan0E/9N4VArQdi8pEVBp8UquAC8VbE="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Throwable -> L47
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L23
            return r0
        L23:
            r3.setPackage(r2)     // Catch: java.lang.Throwable -> L47
            cn.jiguang.commons.l.aj r2 = new cn.jiguang.commons.l.aj     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            android.content.Context r4 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L47
            r5 = 1
            boolean r3 = r4.bindService(r3, r2, r5)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto La1
            boolean r3 = r2.a     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L4b
            java.lang.String r3 = "google service repeat bind"
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Throwable -> L49
            android.content.Context r3 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L47
            r3.unbindService(r2)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
            r2 = move-exception
            goto La7
        L49:
            r3 = move-exception
            goto L78
        L4b:
            cn.jiguang.commons.l.ai r3 = new cn.jiguang.commons.l.ai     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.LinkedBlockingQueue r4 = r2.f1164c     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.take()     // Catch: java.lang.Throwable -> L49
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch: java.lang.Throwable -> L49
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "google ad id:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Throwable -> L49
            android.content.Context r4 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L47
            r4.unbindService(r2)     // Catch: java.lang.Throwable -> L47
            return r3
        L78:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "get google Ids by service error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L98
            r4.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L98
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Throwable -> L98
            android.content.Context r3 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L47
            r3.unbindService(r2)     // Catch: java.lang.Throwable -> L47
            goto Lbf
        L98:
            r3 = move-exception
            android.content.Context r4 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L47
            r4.unbindService(r2)     // Catch: java.lang.Throwable -> L47
            throw r3     // Catch: java.lang.Throwable -> L47
        La1:
            java.lang.String r2 = "google service bind failed"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L47
            goto Lbf
        La7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "google getAdvertisingIdInfo Exception: "
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r2)
        Lbf:
            return r0
    }

    private static java.lang.String a(android.content.Context r8) {
            java.lang.String r0 = "start to unbind did service"
            java.lang.String r1 = "IDUtils"
            java.lang.String r2 = ""
            if (r8 != 0) goto L9
            return r2
        L9:
            java.lang.String r3 = cn.jiguang.commons.i.e.f1157f     // Catch: java.lang.Exception -> L8a
            if (r3 == 0) goto Le
            return r3
        Le:
            cn.jiguang.commons.i.e.f1157f = r2     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "AVy8x+cBVze9OKJHZKioHyNDBGqtEllVM4dvG69zMJc="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Exception -> L8a
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L8a
            if (r4 == 0) goto L1d
            return r2
        L1d:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L8a
            r4.<init>(r3)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "8lAhWp7NB89J3VIJU4lIGQtLf0YkfPcfFvWDnnGUuiQ="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Exception -> L8a
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L8a
            if (r5 == 0) goto L2f
            return r2
        L2f:
            java.lang.String r5 = "8lAhWp7NB89J3VIJU4lIGQnPwmB8zgbENyN+gUA8dpRI7pO4GGAXufB+HCPmLRg7bL9N6o9V3Rxxk98J3lyy6g=="
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)     // Catch: java.lang.Exception -> L8a
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L3c
            return r2
        L3c:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L8a
            r6.<init>(r3, r5)     // Catch: java.lang.Exception -> L8a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L8a
            r3.<init>(r4)     // Catch: java.lang.Exception -> L8a
            r3.setComponent(r6)     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = "start to bind did service."
            cn.jiguang.commons.w.a.d(r1, r4)     // Catch: java.lang.Exception -> L8a
            cn.jiguang.commons.k.d r4 = new cn.jiguang.commons.k.d     // Catch: java.lang.Exception -> L8a
            r4.<init>()     // Catch: java.lang.Exception -> L8a
            r5 = 1
            boolean r3 = r8.bindService(r3, r4, r5)     // Catch: java.lang.Exception -> L8a
            if (r3 == 0) goto Ld1
            cn.jiguang.commons.k.c r5 = new cn.jiguang.commons.k.c     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.LinkedBlockingQueue r6 = r4.a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = r6.take()     // Catch: java.lang.Throwable -> L8d
            android.os.IBinder r6 = (android.os.IBinder) r6     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r6.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = "asus ids-oa; "
            r6.append(r7)     // Catch: java.lang.Throwable -> L8d
            r6.append(r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8d
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Throwable -> L8d
            cn.jiguang.commons.i.e.f1157f = r5     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L8c
            cn.jiguang.commons.w.a.d(r1, r0)     // Catch: java.lang.Exception -> L8a
            r8.unbindService(r4)     // Catch: java.lang.Exception -> L8a
            return r5
        L8a:
            r8 = move-exception
            goto Lb9
        L8c:
            return r5
        L8d:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r6.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = "get asus ids-oa error: "
            r6.append(r7)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> Laf
            r6.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Laf
            cn.jiguang.commons.w.a.f(r1, r5)     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto Ld1
            cn.jiguang.commons.w.a.d(r1, r0)     // Catch: java.lang.Exception -> L8a
            r8.unbindService(r4)     // Catch: java.lang.Exception -> L8a
            goto Ld1
        Laf:
            r5 = move-exception
            if (r3 == 0) goto Lb8
            cn.jiguang.commons.w.a.d(r1, r0)     // Catch: java.lang.Exception -> L8a
            r8.unbindService(r4)     // Catch: java.lang.Exception -> L8a
        Lb8:
            throw r5     // Catch: java.lang.Exception -> L8a
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "asus getAdvertisingIdInfo Exception: "
            r0.append(r3)
            java.lang.String r8 = r8.toString()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r8)
        Ld1:
            return r2
    }

    public static java.lang.String c() {
            java.lang.String r0 = "IDUtils"
            java.lang.String r1 = ""
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L37
            r4 = 1011(0x3f3, float:1.417E-42)
            r5 = 0
            java.lang.String r3 = r3.d(r4, r5)     // Catch: java.lang.Throwable -> L37
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L1a
            return r1
        L1a:
            java.lang.String r4 = "KACzk43fXSu6fNDY3NHiRg=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "1uhzqUdzasJ2ZR3KEL+MzQ=="
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)     // Catch: java.lang.Throwable -> L37
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L3a
            java.lang.String r6 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L4a
            goto L3a
        L37:
            r2 = move-exception
            goto L1dc
        L3a:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L4f
            java.lang.String r4 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L4f
        L4a:
            java.lang.String r0 = c(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L4f:
            java.lang.String r4 = "abElWL6JFOA3DmtpsVXe5g=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "qqDQS9ZdTx8AkhCp5nUUmQ=="
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)     // Catch: java.lang.Throwable -> L37
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L6b
            java.lang.String r6 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L7b
        L6b:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L80
            java.lang.String r4 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L80
        L7b:
            java.lang.String r0 = k(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L80:
            java.lang.String r4 = "ZCUqO8ru60AnJTvdxNftwg=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L9b
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L9b
            java.lang.String r0 = j(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L9b:
            java.lang.String r4 = "Sqo/G40afBQEk/ThxiHCDA=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto Lb6
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto Lb6
            java.lang.String r0 = g(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        Lb6:
            java.lang.String r4 = "Fl44OKc45ZSCqG4pxdgAdA=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto Ld1
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto Ld1
            java.lang.String r0 = i(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        Ld1:
            java.lang.String r4 = "v4ibuvMAw0xxYGyCW947bw=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "lJTl9z+ZycJlu+D6qavE9g=="
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)     // Catch: java.lang.Throwable -> L37
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto Lee
            java.lang.String r6 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto Lfe
        Lee:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L103
            java.lang.String r4 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L103
        Lfe:
            java.lang.String r0 = e(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L103:
            java.lang.String r4 = "7UUoz3VX0wN8BuYNQ77o2g=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L11e
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L11e
            java.lang.String r0 = f(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L11e:
            java.lang.String r4 = "NftKgs8fjwuVYJ3VslncvA=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "Wq1559o9+HHChTmry59Bkg=="
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)     // Catch: java.lang.Throwable -> L37
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L13a
            java.lang.String r6 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L14a
        L13a:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L14f
            java.lang.String r4 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L14f
        L14a:
            java.lang.String r0 = m(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L14f:
            java.lang.String r4 = "fmTCWm9ViPlyzM8H0bOrgw=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L16a
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L16a
            java.lang.String r0 = a(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L16a:
            java.lang.String r4 = "bbyVCf9F4jMXWPUAeT3frw=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L185
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L185
            java.lang.String r0 = l(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L185:
            java.lang.String r4 = "0kbg5dLQpyr1z+M/7Qkp7A=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L19b
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L1a1
        L19b:
            boolean r4 = cn.jiguang.commons.t.a.a()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L1a6
        L1a1:
            java.lang.String r0 = d(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L1a6:
            java.lang.String r4 = "7kOXkVyi2CnACIIN3msOQg=="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L1bc
            java.lang.String r5 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L1c2
        L1bc:
            boolean r4 = cn.jiguang.commons.t.a.c()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L1c7
        L1c2:
            java.lang.String r0 = h(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L1c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "not supported this device: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L37
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Throwable -> L37
            goto L1f4
        L1dc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getIdsByLocal failed:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
        L1f4:
            return r1
    }

    private static java.lang.String c(android.content.Context r7) {
            java.lang.String r0 = "IDUtils"
            java.lang.String r1 = ""
            if (r7 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = cn.jiguang.commons.i.e.a     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r2 = "CV+BUnOM9r9hBWkUu5oSnA=="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Throwable -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L19
            return r1
        L19:
            cn.jiguang.commons.i.e.a = r1     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "axDZqud6H+CDQBXA/yBXOiEPy9gW6px8eLENPXdBlBHSZeanEgWxhi72s58AM6wZ"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Throwable -> L69
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L28
            return r1
        L28:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L69
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r4.setPackage(r2)     // Catch: java.lang.Throwable -> L69
            cn.jiguang.commons.m.c r2 = new cn.jiguang.commons.m.c     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            r3 = 1
            boolean r3 = r7.bindService(r4, r2, r3)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L92
            cn.jiguang.commons.m.a r4 = new cn.jiguang.commons.m.a     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.LinkedBlockingQueue r5 = r2.a     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r5 = r5.take()     // Catch: java.lang.Throwable -> L6c
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "hw ids-o:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.commons.i.e.a = r4     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L6b
            r7.unbindService(r2)     // Catch: java.lang.Throwable -> L69
            return r4
        L69:
            r7 = move-exception
            goto L98
        L6b:
            return r4
        L6c:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "hw get Ids-oa error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L8b
            r5.append(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L8b
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto Lb0
            r7.unbindService(r2)     // Catch: java.lang.Throwable -> L69
            goto Lb0
        L8b:
            r4 = move-exception
            if (r3 == 0) goto L91
            r7.unbindService(r2)     // Catch: java.lang.Throwable -> L69
        L91:
            throw r4     // Catch: java.lang.Throwable -> L69
        L92:
            java.lang.String r7 = "hw service bind failed"
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Throwable -> L69
            goto Lb0
        L98:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hw getAdvertisingIdInfo Exception: "
            r2.append(r3)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        Lb0:
            return r1
    }

    private static java.lang.String d(android.content.Context r1) {
            java.lang.String r0 = cn.jiguang.commons.i.e.f1159h
            if (r0 != 0) goto L1c
            cn.jiguang.commons.t.c r0 = new cn.jiguang.commons.t.c
            r0.<init>(r1)
            java.lang.String r1 = r0.a()
            cn.jiguang.commons.i.e.f1159h = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L18
            java.lang.String r1 = ""
            goto L1a
        L18:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1159h
        L1a:
            cn.jiguang.commons.i.e.f1159h = r1
        L1c:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1159h
            return r1
    }

    private static java.lang.String e(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            cn.jiguang.commons.n.d r1 = new cn.jiguang.commons.n.d     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getVivoIds err: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "IDUtils"
            cn.jiguang.commons.w.a.f(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String f(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            cn.jiguang.commons.o.c r1 = new cn.jiguang.commons.o.c     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getNubiaIds err: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "IDUtils"
            cn.jiguang.commons.w.a.f(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String g(android.content.Context r7) {
            java.lang.String r0 = "IDUtils"
            java.lang.String r1 = ""
            java.lang.String r2 = cn.jiguang.commons.i.e.f1156e     // Catch: java.lang.Exception -> L76
            if (r2 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = "qFFOesfckPwVmbfqzGl5oG9IMWwJa4PjDfKEUokUsrU="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Exception -> L76
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L76
            if (r3 == 0) goto L16
            return r1
        L16:
            cn.jiguang.commons.i.e.f1156e = r1     // Catch: java.lang.Exception -> L76
            java.lang.String r3 = "qFFOesfckPwVmbfqzGl5oOMkBF5tSSPHMYAiT/owwSwoCrUg5HXoJRYDJrCupV3K"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Exception -> L76
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L76
            if (r4 == 0) goto L25
            return r1
        L25:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L76
            r4.<init>(r3)     // Catch: java.lang.Exception -> L76
            r4.setPackage(r2)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = "/3gurUKcGzqF8/YMsL45D9RvCsSd5y5lQDTuvU2S5vtG2aMIkkluUNr+NKF2loi0"
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Exception -> L76
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L76
            if (r3 == 0) goto L3a
            return r1
        L3a:
            r4.setAction(r2)     // Catch: java.lang.Exception -> L76
            cn.jiguang.commons.p.c r2 = new cn.jiguang.commons.p.c     // Catch: java.lang.Exception -> L76
            r2.<init>()     // Catch: java.lang.Exception -> L76
            r3 = 1
            boolean r3 = r7.bindService(r4, r2, r3)     // Catch: java.lang.Exception -> L76
            if (r3 == 0) goto L9f
            cn.jiguang.commons.p.a r4 = new cn.jiguang.commons.p.a     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.LinkedBlockingQueue r5 = r2.a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = r5.take()     // Catch: java.lang.Throwable -> L79
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L79
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r4.a(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r5.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "oppo ids-oa: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L79
            r5.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L79
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L79
            cn.jiguang.commons.i.e.f1156e = r4     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L78
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L76
            return r4
        L76:
            r7 = move-exception
            goto La5
        L78:
            return r4
        L79:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "get oppo ids-oa error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L98
            r5.append(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L98
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto Lbd
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L76
            goto Lbd
        L98:
            r4 = move-exception
            if (r3 == 0) goto L9e
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L76
        L9e:
            throw r4     // Catch: java.lang.Exception -> L76
        L9f:
            java.lang.String r7 = "oppo service bind failed"
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Exception -> L76
            goto Lbd
        La5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "oppo getAdvertisingIdInfo Exception: "
            r2.append(r3)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        Lbd:
            return r1
    }

    private static java.lang.String h(android.content.Context r1) {
            java.lang.String r0 = cn.jiguang.commons.i.e.f1160i
            if (r0 != 0) goto L1c
            cn.jiguang.commons.t.c r0 = new cn.jiguang.commons.t.c
            r0.<init>(r1)
            java.lang.String r1 = r0.a()
            cn.jiguang.commons.i.e.f1160i = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L18
            java.lang.String r1 = ""
            goto L1a
        L18:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1160i
        L1a:
            cn.jiguang.commons.i.e.f1160i = r1
        L1c:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1160i
            return r1
    }

    private static java.lang.String i(android.content.Context r7) {
            java.lang.String r0 = "IDUtils"
            java.lang.String r1 = ""
            java.lang.String r2 = cn.jiguang.commons.i.e.f1155d     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = "NZZdxIY39aBpJdeuRJ0VLp5xPlLZJqfiSSPak26ACVtSyGK74B1pfv+DoniV/u8H"
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Exception -> L66
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L16
            return r1
        L16:
            cn.jiguang.commons.i.e.f1155d = r1     // Catch: java.lang.Exception -> L66
            java.lang.String r3 = "NZZdxIY39aBpJdeuRJ0VLp5xPlLZJqfiSSPak26ACVsaSg3goTgfCOA0dOFWjVLPc7dVv4XHGL0Dk7MQTYMVQw=="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Exception -> L66
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L66
            if (r4 == 0) goto L25
            return r1
        L25:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L66
            r4.<init>()     // Catch: java.lang.Exception -> L66
            r4.setClassName(r2, r3)     // Catch: java.lang.Exception -> L66
            cn.jiguang.commons.q.c r2 = new cn.jiguang.commons.q.c     // Catch: java.lang.Exception -> L66
            r2.<init>()     // Catch: java.lang.Exception -> L66
            r3 = 1
            boolean r3 = r7.bindService(r4, r2, r3)     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L8f
            cn.jiguang.commons.q.a r4 = new cn.jiguang.commons.q.a     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.LinkedBlockingQueue r5 = r2.a     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r5.take()     // Catch: java.lang.Throwable -> L69
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L69
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r4.a(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r5.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = "sumsuang ids-oa:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L69
            r5.append(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L69
            cn.jiguang.commons.i.e.f1155d = r4     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L68
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L66
            return r4
        L66:
            r7 = move-exception
            goto L95
        L68:
            return r4
        L69:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r5.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "get sumsung Ids-oa error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L88
            r5.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L88
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto Lad
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L66
            goto Lad
        L88:
            r4 = move-exception
            if (r3 == 0) goto L8e
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L66
        L8e:
            throw r4     // Catch: java.lang.Exception -> L66
        L8f:
            java.lang.String r7 = "sumsung service bind failed"
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Exception -> L66
            goto Lad
        L95:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sumsung getAdvertisingIdInfo Exception: "
            r2.append(r3)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        Lad:
            return r1
    }

    private static java.lang.String j(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            cn.jiguang.commons.r.d r1 = new cn.jiguang.commons.r.d     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = ""
            r1.a(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getVivoIds err: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "IDUtils"
            cn.jiguang.commons.w.a.f(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String k(android.content.Context r0) {
            java.lang.String r0 = cn.jiguang.commons.s.a.a(r0)
            return r0
    }

    private static java.lang.String l(android.content.Context r1) {
            java.lang.String r0 = cn.jiguang.commons.i.e.f1158g
            if (r0 != 0) goto L1c
            cn.jiguang.commons.t.c r0 = new cn.jiguang.commons.t.c
            r0.<init>(r1)
            java.lang.String r1 = r0.a()
            cn.jiguang.commons.i.e.f1158g = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L18
            java.lang.String r1 = ""
            goto L1a
        L18:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1158g
        L1a:
            cn.jiguang.commons.i.e.f1158g = r1
        L1c:
            java.lang.String r1 = cn.jiguang.commons.i.e.f1158g
            return r1
    }

    private static java.lang.String m(android.content.Context r7) {
            java.lang.String r0 = "IDUtils"
            java.lang.String r1 = ""
            java.lang.String r2 = cn.jiguang.commons.i.e.f1154c     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = "Mpy0fkBSw1N+kug2cBPj2YJ2JkldBoT0Hj8EbMwXMGU="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Exception -> L67
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L67
            if (r3 == 0) goto L16
            return r1
        L16:
            cn.jiguang.commons.i.e.f1154c = r1     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = "Mpy0fkBSw1N+kug2cBPj2dTFEwqSue3aUHyxqBhF0BWQuC1TiTYwRmpXbBFYowSK"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Exception -> L67
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L67
            if (r4 == 0) goto L25
            return r1
        L25:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L67
            r4.<init>(r3)     // Catch: java.lang.Exception -> L67
            r4.setPackage(r2)     // Catch: java.lang.Exception -> L67
            cn.jiguang.commons.u.c r2 = new cn.jiguang.commons.u.c     // Catch: java.lang.Exception -> L67
            r2.<init>()     // Catch: java.lang.Exception -> L67
            r3 = 1
            boolean r3 = r7.bindService(r4, r2, r3)     // Catch: java.lang.Exception -> L67
            if (r3 == 0) goto L90
            cn.jiguang.commons.u.a r4 = new cn.jiguang.commons.u.a     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.LinkedBlockingQueue r5 = r2.a     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r5 = r5.take()     // Catch: java.lang.Throwable -> L6a
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "zui ids-oa:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            r5.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.i.e.f1154c = r4     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L69
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L67
            return r4
        L67:
            r7 = move-exception
            goto L97
        L69:
            return r4
        L6a:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r5.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "get zui ids-oa error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L89
            r5.append(r4)     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L89
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto Lb0
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L67
            goto Lb0
        L89:
            r4 = move-exception
            if (r3 == 0) goto L8f
            r7.unbindService(r2)     // Catch: java.lang.Exception -> L67
        L8f:
            throw r4     // Catch: java.lang.Exception -> L67
        L90:
            java.lang.String r7 = "zui service bind failed"
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Exception -> L67
            goto Lb0
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "zui getAdvertisingIdInfo Exception: "
            r2.append(r3)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        Lb0:
            return r1
    }
}
