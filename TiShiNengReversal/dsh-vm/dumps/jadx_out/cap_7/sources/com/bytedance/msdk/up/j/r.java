package com.bytedance.msdk.up.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r implements com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> {
    private android.content.Context j;

    public r(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.j = r1
        Lf:
            return
    }

    private com.bytedance.msdk.core.tl.g j(java.lang.String r10, boolean r11) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L61
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L20
            r0.<init>(r10)     // Catch: org.json.JSONException -> L20
            java.lang.String r10 = "unity_id"
            java.lang.String r10 = r0.getString(r10)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "_"
            java.lang.String[] r10 = r10.split(r1)     // Catch: org.json.JSONException -> L20
            int r1 = r10.length     // Catch: org.json.JSONException -> L20
            java.lang.String r2 = ""
            if (r1 <= 0) goto L23
            r1 = 0
            r1 = r10[r1]     // Catch: org.json.JSONException -> L20
            goto L24
        L20:
            r0 = move-exception
            r10 = r0
            goto L5e
        L23:
            r1 = r2
        L24:
            int r3 = r10.length     // Catch: org.json.JSONException -> L20
            r4 = 1
            if (r3 <= r4) goto L2b
            r10 = r10[r4]     // Catch: org.json.JSONException -> L20
            goto L2c
        L2b:
            r10 = r2
        L2c:
            if (r11 != 0) goto L3d
            java.lang.String r11 = "waterfall_show_rules_version"
            java.lang.String r2 = r0.getString(r11)     // Catch: org.json.JSONException -> L20
            java.lang.String r11 = "adn_rit_show_rules_version"
            java.lang.String r11 = r0.getString(r11)     // Catch: org.json.JSONException -> L20
            r4 = r11
            r3 = r2
            goto L3f
        L3d:
            r3 = r2
            r4 = r3
        L3f:
            java.lang.String r11 = "timing_mode"
            int r5 = r0.getInt(r11)     // Catch: org.json.JSONException -> L20
            java.lang.String r11 = "show_pacing"
            java.lang.String r6 = r0.getString(r11)     // Catch: org.json.JSONException -> L20
            java.lang.String r11 = "show_pacing_rule_id"
            java.lang.String r7 = r0.getString(r11)     // Catch: org.json.JSONException -> L20
            java.lang.String r11 = "show_time"
            java.lang.String r8 = r0.getString(r11)     // Catch: org.json.JSONException -> L20
            com.bytedance.msdk.core.tl.g r0 = new com.bytedance.msdk.core.tl.g     // Catch: org.json.JSONException -> L20
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: org.json.JSONException -> L20
            return r0
        L5e:
            com.bytedance.sdk.component.utils.vl.j(r10)
        L61:
            r10 = 0
            return r10
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized void delete(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "_"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L27
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            java.lang.String r0 = "pacing_"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L23
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L23
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L23
            r0.m(r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L2f
        L25:
            monitor-exit(r2)
            return
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = " has slotId"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized void delete(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "_"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L41
            android.content.Context r0 = r2.j     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3f
            java.lang.String r0 = "pacing_"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r1.<init>()     // Catch: java.lang.Throwable -> L3d
            r1.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L3d
            r1.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            r0.m(r3)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r3 = move-exception
            goto L49
        L3f:
            monitor-exit(r2)
            return
        L41:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = " has slotId"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
            throw r3
    }

    public synchronized void j(com.bytedance.msdk.core.tl.g r8) {
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.j     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L96
            if (r8 == 0) goto L96
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "pacing_"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r8.xt()     // Catch: java.lang.Throwable -> L4a
            r0.append(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a
            android.content.Context r1 = r7.j     // Catch: java.lang.Throwable -> L4a
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r8.r()     // Catch: java.lang.Throwable -> L4a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4a
            r2.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "unity_id"
            java.lang.String r4 = r8.r()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            boolean r3 = r8.j()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            if (r3 != 0) goto L4e
            java.lang.String r3 = "waterfall_show_rules_version"
            java.lang.String r4 = r8.up()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r3 = "adn_rit_show_rules_version"
            java.lang.String r4 = r8.m()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            goto L4e
        L4a:
            r8 = move-exception
            goto L98
        L4c:
            r8 = move-exception
            goto L93
        L4e:
            java.lang.String r3 = "timing_mode"
            int r4 = r8.ae()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r3 = "show_pacing"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            long r5 = r8.g()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r4.append(r5)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r3 = "show_pacing_rule_id"
            java.lang.String r4 = r8.oq()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r3 = "show_time"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            long r5 = r8.qv()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r4.append(r5)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            r0.j(r1, r8)     // Catch: java.lang.Throwable -> L4a org.json.JSONException -> L4c
            monitor-exit(r7)
            return
        L93:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L4a
        L96:
            monitor-exit(r7)
            return
        L98:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4a
            throw r8
    }

    @Override // com.bytedance.msdk.up.j.cw
    public synchronized void j(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L9
            monitor-exit(r1)
            return
        L9:
            com.bytedance.msdk.core.tl.g r2 = r1.query(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r2.j(r3)     // Catch: java.lang.Throwable -> L16
            r1.j(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // com.bytedance.msdk.up.j.cw
    public synchronized void j(java.lang.String r2, java.lang.String r3, long r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Le
            goto L1f
        Le:
            com.bytedance.msdk.core.tl.g r2 = r1.query(r2, r3)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            r2.j(r4)     // Catch: java.lang.Throwable -> L1b
            r1.j(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L21
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            return
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized com.bytedance.msdk.core.tl.g query(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "_"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L12
            monitor-exit(r2)
            r3 = 0
            return r3
        L12:
            java.lang.String r0 = "pacing_"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L2b
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L2b
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = ""
            java.lang.String r3 = r0.xt(r3, r1)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            com.bytedance.msdk.core.tl.g r3 = r2.j(r3, r0)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return r3
        L2b:
            r3 = move-exception
            goto L35
        L2d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = " has slotId"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public synchronized com.bytedance.msdk.core.tl.g query(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "_"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L12
            monitor-exit(r2)
            r3 = 0
            return r3
        L12:
            java.lang.String r0 = "pacing_"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r2.j     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = ""
            java.lang.String r3 = r0.xt(r3, r4)     // Catch: java.lang.Throwable -> L3f
            r4 = 1
            com.bytedance.msdk.core.tl.g r3 = r2.j(r3, r4)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return r3
        L3f:
            r3 = move-exception
            goto L49
        L41:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = " has slotId"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            throw r3     // Catch: java.lang.Throwable -> L3f
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r3
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* bridge */ /* synthetic */ java.lang.Object query(java.lang.String r1) {
            r0 = this;
            com.bytedance.msdk.core.tl.g r1 = r0.query(r1)
            return r1
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* bridge */ /* synthetic */ java.lang.Object query(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.bytedance.msdk.core.tl.g r1 = r0.query(r1, r2)
            return r1
    }

    @Override // com.bytedance.msdk.up.j.up
    public /* synthetic */ void xt(java.lang.Object r1) {
            r0 = this;
            com.bytedance.msdk.core.tl.g r1 = (com.bytedance.msdk.core.tl.g) r1
            r0.j(r1)
            return
    }
}
