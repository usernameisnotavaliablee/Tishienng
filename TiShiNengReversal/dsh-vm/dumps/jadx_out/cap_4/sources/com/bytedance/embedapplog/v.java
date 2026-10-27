package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class v extends com.bytedance.embedapplog.kt {
    static final long[] cw = null;

    /* renamed from: r, reason: collision with root package name */
    private static final long[] f2114r = null;
    static final long[] xt = null;
    private boolean up;

    static {
            r0 = 1
            long[] r1 = new long[r0]
            r2 = 0
            r3 = 920000(0xe09c0, double:4.545404E-318)
            r1[r2] = r3
            com.bytedance.embedapplog.v.xt = r1
            long[] r0 = new long[r0]
            r0[r2] = r3
            com.bytedance.embedapplog.v.cw = r0
            r0 = 10
            long[] r0 = new long[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [10000, 10000, 20000, 20000, 60000, 6000, 180000, 180000, 540000, 540000} // fill-array
            com.bytedance.embedapplog.v.f2114r = r0
            return
    }

    v(com.bytedance.embedapplog.f r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.up = r1
            return
    }

    @Override // com.bytedance.embedapplog.kt
    boolean cw() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.embedapplog.f r1 = r7.j
            com.bytedance.embedapplog.wq r1 = r1.up()
            org.json.JSONObject r2 = r1.j()
            r3 = 0
            if (r2 == 0) goto L95
            java.lang.String r4 = "magic_tag"
            java.lang.String r5 = "ss_app_log"
            r0.put(r4, r5)
            monitor-enter(r1)
            org.json.JSONObject r2 = com.bytedance.embedapplog.ri.j(r2)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "header"
            r0.put(r1, r2)
            java.lang.String r1 = "_gen_time"
            long r4 = java.lang.System.currentTimeMillis()
            r0.put(r1, r4)
            java.lang.String r1 = "device_id"
            java.lang.String r1 = r2.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            boolean r1 = com.bytedance.embedapplog.ri.r()
            if (r1 == 0) goto L46
            boolean r1 = r7.up
            if (r1 == 0) goto L46
            r7.up = r3
            return r3
        L46:
            com.bytedance.embedapplog.f r1 = r7.j
            android.content.Context r1 = r1.xt()
            com.bytedance.embedapplog.f r2 = r7.j
            com.bytedance.embedapplog.wq r2 = r2.up()
            org.json.JSONObject r2 = r2.j()
            com.bytedance.embedapplog.f r4 = r7.j
            com.bytedance.embedapplog.util.j r4 = r4.tl()
            java.lang.String r4 = r4.j()
            r5 = 1
            com.bytedance.embedapplog.xt r6 = com.bytedance.embedapplog.j.r()
            java.lang.String r1 = com.bytedance.embedapplog.qb.j(r1, r2, r4, r5, r6)
            org.json.JSONObject r0 = com.bytedance.embedapplog.q.j(r1, r0)
            if (r0 == 0) goto L99
            java.lang.String r1 = "device_id"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r2 = "install_id"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.optString(r2, r3)
            java.lang.String r3 = "ssid"
            java.lang.String r4 = ""
            java.lang.String r3 = r0.optString(r3, r4)
            com.bytedance.embedapplog.f r4 = r7.j
            com.bytedance.embedapplog.wq r4 = r4.up()
            boolean r0 = r4.j(r0, r1, r2, r3)
            return r0
        L92:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            throw r0
        L95:
            r0 = 0
            com.bytedance.embedapplog.uc.xt(r0)
        L99:
            return r3
    }

    @Override // com.bytedance.embedapplog.kt
    long j() {
            r4 = this;
            com.bytedance.embedapplog.f r0 = r4.j
            com.bytedance.embedapplog.wq r0 = r0.up()
            long r0 = r0.vl()
            com.bytedance.embedapplog.f r2 = r4.j
            com.bytedance.embedapplog.ch r2 = r2.ae()
            boolean r2 = r2.cw()
            if (r2 == 0) goto L1a
            r2 = 21600000(0x1499700, float:3.7026207E-38)
            goto L1d
        L1a:
            r2 = 43200000(0x2932e00, float:2.1626111E-37)
        L1d:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "r"
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long[] xt() {
            r2 = this;
            com.bytedance.embedapplog.f r0 = r2.j
            com.bytedance.embedapplog.wq r0 = r0.up()
            int r0 = r0.qv()
            if (r0 == 0) goto L1f
            r1 = 1
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto L19
            r0 = 0
            com.bytedance.embedapplog.uc.xt(r0)
            long[] r0 = com.bytedance.embedapplog.v.cw
            return r0
        L19:
            long[] r0 = com.bytedance.embedapplog.v.xt
            return r0
        L1c:
            long[] r0 = com.bytedance.embedapplog.v.cw
            return r0
        L1f:
            long[] r0 = com.bytedance.embedapplog.v.f2114r
            return r0
    }
}
