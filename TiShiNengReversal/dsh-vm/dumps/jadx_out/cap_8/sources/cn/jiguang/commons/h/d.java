package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jiguang.commons.a.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.H.d a = null;

        static {
                cn.jiguang.commons.H.d r0 = new cn.jiguang.commons.H.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.d.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.d a() {
                cn.jiguang.commons.H.d r0 = cn.jiguang.commons.H.d.b.a
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.commons.H.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.H.d c() {
            cn.jiguang.commons.H.d r0 = cn.jiguang.commons.H.d.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDeviceIdMap"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r6) {
            r5 = this;
            java.lang.String r0 = "JDeviceIdMap"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2d
            r3 = 1030(0x406, float:1.443E-42)
            java.lang.String r2 = r2.d(r3, r6)     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2d
            r4 = 1031(0x407, float:1.445E-42)
            java.lang.String r6 = r3.d(r4, r6)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            java.lang.String r6 = "no device id map data to report"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r6 = move-exception
            goto L4b
        L2f:
            java.lang.String r3 = "boot_id"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "media_drm_id"
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "report id map data success"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.commons.g.p r6 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "device_id_map"
            r6.a(r1, r2)     // Catch: java.lang.Throwable -> L2d
            super.d(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L4b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id map err:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r6)
            return
    }
}
