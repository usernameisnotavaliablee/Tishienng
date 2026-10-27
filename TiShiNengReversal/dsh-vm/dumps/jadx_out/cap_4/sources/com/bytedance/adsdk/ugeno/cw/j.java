package com.bytedance.adsdk.ugeno.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private java.util.List<com.bytedance.adsdk.ugeno.cw.j.C0187j> cw;
    private java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f1920m;

    /* renamed from: r, reason: collision with root package name */
    private long f1921r;
    private long up;
    private float xt;

    /* renamed from: com.bytedance.adsdk.ugeno.cw.j$j, reason: collision with other inner class name */
    public static class C0187j {
        private float ae;
        private java.lang.String cw;
        private java.lang.String g;
        private long j;

        /* renamed from: m, reason: collision with root package name */
        private float f1922m;
        private java.lang.String oq;

        /* renamed from: r, reason: collision with root package name */
        private long f1923r;
        private float[] tl;
        private java.lang.String up;
        private float xt;

        public C0187j() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.bytedance.adsdk.ugeno.cw.j.C0187j j(org.json.JSONObject r9, com.bytedance.adsdk.ugeno.xt.cw r10) {
                r0 = 0
                if (r9 != 0) goto L4
                return r0
            L4:
                com.bytedance.adsdk.ugeno.cw.j$j r1 = new com.bytedance.adsdk.ugeno.cw.j$j
                r1.<init>()
                java.lang.String r2 = "duration"
                long r2 = r9.optLong(r2)
                r1.j(r2)
                java.lang.String r2 = "loop"
                java.lang.String r2 = r9.optString(r2)
                java.lang.String r3 = "infinite"
                boolean r3 = android.text.TextUtils.equals(r3, r2)
                if (r3 == 0) goto L26
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.j(r2)
                goto L32
            L26:
                float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L2e
                r1.j(r2)     // Catch: java.lang.NumberFormatException -> L2e
                goto L32
            L2e:
                r2 = 0
                r1.j(r2)
            L32:
                java.lang.String r2 = "loopMode"
                java.lang.String r2 = r9.optString(r2)
                r1.j(r2)
                java.lang.String r2 = "type"
                java.lang.String r2 = r9.optString(r2)
                r1.xt(r2)
                java.lang.String r2 = r1.getType()
                java.lang.String r3 = "ripple"
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L59
                java.lang.String r2 = "rippleColor"
                java.lang.String r2 = r9.optString(r2)
                r1.cw(r2)
            L59:
                android.view.View r2 = r10.g()
                if (r2 == 0) goto L63
                android.content.Context r0 = r2.getContext()
            L63:
                java.lang.String r2 = r1.getType()
                java.lang.String r3 = "backgroundColor"
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                java.lang.String r3 = "translateY"
                java.lang.String r4 = "translateX"
                java.lang.String r5 = "valueFrom"
                java.lang.String r6 = "valueTo"
                if (r2 == 0) goto L98
                java.lang.String r2 = r9.optString(r6)
                org.json.JSONObject r6 = r10.oq()
                java.lang.String r2 = com.bytedance.adsdk.ugeno.r.xt.j(r2, r6)
                java.lang.String r5 = r9.optString(r5)
                int r5 = com.bytedance.adsdk.ugeno.m.j.j(r5)
                int r2 = com.bytedance.adsdk.ugeno.m.j.j(r2)
                float r5 = (float) r5
                r1.xt(r5)
                float r2 = (float) r2
                r1.cw(r2)
                goto Ldf
            L98:
                java.lang.String r2 = r1.getType()
                boolean r2 = android.text.TextUtils.equals(r2, r4)
                if (r2 != 0) goto Lac
                java.lang.String r2 = r1.getType()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto Lcf
            Lac:
                if (r0 == 0) goto Lcf
                double r7 = r9.optDouble(r5)     // Catch: java.lang.Exception -> Lc7
                float r2 = (float) r7     // Catch: java.lang.Exception -> Lc7
                float r2 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r2)     // Catch: java.lang.Exception -> Lc7
                double r5 = r9.optDouble(r6)     // Catch: java.lang.Exception -> Lc7
                float r5 = (float) r5     // Catch: java.lang.Exception -> Lc7
                float r5 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r5)     // Catch: java.lang.Exception -> Lc7
                r1.xt(r2)     // Catch: java.lang.Exception -> Lc7
                r1.cw(r5)     // Catch: java.lang.Exception -> Lc7
                goto Ldf
            Lc7:
                java.lang.String r2 = "animation"
                java.lang.String r5 = "animation "
                com.bytedance.sdk.component.utils.vl.r(r2, r5)
                goto Ldf
            Lcf:
                double r7 = r9.optDouble(r5)
                float r2 = (float) r7
                r1.xt(r2)
                double r5 = r9.optDouble(r6)
                float r2 = (float) r5
                r1.cw(r2)
            Ldf:
                java.lang.String r2 = "interpolator"
                java.lang.String r2 = r9.optString(r2)
                r1.r(r2)
                java.lang.String r2 = "startDelay"
                java.lang.String r2 = r9.optString(r2)
                org.json.JSONObject r5 = r10.oq()
                java.lang.String r2 = com.bytedance.adsdk.ugeno.r.xt.j(r2, r5)
                r5 = 0
                long r5 = com.bytedance.adsdk.ugeno.m.cw.j(r2, r5)
                r1.xt(r5)
                java.lang.String r2 = "values"
                org.json.JSONArray r9 = r9.optJSONArray(r2)
                if (r9 == 0) goto L161
                int r2 = r9.length()
                if (r2 <= 0) goto L161
                int r2 = r9.length()
                float[] r2 = new float[r2]
                java.lang.String r5 = r1.getType()
                boolean r4 = android.text.TextUtils.equals(r5, r4)
                r5 = 0
                if (r4 != 0) goto L128
                java.lang.String r4 = r1.getType()
                boolean r3 = android.text.TextUtils.equals(r4, r3)
                if (r3 == 0) goto L146
            L128:
                if (r0 == 0) goto L146
            L12a:
                int r3 = r9.length()
                if (r5 >= r3) goto L15e
                java.lang.String r3 = r9.optString(r5)
                org.json.JSONObject r4 = r10.oq()
                double r3 = com.bytedance.adsdk.ugeno.cw.j.j(r3, r4)
                float r3 = (float) r3
                float r3 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r3)
                r2[r5] = r3
                int r5 = r5 + 1
                goto L12a
            L146:
                int r0 = r9.length()
                if (r5 >= r0) goto L15e
                java.lang.String r0 = r9.optString(r5)
                org.json.JSONObject r3 = r10.oq()
                double r3 = com.bytedance.adsdk.ugeno.cw.j.j(r0, r3)
                float r0 = (float) r3
                r2[r5] = r0
                int r5 = r5 + 1
                goto L146
            L15e:
                r1.j(r2)
            L161:
                return r1
        }

        public float[] ae() {
                r1 = this;
                float[] r0 = r1.tl
                return r0
        }

        public java.lang.String cw() {
                r1 = this;
                java.lang.String r0 = r1.cw
                return r0
        }

        public void cw(float r1) {
                r0 = this;
                r0.ae = r1
                return
        }

        public void cw(java.lang.String r1) {
                r0 = this;
                r0.oq = r1
                return
        }

        public java.lang.String g() {
                r1 = this;
                java.lang.String r0 = r1.oq
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.up
                return r0
        }

        public long j() {
                r2 = this;
                long r0 = r2.j
                return r0
        }

        public void j(float r1) {
                r0 = this;
                r0.xt = r1
                return
        }

        public void j(long r1) {
                r0 = this;
                r0.j = r1
                return
        }

        public void j(java.lang.String r1) {
                r0 = this;
                r0.cw = r1
                return
        }

        public void j(float[] r1) {
                r0 = this;
                r0.tl = r1
                return
        }

        public float m() {
                r1 = this;
                float r0 = r1.ae
                return r0
        }

        public long r() {
                r2 = this;
                long r0 = r2.f1923r
                return r0
        }

        public void r(java.lang.String r1) {
                r0 = this;
                r0.g = r1
                return
        }

        public java.lang.String tl() {
                r1 = this;
                java.lang.String r0 = r1.g
                return r0
        }

        public float up() {
                r1 = this;
                float r0 = r1.f1922m
                return r0
        }

        public float xt() {
                r1 = this;
                float r0 = r1.xt
                return r0
        }

        public void xt(float r1) {
                r0 = this;
                r0.f1922m = r1
                return
        }

        public void xt(long r1) {
                r0 = this;
                r0.f1923r = r1
                return
        }

        public void xt(java.lang.String r1) {
                r0 = this;
                r0.up = r1
                return
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double j(java.lang.Object r3, org.json.JSONObject r4) {
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.bytedance.adsdk.ugeno.r.xt.j(r3, r4)
            double r3 = com.bytedance.adsdk.ugeno.m.cw.j(r3, r1)
            return r3
        L11:
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 == 0) goto L1c
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            return r3
        L1c:
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L27
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            return r3
        L27:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L32
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            return r3
        L32:
            return r1
    }

    public static com.bytedance.adsdk.ugeno.cw.j j(java.lang.String r2, com.bytedance.adsdk.ugeno.xt.cw r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L12
            r0.<init>(r2)     // Catch: org.json.JSONException -> L12
            com.bytedance.adsdk.ugeno.cw.j r2 = j(r0, r3)     // Catch: org.json.JSONException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r1
    }

    public static com.bytedance.adsdk.ugeno.cw.j j(org.json.JSONObject r1, com.bytedance.adsdk.ugeno.xt.cw r2) {
            r0 = 0
            com.bytedance.adsdk.ugeno.cw.j r1 = j(r1, r0, r2)
            return r1
    }

    public static com.bytedance.adsdk.ugeno.cw.j j(org.json.JSONObject r6, org.json.JSONObject r7, com.bytedance.adsdk.ugeno.xt.cw r8) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.bytedance.adsdk.ugeno.cw.j r0 = new com.bytedance.adsdk.ugeno.cw.j
            r0.<init>()
            java.lang.String r1 = "ordering"
            java.lang.String r1 = r6.optString(r1)
            r0.j(r1)
            java.lang.String r1 = "loop"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r2 = "infinite"
            boolean r2 = android.text.TextUtils.equals(r2, r1)
            if (r2 == 0) goto L26
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r1)
            goto L32
        L26:
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L2e
            r0.j(r1)     // Catch: java.lang.NumberFormatException -> L2e
            goto L32
        L2e:
            r1 = 0
            r0.j(r1)
        L32:
            java.lang.String r1 = "duration"
            r2 = 0
            long r4 = r6.optLong(r1, r2)
            r0.j(r4)
            java.lang.String r1 = "startDelay"
            java.lang.String r1 = r6.optString(r1)
            org.json.JSONObject r4 = r8.oq()
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r4)
            long r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r2)
            r0.xt(r1)
            java.lang.String r1 = "loopMode"
            java.lang.String r1 = r6.optString(r1)
            r0.xt(r1)
            java.lang.String r1 = "animators"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 == 0) goto L85
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L69:
            int r3 = r6.length()
            if (r2 >= r3) goto L82
            org.json.JSONObject r3 = r6.optJSONObject(r2)
            if (r7 == 0) goto L78
            com.bytedance.adsdk.ugeno.m.xt.j(r7, r3)
        L78:
            com.bytedance.adsdk.ugeno.cw.j$j r3 = com.bytedance.adsdk.ugeno.cw.j.C0187j.j(r3, r8)
            r1.add(r3)
            int r2 = r2 + 1
            goto L69
        L82:
            r0.j(r1)
        L85:
            return r0
    }

    public java.util.List<com.bytedance.adsdk.ugeno.cw.j.C0187j> cw() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.cw.j$j> r0 = r1.cw
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public void j(float r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.f1921r = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(java.util.List<com.bytedance.adsdk.ugeno.cw.j.C0187j> r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f1920m
            return r0
    }

    public long r() {
            r2 = this;
            long r0 = r2.f1921r
            return r0
    }

    public long up() {
            r2 = this;
            long r0 = r2.up
            return r0
    }

    public float xt() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    public void xt(long r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.f1920m = r1
            return
    }
}
