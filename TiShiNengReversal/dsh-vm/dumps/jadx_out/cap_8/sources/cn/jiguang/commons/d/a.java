package cn.jiguang.commons.D;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: cn.jiguang.commons.D.a$a, reason: collision with other inner class name */
    class C0023a implements cn.jiguang.commons.f.f {
        final /* synthetic */ cn.jiguang.commons.D.a a;

        C0023a(cn.jiguang.commons.D.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.m r2) {
                r1 = this;
                java.lang.String r2 = "TopicManager"
                java.lang.String r0 = "location config refreshed ok for cmd 79"
                cn.jiguang.commons.w.a.a(r2, r0)
                return
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.m r1 = (cn.jiguang.commons.c.m) r1
                r0.a(r1)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.D.a a = null;

        static {
                cn.jiguang.commons.D.a r0 = new cn.jiguang.commons.D.a
                r0.<init>()
                cn.jiguang.commons.D.a.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.D.a a() {
                cn.jiguang.commons.D.a r0 = cn.jiguang.commons.D.a.b.a
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(cn.jiguang.commons.C.a.g r2, long r3) {
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.a(r1)
            r0.c(r1)
            cn.jiguang.commons.f.d r0 = cn.jiguang.commons.f.d.h()
            r0.n()
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            java.lang.String r1 = "JAppActive"
            boolean r0 = r0.a(r1, r3)
            if (r0 == 0) goto L2a
            cn.jiguang.commons.E.a r0 = cn.jiguang.commons.E.a.d()
            r0.a(r2)
        L2a:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            java.lang.String r1 = "JAppActiveFile"
            boolean r3 = r0.a(r1, r3)
            if (r3 == 0) goto L3d
            cn.jiguang.commons.E.d r3 = cn.jiguang.commons.E.d.d()
            r3.a(r2)
        L3d:
            return
    }

    private void a(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "TopicManager"
            if (r0 == 0) goto Le
            java.lang.String r5 = "check empty"
        La:
            cn.jiguang.commons.w.a.f(r1, r5)
            return
        Le:
            java.lang.String r0 = cn.jiguang.commons.z.e.g()     // Catch: java.lang.Exception -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = "check so: new md5="
            r2.append(r3)     // Catch: java.lang.Exception -> L2d
            r2.append(r5)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = ", cached md5="
            r2.append(r3)     // Catch: java.lang.Exception -> L2d
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2d
            if (r3 == 0) goto L2f
            java.lang.String r3 = "empty"
            goto L30
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            r3 = r0
        L30:
            r2.append(r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2d
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L2d
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2d
            if (r2 != 0) goto L48
            boolean r5 = r5.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto L47
            goto L48
        L47:
            return
        L48:
            cn.jiguang.commons.z.d.a()     // Catch: java.lang.Exception -> L2d
            return
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "download err:"
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto La
    }

    private void a(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "TopicManager"
            if (r4 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "content"
            org.json.JSONObject r4 = r4.optJSONObject(r1)     // Catch: java.lang.Exception -> L13
            if (r4 != 0) goto L15
            java.lang.String r4 = "content null"
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r4 = move-exception
            goto L3f
        L15:
            java.lang.String r1 = "code"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Exception -> L13
            r2 = 157(0x9d, float:2.2E-43)
            if (r1 == r2) goto L3b
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 == r2) goto L37
            r2 = 159(0x9f, float:2.23E-43)
            if (r1 == r2) goto L33
            r2 = 160(0xa0, float:2.24E-43)
            if (r1 == r2) goto L2f
            r3.c(r1, r4)     // Catch: java.lang.Exception -> L13
            return
        L2f:
            r3.d(r4)     // Catch: java.lang.Exception -> L13
            return
        L33:
            r3.e(r4)     // Catch: java.lang.Exception -> L13
            return
        L37:
            r3.f(r4)     // Catch: java.lang.Exception -> L13
            return
        L3b:
            r3.c(r4)     // Catch: java.lang.Exception -> L13
            return
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "deal err:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }

    public static cn.jiguang.commons.D.a c() {
            cn.jiguang.commons.D.a r0 = cn.jiguang.commons.D.a.b.a()
            return r0
    }

    private void c(int r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "s_c"
            java.lang.String r6 = r6.optString(r0)     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r0.d()     // Catch: java.lang.Exception -> L16
            long r2 = r0.l()     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.z.f.a(r1, r2, r5, r6)     // Catch: java.lang.Exception -> L16
            return
        L16:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "code err:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "TopicManager"
            cn.jiguang.commons.w.a.f(r6, r5)
            return
    }

    private static void c(cn.jiguang.commons.C.a.g r2, long r3) {
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.d(r1)
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            java.lang.String r1 = "JAppList"
            boolean r0 = r0.a(r1, r3)
            if (r0 == 0) goto L21
            cn.jiguang.commons.E.e r3 = cn.jiguang.commons.E.e.c()
        L1d:
            r3.a(r2)
            return
        L21:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            java.lang.String r1 = "JAppListFile"
            boolean r3 = r0.a(r1, r3)
            if (r3 == 0) goto L32
            cn.jiguang.commons.E.f r3 = cn.jiguang.commons.E.f.c()
            goto L1d
        L32:
            return
    }

    private void c(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "zm"
            java.lang.String r0 = r7.optString(r0)
            java.lang.String r1 = "en"
            int r1 = r7.optInt(r1)
            java.lang.String r2 = "dy"
            int r2 = r7.optInt(r2)
            java.lang.String r3 = "ul"
            java.lang.String r7 = r7.optString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "all sdk: zm="
            r3.append(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "empty"
            if (r4 == 0) goto L2d
            r4 = r5
            goto L2e
        L2d:
            r4 = r0
        L2e:
            r3.append(r4)
            java.lang.String r4 = ", en="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", dy="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", ul="
            r3.append(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L4d
            goto L4f
        L4d:
            java.lang.String r5 = "set"
        L4f:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TopicManager"
            cn.jiguang.commons.w.a.a(r4, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L68
            java.lang.String r7 = cn.jiguang.commons.z.e.a(r7)
            cn.jiguang.commons.z.e.c(r7)
        L68:
            r7 = 0
            r3 = 1
            if (r1 != r3) goto L6e
            r1 = 1
            goto L6f
        L6e:
            r1 = 0
        L6f:
            cn.jiguang.commons.z.e.a(r1)
            if (r2 != r3) goto L75
            r7 = 1
        L75:
            cn.jiguang.commons.z.e.d(r7)
            r6.a(r0)
            return
    }

    private void d(cn.jiguang.commons.C.a.g r3, long r4) {
            r2 = this;
            c(r3, r4)
            a(r3, r4)
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "JAppMovement"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1c
            cn.jiguang.commons.E.g r0 = cn.jiguang.commons.E.g.h()     // Catch: java.lang.Exception -> L1a
            r0.a(r3)     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L7c
        L1c:
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L1a
            r1 = 1101(0x44d, float:1.543E-42)
            cn.jiguang.commons.c.i r0 = r0.a(r1)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L3b
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            boolean r0 = r1.c(r0)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L33
            goto L3b
        L33:
            cn.jiguang.commons.E.g r0 = cn.jiguang.commons.E.g.h()     // Catch: java.lang.Exception -> L1a
            r0.f()     // Catch: java.lang.Exception -> L1a
            goto L42
        L3b:
            cn.jiguang.commons.E.g r0 = cn.jiguang.commons.E.g.h()     // Catch: java.lang.Exception -> L1a
            r0.e()     // Catch: java.lang.Exception -> L1a
        L42:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "JAppProbe"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L55
            cn.jiguang.commons.E.i r0 = cn.jiguang.commons.E.i.h()     // Catch: java.lang.Exception -> L1a
            r0.a(r3)     // Catch: java.lang.Exception -> L1a
        L55:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "JAppRunning"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L68
            cn.jiguang.commons.E.j r0 = cn.jiguang.commons.E.j.c()     // Catch: java.lang.Exception -> L1a
            r0.a(r3)     // Catch: java.lang.Exception -> L1a
        L68:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "JAppSDK"
            boolean r4 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L1a
            if (r4 == 0) goto L7b
            cn.jiguang.commons.E.k r4 = cn.jiguang.commons.E.k.c()     // Catch: java.lang.Exception -> L1a
            r4.a(r3)     // Catch: java.lang.Exception -> L1a
        L7b:
            return
        L7c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "app related tasks err:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "TopicManager"
            cn.jiguang.commons.w.a.f(r4, r3)
            return
    }

    private void d(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "e_n"
            r1 = 0
            int r0 = r4.optInt(r0, r1)
            java.lang.String r2 = "s_c"
            java.lang.String r4 = r4.optString(r2)
            r2 = 1
            if (r0 != r2) goto L11
            r1 = 1
        L11:
            cn.jiguang.commons.z.e.d(r1)
            r3.a(r4)
            return
    }

    private void e(cn.jiguang.commons.C.a.g r4, long r5) {
            r3 = this;
            java.lang.String r0 = "TopicManager"
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L16
            java.lang.String r2 = "JDeviceIdMap"
            boolean r1 = r1.a(r2, r5)     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L18
            cn.jiguang.commons.H.d r1 = cn.jiguang.commons.H.d.c()     // Catch: java.lang.Exception -> L16
            r1.a(r4)     // Catch: java.lang.Exception -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L87
        L18:
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L16
            java.lang.String r2 = "JDeviceIds"
            boolean r1 = r1.a(r2, r5)     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L2b
            cn.jiguang.commons.H.e r1 = cn.jiguang.commons.H.e.c()     // Catch: java.lang.Exception -> L16
            r1.a(r4)     // Catch: java.lang.Exception -> L16
        L2b:
            cn.jiguang.commons.f.j r1 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L16
            r2 = 2900(0xb54, float:4.064E-42)
            cn.jiguang.commons.c.i r1 = r1.a(r2)     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L4a
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L16
            boolean r1 = r2.c(r1)     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L42
            goto L4a
        L42:
            cn.jiguang.commons.H.h r1 = cn.jiguang.commons.H.h.h()     // Catch: java.lang.Exception -> L16
            r1.f()     // Catch: java.lang.Exception -> L16
            goto L51
        L4a:
            cn.jiguang.commons.H.h r1 = cn.jiguang.commons.H.h.h()     // Catch: java.lang.Exception -> L16
            r1.e()     // Catch: java.lang.Exception -> L16
        L51:
            cn.jiguang.commons.K.a r1 = cn.jiguang.commons.K.a.e()     // Catch: java.lang.Exception -> L16
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L16
            r1.a(r2)     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L16
            java.lang.String r2 = "JBluetooth"
            boolean r5 = r1.a(r2, r5)     // Catch: java.lang.Exception -> L16
            if (r5 == 0) goto L7f
            cn.jiguang.commons.f.i r5 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Exception -> L16
            boolean r5 = r5.l()     // Catch: java.lang.Exception -> L16
            if (r5 != 0) goto L78
            java.lang.String r4 = "not contain jpush sdk, give up collect bluetooth"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L16
            return
        L78:
            cn.jiguang.commons.G.h r5 = cn.jiguang.commons.G.h.c()     // Catch: java.lang.Exception -> L16
            r5.a(r4)     // Catch: java.lang.Exception -> L16
        L7f:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L16
            r4.k()     // Catch: java.lang.Exception -> L16
            return
        L87:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "device info tasks err:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }

    private void e(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "e_n"
            r1 = 0
            int r3 = r3.optInt(r0, r1)
            r0 = 1
            if (r3 != r0) goto Lb
            r1 = 1
        Lb:
            cn.jiguang.commons.z.e.a(r1)
            return
    }

    private void f(cn.jiguang.commons.C.a.g r3, long r4) {
            r2 = this;
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = "JBattery"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L16
            cn.jiguang.commons.H.a r0 = cn.jiguang.commons.H.a.c()     // Catch: java.lang.Exception -> L14
            r0.a(r3)     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L2d
        L16:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = "JDevice"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L29
            cn.jiguang.commons.H.c r0 = cn.jiguang.commons.H.c.c()     // Catch: java.lang.Exception -> L14
            r0.a(r3)     // Catch: java.lang.Exception -> L14
        L29:
            r2.g(r3, r4)     // Catch: java.lang.Exception -> L14
            return
        L2d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "light tasks err:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "TopicManager"
            cn.jiguang.commons.w.a.f(r4, r3)
            return
    }

    private void f(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "s_c"
            java.lang.String r2 = r2.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L14
            java.lang.String r2 = "TopicManager"
            java.lang.String r0 = "url empty"
            cn.jiguang.commons.w.a.f(r2, r0)
            return
        L14:
            java.lang.String r2 = cn.jiguang.commons.z.e.a(r2)
            cn.jiguang.commons.z.e.c(r2)
            return
    }

    private void g(cn.jiguang.commons.C.a.g r4, long r5) {
            r3 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.j(r1)
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "JLocation"
            boolean r5 = r0.a(r2, r5)     // Catch: java.lang.Exception -> L2f
            if (r5 == 0) goto L31
            cn.jiguang.commons.I.a r5 = cn.jiguang.commons.I.a.c()     // Catch: java.lang.Exception -> L2f
            r5.a(r4)     // Catch: java.lang.Exception -> L2f
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L2f
            r5.k(r1)     // Catch: java.lang.Exception -> L2f
            cn.jiguang.commons.J.d r5 = cn.jiguang.commons.J.d.c()     // Catch: java.lang.Exception -> L2f
            r5.a(r4)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r4 = move-exception
            goto L32
        L31:
            return
        L32:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "location tasks err:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "TopicManager"
            cn.jiguang.commons.w.a.f(r5, r4)
            return
    }

    private void h(cn.jiguang.commons.C.a.g r3, long r4) {
            r2 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L35
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L35
            r0.e(r1)     // Catch: java.lang.Exception -> L35
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "JArp"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L1a
            goto L21
        L1a:
            cn.jiguang.commons.F.a r0 = cn.jiguang.commons.F.a.c()     // Catch: java.lang.Exception -> L35
            r0.a(r3)     // Catch: java.lang.Exception -> L35
        L21:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "JDeviceMac"
            boolean r0 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L37
            cn.jiguang.commons.H.g r0 = cn.jiguang.commons.H.g.c()     // Catch: java.lang.Exception -> L35
            r0.a(r3)     // Catch: java.lang.Exception -> L35
            goto L37
        L35:
            r3 = move-exception
            goto L4b
        L37:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "JDeviceIp"
            boolean r4 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L4a
            cn.jiguang.commons.H.f r4 = cn.jiguang.commons.H.f.e()     // Catch: java.lang.Exception -> L35
            r4.a(r3)     // Catch: java.lang.Exception -> L35
        L4a:
            return
        L4b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "network related tasks err:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "TopicManager"
            cn.jiguang.commons.w.a.f(r4, r3)
            return
    }

    public void a() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "rece hb time="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TopicManager"
            cn.jiguang.commons.w.a.f(r3, r2)
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.a
            r4.f(r2, r0)
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f770c
            r4.d(r2, r0)
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f771d
            r4.h(r2, r0)
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f772e
            r4.e(r2, r0)
            return
    }

    public void a(int r4, org.json.JSONObject r5) {
            r3 = this;
            r0 = 3008(0xbc0, float:4.215E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            if (r4 == r2) goto Lea
            r2 = 5
            if (r4 == r2) goto Lc5
            r2 = 9
            if (r4 == r2) goto Lbc
            r2 = 52
            if (r4 == r2) goto Lab
            r2 = 54
            if (r4 == r2) goto La1
            r2 = 74
            if (r4 == r2) goto L97
            r2 = 79
            if (r4 == r2) goto L8a
            r2 = 81
            if (r4 == r2) goto L5b
            r2 = 86
            if (r4 == r2) goto L57
            r2 = 44
            if (r4 == r2) goto L4d
            r2 = 45
            if (r4 == r2) goto Lc5
            r0 = 83
            if (r4 == r0) goto L43
            r0 = 84
            if (r4 == r0) goto L3f
            return
        L3f:
            cn.jiguang.commons.f.h.c(r5)
            return
        L43:
            cn.jiguang.commons.H.f r4 = cn.jiguang.commons.H.f.e()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f771d
            r4.c(r5)
            return
        L4d:
            cn.jiguang.commons.E.j r4 = cn.jiguang.commons.E.j.c()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f770c
            r4.c(r5)
            return
        L57:
            r3.a(r5)
            return
        L5b:
            cn.jiguang.commons.f.k r4 = cn.jiguang.commons.f.k.a()
            r5 = 2400(0x960, float:3.363E-42)
            boolean r4 = r4.a(r5)
            java.lang.String r5 = "TopicManager"
            if (r4 != 0) goto L70
            java.lang.String r4 = "user contrl bluetooth not can collect"
            cn.jiguang.commons.w.a.a(r5, r4)
            return
        L70:
            cn.jiguang.commons.f.i r4 = cn.jiguang.commons.f.i.d()
            boolean r4 = r4.l()
            if (r4 != 0) goto L80
            java.lang.String r4 = "not contain jpush sdk, give up collect bluetooth"
            cn.jiguang.commons.w.a.a(r5, r4)
            return
        L80:
            cn.jiguang.commons.G.h r4 = cn.jiguang.commons.G.h.c()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f772e
            r4.c(r5)
            return
        L8a:
            cn.jiguang.commons.J.e r4 = cn.jiguang.commons.J.e.i()
            cn.jiguang.commons.D.a$a r5 = new cn.jiguang.commons.D.a$a
            r5.<init>(r3)
            r4.a(r5)
            return
        L97:
            cn.jiguang.commons.E.k r4 = cn.jiguang.commons.E.k.c()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f770c
            r4.c(r5)
            return
        La1:
            cn.jiguang.commons.E.j r4 = cn.jiguang.commons.E.j.c()
            cn.jiguang.commons.C.a$g r0 = cn.jiguang.commons.C.a.g.f770c
            r4.a(r0, r5)
            return
        Lab:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r4.e(r1)
            cn.jiguang.commons.F.a r4 = cn.jiguang.commons.F.a.c()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f771d
            r4.c(r5)
            return
        Lbc:
            cn.jiguang.commons.E.h r4 = cn.jiguang.commons.E.h.c()
            r5 = 1
            r4.a(r5)
            return
        Lc5:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r4.j(r1)
            cn.jiguang.commons.f.k r4 = cn.jiguang.commons.f.k.a()
            r1 = 1502(0x5de, float:2.105E-42)
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto Le2
            cn.jiguang.commons.I.a r4 = cn.jiguang.commons.I.a.c()
            cn.jiguang.commons.C.a$g r0 = cn.jiguang.commons.C.a.g.a
            r4.a(r0, r5)
            return
        Le2:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r4.j(r0)
            return
        Lea:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r4.d(r1)
            cn.jiguang.commons.f.k r4 = cn.jiguang.commons.f.k.a()
            r5 = 1100(0x44c, float:1.541E-42)
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L107
            cn.jiguang.commons.E.e r4 = cn.jiguang.commons.E.e.c()
            cn.jiguang.commons.C.a$g r5 = cn.jiguang.commons.C.a.g.f770c
            r4.c(r5)
            return
        L107:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r4.d(r0)
            return
    }
}
