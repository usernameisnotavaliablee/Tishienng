package com.bytedance.msdk.core.j.j.xt.j.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.msdk.core.j.j.xt.j {


    /* renamed from: com.bytedance.msdk.core.j.j.xt.j.ae.j$j, reason: collision with other inner class name */
    static class C0220j extends com.bytedance.sdk.openadsdk.core.wq.r {
        private com.bytedance.msdk.core.j.j.xt.j j;
        private com.bytedance.msdk.core.j.j.xt.j.ae.xt xt;

        public C0220j(com.bytedance.msdk.core.j.j.xt.j r1) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                return
        }

        private void j(java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r3) {
                r2 = this;
                com.bytedance.msdk.core.j.j.xt.j.ae.xt r0 = r2.xt
                if (r0 != 0) goto Lf
                if (r3 == 0) goto Lf
                com.bytedance.msdk.core.j.j.xt.j.ae.xt r0 = new com.bytedance.msdk.core.j.j.xt.j.ae.xt
                com.bytedance.msdk.core.j.j.xt.j r1 = r2.j
                r0.<init>(r1, r3)
                r2.xt = r0
            Lf:
                return
        }

        public <T> T applyFunction(int r5, com.bykv.vk.openvk.api.proto.PluginValueSet r6, java.lang.Class<T> r7) {
                r4 = this;
                r7 = 60000(0xea60, float:8.4078E-41)
                if (r5 != r7) goto L48
                r5 = 50005(0xc355, float:7.0072E-41)
                java.lang.Class r7 = z0.a.a()
                java.lang.Object r5 = r6.objectValue(r5, r7)
                java.util.function.Function r5 = z0.b.a(r5)
                r7 = 50012(0xc35c, float:7.0082E-41)
                long r6 = r6.longValue(r7)
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r6 = r6 - r0
                com.bytedance.msdk.core.j.j.xt.j r0 = r4.j
                if (r0 == 0) goto L8b
                r1 = 1000(0x3e8, double:4.94E-321)
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 <= 0) goto L8b
                if (r5 == 0) goto L40
                r4.j(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 1
                r5.<init>(r6)
                com.bytedance.msdk.core.j.j.xt.j.ae.xt r6 = r4.xt
                r5.add(r6)
                com.bytedance.msdk.core.j.j.xt.j r6 = r4.j
                r6.j(r5)
                goto L8b
            L40:
                r5 = -999(0xfffffffffffffc19, float:NaN)
                java.lang.String r6 = "adn return data is null"
                r0.j(r5, r6)
                goto L8b
            L48:
                r7 = 60001(0xea61, float:8.408E-41)
                if (r5 != r7) goto L8b
                com.bytedance.msdk.core.j.j.xt.j r5 = r4.j
                if (r5 == 0) goto L8b
                r5 = 50006(0xc356, float:7.0073E-41)
                java.lang.Class r7 = z0.a.a()
                java.lang.Object r5 = r6.objectValue(r5, r7)
                java.util.function.Function r5 = z0.b.a(r5)
                com.bytedance.msdk.core.j.j.xt.j.m.xt r6 = new com.bytedance.msdk.core.j.j.xt.j.m.xt
                r6.<init>(r5)
                int r5 = r6.j()
                r7 = 4004(0xfa4, float:5.611E-42)
                if (r5 == r7) goto L84
                int r5 = r6.j()
                r7 = 4005(0xfa5, float:5.612E-42)
                if (r5 != r7) goto L76
                goto L84
            L76:
                com.bytedance.msdk.core.j.j.xt.j r5 = r4.j
                int r7 = r6.j()
                java.lang.String r6 = r6.xt()
                r5.j(r7, r6)
                goto L8b
            L84:
                com.bytedance.msdk.core.j.j.xt.j.ae.xt r5 = r4.xt
                if (r5 == 0) goto L8b
                r5.j(r6)
            L8b:
                r5 = 0
                return r5
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private void cw(android.content.Context r5) {
            r4 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.cw
            if (r0 == 0) goto L4d
            com.bytedance.msdk.api.j.xt r0 = r4.j
            int r0 = r0.i()
            if (r0 >= 0) goto Lf
            r0 = 3000(0xbb8, float:4.204E-42)
            goto L15
        Lf:
            r1 = 5000(0x1388, float:7.006E-42)
            if (r0 <= r1) goto L15
            r0 = 5000(0x1388, float:7.006E-42)
        L15:
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 40024(0x9c58, float:5.6086E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            com.bytedance.msdk.core.oq.oq r2 = r4.xt
            java.lang.String r2 = r2.w()
            r3 = 50000(0xc350, float:7.0065E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r3, r2)
            r2 = 50011(0xc35b, float:7.008E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bytedance.sdk.openadsdk.i.r r0 = r1.j(r2, r0)
            r1 = 10000(0x2710, float:1.4013E-41)
            com.bytedance.sdk.openadsdk.i.r r5 = r0.j(r1, r5)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r5 = r5.j(r0)
            android.util.SparseArray r5 = r5.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.cw
            com.bytedance.msdk.core.ae.a.a(r0, r5)
        L4d:
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.j.j.xt.j.ae.j r0, android.content.Context r1) {
            r0.xt(r1)
            return
    }

    private void m() {
            r4 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.cw
            if (r0 == 0) goto L5b
            com.bytedance.msdk.core.oq.oq r0 = r4.xt
            if (r0 == 0) goto L5b
            int r0 = r0.oq()
            r1 = 2
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r3 = 10004(0x2714, float:1.4019E-41)
            if (r0 != r1) goto L35
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40027(0x9c5b, float:5.609E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            com.bytedance.msdk.core.j.j.xt.j.ae.j$j r1 = new com.bytedance.msdk.core.j.j.xt.j.ae.j$j
            r1.<init>(r4)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r3, r1)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r4.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
            return
        L35:
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 != r1) goto L5b
        L3a:
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40028(0x9c5c, float:5.6091E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            com.bytedance.msdk.core.j.j.xt.j.ae.j$j r1 = new com.bytedance.msdk.core.j.j.xt.j.ae.j$j
            r1.<init>(r4)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r3, r1)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r4.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L5b:
            return
    }

    private void r() {
            r2 = this;
            com.bytedance.msdk.api.j.xt r0 = r2.j
            boolean r0 = r0.kt()
            if (r0 != 0) goto L26
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L26
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40026(0x9c5a, float:5.6088E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L26:
            return
    }

    private void up() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.ws r1 = r1.p()
            com.bytedance.msdk.api.r.g r1 = r1.xt()
            if (r1 == 0) goto L3d
            double r2 = r1.xt()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "lng"
            r0.put(r3, r2)
            double r1 = r1.j()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "lat"
            r0.put(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "loc_time"
            r0.put(r2, r1)
        L3d:
            com.bytedance.msdk.api.j.xt r1 = r5.j
            boolean r1 = r1.mi()
            if (r1 != 0) goto L4c
            java.lang.String r1 = "shakable"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
        L4c:
            int r1 = r0.size()
            if (r1 <= 0) goto L78
            com.bykv.j.j.j.j.e r1 = com.bykv.j.j.j.j.e.a()
            r2 = 50010(0xc35a, float:7.0079E-41)
            r1.f(r2, r0)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r5.cw
            if (r0 == 0) goto L78
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 40025(0x9c59, float:5.6087E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            android.util.SparseArray r1 = r1.xt()
            com.bytedance.msdk.core.ae.a.a(r0, r1)
        L78:
            return
    }

    private void xt(android.content.Context r1) {
            r0 = this;
            r0.up()
            r0.cw(r1)
            r0.r()
            r0.m()
            return
    }

    @Override // com.bytedance.msdk.core.j.j.xt.j
    protected void j(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.cw()
            if (r0 == 0) goto Lf
            com.bytedance.msdk.core.j.j.xt.j.ae.j$1 r0 = new com.bytedance.msdk.core.j.j.xt.j.ae.j$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
        Lf:
            r1.xt(r2)
            return
    }
}
