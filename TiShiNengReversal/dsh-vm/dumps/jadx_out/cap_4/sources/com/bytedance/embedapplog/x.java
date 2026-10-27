package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class x extends com.bytedance.embedapplog.kt {
    private static final long[] xt = null;
    private long cw;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2121r;

    static {
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 60000(0xea60, double:2.9644E-319)
            r3 = 0
            r0[r3] = r1
            com.bytedance.embedapplog.x.xt = r0
            return
    }

    x(com.bytedance.embedapplog.f r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f2121r = r1
            return
    }

    private void j(java.util.ArrayList<com.bytedance.embedapplog.zz> r12) {
            r11 = this;
            com.bytedance.embedapplog.f r0 = r11.j
            com.bytedance.embedapplog.sm r0 = r0.cw()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.bytedance.embedapplog.f r3 = r11.j
            com.bytedance.embedapplog.rn r3 = r3.r()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L24
            r4.addAll(r12)
        L24:
            java.util.ArrayList r5 = r0.j()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L31
            r4.addAll(r5)
        L31:
            int r5 = r4.size()
            if (r5 <= 0) goto Lcd
            java.util.Iterator r5 = r4.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r5.next()
            com.bytedance.embedapplog.zz r6 = (com.bytedance.embedapplog.zz) r6
            byte[] r7 = r6.vl
            if (r7 == 0) goto L90
            int r7 = r7.length
            if (r7 > 0) goto L4f
            goto L90
        L4f:
            boolean r7 = r11.f2121r
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L70
            com.bytedance.embedapplog.f r7 = r11.j
            android.content.Context r9 = r7.xt()
            com.bytedance.embedapplog.f r10 = r11.j
            com.bytedance.embedapplog.wq r10 = r10.up()
            org.json.JSONObject r10 = r10.j()
            java.lang.String[] r7 = com.bytedance.embedapplog.qb.j(r7, r9, r10)
            byte[] r9 = r6.vl
            int r7 = com.bytedance.embedapplog.q.j(r7, r9, r3)
            goto L72
        L70:
            r7 = 200(0xc8, float:2.8E-43)
        L72:
            boolean r9 = com.bytedance.embedapplog.q.j(r7)
            if (r9 == 0) goto L84
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L94
            r6.ws = r7
            r2.add(r6)
            goto L94
        L84:
            if (r7 != r8) goto L8a
            r1.add(r6)
            goto L3b
        L8a:
            r6.ws = r7
            r2.add(r6)
            goto L3b
        L90:
            r1.add(r6)
            goto L3b
        L94:
            int r3 = r1.size()
            if (r3 > 0) goto La0
            int r3 = r2.size()
            if (r3 <= 0) goto La3
        La0:
            r0.j(r1, r2, r12)
        La3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r11.r()
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
            int r1 = r1.size()
            r12.append(r1)
            r12.append(r0)
            int r0 = r4.size()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r0 = 0
            com.bytedance.embedapplog.uc.r(r12, r0)
        Lcd:
            return
    }

    @Override // com.bytedance.embedapplog.kt
    public boolean cw() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.embedapplog.f r2 = r6.j
            com.bytedance.embedapplog.ch r2 = r2.ae()
            r3 = 1
            if (r2 == 0) goto L1e
            r4 = 50000(0xc350, double:2.47033E-319)
            android.os.Bundle r0 = r2.j(r0, r4)
            if (r0 == 0) goto L1e
            java.lang.String r1 = "play_session"
            com.bytedance.embedapplog.j.j(r1, r0, r3)
            com.bytedance.embedapplog.j.xt()
        L1e:
            com.bytedance.embedapplog.f r0 = r6.j
            com.bytedance.embedapplog.sm r0 = r0.cw()
            com.bytedance.embedapplog.f r1 = r6.j
            com.bytedance.embedapplog.wq r1 = r1.up()
            int r2 = r1.qv()
            r4 = 0
            if (r2 == 0) goto L4d
            org.json.JSONObject r1 = r1.j()
            org.json.JSONObject r1 = com.bytedance.embedapplog.ri.xt(r1)
            if (r1 == 0) goto L49
            java.util.ArrayList r0 = r0.j(r1)
            r6.j(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r6.cw = r0
            return r3
        L49:
            r0 = 0
            com.bytedance.embedapplog.uc.xt(r0)
        L4d:
            return r4
    }

    @Override // com.bytedance.embedapplog.kt
    long j() {
            r7 = this;
            com.bytedance.embedapplog.f r0 = r7.j
            com.bytedance.embedapplog.rn r0 = r0.r()
            long r0 = r0.x()
            r2 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13
        L11:
            r0 = r2
            goto L1a
        L13:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L1a
            goto L11
        L1a:
            long[] r2 = com.bytedance.embedapplog.x.xt
            r3 = 0
            r2[r3] = r0
            long r2 = r7.cw
            long r2 = r2 + r0
            return r2
    }

    public void j(boolean r1) {
            r0 = this;
            r0.f2121r = r1
            return
    }

    @Override // com.bytedance.embedapplog.kt
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "s"
            return r0
    }

    @Override // com.bytedance.embedapplog.kt
    long[] xt() {
            r1 = this;
            long[] r0 = com.bytedance.embedapplog.x.xt
            return r0
    }
}
