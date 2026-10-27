package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends cn.jiguang.commons.a.c {

    private static final class a {
        private static final cn.jiguang.commons.E.f a = null;

        static {
                cn.jiguang.commons.E.f r0 = new cn.jiguang.commons.E.f
                r0.<init>()
                cn.jiguang.commons.E.f.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.f a() {
                cn.jiguang.commons.E.f r0 = cn.jiguang.commons.E.f.a.a
                return r0
        }
    }

    public f() {
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
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            r2 = 128(0x80, float:1.8E-43)
            org.json.JSONObject r1 = r1.a(r2)
            if (r1 == 0) goto L9
            r0.put(r1)
            goto L9
        L21:
            return r0
    }

    public static cn.jiguang.commons.E.f c() {
            cn.jiguang.commons.E.f r0 = cn.jiguang.commons.E.f.a.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppListFile"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r7) {
            r6 = this;
            java.lang.String r0 = "JAppListFile"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L27
            r2 = 1110(0x456, float:1.555E-42)
            java.util.List r7 = r1.c(r2, r7)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L15
            goto L6c
        L15:
            org.json.JSONArray r7 = r6.a(r7)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L29
            int r1 = r7.length()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            java.lang.String r7 = "app list file json array empty"
        L23:
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r7 = move-exception
            goto L6f
        L29:
            java.util.ArrayList r7 = cn.jiguang.commons.L.ad.a(r7)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L36
            java.lang.String r7 = "app list file partition empty"
            goto L23
        L36:
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L27
            r2 = 0
        L3b:
            if (r2 >= r1) goto L63
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r7.get(r2)     // Catch: java.lang.Throwable -> L27
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "slice_index"
            int r2 = r2 + 1
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "slice_count"
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "data"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "package_list"
            r4.a(r3, r5)     // Catch: java.lang.Throwable -> L27
            goto L3b
        L63:
            super.d(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "app list file report ok"
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Throwable -> L27
            return
        L6c:
            java.lang.String r7 = "app list file empty"
            goto L23
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app list file err:"
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
            return
    }
}
