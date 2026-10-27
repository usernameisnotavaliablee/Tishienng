package com.bytedance.msdk.up.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt implements com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> {
    private android.content.Context j;

    public xt(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.j = r1
        Lf:
            return
    }

    private void cw(com.bytedance.msdk.core.tl.ae r3) {
            r2 = this;
            android.content.Context r0 = r2.j
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "freqctl_"
            r0.<init>(r1)
            java.lang.String r1 = r3.xt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.Context r1 = r2.j
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            r1 = 0
            org.json.JSONObject r1 = r2.j(r3, r1)
            if (r1 == 0) goto L30
            java.lang.String r3 = r3.r()
            java.lang.String r1 = r1.toString()
            r0.j(r3, r1)
        L30:
            return
    }

    private com.bytedance.msdk.core.tl.ae j(java.lang.String r8, boolean r9) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L55
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L20
            r0.<init>(r8)     // Catch: org.json.JSONException -> L20
            java.lang.String r8 = "unity_id"
            java.lang.String r8 = r0.getString(r8)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "_"
            java.lang.String[] r8 = r8.split(r1)     // Catch: org.json.JSONException -> L20
            int r1 = r8.length     // Catch: org.json.JSONException -> L20
            java.lang.String r2 = ""
            if (r1 <= 0) goto L23
            r1 = 0
            r1 = r8[r1]     // Catch: org.json.JSONException -> L20
            goto L24
        L20:
            r0 = move-exception
            r8 = r0
            goto L52
        L23:
            r1 = r2
        L24:
            int r3 = r8.length     // Catch: org.json.JSONException -> L20
            r4 = 1
            if (r3 <= r4) goto L2b
            r8 = r8[r4]     // Catch: org.json.JSONException -> L20
            goto L2c
        L2b:
            r8 = r2
        L2c:
            if (r9 == 0) goto L37
            java.lang.String r9 = "adn_rit_show_rules_version"
            java.lang.String r9 = r0.getString(r9)     // Catch: org.json.JSONException -> L20
            r4 = r9
            r3 = r2
            goto L3f
        L37:
            java.lang.String r9 = "waterfall_show_rules_version"
            java.lang.String r9 = r0.getString(r9)     // Catch: org.json.JSONException -> L20
            r3 = r9
            r4 = r2
        L3f:
            java.lang.String r9 = "timing_mode"
            int r5 = r0.getInt(r9)     // Catch: org.json.JSONException -> L20
            java.lang.String r9 = "show_freqctl_rules"
            java.lang.String r6 = r0.getString(r9)     // Catch: org.json.JSONException -> L20
            com.bytedance.msdk.core.tl.ae r0 = new com.bytedance.msdk.core.tl.ae     // Catch: org.json.JSONException -> L20
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: org.json.JSONException -> L20
            return r0
        L52:
            com.bytedance.sdk.component.utils.vl.j(r8)
        L55:
            r8 = 0
            return r8
    }

    private org.json.JSONObject j(com.bytedance.msdk.core.tl.ae r4, boolean r5) {
            r3 = this;
            if (r4 == 0) goto L48
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "unity_id"
            java.lang.String r2 = r4.r()     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            boolean r1 = r4.j()     // Catch: org.json.JSONException -> L20
            if (r1 == 0) goto L22
            java.lang.String r1 = "adn_rit_show_rules_version"
            java.lang.String r2 = r4.m()     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            goto L2b
        L20:
            r4 = move-exception
            goto L45
        L22:
            java.lang.String r1 = "waterfall_show_rules_version"
            java.lang.String r2 = r4.up()     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
        L2b:
            java.lang.String r1 = "timing_mode"
            int r2 = r4.ae()     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "show_freqctl_rules"
            if (r5 == 0) goto L3d
            java.lang.String r4 = r4.g()     // Catch: org.json.JSONException -> L20
            goto L41
        L3d:
            java.lang.String r4 = r4.oq()     // Catch: org.json.JSONException -> L20
        L41:
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L20
            return r0
        L45:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L48:
            r4 = 0
            return r4
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized void delete(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.lang.String r0 = "freqctl_"
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L1f
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0.m(r3)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L23
        L21:
            monitor-exit(r2)
            return
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized void delete(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L3b
            java.lang.String r0 = "freqctl_"
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L39
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r0.m(r3)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r3 = move-exception
            goto L3d
        L3b:
            monitor-exit(r2)
            return
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r3
    }

    /* renamed from: j, reason: avoid collision after fix types in other method */
    public synchronized void j2(com.bytedance.msdk.core.tl.ae r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.j     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L34
            if (r4 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "freqctl_"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r4.xt()     // Catch: java.lang.Throwable -> L32
            r0.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            android.content.Context r1 = r3.j     // Catch: java.lang.Throwable -> L32
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r4.r()     // Catch: java.lang.Throwable -> L32
            r2 = 1
            org.json.JSONObject r4 = r3.j(r4, r2)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L32
            r0.j(r1, r4)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r4 = move-exception
            goto L36
        L34:
            monitor-exit(r3)
            return
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r4
    }

    @Override // com.bytedance.msdk.up.j.j
    public /* synthetic */ void j(com.bytedance.msdk.core.tl.ae r1) {
            r0 = this;
            com.bytedance.msdk.core.tl.ae r1 = (com.bytedance.msdk.core.tl.ae) r1
            r0.xt(r1)
            return
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized com.bytedance.msdk.core.tl.ae query(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L8
            monitor-exit(r2)
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = "freqctl_"
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L25
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = ""
            java.lang.String r3 = r0.xt(r3, r1)     // Catch: java.lang.Throwable -> L25
            r0 = 0
            com.bytedance.msdk.core.tl.ae r3 = r2.j(r3, r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)
            return r3
        L25:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized com.bytedance.msdk.core.tl.ae query(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L8
            monitor-exit(r2)
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = "freqctl_"
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L39
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = ""
            java.lang.String r3 = r0.xt(r3, r4)     // Catch: java.lang.Throwable -> L39
            r4 = 1
            com.bytedance.msdk.core.tl.ae r3 = r2.j(r3, r4)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            return r3
        L39:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* bridge */ /* synthetic */ java.lang.Object query(java.lang.String r1) {
            r0 = this;
            com.bytedance.msdk.core.tl.ae r1 = r0.query(r1)
            return r1
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* bridge */ /* synthetic */ java.lang.Object query(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.bytedance.msdk.core.tl.ae r1 = r0.query(r1, r2)
            return r1
    }

    public synchronized void xt(com.bytedance.msdk.core.tl.ae r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto La
            r0.cw(r1)     // Catch: java.lang.Throwable -> L7
            goto La
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
        La:
            monitor-exit(r0)
            return
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* synthetic */ void xt(java.lang.Object r1) {
            r0 = this;
            com.bytedance.msdk.core.tl.ae r1 = (com.bytedance.msdk.core.tl.ae) r1
            r0.j2(r1)
            return
    }
}
