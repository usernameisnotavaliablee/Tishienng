package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae extends com.bytedance.msdk.core.tl.r {
    private java.lang.String ae;
    private final java.lang.String g;

    /* renamed from: m, reason: collision with root package name */
    private java.util.List<com.bytedance.msdk.core.tl.up> f2257m;
    private com.bytedance.msdk.core.tl.ae.j oq;
    private final java.lang.String tl;


    private static class j {
        public java.lang.String cw;
        public java.lang.String j;
        public java.lang.String xt;

        public j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                return
        }
    }

    public ae(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            java.lang.String r3 = "count"
            r1.tl = r3
            java.lang.String r3 = "effective_time"
            r1.g = r3
            r1.ae = r6
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L22
            com.bytedance.msdk.core.tl.ae$j r2 = new com.bytedance.msdk.core.tl.ae$j
            java.lang.String r3 = "span"
            java.lang.String r4 = "rule_id"
            java.lang.String r5 = "freq"
            r2.<init>(r5, r3, r4)
            r1.oq = r2
            return
        L22:
            com.bytedance.msdk.core.tl.ae$j r2 = new com.bytedance.msdk.core.tl.ae$j
            java.lang.String r3 = "waterfall_show_span"
            java.lang.String r4 = "waterfall_show_rule_id"
            java.lang.String r5 = "waterfall_show_freq"
            r2.<init>(r5, r3, r4)
            r1.oq = r2
            return
    }

    public java.lang.String g() {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2c
            java.lang.String r1 = r7.ae     // Catch: org.json.JSONException -> L2c
            r0.<init>(r1)     // Catch: org.json.JSONException -> L2c
            r1 = 0
            r2 = 0
        L9:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L2c
            if (r2 >= r3) goto L2e
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "count"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "effective_time"
            com.bytedance.msdk.core.tl.ae$j r5 = r7.oq     // Catch: org.json.JSONException -> L2c
            java.lang.String r5 = r5.xt     // Catch: org.json.JSONException -> L2c
            long r5 = r3.getLong(r5)     // Catch: org.json.JSONException -> L2c
            long r5 = com.bytedance.msdk.core.tl.m.j(r5)     // Catch: org.json.JSONException -> L2c
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L2c
            int r2 = r2 + 1
            goto L9
        L2c:
            r0 = move-exception
            goto L35
        L2e:
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L2c
            r7.ae = r0     // Catch: org.json.JSONException -> L2c
            goto L38
        L35:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L38:
            java.lang.String r0 = r7.ae
            return r0
    }

    public void j(java.lang.String r4, int r5) {
            r3 = this;
            java.util.List r0 = r3.qv()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.core.tl.up r1 = (com.bytedance.msdk.core.tl.up) r1
            java.lang.String r2 = r1.cw()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L8
            r1.xt(r5)
        L21:
            return
    }

    public void j(java.lang.String r4, long r5) {
            r3 = this;
            java.util.List r0 = r3.qv()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.core.tl.up r1 = (com.bytedance.msdk.core.tl.up) r1
            java.lang.String r2 = r1.cw()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L8
            r1.xt(r5)
        L21:
            return
    }

    public java.lang.String oq() {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L55
            r0.<init>()     // Catch: org.json.JSONException -> L55
            java.util.List r1 = r7.qv()     // Catch: org.json.JSONException -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L55
        Ld:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L55
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L55
            com.bytedance.msdk.core.tl.up r2 = (com.bytedance.msdk.core.tl.up) r2     // Catch: org.json.JSONException -> L55
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            r3.<init>()     // Catch: org.json.JSONException -> L55
            com.bytedance.msdk.core.tl.ae$j r4 = r7.oq     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = r4.j     // Catch: org.json.JSONException -> L55
            int r5 = r2.j()     // Catch: org.json.JSONException -> L55
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L55
            com.bytedance.msdk.core.tl.ae$j r4 = r7.oq     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = r4.xt     // Catch: org.json.JSONException -> L55
            long r5 = r2.xt()     // Catch: org.json.JSONException -> L55
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L55
            com.bytedance.msdk.core.tl.ae$j r4 = r7.oq     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = r4.cw     // Catch: org.json.JSONException -> L55
            java.lang.String r5 = r2.cw()     // Catch: org.json.JSONException -> L55
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = "count"
            int r5 = r2.up()     // Catch: org.json.JSONException -> L55
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = "effective_time"
            long r5 = r2.r()     // Catch: org.json.JSONException -> L55
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L55
            r0.put(r3)     // Catch: org.json.JSONException -> L55
            goto Ld
        L55:
            r0 = move-exception
            goto L5e
        L57:
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L55
            r7.ae = r0     // Catch: org.json.JSONException -> L55
            goto L61
        L5e:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L61:
            java.lang.String r0 = r7.ae
            return r0
    }

    public synchronized java.util.List<com.bytedance.msdk.core.tl.up> qv() {
            r7 = this;
            monitor-enter(r7)
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r7)
            return r0
        Lf:
            r0 = move-exception
            goto Lbd
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            r7.f2257m = r0     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r7.ae     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L2d
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r7.j     // Catch: java.lang.Throwable -> Lf
            com.bytedance.msdk.core.tl.ae r0 = r0.oq(r1)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.ae     // Catch: java.lang.Throwable -> Lf
            r7.ae = r0     // Catch: java.lang.Throwable -> Lf
        L2d:
            java.lang.String r0 = r7.ae     // Catch: java.lang.Throwable -> Lf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L39
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r7)
            return r0
        L39:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r1 = r7.ae     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r1 = 0
        L41:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            if (r1 >= r2) goto La7
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            com.bytedance.msdk.core.tl.up r3 = new com.bytedance.msdk.core.tl.up     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.<init>()     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            com.bytedance.msdk.core.tl.ae$j r4 = r7.oq     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r4 = r4.cw     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            if (r5 != 0) goto La1
            com.bytedance.msdk.core.tl.ae$j r5 = r7.oq     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r5 = r5.j     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            int r5 = r2.optInt(r5)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.j(r5)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            com.bytedance.msdk.core.tl.ae$j r5 = r7.oq     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r5 = r5.xt     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            long r5 = r2.optLong(r5)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.j(r5)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.j(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            java.lang.String r4 = "count"
            boolean r4 = r2.has(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            if (r4 == 0) goto L8b
            java.lang.String r4 = "count"
            int r4 = r2.optInt(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.xt(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            goto L8b
        L89:
            r0 = move-exception
            goto La4
        L8b:
            java.lang.String r4 = "effective_time"
            boolean r4 = r2.has(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            if (r4 == 0) goto L9c
            java.lang.String r4 = "effective_time"
            long r4 = r2.optLong(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r3.xt(r4)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
        L9c:
            java.util.List<com.bytedance.msdk.core.tl.up> r2 = r7.f2257m     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
            r2.add(r3)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L89
        La1:
            int r1 = r1 + 1
            goto L41
        La4:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> Lf
        La7:
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 <= 0) goto Lb9
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            com.bytedance.msdk.core.tl.ae$1 r1 = new com.bytedance.msdk.core.tl.ae$1     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lf
            java.util.Collections.sort(r0, r1)     // Catch: java.lang.Throwable -> Lf
        Lb9:
            java.util.List<com.bytedance.msdk.core.tl.up> r0 = r7.f2257m     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r7)
            return r0
        Lbd:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // com.bytedance.msdk.core.tl.r
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseIntervalBean{waterfallId='"
            r0.<init>(r1)
            java.lang.String r1 = r4.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", showRulesVersion='"
            r0.append(r2)
            java.lang.String r2 = r4.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", timingMode="
            r0.append(r2)
            int r2 = r4.up
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r3 = "IntervalFreqctlBean{freqctlRules="
            r0.append(r3)
            java.util.List<com.bytedance.msdk.core.tl.up> r3 = r4.f2257m
            r0.append(r3)
            java.lang.String r3 = ", freqctlRulesJson='"
            r0.append(r3)
            java.lang.String r3 = r4.ae
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
