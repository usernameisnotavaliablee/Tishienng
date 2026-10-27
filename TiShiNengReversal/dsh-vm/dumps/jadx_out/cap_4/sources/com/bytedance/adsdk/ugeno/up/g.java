package com.bytedance.adsdk.ugeno.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bytedance.adsdk.ugeno.up.qv {
    private com.bytedance.adsdk.ugeno.xt.cw cw;
    private com.bytedance.adsdk.ugeno.up.g.j j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1987m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.m f1988r;
    private boolean up;
    private java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> xt;

    public static class j {
        public java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> j;
        public java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.cw.xt> xt;

        public j(java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r1, java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.cw.xt> r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    public g(com.bytedance.adsdk.ugeno.xt.cw r1, com.bytedance.adsdk.ugeno.up.g.j r2) {
            r0 = this;
            r0.<init>()
            r0.cw = r1
            r0.j = r2
            if (r2 == 0) goto Ld
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r1 = r2.j
            r0.xt = r1
        Ld:
            return
    }

    public static com.bytedance.adsdk.ugeno.up.g j(com.bytedance.adsdk.ugeno.xt.cw r7, java.lang.String r8) {
            r0 = 0
            if (r7 == 0) goto L9d
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto Lb
            goto L9d
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L71
            r1.<init>(r8)     // Catch: org.json.JSONException -> L71
            int r8 = r1.length()     // Catch: org.json.JSONException -> L71
            if (r8 > 0) goto L17
            return r0
        L17:
            java.util.HashMap r8 = new java.util.HashMap     // Catch: org.json.JSONException -> L71
            r8.<init>()     // Catch: org.json.JSONException -> L71
            java.util.HashMap r2 = new java.util.HashMap     // Catch: org.json.JSONException -> L71
            r2.<init>()     // Catch: org.json.JSONException -> L71
            com.bytedance.adsdk.ugeno.up.g$j r3 = new com.bytedance.adsdk.ugeno.up.g$j     // Catch: org.json.JSONException -> L71
            r3.<init>(r8, r2)     // Catch: org.json.JSONException -> L71
            r8 = 0
        L27:
            int r2 = r1.length()     // Catch: org.json.JSONException -> L71
            if (r8 >= r2) goto L94
            org.json.JSONObject r2 = r1.optJSONObject(r8)     // Catch: org.json.JSONException -> L71
            if (r2 == 0) goto L91
            android.view.View r4 = r7.g()     // Catch: org.json.JSONException -> L71
            android.content.Context r4 = r4.getContext()     // Catch: org.json.JSONException -> L71
            org.json.JSONObject r5 = r7.oq()     // Catch: org.json.JSONException -> L71
            com.bytedance.adsdk.ugeno.up.cw.xt r2 = com.bytedance.adsdk.ugeno.up.cw.xt.j.j(r4, r7, r2, r5)     // Catch: org.json.JSONException -> L71
            if (r2 == 0) goto L91
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r4 = r3.j     // Catch: org.json.JSONException -> L71
            java.lang.String r5 = r2.ae()     // Catch: org.json.JSONException -> L71
            boolean r4 = r4.containsKey(r5)     // Catch: org.json.JSONException -> L71
            if (r4 == 0) goto L77
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r4 = r3.j     // Catch: org.json.JSONException -> L71
            java.lang.String r5 = r2.ae()     // Catch: org.json.JSONException -> L71
            java.lang.Object r4 = r4.get(r5)     // Catch: org.json.JSONException -> L71
            java.util.List r4 = (java.util.List) r4     // Catch: org.json.JSONException -> L71
            if (r4 != 0) goto L73
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L71
            r4.<init>()     // Catch: org.json.JSONException -> L71
            r4.add(r2)     // Catch: org.json.JSONException -> L71
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r5 = r3.j     // Catch: org.json.JSONException -> L71
            java.lang.String r6 = r2.ae()     // Catch: org.json.JSONException -> L71
            r5.put(r6, r4)     // Catch: org.json.JSONException -> L71
            goto L88
        L71:
            r7 = move-exception
            goto L9a
        L73:
            r4.add(r2)     // Catch: org.json.JSONException -> L71
            goto L88
        L77:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L71
            r4.<init>()     // Catch: org.json.JSONException -> L71
            r4.add(r2)     // Catch: org.json.JSONException -> L71
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r5 = r3.j     // Catch: org.json.JSONException -> L71
            java.lang.String r6 = r2.ae()     // Catch: org.json.JSONException -> L71
            r5.put(r6, r4)     // Catch: org.json.JSONException -> L71
        L88:
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.cw.xt> r4 = r3.xt     // Catch: org.json.JSONException -> L71
            java.lang.String r5 = r2.tl()     // Catch: org.json.JSONException -> L71
            r4.put(r5, r2)     // Catch: org.json.JSONException -> L71
        L91:
            int r8 = r8 + 1
            goto L27
        L94:
            com.bytedance.adsdk.ugeno.up.g r8 = new com.bytedance.adsdk.ugeno.up.g     // Catch: org.json.JSONException -> L71
            r8.<init>(r7, r3)     // Catch: org.json.JSONException -> L71
            return r8
        L9a:
            com.bytedance.sdk.component.utils.vl.j(r7)
        L9d:
            return r0
    }

    private void j(java.lang.String r3, java.util.List<com.bytedance.adsdk.ugeno.up.m.j> r4) {
            r2 = this;
            if (r4 == 0) goto L2a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L2a
        L9:
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            com.bytedance.adsdk.ugeno.up.m$j r0 = (com.bytedance.adsdk.ugeno.up.m.j) r0
            if (r0 == 0) goto Ld
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.cw
            com.bytedance.adsdk.ugeno.up.xt.j r0 = com.bytedance.adsdk.ugeno.up.xt.j.C0192j.j(r1, r3, r0)
            if (r0 == 0) goto Ld
            r0.j()
            r0.xt()
            goto Ld
        L2a:
            return
    }

    public void cw() {
            r4 = this;
            com.bytedance.adsdk.ugeno.up.g$j r0 = r4.j
            if (r0 != 0) goto L5
            goto L49
        L5:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r0 = r0.j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lf
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lf
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r2 = (com.bytedance.adsdk.ugeno.up.cw.xt) r2
            boolean r3 = r2 instanceof com.bytedance.adsdk.ugeno.up.cw.cw
            if (r3 == 0) goto L2f
            r2.j(r4)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.j(r3)
            goto L2f
        L49:
            return
    }

    public java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt> j(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r0 = r2.xt
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L1c
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.up.cw.xt>> r0 = r2.xt
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            return r3
        L1c:
            return r1
    }

    public void j() {
            r3 = this;
            java.lang.String r0 = "shake"
            java.util.List r0 = r3.j(r0)
            if (r0 == 0) goto L2b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L2b
        Lf:
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r1 = (com.bytedance.adsdk.ugeno.up.cw.xt) r1
            if (r1 == 0) goto L13
            r1.j(r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.j(r2)
            goto L13
        L2b:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.m r1) {
            r0 = this;
            r0.f1988r = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.qv
    public void j(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, java.util.List<com.bytedance.adsdk.ugeno.up.m.j> r3) {
            r0 = this;
            r0.j(r2, r3)
            return
    }

    public boolean j(android.view.MotionEvent r8) {
            r7 = this;
            java.lang.String r0 = "touchStart"
            java.util.List r0 = r7.j(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L2f
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r4 = (com.bytedance.adsdk.ugeno.up.cw.xt) r4
            boolean r5 = r4 instanceof com.bytedance.adsdk.ugeno.up.cw.tl
            if (r5 == 0) goto L14
            r4.j(r7)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r8
            r4.j(r5)
            goto L14
        L2f:
            java.lang.String r3 = "touchEnd"
            java.util.List r3 = r7.j(r3)
            java.lang.String r4 = "tap"
            java.util.List r4 = r7.j(r4)
            java.lang.String r5 = "slide"
            java.util.List r5 = r7.j(r5)
            if (r0 == 0) goto L6b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6b
            java.util.Iterator r0 = r3.iterator()
        L4d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r3 = (com.bytedance.adsdk.ugeno.up.cw.xt) r3
            boolean r6 = r3 instanceof com.bytedance.adsdk.ugeno.up.cw.ae
            if (r6 == 0) goto L4d
            r3.j(r7)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r8
            boolean r3 = r3.j(r6)
            r7.f1987m = r3
            goto L4d
        L6b:
            if (r4 == 0) goto L73
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7c
        L73:
            if (r5 == 0) goto Le1
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7c
            goto Le1
        L7c:
            boolean r0 = r7.f1987m
            if (r0 == 0) goto L87
            int r0 = r8.getAction()
            if (r0 != r2) goto L87
            return r2
        L87:
            if (r4 == 0) goto Lb1
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lb1
            java.util.Iterator r0 = r4.iterator()
        L93:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r3 = (com.bytedance.adsdk.ugeno.up.cw.xt) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.ugeno.up.cw.up
            if (r4 == 0) goto L93
            r3.j(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r8
            boolean r3 = r3.j(r4)
            r7.up = r3
            goto L93
        Lb1:
            boolean r0 = r7.up
            if (r0 == 0) goto Lb6
            return r2
        Lb6:
            if (r5 == 0) goto Lde
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lde
            java.util.Iterator r0 = r5.iterator()
        Lc2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lde
            java.lang.Object r3 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r3 = (com.bytedance.adsdk.ugeno.up.cw.xt) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.ugeno.up.cw.r
            if (r4 == 0) goto Lc2
            r3.j(r7)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r8
            boolean r8 = r3.j(r0)
            return r8
        Lde:
            boolean r8 = r7.up
            return r8
        Le1:
            boolean r8 = r7.f1987m
            return r8
    }

    public void r() {
            r3 = this;
            java.lang.String r0 = "animateState"
            java.util.List r0 = r3.j(r0)
            if (r0 == 0) goto L2b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L2b
        Lf:
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r1 = (com.bytedance.adsdk.ugeno.up.cw.xt) r1
            if (r1 == 0) goto L13
            r1.j(r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.j(r2)
            goto L13
        L2b:
            return
    }

    public void up() {
            r3 = this;
            java.lang.String r0 = "timer"
            java.util.List r0 = r3.j(r0)
            if (r0 == 0) goto L2b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L2b
        Lf:
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r1 = (com.bytedance.adsdk.ugeno.up.cw.xt) r1
            if (r1 == 0) goto L13
            r1.j(r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.j(r2)
            goto L13
        L2b:
            return
    }

    public void xt() {
            r3 = this;
            java.lang.String r0 = "twist"
            java.util.List r0 = r3.j(r0)
            if (r0 == 0) goto L2b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L2b
        Lf:
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.up.cw.xt r1 = (com.bytedance.adsdk.ugeno.up.cw.xt) r1
            if (r1 == 0) goto L13
            r1.j(r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.j(r2)
            goto L13
        L2b:
            return
    }
}
