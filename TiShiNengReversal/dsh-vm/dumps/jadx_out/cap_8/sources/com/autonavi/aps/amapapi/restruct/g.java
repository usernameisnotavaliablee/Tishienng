package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g {
    private java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> a;

    /* renamed from: b, reason: collision with root package name */
    private java.io.File f5762b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5763c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f5764d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5765e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5766f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Runnable f5767g;


    public g(android.content.Context r3, android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.a = r0
            r0 = 0
            r2.f5763c = r0
            r0 = 0
            r2.f5765e = r0
            com.autonavi.aps.amapapi.restruct.g$1 r0 = new com.autonavi.aps.amapapi.restruct.g$1
            r0.<init>(r2)
            r2.f5767g = r0
            r2.f5764d = r4
            java.io.File r4 = r3.getFilesDir()
            java.lang.String r4 = r4.getPath()
            java.lang.String r0 = r2.f5765e
            if (r0 != 0) goto L2b
            java.lang.String r3 = com.autonavi.aps.amapapi.utils.j.l(r3)
            r2.f5765e = r3
        L2b:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "hisloc"
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L35
            r2.f5762b = r3     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r3 = move-exception
            com.amap.api.col.p0003l.p9.a(r3)
        L39:
            r2.a()
            android.os.Handler r3 = r2.f5764d
            if (r3 == 0) goto L4f
            java.lang.Runnable r4 = r2.f5767g
            r3.removeCallbacks(r4)
            android.os.Handler r3 = r2.f5764d
            java.lang.Runnable r4 = r2.f5767g
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r4, r0)
        L4f:
            return
    }

    private void a() {
            r4 = this;
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r4.a
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            if (r0 <= 0) goto Lb
            goto L47
        Lb:
            java.io.File r0 = r4.f5762b
            java.util.List r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L45
            byte[] r1 = com.amap.api.col.p0003l.j4.g(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r4.f5765e     // Catch: java.lang.Throwable -> L45
            byte[] r1 = com.autonavi.aps.amapapi.security.a.b(r1, r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L45
            com.autonavi.aps.amapapi.restruct.f r1 = new com.autonavi.aps.amapapi.restruct.f     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L45
            r1.a(r3)     // Catch: java.lang.Throwable -> L45
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r2 = r4.a     // Catch: java.lang.Throwable -> L45
            r2.add(r1)     // Catch: java.lang.Throwable -> L45
            goto L15
        L45:
            goto L15
        L47:
            return
    }

    static /* synthetic */ boolean a(com.autonavi.aps.amapapi.restruct.g r0) {
            boolean r0 = r0.f5763c
            return r0
    }

    private void b() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r1 = r5.a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            com.autonavi.aps.amapapi.restruct.f r2 = (com.autonavi.aps.amapapi.restruct.f) r2
            java.lang.String r2 = r2.a()     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L40
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r4 = "UTF-8"
            byte[] r2 = r2.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r4 = r5.f5765e     // Catch: java.io.UnsupportedEncodingException -> L40
            byte[] r2 = com.autonavi.aps.amapapi.security.a.a(r2, r4)     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r2 = com.amap.api.col.p0003l.j4.f(r2)     // Catch: java.io.UnsupportedEncodingException -> L40
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r2 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L40
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L40
            goto Lb
        L40:
            goto Lb
        L42:
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L51
            java.io.File r1 = r5.f5762b
            com.autonavi.aps.amapapi.utils.j.a(r1, r0)
        L51:
            return
    }

    static /* synthetic */ boolean b(com.autonavi.aps.amapapi.restruct.g r0) {
            boolean r0 = r0.f5766f
            return r0
    }

    private static boolean b(java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r6, java.util.ArrayList<com.amap.api.col.p0003l.m9> r7) {
            r0 = 1
            if (r6 == 0) goto L2c
            int r1 = r6.size()
            if (r1 > 0) goto La
            goto L2c
        La:
            if (r7 == 0) goto L2c
            int r1 = r7.size()
            if (r1 > 0) goto L13
            goto L2c
        L13:
            int r6 = r6.size()
            long r1 = (long) r6
            r3 = 4
            r6 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L20
            return r6
        L20:
            int r7 = r7.size()
            long r1 = (long) r7
            r3 = 20
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L2c
            return r6
        L2c:
            return r0
    }

    static /* synthetic */ void c(com.autonavi.aps.amapapi.restruct.g r0) {
            r0.b()
            return
    }

    static /* synthetic */ boolean d(com.autonavi.aps.amapapi.restruct.g r1) {
            r0 = 0
            r1.f5766f = r0
            return r0
    }

    static /* synthetic */ android.os.Handler e(com.autonavi.aps.amapapi.restruct.g r0) {
            android.os.Handler r0 = r0.f5764d
            return r0
    }

    static /* synthetic */ java.lang.Runnable f(com.autonavi.aps.amapapi.restruct.g r0) {
            java.lang.Runnable r0 = r0.f5767g
            return r0
    }

    public final java.util.List<com.autonavi.aps.amapapi.restruct.f> a(java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10, java.util.ArrayList<com.amap.api.col.p0003l.m9> r11) {
            r9 = this;
            boolean r10 = b(r10, r11)
            if (r10 == 0) goto L39
            long r10 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r1 = r9.a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.next()
            com.autonavi.aps.amapapi.restruct.f r3 = (com.autonavi.aps.amapapi.restruct.f) r3
            long r4 = r3.f5757d
            long r4 = r10 - r4
            r6 = 21600000000(0x50775d800, double:1.067181795E-313)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L34
            r0.add(r3)
            int r2 = r2 + 1
        L34:
            r3 = 10
            if (r2 != r3) goto L16
        L38:
            return r0
        L39:
            r10 = 0
            return r10
    }

    public final void a(com.autonavi.aps.amapapi.restruct.f r14) {
            r13 = this;
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r13.a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = 0
        La:
            boolean r5 = r0.hasNext()
            r6 = 1
            if (r5 == 0) goto L22
            java.lang.Object r5 = r0.next()
            com.autonavi.aps.amapapi.restruct.f r5 = (com.autonavi.aps.amapapi.restruct.f) r5
            int r7 = r5.a
            if (r7 != r6) goto La
            if (r3 != 0) goto L1e
            r3 = r5
        L1e:
            int r4 = r4 + 1
            r1 = r5
            goto La
        L22:
            if (r1 == 0) goto L56
            android.location.Location r0 = new android.location.Location
            java.lang.String r5 = "gps"
            r0.<init>(r5)
            long r7 = r14.f5757d
            long r9 = r1.f5757d
            long r7 = r7 - r9
            r9 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L56
            double r7 = r14.f5755b
            double r9 = r14.f5756c
            double r11 = r1.f5755b
            double r0 = r1.f5756c
            r5 = 4
            double[] r5 = new double[r5]
            r5[r2] = r7
            r5[r6] = r9
            r2 = 2
            r5[r2] = r11
            r2 = 3
            r5[r2] = r0
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r5)
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L56
            return
        L56:
            long r0 = (long) r4
            r4 = 5
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L62
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r13.a
            r0.remove(r3)
        L62:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r13.a
            int r0 = r0.size()
            long r0 = (long) r0
            r2 = 10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L74
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r13.a
            r0.removeFirst()
        L74:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r13.a
            r0.add(r14)
            r13.f5766f = r6
            return
    }

    public final void a(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            java.lang.Runnable r2 = r1.f5767g
            r2.run()
        L7:
            android.os.Handler r2 = r1.f5764d
            if (r2 == 0) goto L10
            java.lang.Runnable r0 = r1.f5767g
            r2.removeCallbacks(r0)
        L10:
            r2 = 1
            r1.f5763c = r2
            return
    }

    public final void b(com.autonavi.aps.amapapi.restruct.f r10) {
            r9 = this;
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            int r0 = r0.size()
            if (r0 <= 0) goto L69
            int r0 = r10.a
            r1 = 6
            r2 = 1
            r3 = 10
            if (r0 == r1) goto L34
            r1 = 5
            if (r0 != r1) goto L14
            goto L34
        L14:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L69
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            int r0 = r0.size()
            long r0 = (long) r0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L2c
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            r0.removeFirst()
        L2c:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            r0.add(r10)
            r9.f5766f = r2
            return
        L34:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            java.lang.Object r0 = r0.getLast()
            com.autonavi.aps.amapapi.restruct.f r0 = (com.autonavi.aps.amapapi.restruct.f) r0
            double r5 = r0.f5756c
            double r7 = r10.f5756c
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L52
            double r5 = r0.f5755b
            double r7 = r10.f5755b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L52
            int r0 = r0.f5758e
            int r1 = r10.f5758e
            if (r0 == r1) goto L69
        L52:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            int r0 = r0.size()
            long r0 = (long) r0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L62
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            r0.removeFirst()
        L62:
            java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> r0 = r9.a
            r0.add(r10)
            r9.f5766f = r2
        L69:
            return
    }
}
