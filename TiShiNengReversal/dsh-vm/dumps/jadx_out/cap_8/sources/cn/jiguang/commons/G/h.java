package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends cn.jiguang.commons.a.c {

    class a implements cn.jiguang.commons.G.d {
        final /* synthetic */ cn.jiguang.commons.G.h a;

        a(cn.jiguang.commons.G.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.jiguang.commons.G.d
        public void a(cn.jiguang.commons.bean.BleInfo r4) {
                r3 = this;
                java.lang.String r0 = "pls"
                java.lang.String r1 = "JBluetooth"
                if (r4 != 0) goto L10
                java.lang.String r4 = "ble info null"
                cn.jiguang.commons.w.a.f(r1, r4)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                return
            Lc:
                r4 = move-exception
                goto L43
            Le:
                r4 = move-exception
                goto L44
            L10:
                org.json.JSONObject r4 = r4.a()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                if (r4 == 0) goto L42
                int r2 = r4.length()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                if (r2 <= 0) goto L3d
                boolean r2 = r4.has(r0)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                if (r2 == 0) goto L3d
                org.json.JSONArray r0 = r4.getJSONArray(r0)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                if (r0 <= 0) goto L3d
                cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                java.lang.String r2 = "ble_info"
                r0.a(r4, r2)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                cn.jiguang.commons.G.h r4 = r3.a     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                cn.jiguang.commons.G.h.a(r4, r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
                java.lang.String r4 = "ble cl success"
                goto L3f
            L3d:
                java.lang.String r4 = "ble no devices"
            L3f:
                cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            L42:
                return
            L43:
                throw r4
            L44:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ble report err: "
                r0.append(r2)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                cn.jiguang.commons.w.a.f(r1, r4)
                return
        }

        @Override // cn.jiguang.commons.G.d
        public void a(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ble scan err: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "JBluetooth"
                cn.jiguang.commons.w.a.f(r0, r3)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.G.h a = null;

        static {
                cn.jiguang.commons.G.h r0 = new cn.jiguang.commons.G.h
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.G.h.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.G.h a() {
                cn.jiguang.commons.G.h r0 = cn.jiguang.commons.G.h.b.a
                return r0
        }
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ h(cn.jiguang.commons.G.h.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.G.h r0, java.lang.String r1) {
            super.d(r1)
            return
    }

    public static cn.jiguang.commons.G.h c() {
            cn.jiguang.commons.G.h r0 = cn.jiguang.commons.G.h.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JBluetooth"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r3) {
            r2 = this;
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1a
            r1 = 2400(0x960, float:3.363E-42)
            boolean r3 = r0.a(r1, r3)     // Catch: java.lang.Exception -> L1a
            if (r3 != 0) goto Ld
            return
        Ld:
            cn.jiguang.commons.L.e r3 = cn.jiguang.commons.L.e.f()     // Catch: java.lang.Exception -> L1a
            cn.jiguang.commons.G.h$a r0 = new cn.jiguang.commons.G.h$a     // Catch: java.lang.Exception -> L1a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1a
            r3.a(r0)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ble err: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JBluetooth"
            cn.jiguang.commons.w.a.f(r0, r3)
            return
    }
}
