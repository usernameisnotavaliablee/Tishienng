package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class mi extends com.bytedance.embedapplog.kt {
    private long xt;

    mi(com.bytedance.embedapplog.f r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.embedapplog.kt
    boolean cw() {
            r8 = this;
            com.bytedance.embedapplog.f r0 = r8.j
            com.bytedance.embedapplog.wq r0 = r0.up()
            org.json.JSONObject r0 = r0.j()
            com.bytedance.embedapplog.f r1 = r8.j
            com.bytedance.embedapplog.wq r1 = r1.up()
            int r1 = r1.qv()
            if (r1 == 0) goto L99
            if (r0 == 0) goto L99
            long r0 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.bytedance.embedapplog.f r3 = r8.j
            com.bytedance.embedapplog.wq r3 = r3.up()
            org.json.JSONObject r3 = r3.j()
            java.lang.String r4 = "header"
            r2.put(r4, r3)
            java.lang.String r3 = "magic_tag"
            java.lang.String r4 = "ss_app_log"
            r2.put(r3, r4)
            java.lang.String r3 = "_gen_time"
            r2.put(r3, r0)
            com.bytedance.embedapplog.f r3 = r8.j
            android.content.Context r3 = r3.xt()
            com.bytedance.embedapplog.f r4 = r8.j
            com.bytedance.embedapplog.wq r4 = r4.up()
            org.json.JSONObject r4 = r4.j()
            com.bytedance.embedapplog.f r5 = r8.j
            com.bytedance.embedapplog.util.j r5 = r5.tl()
            java.lang.String r5 = r5.r()
            com.bytedance.embedapplog.xt r6 = com.bytedance.embedapplog.j.r()
            r7 = 1
            java.lang.String r3 = com.bytedance.embedapplog.qb.j(r3, r4, r5, r7, r6)
            java.lang.String[] r4 = com.bytedance.embedapplog.q.cw
            java.lang.String r3 = com.bytedance.embedapplog.q.j(r3, r4)
            org.json.JSONObject r2 = com.bytedance.embedapplog.q.cw(r3, r2)
            if (r2 == 0) goto L99
            org.json.JSONObject r3 = com.bytedance.embedapplog.j.m()
            com.bytedance.embedapplog.cw r4 = com.bytedance.embedapplog.j.qv()
            boolean r3 = com.bytedance.embedapplog.ri.j(r3, r2)
            r3 = r3 ^ r7
            r4.xt(r3, r2)
            boolean r3 = com.bytedance.embedapplog.uc.xt
            if (r3 == 0) goto L8d
            java.lang.String r3 = "getAbConfig "
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r4)
            r4 = 0
            com.bytedance.embedapplog.uc.j(r3, r4)
        L8d:
            com.bytedance.embedapplog.f r3 = r8.j
            com.bytedance.embedapplog.wq r3 = r3.up()
            r3.j(r2)
            r8.xt = r0
            return r7
        L99:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long j() {
            r5 = this;
            com.bytedance.embedapplog.f r0 = r5.j
            com.bytedance.embedapplog.rn r0 = r0.r()
            long r0 = r0.w()
            r2 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L12
            r0 = r2
        L12:
            long r2 = r5.xt
            long r2 = r2 + r0
            return r2
    }

    @Override // com.bytedance.embedapplog.kt
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "ab"
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long[] xt() {
            r1 = this;
            long[] r0 = com.bytedance.embedapplog.v.cw
            return r0
    }
}
