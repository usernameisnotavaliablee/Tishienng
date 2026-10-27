package cn.jiguang.commons.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements cn.jiguang.commons.v.a {

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f1200c;

    /* renamed from: d, reason: collision with root package name */
    private static org.json.JSONObject f1201d;
    private java.util.List a;

    class a implements cn.jiguang.commons.f.f {
        final /* synthetic */ cn.jiguang.commons.v.c a;

        a(cn.jiguang.commons.v.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.n r3) {
                r2 = this;
                java.lang.String r3 = "ICommonImpl"
                java.lang.String r0 = "onConfigFinish complete"
                cn.jiguang.commons.w.a.a(r3, r0)
                cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()
                r3.l()
                cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()
                r0 = 0
                java.lang.String r1 = "ser_done"
                r3.a(r0, r1)
                return
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.n r1 = (cn.jiguang.commons.c.n) r1
                r0.a(r1)
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.commons.v.c.f1200c = r0
            return
    }

    public c() {
            r7 = this;
            r7.<init>()
            r0 = 1
            java.util.List r0 = cn.jiguang.commons.f.g.a(r0)
            int r0 = r0.size()
            r1 = 2
            java.util.List r1 = cn.jiguang.commons.f.g.a(r1)
            int r1 = r1.size()
            r2 = 3
            java.util.List r2 = cn.jiguang.commons.f.g.a(r2)
            int r2 = r2.size()
            r3 = 4
            java.util.List r3 = cn.jiguang.commons.f.g.a(r3)
            int r3 = r3.size()
            int r4 = cn.jiguang.commons.f.g.c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "icommonimpl total data items="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " (static="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ", bulk="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", dynamic="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", realtime="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
    }

    private java.lang.Object a() {
            r5 = this;
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L12
            java.lang.String r3 = "s_c"
            r2.a(r1, r3)     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "s ctrl success"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L12
            return r1
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "s ctrl failed: "
            r3.append(r4)
            java.lang.String r4 = r2.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jiguang.commons.w.a.a(r0, r3, r2)
            return r1
    }

    private java.lang.Object a(android.os.Bundle r9, java.lang.Object[] r10) {
            r8 = this;
            if (r10 == 0) goto L82
            int r9 = r10.length     // Catch: java.lang.Throwable -> L8c
            if (r9 == 0) goto L82
            r9 = 0
            r0 = r10[r9]     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto Le
            goto L82
        Le:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8c
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L8c
            int r0 = r10.length     // Catch: java.lang.Throwable -> L8c
            r1 = 1
            if (r0 <= r1) goto L28
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L28
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L8c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            r4 = 2
            if (r0 <= r4) goto L3c
            r4 = r10[r4]     // Catch: java.lang.Throwable -> L8c
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L3c
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L3c
            r4 = 1
            goto L3d
        L3c:
            r4 = 0
        L3d:
            r5 = 3
            if (r0 <= r5) goto L50
            r5 = r10[r5]     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L50
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L8c
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            r6 = 4
            if (r0 <= r6) goto L64
            r6 = r10[r6]     // Catch: java.lang.Throwable -> L8c
            boolean r7 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L64
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L64
            r6 = 1
            goto L65
        L64:
            r6 = 0
        L65:
            r7 = 5
            if (r0 <= r7) goto L78
            r10 = r10[r7]     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r10 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L78
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r10 == 0) goto L78
            r7 = 1
            goto L79
        L78:
            r7 = 0
        L79:
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8c
            return r9
        L82:
            java.lang.String r9 = "ICommonImpl"
            java.lang.String r10 = "invalid args for check config with rp enable"
            cn.jiguang.commons.w.a.f(r9, r10)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            return r9
        L8c:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
    }

    private java.lang.Object a(java.lang.String r1, android.os.Bundle r2, java.lang.Object[] r3) {
            r0 = this;
            android.text.TextUtils.isEmpty(r1)
            r1 = 0
            return r1
    }

    private java.util.Map a(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12
            r0.<init>(r4)     // Catch: java.lang.Exception -> L12
            java.util.Map r4 = cn.jiguang.commons.L.ad.a(r0)     // Catch: java.lang.Exception -> L12
            return r4
        L12:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "parse headers failed: "
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.w.a.f(r0, r4)
            return r1
    }

    private void a(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "ICommonImpl"
            java.lang.String r1 = "connected"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L50
            boolean r4 = r4.getBoolean(r1)     // Catch: java.lang.Exception -> L2a
            cn.jiguang.commons.h.i r1 = cn.jiguang.commons.h.i.c()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L32
            boolean r4 = r1.f()     // Catch: java.lang.Exception -> L2a
            if (r4 != 0) goto L2c
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L2a
            boolean r4 = r4.o()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = "connection"
            r3.c(r4)     // Catch: java.lang.Exception -> L2a
            return
        L2a:
            r4 = move-exception
            goto L38
        L2c:
            java.lang.String r4 = "data collection scheduler not started - already running or user not logged in"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L2a
            return
        L32:
            java.lang.String r4 = "disconnection"
            r3.d(r4)     // Catch: java.lang.Exception -> L2a
            return
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to handle connection state:"
            r1.append(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r4)
        L50:
            return
    }

    private java.lang.Object c(android.os.Bundle r4) {
            r3 = this;
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "handling cmd_init - requesting config"
            java.lang.String r1 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.v.c.f1200c     // Catch: java.lang.Exception -> L1a
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1c
            java.lang.String r0 = "already initialized, skipping cmd_init"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L1a
            return r4
        L1a:
            r4 = move-exception
            goto L34
        L1c:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.v.c.f1200c     // Catch: java.lang.Exception -> L1a
            r2 = 1
            r0.set(r2)     // Catch: java.lang.Exception -> L1a
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L1a
            cn.jiguang.commons.v.c$a r2 = new cn.jiguang.commons.v.c$a     // Catch: java.lang.Exception -> L1a
            r2.<init>(r3)     // Catch: java.lang.Exception -> L1a
            r0.c(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = "initialization complete"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L1a
            return r4
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "error during initialization:"
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jiguang.commons.w.a.c(r1, r4)
            r4 = 0
            return r4
    }

    private java.util.List c(android.os.Bundle r2, java.lang.Object[] r3) {
            r1 = this;
            java.util.List r2 = r1.a     // Catch: java.lang.Exception -> Ld
            if (r2 == 0) goto Lf
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> Ld
            if (r2 != 0) goto Lf
        La:
            java.util.List r2 = r1.a     // Catch: java.lang.Exception -> Ld
            return r2
        Ld:
            r2 = move-exception
            goto L46
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Ld
            r2.<init>()     // Catch: java.lang.Exception -> Ld
            r1.a = r2     // Catch: java.lang.Exception -> Ld
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Ld
            r3 = 1100(0x44c, float:1.541E-42)
            java.util.List r2 = r2.c(r3)     // Catch: java.lang.Exception -> Ld
            if (r2 == 0) goto La
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> Ld
            if (r3 == 0) goto L29
            goto La
        L29:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Ld
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Ld
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Ld
            cn.jiguang.commons.c.e r3 = (cn.jiguang.commons.c.e) r3     // Catch: java.lang.Exception -> Ld
            if (r3 == 0) goto L2d
            java.lang.String r3 = r3.f1007c     // Catch: java.lang.Exception -> Ld
            if (r3 != 0) goto L40
            goto L2d
        L40:
            java.util.List r0 = r1.a     // Catch: java.lang.Exception -> Ld
            r0.add(r3)     // Catch: java.lang.Exception -> Ld
            goto L2d
        L46:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "get ap error:"
            r3.append(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r0, r3, r2)
            r2 = 0
            return r2
    }

    private void c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.h.i r1 = cn.jiguang.commons.h.i.c()     // Catch: java.lang.Exception -> L21
            boolean r2 = r1.f()     // Catch: java.lang.Exception -> L21
            if (r2 != 0) goto L23
            r1.i()     // Catch: java.lang.Exception -> L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            r1.<init>()     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "data collection scheduler started due to "
            r1.append(r2)     // Catch: java.lang.Exception -> L21
        L19:
            r1.append(r4)     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L21
            goto L2e
        L21:
            r4 = move-exception
            goto L32
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            r1.<init>()     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "data collection scheduler already running after "
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            goto L19
        L2e:
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L21
            return
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to start data collection scheduler:"
            r1.append(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r4)
            return
    }

    private java.lang.Object d(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            java.lang.String r2 = "ds"
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.Exception -> L15
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L17
            java.lang.String r5 = "s cd params empty"
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Exception -> L15
            return r1
        L15:
            r5 = move-exception
            goto L2f
        L17:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L15
            r2.<init>(r5)     // Catch: java.lang.Exception -> L15
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = "s_c"
            r5.a(r1, r3)     // Catch: java.lang.Exception -> L15
            cn.jiguang.commons.D.a r5 = cn.jiguang.commons.D.a.c()     // Catch: java.lang.Exception -> L15
            r3 = 86
            r5.a(r3, r2)     // Catch: java.lang.Exception -> L15
            return r1
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "s cd failed: "
            r2.append(r3)
            java.lang.String r3 = r5.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2, r5)
            return r1
    }

    private java.lang.Object d(android.os.Bundle r3, java.lang.Object[] r4) {
            r2 = this;
            r3 = 0
            if (r4 == 0) goto L12
            int r0 = r4.length     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L12
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L27
            boolean r0 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L12
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L27
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Throwable -> L27
        L12:
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L27
            java.lang.Class<cn.jiguang.commons.c.g> r0 = cn.jiguang.commons.c.g.class
            r1 = 1200(0x4b0, float:1.682E-42)
            java.lang.Object r3 = r4.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.c.g r3 = (cn.jiguang.commons.c.g) r3     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L27
            org.json.JSONObject r3 = r3.a()     // Catch: java.lang.Throwable -> L27
            return r3
        L27:
            r3 = 0
            return r3
    }

    private void d(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.h.i r1 = cn.jiguang.commons.h.i.c()     // Catch: java.lang.Exception -> L1e
            r1.j()     // Catch: java.lang.Exception -> L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1e
            r1.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r2 = "data collection scheduler stopped due to "
            r1.append(r2)     // Catch: java.lang.Exception -> L1e
            r1.append(r4)     // Catch: java.lang.Exception -> L1e
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L1e
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to stop data collection scheduler:"
            r1.append(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r4)
            return
    }

    private java.lang.Object e(android.os.Bundle r7) {
            r6 = this;
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            java.lang.String r2 = "m"
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "u"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> L31
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L31
            if (r4 != 0) goto L33
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L31
            if (r4 == 0) goto L1c
            goto L33
        L1c:
            java.lang.String r4 = "b"
            byte[] r4 = r7.getByteArray(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "h"
            java.lang.String r7 = r7.getString(r5)     // Catch: java.lang.Exception -> L31
            java.util.Map r7 = r6.a(r7)     // Catch: java.lang.Exception -> L31
            cn.jiguang.internal.Hr r7 = cn.jiguang.commons.z.e.a(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L31
            return r7
        L31:
            r7 = move-exception
            goto L39
        L33:
            java.lang.String r7 = "s https params invalid"
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Exception -> L31
            return r1
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "s https failed: "
            r2.append(r3)
            java.lang.String r3 = r7.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2, r7)
            return r1
    }

    private org.json.JSONObject e(android.os.Bundle r3, java.lang.Object[] r4) {
            r2 = this;
            r3 = 0
            if (r4 == 0) goto L3e
            int r0 = r4.length
            if (r0 != 0) goto L7
            goto L3e
        L7:
            r0 = 0
            r4 = r4[r0]
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.c.i r4 = r0.a(r4)     // Catch: java.lang.Exception -> L23
            if (r4 == 0) goto L3e
            org.json.JSONObject r3 = r4.k()     // Catch: java.lang.Exception -> L23
            return r3
        L23:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getConfig error:"
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r1, r0, r4)
        L3e:
            return r3
    }

    private java.lang.Object f(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            java.lang.String r2 = "ds"
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.Exception -> L15
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L17
            java.lang.String r5 = "s report params empty"
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Exception -> L15
            return r1
        L15:
            r5 = move-exception
            goto L31
        L17:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L15
            r2.<init>()     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = "data"
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L15
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = "xlog"
            r5.a(r2, r3)     // Catch: java.lang.Exception -> L15
            java.lang.String r5 = "s report success"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L15
            return r1
        L31:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "s report failed: "
            r2.append(r3)
            java.lang.String r3 = r5.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2, r5)
            return r1
    }

    private org.json.JSONObject f(android.os.Bundle r3, java.lang.Object[] r4) {
            r2 = this;
            org.json.JSONObject r3 = cn.jiguang.commons.v.c.f1201d
            if (r3 == 0) goto Ld
            int r3 = r3.length()
            if (r3 <= 0) goto Ld
            org.json.JSONObject r3 = cn.jiguang.commons.v.c.f1201d
            return r3
        Ld:
            r3 = 0
            if (r4 == 0) goto L22
            int r0 = r4.length     // Catch: java.lang.Exception -> L20
            if (r0 <= 0) goto L22
            r4 = r4[r3]     // Catch: java.lang.Exception -> L20
            boolean r0 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L22
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L20
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L20
            goto L23
        L20:
            r3 = move-exception
            goto L44
        L22:
            r4 = 0
        L23:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L20
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L20
            r1 = 0
            if (r0 != 0) goto L31
            return r1
        L31:
            cn.jiguang.commons.H.c r0 = cn.jiguang.commons.H.c.c()     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = r0.a(r4, r3)     // Catch: java.lang.Exception -> L20
            if (r3 != 0) goto L3c
            return r1
        L3c:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L20
            r4.<init>(r3)     // Catch: java.lang.Exception -> L20
            cn.jiguang.commons.v.c.f1201d = r4     // Catch: java.lang.Exception -> L20
            goto L5e
        L44:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "getDeviceInfo error:"
            r4.append(r0)
            java.lang.String r0 = r3.getMessage()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r0, r4, r3)
        L5e:
            org.json.JSONObject r3 = cn.jiguang.commons.v.c.f1201d
            return r3
    }

    private android.os.Bundle g(android.os.Bundle r6, java.lang.Object[] r7) {
            r5 = this;
            r6 = 0
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            if (r7 == 0) goto L18
            int r2 = r7.length     // Catch: java.lang.Exception -> L16
            if (r2 <= 0) goto L18
            r7 = r7[r1]     // Catch: java.lang.Exception -> L16
            boolean r2 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L18
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L16
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L16
            goto L19
        L16:
            r7 = move-exception
            goto L6f
        L18:
            r7 = 0
        L19:
            if (r7 == 0) goto L2a
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L16
            java.lang.Class<cn.jiguang.commons.c.j> r3 = cn.jiguang.commons.c.j.class
            r4 = 1502(0x5de, float:2.105E-42)
            java.lang.Object r2 = r2.a(r3, r4, r7)     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.c.j r2 = (cn.jiguang.commons.c.j) r2     // Catch: java.lang.Exception -> L16
            goto L32
        L2a:
            cn.jiguang.commons.L.q r2 = cn.jiguang.commons.L.q.g()     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.c.j r2 = r2.h()     // Catch: java.lang.Exception -> L16
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r3.<init>()     // Catch: java.lang.Exception -> L16
            java.lang.String r4 = "get loc:isA="
            r3.append(r4)     // Catch: java.lang.Exception -> L16
            r3.append(r7)     // Catch: java.lang.Exception -> L16
            java.lang.String r7 = ",result="
            r3.append(r7)     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L47
            r1 = 1
        L47:
            r3.append(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Exception -> L16
            if (r2 != 0) goto L54
            return r6
        L54:
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Exception -> L16
            r7.<init>()     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "time"
            long r3 = r2.a     // Catch: java.lang.Exception -> L16
            r7.putLong(r1, r3)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "lat"
            double r3 = r2.f1047e     // Catch: java.lang.Exception -> L16
            r7.putDouble(r1, r3)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "lot"
            double r2 = r2.f1048f     // Catch: java.lang.Exception -> L16
            r7.putDouble(r1, r2)     // Catch: java.lang.Exception -> L16
            return r7
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get loc error:"
            r1.append(r2)
            java.lang.String r2 = r7.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r7)
            return r6
    }

    private android.content.pm.PackageInfo h(android.os.Bundle r7, java.lang.Object[] r8) {
            r6 = this;
            r7 = 0
            if (r8 == 0) goto L7a
            int r0 = r8.length     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L8
            goto L7a
        L8:
            r0 = 0
            r1 = r8[r0]     // Catch: java.lang.Throwable -> L38
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L7a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L38
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L18
            return r7
        L18:
            boolean r2 = cn.jiguang.commons.L.t.d(r1)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.commons.v.c.f1200c     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L27
            if (r2 != 0) goto L27
            return r7
        L27:
            int r3 = r8.length     // Catch: java.lang.Throwable -> L38
            r4 = 1
            if (r3 <= r4) goto L3a
            r3 = r8[r4]     // Catch: java.lang.Throwable -> L38
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L38
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r8 = move-exception
            goto L60
        L3a:
            r3 = 0
        L3b:
            int r4 = r8.length     // Catch: java.lang.Throwable -> L38
            r5 = 2
            if (r4 <= r5) goto L4b
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L38
            boolean r4 = r8 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L4b
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L38
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L38
        L4b:
            if (r2 == 0) goto L4e
            goto L5b
        L4e:
            cn.jiguang.commons.g.l r8 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Throwable -> L38
            r2 = 1105(0x451, float:1.548E-42)
            boolean r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto L5b
            return r7
        L5b:
            android.content.pm.PackageInfo r7 = cn.jiguang.commons.L.t.a(r1, r0, r3)     // Catch: java.lang.Throwable -> L38
            return r7
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get pkg info error:"
            r0.append(r1)
            java.lang.String r1 = r8.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r1, r0, r8)
        L7a:
            return r7
    }

    private java.util.List i(android.os.Bundle r5, java.lang.Object[] r6) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L15
            int r0 = r6.length     // Catch: java.lang.Exception -> L13
            if (r0 <= 0) goto L15
            r0 = r6[r5]     // Catch: java.lang.Exception -> L13
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L13
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L13
            goto L16
        L13:
            r5 = move-exception
            goto L67
        L15:
            r0 = 0
        L16:
            if (r6 == 0) goto L29
            int r1 = r6.length     // Catch: java.lang.Exception -> L13
            r2 = 1
            if (r1 <= r2) goto L29
            r6 = r6[r2]     // Catch: java.lang.Exception -> L13
            boolean r1 = r6 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto L29
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L13
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L13
            goto L2b
        L29:
            r6 = 10
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L13
            r1.<init>()     // Catch: java.lang.Exception -> L13
            java.util.List r0 = cn.jiguang.commons.I.d.c(r0)     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L66
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L13
            if (r2 == 0) goto L3d
            goto L66
        L3d:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L13
        L41:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L13
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L13
            cn.jiguang.commons.c.k r2 = (cn.jiguang.commons.c.k) r2     // Catch: java.lang.Exception -> L13
            if (r2 == 0) goto L41
            java.lang.String r3 = r2.f1054c     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L54
            goto L41
        L54:
            if (r5 < r6) goto L57
            goto L66
        L57:
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L5e
            goto L41
        L5e:
            int r5 = r5 + 1
            java.lang.String r2 = r2.f1054c     // Catch: java.lang.Exception -> L13
            r1.add(r2)     // Catch: java.lang.Exception -> L13
            goto L41
        L66:
            return r1
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "get wf error:"
            r6.append(r0)
            java.lang.String r0 = r5.getMessage()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r0, r6, r5)
            r5 = 0
            return r5
    }

    private java.lang.Object j(android.os.Bundle r3, java.lang.Object[] r4) {
            r2 = this;
            r4 = 0
            org.json.JSONObject r3 = cn.jiguang.commons.e.l.a(r3)     // Catch: java.lang.Exception -> L16
            if (r3 != 0) goto L8
            return r4
        L8:
            java.lang.String r0 = "cmd"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.D.a r1 = cn.jiguang.commons.D.a.c()     // Catch: java.lang.Exception -> L16
            r1.a(r0, r3)     // Catch: java.lang.Exception -> L16
            return r4
        L16:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handle cmd error:"
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r1, r0, r3)
            return r4
    }

    private java.lang.Object k(android.os.Bundle r6, java.lang.Object... r7) {
            r5 = this;
            java.lang.String r6 = "ICommonImpl"
            r0 = 0
            r1 = 0
            r0 = r7[r0]     // Catch: java.lang.Exception -> L30
            boolean r2 = r0 instanceof java.util.Map     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L33
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L30
            boolean r7 = r0.isEmpty()     // Catch: java.lang.Exception -> L30
            if (r7 == 0) goto L13
            return r1
        L13:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "rd: map "
            r7.append(r2)     // Catch: java.lang.Exception -> L30
            r7.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.a(r6, r7)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.g.n r7 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L30
            java.util.Map r6 = r7.a(r0)     // Catch: java.lang.Exception -> L30
            return r6
        L30:
            r7 = move-exception
            goto Lbb
        L33:
            boolean r2 = r0 instanceof java.util.Set     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L5d
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Exception -> L30
            boolean r7 = r0.isEmpty()     // Catch: java.lang.Exception -> L30
            if (r7 == 0) goto L40
            return r1
        L40:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "rd: set "
            r7.append(r2)     // Catch: java.lang.Exception -> L30
            r7.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.a(r6, r7)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.g.n r7 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L30
            java.util.Map r6 = r7.a(r0)     // Catch: java.lang.Exception -> L30
            return r6
        L5d:
            boolean r2 = r0 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto Ld3
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L30
            int r2 = r7.length     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "rd: "
            r4 = 1
            if (r2 <= r4) goto L9c
            r7 = r7[r4]     // Catch: java.lang.Exception -> L30
            boolean r2 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L9c
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L30
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r2.<init>()     // Catch: java.lang.Exception -> L30
            r2.append(r3)     // Catch: java.lang.Exception -> L30
            r2.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = ", cmd:"
            r2.append(r3)     // Catch: java.lang.Exception -> L30
            r2.append(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.a(r6, r2)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L30
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L30
            java.lang.Object r6 = r2.a(r0, r7)     // Catch: java.lang.Exception -> L30
            return r6
        L9c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L30
            r7.append(r3)     // Catch: java.lang.Exception -> L30
            r7.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.a(r6, r7)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.g.n r7 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L30
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L30
            java.lang.Object r6 = r7.a(r0)     // Catch: java.lang.Exception -> L30
            return r6
        Lbb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "error during data retrieval:"
            r0.append(r2)
            java.lang.String r2 = r7.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r6, r0, r7)
        Ld3:
            return r1
    }

    private java.lang.Object l(android.os.Bundle r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.String r3 = "handling cmd_on_login - starting heartbeat"
            java.lang.String r4 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r4, r3)
            java.lang.String r3 = "login"
            r2.c(r3)     // Catch: java.lang.Exception -> L15
            cn.jiguang.commons.z.f.g()     // Catch: java.lang.Exception -> L15
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error during login:"
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r4, r0, r3)
            r3 = 0
            return r3
    }

    private java.lang.Object m(android.os.Bundle r4, java.lang.Object... r5) {
            r3 = this;
            java.lang.String r4 = "handling cmd_on_register"
            java.lang.String r5 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r5, r4)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2e
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "rtime"
            r4.c(r2, r0)     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r4.<init>()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "registration time recorded:"
            r4.append(r2)     // Catch: java.lang.Exception -> L2e
            r4.append(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r5, r4)     // Catch: java.lang.Exception -> L2e
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L2e
            return r4
        L2e:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error during registration:"
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r5, r0, r4)
            r4 = 0
            return r4
    }

    private java.lang.Object n(android.os.Bundle r4, java.lang.Object[] r5) {
            r3 = this;
            r5 = 0
            java.lang.String r0 = "ICommonImpl"
            if (r4 != 0) goto Lb
            java.lang.String r4 = "so bundle is null"
            cn.jiguang.commons.w.a.f(r0, r4)
            return r5
        Lb:
            java.lang.String r1 = "sm"
            r2 = -1
            int r1 = r4.getInt(r1, r2)     // Catch: java.lang.Exception -> L33
            r2 = 1
            if (r1 == r2) goto L44
            r2 = 2
            if (r1 == r2) goto L3f
            r2 = 3
            if (r1 == r2) goto L3a
            r4 = 4
            if (r1 == r4) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r4.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "unknown so method: "
            r4.append(r2)     // Catch: java.lang.Exception -> L33
            r4.append(r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L33
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L33
            return r5
        L33:
            r4 = move-exception
            goto L49
        L35:
            java.lang.Object r4 = r3.a()     // Catch: java.lang.Exception -> L33
            return r4
        L3a:
            java.lang.Object r4 = r3.d(r4)     // Catch: java.lang.Exception -> L33
            return r4
        L3f:
            java.lang.Object r4 = r3.e(r4)     // Catch: java.lang.Exception -> L33
            return r4
        L44:
            java.lang.Object r4 = r3.f(r4)     // Catch: java.lang.Exception -> L33
            return r4
        L49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s handle error: "
            r1.append(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r4)
            return r5
    }

    private java.lang.Object o(android.os.Bundle r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.String r4 = "handling cmd_sync_config"
            java.lang.String r0 = "ICommonImpl"
            cn.jiguang.commons.w.a.a(r0, r4)
            if (r3 == 0) goto Lf
            r2.a(r3)     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            cn.jiguang.commons.f.k r4 = cn.jiguang.commons.f.k.a()     // Catch: java.lang.Exception -> Ld
            r4.d(r3)     // Catch: java.lang.Exception -> Ld
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld
            return r3
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "error during config sync:"
            r4.append(r1)
            java.lang.String r1 = r3.getMessage()
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            cn.jiguang.commons.w.a.a(r0, r4, r3)
            r3 = 0
            return r3
    }

    private java.lang.Object p(android.os.Bundle r1, java.lang.Object[] r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.size()
        L5:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.commons.v.a
    public java.lang.Object a(android.content.Context r4, int r5, java.lang.String r6, android.os.Bundle r7, java.lang.Object... r8) {
            r3 = this;
            java.lang.String r0 = "ICommonImpl"
            r1 = 0
            cn.jiguang.commons.L.h.a(r4)     // Catch: java.lang.Exception -> L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r4.<init>()     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = "processing command:"
            r4.append(r2)     // Catch: java.lang.Exception -> L42
            r4.append(r5)     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = ", action:"
            r4.append(r2)     // Catch: java.lang.Exception -> L42
            r4.append(r6)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L42
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L42
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L42
            r4.a(r7)     // Catch: java.lang.Exception -> L42
            r4 = 0
            switch(r5) {
                case 10: goto Lcc;
                case 11: goto Lc5;
                case 12: goto Lbe;
                case 13: goto Lb7;
                case 14: goto L59;
                case 15: goto L54;
                case 16: goto L4f;
                case 17: goto L4a;
                case 18: goto L59;
                case 19: goto L59;
                case 20: goto L59;
                case 21: goto L59;
                case 22: goto L59;
                case 23: goto L2d;
                case 24: goto L59;
                case 25: goto L45;
                case 26: goto L59;
                case 27: goto L59;
                default: goto L2d;
            }     // Catch: java.lang.Exception -> L42
        L2d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r4.<init>()     // Catch: java.lang.Exception -> L42
            java.lang.String r6 = "unknown command:"
            r4.append(r6)     // Catch: java.lang.Exception -> L42
            r4.append(r5)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L42
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L42
            return r1
        L42:
            r4 = move-exception
            goto Ld1
        L45:
            java.lang.Object r4 = r3.a(r6, r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L4a:
            android.content.pm.PackageInfo r4 = r3.h(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L4f:
            java.lang.Object r4 = r3.j(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L54:
            java.lang.Object r4 = r3.p(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L59:
            java.util.concurrent.atomic.AtomicBoolean r4 = cn.jiguang.commons.v.c.f1200c     // Catch: java.lang.Exception -> L42
            boolean r4 = r4.get()     // Catch: java.lang.Exception -> L42
            if (r4 != 0) goto L76
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r4.<init>()     // Catch: java.lang.Exception -> L42
            java.lang.String r6 = "sdk not initialized, cmd="
            r4.append(r6)     // Catch: java.lang.Exception -> L42
            r4.append(r5)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L42
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L42
            return r1
        L76:
            r4 = 14
            if (r5 == r4) goto Lb2
            r4 = 24
            if (r5 == r4) goto Lad
            r4 = 26
            if (r5 == r4) goto La8
            r4 = 27
            if (r5 == r4) goto La3
            switch(r5) {
                case 18: goto L9e;
                case 19: goto L99;
                case 20: goto L94;
                case 21: goto L8f;
                case 22: goto L8a;
                default: goto L89;
            }     // Catch: java.lang.Exception -> L42
        L89:
            return r1
        L8a:
            java.util.List r4 = r3.i(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L8f:
            org.json.JSONObject r4 = r3.f(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L94:
            java.util.List r4 = r3.c(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L99:
            android.os.Bundle r4 = r3.g(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        L9e:
            java.lang.Object r4 = r3.a(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        La3:
            java.lang.Object r4 = r3.d(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        La8:
            java.lang.Object r4 = r3.n(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        Lad:
            org.json.JSONObject r4 = r3.e(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        Lb2:
            java.lang.Object r4 = r3.k(r7, r8)     // Catch: java.lang.Exception -> L42
            return r4
        Lb7:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r3.l(r7, r4)     // Catch: java.lang.Exception -> L42
            return r4
        Lbe:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r3.m(r7, r4)     // Catch: java.lang.Exception -> L42
            return r4
        Lc5:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r3.o(r7, r4)     // Catch: java.lang.Exception -> L42
            return r4
        Lcc:
            java.lang.Object r4 = r3.c(r7)     // Catch: java.lang.Exception -> L42
            return r4
        Ld1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onEvent error:"
            r5.append(r6)
            java.lang.String r6 = r4.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.commons.w.a.a(r0, r5, r4)
            return r1
    }
}
