package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class tj extends com.bytedance.embedapplog.kt {
    tj(com.bytedance.embedapplog.f r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.embedapplog.kt
    public boolean cw() {
            r6 = this;
            com.bytedance.embedapplog.f r0 = r6.j
            com.bytedance.embedapplog.wq r0 = r0.up()
            org.json.JSONObject r0 = r0.j()
            com.bytedance.embedapplog.f r1 = r6.j
            com.bytedance.embedapplog.wq r1 = r1.up()
            int r1 = r1.qv()
            if (r1 == 0) goto L97
            if (r0 == 0) goto L97
            com.bytedance.embedapplog.f r1 = r6.j
            com.bytedance.embedapplog.rn r1 = r1.r()
            long r1 = r1.ae()
            r3 = 21600000(0x1499700, double:1.0671818E-316)
            long r1 = r1 + r3
            long r3 = java.lang.System.currentTimeMillis()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L97
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "magic_tag"
            java.lang.String r3 = "ss_app_log"
            r1.put(r2, r3)
            java.lang.String r2 = "header"
            r1.put(r2, r0)
            java.lang.String r0 = "_gen_time"
            long r2 = java.lang.System.currentTimeMillis()
            r1.put(r0, r2)
            com.bytedance.embedapplog.f r0 = r6.j
            android.content.Context r0 = r0.xt()
            com.bytedance.embedapplog.f r2 = r6.j
            com.bytedance.embedapplog.wq r2 = r2.up()
            org.json.JSONObject r2 = r2.j()
            com.bytedance.embedapplog.f r3 = r6.j
            com.bytedance.embedapplog.util.j r3 = r3.tl()
            java.lang.String r3 = r3.cw()
            com.bytedance.embedapplog.xt r4 = com.bytedance.embedapplog.j.r()
            r5 = 1
            java.lang.String r0 = com.bytedance.embedapplog.qb.j(r0, r2, r3, r5, r4)
            java.lang.String[] r2 = com.bytedance.embedapplog.q.cw
            java.lang.String r0 = com.bytedance.embedapplog.q.j(r0, r2)
            org.json.JSONObject r0 = com.bytedance.embedapplog.q.xt(r0, r1)
            com.bytedance.embedapplog.cw r1 = com.bytedance.embedapplog.j.qv()
            com.bytedance.embedapplog.f r2 = r6.j
            com.bytedance.embedapplog.rn r2 = r2.r()
            org.json.JSONObject r2 = r2.m()
            boolean r2 = com.bytedance.embedapplog.ri.j(r0, r2)
            r2 = r2 ^ r5
            r1.j(r2, r0)
            if (r0 == 0) goto L97
            com.bytedance.embedapplog.f r1 = r6.j
            com.bytedance.embedapplog.rn r1 = r1.r()
            r1.j(r0)
            return r5
        L97:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long j() {
            r4 = this;
            com.bytedance.embedapplog.f r0 = r4.j
            com.bytedance.embedapplog.rn r0 = r0.r()
            long r0 = r0.ae()
            r2 = 21600000(0x1499700, double:1.0671818E-316)
            long r0 = r0 + r2
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "c"
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long[] xt() {
            r1 = this;
            long[] r0 = com.bytedance.embedapplog.v.cw
            return r0
    }
}
