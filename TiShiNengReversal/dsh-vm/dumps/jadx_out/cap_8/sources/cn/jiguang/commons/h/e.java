package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e extends cn.jiguang.commons.a.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.H.e a = null;

        static {
                cn.jiguang.commons.H.e r0 = new cn.jiguang.commons.H.e
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.e.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.e a() {
                cn.jiguang.commons.H.e r0 = cn.jiguang.commons.H.e.b.a
                return r0
        }
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ e(cn.jiguang.commons.H.e.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.H.e c() {
            cn.jiguang.commons.H.e r0 = cn.jiguang.commons.H.e.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDeviceIds"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r7) {
            r6 = this;
            java.lang.String r0 = "JDeviceIds-session"
            java.lang.String r1 = "JDeviceIds"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2f
            r4 = 1900(0x76c, float:2.662E-42)
            java.lang.String r3 = r3.d(r4, r7)     // Catch: java.lang.Throwable -> L2f
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2f
            r5 = 1901(0x76d, float:2.664E-42)
            java.lang.String r7 = r4.d(r5, r7)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            java.lang.String r7 = "no device ids to report"
        L2b:
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r7 = move-exception
            goto La6
        L31:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L3c
            java.lang.String r4 = "joad"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L2f
        L3c:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L47
            java.lang.String r4 = "jgad"
            r2.put(r4, r7)     // Catch: java.lang.Throwable -> L2f
        L47:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = cn.jiguang.commons.L.k.d(r7)     // Catch: java.lang.Throwable -> L2f
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = ""
            java.lang.String r4 = r4.a(r0, r5)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = android.text.TextUtils.equals(r7, r4)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L62
            java.lang.String r7 = "device ids unchanged, skip report"
            goto L2b
        L62:
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L2f
            r4.c(r0, r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = cn.jiguang.commons.L.ad.e(r7)     // Catch: java.lang.Throwable -> L2f
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L7d
            java.lang.String r7 = "encrypt device ids failed, skip report"
            cn.jiguang.commons.w.a.f(r1, r7)     // Catch: java.lang.Throwable -> L2f
            return
        L7d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "data"
            r0.put(r2, r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "device ids changed, report success"
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L2f
            cn.jiguang.commons.g.p r7 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "sdk_joa"
            r7.a(r0, r2)     // Catch: java.lang.Throwable -> L2f
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto La2
            java.lang.String r7 = "JDevice"
            java.lang.String r0 = "dev_rpt_state|1900_v1=ok"
            cn.jiguang.commons.w.a.e(r7, r0)     // Catch: java.lang.Throwable -> L2f
        La2:
            super.d(r1)     // Catch: java.lang.Throwable -> L2f
            return
        La6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "ids err:"
            r0.append(r2)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r7)
            return
    }
}
