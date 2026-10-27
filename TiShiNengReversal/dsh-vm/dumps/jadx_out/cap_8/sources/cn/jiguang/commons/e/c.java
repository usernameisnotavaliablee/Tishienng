package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c extends cn.jiguang.commons.a.c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONArray a(java.util.List r4) {
            r3 = this;
            if (r4 == 0) goto L2e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L2e
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            cn.jiguang.commons.c.d r1 = (cn.jiguang.commons.c.d) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            r2 = 128(0x80, float:1.8E-43)
            org.json.JSONObject r1 = r1.a(r2)
            if (r1 == 0) goto L12
            r0.put(r1)
            goto L12
        L2d:
            return r0
        L2e:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            return r4
    }

    private org.json.JSONObject a(int r3, int r4, org.json.JSONArray r5) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "slice_index"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "slice_count"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "data"
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            return r3
    }

    private void d(java.util.List r6) {
            r5 = this;
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
        L5:
            if (r1 >= r0) goto L1e
            int r2 = r1 + 1
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r1 = r5.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L2e
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "app_active"
            r3.a(r1, r4)     // Catch: java.lang.Throwable -> L2e
            r1 = r2
            goto L5
        L1e:
            java.lang.String r6 = r5.a()     // Catch: java.lang.Throwable -> L2e
            super.d(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = r5.a()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "all active data slices reported"
            cn.jiguang.commons.w.a.a(r6, r0)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    protected final void c(java.util.List r2) {
            r1 = this;
            if (r2 == 0) goto L36
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L36
        L9:
            org.json.JSONArray r2 = r1.a(r2)     // Catch: java.lang.Throwable -> L35
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L1d
            java.lang.String r2 = r1.a()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "no active data to report"
        L19:
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Throwable -> L35
            return
        L1d:
            java.util.ArrayList r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L2e
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2a
            goto L2e
        L2a:
            r1.d(r2)     // Catch: java.lang.Throwable -> L35
            return
        L2e:
            java.lang.String r2 = r1.a()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "no active data after partitioning"
            goto L19
        L35:
            return
        L36:
            java.lang.String r2 = r1.a()
            java.lang.String r0 = "no active info to report"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
    }
}
