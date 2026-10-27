package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k extends cn.jiguang.commons.a.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.E.k a = null;

        static {
                cn.jiguang.commons.E.k r0 = new cn.jiguang.commons.E.k
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.E.k.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.k a() {
                cn.jiguang.commons.E.k r0 = cn.jiguang.commons.E.k.b.a
                return r0
        }
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ k(cn.jiguang.commons.E.k.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONArray a(java.util.List r4) {
            r3 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            int r2 = r1.f1011g
            if (r2 == 0) goto L9
            r2 = 128(0x80, float:1.8E-43)
            org.json.JSONObject r1 = r1.f(r2)
            if (r1 == 0) goto L9
            r0.put(r1)
            goto L9
        L25:
            return r0
    }

    public static cn.jiguang.commons.E.k c() {
            cn.jiguang.commons.E.k r0 = cn.jiguang.commons.E.k.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppSDK"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r4) {
            r3 = this;
            java.lang.String r0 = "JAppSDK"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r2 = 1100(0x44c, float:1.541E-42)
            java.util.List r4 = r1.c(r2, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r4 == 0) goto L48
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r1 == 0) goto L15
            goto L48
        L15:
            org.json.JSONArray r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r4 == 0) goto L42
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r1 != 0) goto L22
            goto L42
        L22:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.String r2 = "data"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.String r4 = "reporting sdk data ok"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.String r2 = "app_sdk"
            r4.a(r1, r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            super.d(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            return
        L3e:
            r4 = move-exception
            goto L4b
        L40:
            r4 = move-exception
            goto L4c
        L42:
            java.lang.String r4 = "no sdk data to report"
        L44:
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            return
        L48:
            java.lang.String r4 = "no sdk installed apps found"
            goto L44
        L4b:
            throw r4
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sdk err:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }
}
