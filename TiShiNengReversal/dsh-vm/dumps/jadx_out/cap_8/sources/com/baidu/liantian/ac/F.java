package com.baidu.liantian.ac;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class F implements com.baidu.liantian.ac.FI {
    private static com.baidu.liantian.ac.F instance;
    private static com.baidu.liantian.jni.Asc sAsc;

    private F() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.baidu.liantian.ac.F getInstance() {
            java.lang.Class<com.baidu.liantian.ac.F> r0 = com.baidu.liantian.ac.F.class
            monitor-enter(r0)
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.instance     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.baidu.liantian.ac.F r1 = new com.baidu.liantian.ac.F     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.baidu.liantian.ac.F.instance = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.instance     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.baidu.liantian.ac.FI
    public byte[] ad(byte[] r5, byte[] r6) {
            r4 = this;
            java.lang.String r0 = "5"
            r1 = 0
            if (r6 == 0) goto L49
            int r2 = r6.length     // Catch: java.lang.Throwable -> L46
            if (r2 <= 0) goto L49
            if (r5 == 0) goto L49
            int r2 = r5.length     // Catch: java.lang.Throwable -> L46
            if (r2 > 0) goto Le
            goto L49
        Le:
            java.lang.String r2 = "3"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L46
            r2 = 1
            byte[] r2 = com.baidu.liantian.b.a.a(r6, r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L46
            if (r3 <= 0) goto L1e
            return r2
        L1e:
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L29
            com.baidu.liantian.jni.Asc r2 = new com.baidu.liantian.jni.Asc     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            com.baidu.liantian.ac.F.sAsc = r2     // Catch: java.lang.Throwable -> L46
        L29:
            java.lang.String r2 = "4"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L46
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L3f
            byte[] r5 = r2.dc(r5, r6)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L3b
            int r6 = r5.length     // Catch: java.lang.Throwable -> L46
            if (r6 != 0) goto L3a
            goto L3b
        L3a:
            return r5
        L3b:
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L3f:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L46
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L46
            return r1
        L46:
            com.baidu.liantian.b.e.a()
        L49:
            return r1
    }

    @Override // com.baidu.liantian.ac.FI
    public byte[] ae(byte[] r5, byte[] r6) {
            r4 = this;
            java.lang.String r0 = "2"
            r1 = 0
            if (r6 == 0) goto L48
            int r2 = r6.length     // Catch: java.lang.Throwable -> L45
            if (r2 <= 0) goto L48
            if (r5 == 0) goto L48
            int r2 = r5.length     // Catch: java.lang.Throwable -> L45
            if (r2 > 0) goto Le
            goto L48
        Le:
            java.lang.String r2 = "0"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.baidu.liantian.b.a.a(r6, r5)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L1d
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r3 <= 0) goto L1d
            return r2
        L1d:
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L28
            com.baidu.liantian.jni.Asc r2 = new com.baidu.liantian.jni.Asc     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.F.sAsc = r2     // Catch: java.lang.Throwable -> L45
        L28:
            java.lang.String r2 = "1"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L3e
            byte[] r5 = r2.ac(r5, r6)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L3a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L45
            if (r6 != 0) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L45
            return r5
        L3e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L45
            return r1
        L45:
            com.baidu.liantian.b.e.a()
        L48:
            return r1
    }

    @Override // com.baidu.liantian.ac.FI
    public boolean chh(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = com.baidu.liantian.b.e.a(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            com.baidu.liantian.b.e.a()
            r1 = 0
            return r1
    }

    @Override // com.baidu.liantian.ac.FI
    public void cm(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.baidu.liantian.ac.Callback r8, java.lang.Class<?>[] r9, java.lang.Object... r10) {
            r4 = this;
            java.util.Objects.toString(r8)     // Catch: java.lang.Throwable -> L88
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L88
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L88
            r1 = 0
            if (r0 != 0) goto L80
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L80
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L1a
            goto L80
        L1a:
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L28
            if (r8 == 0) goto L87
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            r8.onEnd(r5)     // Catch: java.lang.Throwable -> L88
            return
        L28:
            com.baidu.liantian.core.ApkInfo r6 = r0.d(r6)     // Catch: java.lang.Throwable -> L88
            com.baidu.liantian.core.ApkInfo r5 = r0.d(r5)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L78
            if (r6 != 0) goto L35
            goto L78
        L35:
            java.lang.ClassLoader r5 = r6.classLoader     // Catch: java.lang.Throwable -> L69
            com.baidu.liantian.core.f r5 = (com.baidu.liantian.core.f) r5     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.Class r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = "getInstance"
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L69
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r1] = r3     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r6 = r5.getDeclaredMethod(r6, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L69
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r6.invoke(r5, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = com.baidu.liantian.b.e.a(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L69
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L69
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L87
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L69
            r6[r1] = r5     // Catch: java.lang.Throwable -> L69
            r8.onEnd(r6)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r5 = move-exception
            r5.getMessage()     // Catch: java.lang.Throwable -> L88
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L87
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            r8.onEnd(r5)     // Catch: java.lang.Throwable -> L88
            goto L87
        L78:
            if (r8 == 0) goto L87
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            r8.onEnd(r5)     // Catch: java.lang.Throwable -> L88
            return
        L80:
            if (r8 == 0) goto L87
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            r8.onEnd(r5)     // Catch: java.lang.Throwable -> L88
        L87:
            return
        L88:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public android.util.Pair<java.lang.Integer, java.lang.Object> cmsi(int r3, java.lang.String r4, java.lang.Class<?>[] r5, java.lang.Object... r6) {
            r2 = this;
            r0 = 0
            com.baidu.liantian.core.d r1 = com.baidu.liantian.core.d.a()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L12
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L17
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L17
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L12:
            android.util.Pair r3 = r1.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            com.baidu.liantian.b.e.a()
            android.util.Pair r3 = new android.util.Pair
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r0)
            return r3
    }

    @Override // com.baidu.liantian.ac.FI
    public java.util.Map<java.lang.Integer, java.lang.String> gpd() {
            r1 = this;
            com.baidu.liantian.a.a r0 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            java.util.Map r0 = r0.b()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            com.baidu.liantian.b.e.a()
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.baidu.liantian.ac.FI
    public java.lang.String gs(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            com.baidu.liantian.core.g r1 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L9
            return r0
        L9:
            com.baidu.liantian.core.ApkInfo r3 = r1.d(r3)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L12
            java.lang.String r3 = r3.libPath     // Catch: java.lang.Throwable -> L13
            return r3
        L12:
            return r0
        L13:
            com.baidu.liantian.b.e.a()
            return r0
    }

    @Override // com.baidu.liantian.ac.FI
    public java.lang.String p(java.lang.String r2) {
            r1 = this;
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L13
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r0.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L13
            com.baidu.liantian.core.ApkInfo r2 = (com.baidu.liantian.core.ApkInfo) r2     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.String r2 = r2.pkgPath     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            com.baidu.liantian.b.e.a()
            java.lang.String r2 = ""
            return r2
    }

    @Override // com.baidu.liantian.ac.FI
    public void r(java.lang.String r4, android.content.IntentFilter r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = "android.intent.action.BOOT_COMPLETED"
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L72
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L72
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L71
            if (r5 == 0) goto L71
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L71
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L1d
            goto L71
        L1d:
            com.baidu.liantian.core.g r1 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L72
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L72
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L71
            com.baidu.liantian.core.h r2 = new com.baidu.liantian.core.h     // Catch: java.lang.Throwable -> L72
            r2.<init>(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            r1.a(r2)     // Catch: java.lang.Throwable -> L72
            r5.hasAction(r0)     // Catch: java.lang.Throwable -> L72
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L72
            boolean r5 = r5.hasAction(r0)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L71
            com.baidu.liantian.a.a r5 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L72
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L72
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L71
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "r"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L72
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "b"
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = "t"
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L72
            android.database.sqlite.SQLiteDatabase r5 = r5.f5903c     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = "tbchliantian"
            java.lang.String r7 = "p=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L6e
            r5.update(r6, r0, r7, r4)     // Catch: java.lang.Throwable -> L6e
            return
        L6e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L72
        L71:
            return
        L72:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public byte[] rd(byte[] r4, byte[] r5) {
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            int r1 = r5.length     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2f
            if (r4 == 0) goto L2f
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2c
            if (r1 > 0) goto Lc
            goto L2f
        Lc:
            byte[] r1 = com.baidu.liantian.b.h.a(r4, r5)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L16
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c
            if (r2 <= 0) goto L16
            return r1
        L16:
            com.baidu.liantian.jni.Asc r1 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L21
            com.baidu.liantian.jni.Asc r1 = new com.baidu.liantian.jni.Asc     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            com.baidu.liantian.ac.F.sAsc = r1     // Catch: java.lang.Throwable -> L2c
        L21:
            com.baidu.liantian.jni.Asc r1 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L28
            byte[] r4 = r1.dr(r4, r5)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            com.baidu.liantian.b.e.a()
        L2f:
            return r0
    }

    @Override // com.baidu.liantian.ac.FI
    public byte[] re(byte[] r5, byte[] r6) {
            r4 = this;
            java.lang.String r0 = "8"
            r1 = 0
            if (r6 == 0) goto L48
            int r2 = r6.length     // Catch: java.lang.Throwable -> L45
            if (r2 <= 0) goto L48
            if (r5 == 0) goto L48
            int r2 = r5.length     // Catch: java.lang.Throwable -> L45
            if (r2 > 0) goto Le
            goto L48
        Le:
            java.lang.String r2 = "6"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.baidu.liantian.b.h.a(r5, r6)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L1d
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r3 <= 0) goto L1d
            return r2
        L1d:
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L28
            com.baidu.liantian.jni.Asc r2 = new com.baidu.liantian.jni.Asc     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.F.sAsc = r2     // Catch: java.lang.Throwable -> L45
        L28:
            java.lang.String r2 = "7"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.jni.Asc r2 = com.baidu.liantian.ac.F.sAsc     // Catch: java.lang.Throwable -> L3e
            byte[] r5 = r2.ar(r5, r6)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L3a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L45
            if (r6 != 0) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L45
            return r5
        L3e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L45
            return r1
        L45:
            com.baidu.liantian.b.e.a()
        L48:
            return r1
    }

    @Override // com.baidu.liantian.ac.FI
    public void rf(android.content.Context r4) {
            r3 = this;
            com.baidu.liantian.ac.U r0 = new com.baidu.liantian.ac.U     // Catch: java.lang.Throwable -> L13
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L13
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L13
            r1 = 5
            r2 = 1
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L13
            r0.start()     // Catch: java.lang.Throwable -> L13
            return
        L13:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public void s(int r5, boolean r6) {
            r4 = this;
            com.baidu.liantian.a.a r0 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L31
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "s"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L32
            android.database.sqlite.SQLiteDatabase r6 = r0.f5903c     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "tbchliantian"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            r2.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = " and n=1"
            r2.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r6.update(r0, r1, r5, r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L32
        L31:
            return
        L32:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public void sp(java.lang.String r4, boolean r5) {
            r3 = this;
            com.baidu.liantian.a.a r0 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "s"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L24
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L24
            android.database.sqlite.SQLiteDatabase r5 = r0.f5903c     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "tbchliantian"
            java.lang.String r2 = "p=? and n=1"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L20
            r5.update(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L24
        L23:
            return
        L24:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public void u(java.lang.String r2) {
            r1 = this;
            com.baidu.liantian.core.d r0 = com.baidu.liantian.core.d.a()     // Catch: java.lang.Throwable -> L8
            r0.a(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            com.baidu.liantian.b.e.a()
            return
    }

    @Override // com.baidu.liantian.ac.FI
    public void ur(java.lang.String r3, android.content.IntentFilter r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L13
            goto L21
        L13:
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21
            com.baidu.liantian.core.h r1 = new com.baidu.liantian.core.h     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L22
            r0.b(r1)     // Catch: java.lang.Throwable -> L22
        L21:
            return
        L22:
            com.baidu.liantian.b.e.a()
            return
    }
}
