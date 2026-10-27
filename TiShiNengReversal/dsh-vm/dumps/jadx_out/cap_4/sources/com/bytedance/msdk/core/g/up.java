package com.bytedance.msdk.core.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.msdk.core.g.j {
    private static volatile com.bytedance.msdk.core.g.up up;
    protected final java.util.Map<java.lang.String, java.lang.String> cw;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Map<java.lang.String, double[]> f2200r;

    private up() {
            r1 = this;
            java.lang.String r0 = "label_v_v_s"
            r1.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f2200r = r0
            r1.xt()
            return
    }

    public static java.lang.String cw(int r2) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r0 = r0.ol()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.core.oq.cw r2 = (com.bytedance.msdk.core.oq.cw) r2
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.j()
            return r2
        L25:
            return r1
    }

    private java.util.Map<java.lang.String, org.json.JSONObject> j(java.lang.String r8, double[] r9) {
            r7 = this;
            java.lang.String r8 = "timestamp"
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r9 = r7.j(r9)
            r1 = 0
            java.lang.String r2 = "-1"
            boolean r2 = r9.equals(r2)     // Catch: org.json.JSONException -> L30
            if (r2 != 0) goto L38
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L30
            r2.<init>()     // Catch: org.json.JSONException -> L30
            java.lang.String r1 = "input"
            java.lang.String r3 = r7.xt(r9)     // Catch: org.json.JSONException -> L2e
            r2.putOpt(r1, r3)     // Catch: org.json.JSONException -> L2e
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L2e
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: org.json.JSONException -> L2e
            r2.putOpt(r8, r1)     // Catch: org.json.JSONException -> L2e
            goto L37
        L2e:
            r1 = move-exception
            goto L34
        L30:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L34:
            com.bytedance.sdk.component.utils.vl.j(r1)
        L37:
            r1 = r2
        L38:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "ecpm"
            r3.putOpt(r4, r9)     // Catch: org.json.JSONException -> L58
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L58
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> L58
            r3.putOpt(r8, r9)     // Catch: org.json.JSONException -> L58
            java.lang.String r8 = "ecpm_info"
            r2.putOpt(r8, r3)     // Catch: org.json.JSONException -> L58
            goto L5c
        L58:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
        L5c:
            java.lang.String r8 = "config_req_label_value"
            r0.put(r8, r1)
            java.lang.String r8 = "event_label_value"
            r0.put(r8, r2)
            return r0
    }

    public static com.bytedance.msdk.core.g.up r() {
            com.bytedance.msdk.core.g.up r0 = com.bytedance.msdk.core.g.up.up
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.g.up> r0 = com.bytedance.msdk.core.g.up.class
            monitor-enter(r0)
            com.bytedance.msdk.core.g.up r1 = com.bytedance.msdk.core.g.up.up     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.g.up r1 = new com.bytedance.msdk.core.g.up     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.g.up.up = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.core.g.up r0 = com.bytedance.msdk.core.g.up.up
            return r0
    }

    private void r(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L9
            java.util.Map<java.lang.String, double[]> r2 = r1.f2200r
            r2.clear()
            return
        L9:
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.cw
            r2.clear()
            com.bytedance.msdk.tl.l r2 = r1.xt
            if (r2 == 0) goto L15
            r2.cw()
        L15:
            return
    }

    public static java.lang.String up() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r0 = r0.ol()
            java.util.Set r0 = r0.entrySet()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.bytedance.msdk.core.oq.cw r2 = (com.bytedance.msdk.core.oq.cw) r2
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "label_name"
            java.lang.String r6 = r2.j()     // Catch: java.lang.Exception -> L76
            r4.putOpt(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "timestamp"
            java.lang.String r6 = r2.xt()     // Catch: java.lang.Exception -> L76
            r4.putOpt(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "lower_bound"
            double r6 = r2.m()     // Catch: java.lang.Exception -> L76
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Exception -> L76
            r4.putOpt(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "upper_bound"
            double r6 = r2.up()     // Catch: java.lang.Exception -> L76
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Exception -> L76
            r4.putOpt(r5, r2)     // Catch: java.lang.Exception -> L76
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = com.bytedance.msdk.core.g.j.j(r2)     // Catch: java.lang.Exception -> L76
            r1.putOpt(r2, r4)     // Catch: java.lang.Exception -> L76
            goto L21
        L76:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto L21
        L7b:
            java.lang.String r0 = r1.toString()
            return r0
    }

    private java.util.Map<java.lang.String, double[]> xt(java.util.Map<java.lang.String, java.lang.String> r12) {
            r11 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            if (r12 == 0) goto L86
            int r1 = r12.size()
            if (r1 != 0) goto Lf
            goto L86
        Lf:
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L17:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L70
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L70
            if (r2 != 0) goto L17
            java.lang.String r2 = "_"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L70
            r2 = 0
            r3 = r1[r2]     // Catch: java.lang.Exception -> L70
            r4 = 1
            r5 = r1[r4]     // Catch: java.lang.Exception -> L70
            r6 = 2
            r7 = r1[r6]     // Catch: java.lang.Exception -> L70
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L70
            if (r8 != 0) goto L17
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L70
            if (r8 != 0) goto L17
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L70
            if (r7 != 0) goto L17
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L70
            r1 = r1[r6]     // Catch: java.lang.Exception -> L70
            long r9 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L70
            long r7 = r7 - r9
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L70
            boolean r1 = r1.j(r7)     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Exception -> L70
            double[] r1 = (double[]) r1     // Catch: java.lang.Exception -> L70
            if (r1 != 0) goto L72
            double[] r1 = new double[r6]     // Catch: java.lang.Exception -> L70
            goto L72
        L70:
            goto L17
        L72:
            r6 = r1[r2]     // Catch: java.lang.Exception -> L70
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 + r8
            r1[r2] = r6     // Catch: java.lang.Exception -> L70
            r6 = r1[r4]     // Catch: java.lang.Exception -> L70
            double r8 = java.lang.Double.parseDouble(r5)     // Catch: java.lang.Exception -> L70
            double r6 = r6 + r8
            r1[r4] = r6     // Catch: java.lang.Exception -> L70
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L70
            goto L17
        L86:
            return r0
    }

    private void xt(org.json.JSONObject r6) {
            r5 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r0 = r0.ol()
            int r1 = r0.size()
            if (r1 <= 0) goto L15
            if (r6 != 0) goto L15
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L15:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            com.bytedance.msdk.core.oq.cw r1 = (com.bytedance.msdk.core.oq.cw) r1
            if (r1 == 0) goto L1d
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r3 = r6.optJSONObject(r3)     // Catch: org.json.JSONException -> L58
            if (r3 != 0) goto L5a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L58
            r3.<init>()     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: org.json.JSONException -> L58
            r6.put(r2, r3)     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = "ecpm_info"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L58
            r4.<init>()     // Catch: org.json.JSONException -> L58
            r3.put(r2, r4)     // Catch: org.json.JSONException -> L58
            goto L5a
        L58:
            r1 = move-exception
            goto L75
        L5a:
            java.lang.String r2 = "label_info"
            org.json.JSONObject r1 = r5.j(r1)     // Catch: org.json.JSONException -> L58
            r3.putOpt(r2, r1)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "ecpm_ttl"
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()     // Catch: org.json.JSONException -> L58
            int r2 = r2.b()     // Catch: org.json.JSONException -> L58
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L58
            r3.putOpt(r1, r2)     // Catch: org.json.JSONException -> L58
            goto L1d
        L75:
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto L1d
        L79:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected java.util.Map<java.lang.String, java.lang.String> j() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.msdk.core.g.j
    protected org.json.JSONObject j(com.bytedance.msdk.core.oq.cw r5) {
            r4 = this;
            if (r5 == 0) goto L4e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4a
            r0.<init>()     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "label_name"
            java.lang.String r2 = r5.j()     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "label_id"
            int r2 = r5.cw()     // Catch: org.json.JSONException -> L4a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "label_version"
            java.lang.String r2 = r5.r()     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "upper_bound"
            double r2 = r5.up()     // Catch: org.json.JSONException -> L4a
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "lower_bound"
            double r2 = r5.m()     // Catch: org.json.JSONException -> L4a
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r1 = "timestamp"
            java.lang.String r5 = r5.xt()     // Catch: org.json.JSONException -> L4a
            r0.putOpt(r1, r5)     // Catch: org.json.JSONException -> L4a
            return r0
        L4a:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L4e:
            r5 = 0
            return r5
    }

    protected void j(int r8, double r9) {
            r7 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r4 = 1
            r2 = 2
            r1 = r7
            r5 = r9
            r1.j(r2, r3, r4, r5)
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected void j(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 2
            if (r3 != r0) goto L8
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.cw
            r3.put(r2, r4)
        L8:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected void j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            java.lang.String r0 = "cpm_key_"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.cw
            r0.put(r2, r3)
        L19:
            return
    }

    public void j(java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r7) {
            r6 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lc
            goto Le9
        Lc:
            if (r7 == 0) goto Le9
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Le9
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 == 0) goto L76
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L3f
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L3f
            java.lang.Object r5 = r4.get(r3)
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.get(r3)
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5
            com.bytedance.msdk.xt.cw r5 = r5.j
            if (r5 == 0) goto L3f
            java.lang.Object r2 = r4.get(r3)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.xt.cw r2 = r2.j
            int r2 = r2.om()
            goto L77
        L76:
            r2 = 0
        L77:
            com.bytedance.msdk.ae.j.cw r4 = com.bytedance.msdk.ae.j.cw.j()
            r5 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r1 = r4.j(r1, r2, r5)
            if (r1 == 0) goto L1c
            int r1 = r1.m()
            r2 = 1
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L1c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L9a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L9a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L9a
            java.lang.Object r2 = r1.get(r3)
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.get(r3)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.xt.cw r2 = r2.j
            if (r2 == 0) goto L9a
            com.bytedance.msdk.tl.la.j(r1)
            java.lang.Object r1 = r1.get(r3)
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1
            com.bytedance.msdk.xt.cw r2 = r1.j
            int r2 = r2.om()
            com.bytedance.msdk.xt.cw r1 = r1.j
            double r4 = r1.t()
            r6.xt(r2, r4)
            goto L9a
        Ldd:
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r7 = com.bytedance.msdk.core.ws.xt.j(r7)
            r0 = 2
            r7.j(r0)
        Le9:
            return
    }

    public void j(org.json.JSONObject r5) {
            r4 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            return
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r1 = r1.ol()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.bytedance.msdk.core.oq.cw r2 = (com.bytedance.msdk.core.oq.cw) r2
            if (r2 == 0) goto L20
            org.json.JSONObject r2 = r4.j(r2)     // Catch: org.json.JSONException -> L42
            r0.putOpt(r3, r2)     // Catch: org.json.JSONException -> L42
            goto L20
        L42:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto L20
        L47:
            if (r5 == 0) goto L4c
            r0.length()
        L4c:
            java.lang.String r1 = "last_label_outputs"
            r5.putOpt(r1, r0)     // Catch: org.json.JSONException -> L52
            return
        L52:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    public void j(org.json.JSONObject r2, org.json.JSONObject r3) {
            r1 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            goto L17
        Lb:
            if (r3 == 0) goto L17
            java.lang.String r0 = "label_inputs"
            r2.putOpt(r0, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L17:
            return
    }

    protected void j(boolean r2, com.bytedance.msdk.up.r r3, org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r1 = this;
            r2 = r2 ^ 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "reason"
            r3.j(r0, r2)
            if (r5 == 0) goto L17
            r1.xt(r4)
            if (r4 == 0) goto L17
            java.lang.String r2 = "label"
            r5.put(r2, r4)
        L17:
            return
    }

    public java.util.Map<java.lang.String, org.json.JSONObject> xt(int r9) {
            r8 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto L10
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            return r9
        L10:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 2
            if (r9 != r2) goto L24
            java.util.Map<java.lang.String, double[]> r2 = r8.f2200r
        L1f:
            java.util.Set r2 = r2.entrySet()
            goto L2b
        L24:
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.cw
            java.util.Map r2 = r8.xt(r2)
            goto L1f
        L2b:
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L30:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            double[] r4 = (double[]) r4
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L68
            if (r6 != 0) goto L30
            java.util.Map r4 = r8.j(r5, r4)     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = "config_req_label_value"
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.Exception -> L68
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Exception -> L68
            java.lang.String r7 = "event_label_value"
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Exception -> L68
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Exception -> L68
            if (r4 == 0) goto L6a
            r1.putOpt(r5, r4)     // Catch: java.lang.Exception -> L68
            goto L6a
        L68:
            r4 = move-exception
            goto L78
        L6a:
            if (r6 == 0) goto L30
            if (r3 != 0) goto L74
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L68
            r4.<init>()     // Catch: java.lang.Exception -> L68
            r3 = r4
        L74:
            r3.putOpt(r5, r6)     // Catch: java.lang.Exception -> L68
            goto L30
        L78:
            com.bytedance.sdk.component.utils.vl.j(r4)
            goto L30
        L7c:
            java.lang.String r2 = "event_label_value_root"
            r0.put(r2, r1)
            if (r3 == 0) goto L88
            java.lang.String r1 = "config_req_label_value_root"
            r0.put(r1, r3)
        L88:
            r8.r(r9)
            return r0
    }

    public void xt(int r7, double r8) {
            r6 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.util.Map<java.lang.String, double[]> r0 = r6.f2200r
            java.lang.Object r0 = r0.get(r7)
            double[] r0 = (double[]) r0
            if (r0 != 0) goto L1c
            r0 = 2
            double[] r0 = new double[r0]
        L1c:
            r1 = 0
            r2 = r0[r1]
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r4
            r0[r1] = r2
            r1 = 1
            r2 = r0[r1]
            double r2 = r2 + r8
            r0[r1] = r2
            java.util.Map<java.lang.String, double[]> r8 = r6.f2200r
            r8.put(r7, r0)
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected boolean xt(java.lang.String r2, org.json.JSONObject r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r1 = this;
            com.bytedance.msdk.core.ws.cw r4 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r4 = r4.ol()
            java.lang.Object r4 = r4.get(r2)
            com.bytedance.msdk.core.oq.cw r4 = (com.bytedance.msdk.core.oq.cw) r4
            if (r4 == 0) goto L38
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L34
            r0.<init>()     // Catch: org.json.JSONException -> L34
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L34
            java.lang.String r2 = "label_info"
            org.json.JSONObject r3 = r1.j(r4)     // Catch: org.json.JSONException -> L34
            r0.putOpt(r2, r3)     // Catch: org.json.JSONException -> L34
            java.lang.String r2 = "ecpm_ttl"
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: org.json.JSONException -> L34
            int r3 = r3.b()     // Catch: org.json.JSONException -> L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L34
            r0.putOpt(r2, r3)     // Catch: org.json.JSONException -> L34
            r2 = 1
            return r2
        L34:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L38:
            r2 = 0
            return r2
    }
}
