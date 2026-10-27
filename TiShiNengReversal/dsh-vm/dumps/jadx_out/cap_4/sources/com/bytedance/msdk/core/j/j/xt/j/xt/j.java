package com.bytedance.msdk.core.j.j.xt.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.msdk.core.j.j.xt.j {


    /* renamed from: com.bytedance.msdk.core.j.j.xt.j.xt.j$j, reason: collision with other inner class name */
    static class C0226j extends com.bytedance.sdk.openadsdk.core.wq.r {
        private com.bytedance.msdk.core.j.j.xt.j j;
        private android.content.Context xt;

        public C0226j(com.bytedance.msdk.core.j.j.xt.j r1) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                return
        }

        public <T> T applyFunction(int r4, com.bykv.vk.openvk.api.proto.PluginValueSet r5, java.lang.Class<T> r6) {
                r3 = this;
                r6 = 60000(0xea60, float:8.4078E-41)
                if (r4 != r6) goto L54
                r4 = 50015(0xc35f, float:7.0086E-41)
                java.lang.Class<java.util.List> r6 = java.util.List.class
                java.lang.Object r4 = r5.objectValue(r4, r6)
                java.util.List r4 = (java.util.List) r4
                com.bytedance.msdk.core.j.j.xt.j r5 = r3.j
                if (r5 == 0) goto L7e
                if (r4 == 0) goto L4a
                int r5 = r4.size()
                if (r5 <= 0) goto L4a
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r4.size()
                r5.<init>(r6)
                java.util.Iterator r4 = r4.iterator()
            L29:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L44
                java.lang.Object r6 = r4.next()
                java.util.function.Function r6 = z0.b.a(r6)
                com.bytedance.msdk.core.j.j.xt.j.xt.xt r0 = new com.bytedance.msdk.core.j.j.xt.j.xt.xt
                android.content.Context r1 = r3.xt
                com.bytedance.msdk.core.j.j.xt.j r2 = r3.j
                r0.<init>(r1, r2, r6)
                r5.add(r0)
                goto L29
            L44:
                com.bytedance.msdk.core.j.j.xt.j r4 = r3.j
                r4.j(r5)
                goto L7e
            L4a:
                com.bytedance.msdk.core.j.j.xt.j r4 = r3.j
                r5 = -999(0xfffffffffffffc19, float:NaN)
                java.lang.String r6 = "adn return data is null"
                r4.j(r5, r6)
                goto L7e
            L54:
                r6 = 60001(0xea61, float:8.408E-41)
                if (r4 != r6) goto L7e
                com.bytedance.msdk.core.j.j.xt.j r4 = r3.j
                if (r4 == 0) goto L7e
                r4 = 50006(0xc356, float:7.0073E-41)
                java.lang.Class r6 = z0.a.a()
                java.lang.Object r4 = r5.objectValue(r4, r6)
                java.util.function.Function r4 = z0.b.a(r4)
                com.bytedance.msdk.core.j.j.xt.j.m.xt r5 = new com.bytedance.msdk.core.j.j.xt.j.m.xt
                r5.<init>(r4)
                com.bytedance.msdk.core.j.j.xt.j r4 = r3.j
                int r6 = r5.j()
                java.lang.String r5 = r5.xt()
                r4.j(r6, r5)
            L7e:
                r4 = 0
                return r4
        }

        public void j(android.content.Context r1) {
                r0 = this;
                r0.xt = r1
                return
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private void cw(android.content.Context r3) {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L40
            com.bytedance.msdk.api.j.xt r0 = r2.j
            if (r0 == 0) goto L40
            com.bytedance.msdk.core.j.j.xt.j.xt.j$j r0 = new com.bytedance.msdk.core.j.j.xt.j.xt.j$j
            r0.<init>(r2)
            r0.j(r3)
            com.bytedance.sdk.openadsdk.i.r r3 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40037(0x9c65, float:5.6104E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1)
            r1 = 10004(0x2714, float:1.4019E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1, r0)
            com.bytedance.msdk.api.j.xt r0 = r2.j
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 10013(0x271d, float:1.4031E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1, r0)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L40:
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.j.j.xt.j.xt.j r0, android.content.Context r1) {
            r0.xt(r1)
            return
    }

    private void m() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.cw
            if (r0 == 0) goto L2b
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40020(0x9c54, float:5.608E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            com.bytedance.msdk.api.j.xt r1 = r3.j
            java.util.Map r1 = r1.c()
            r2 = 50010(0xc35a, float:7.0079E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2, r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L2b:
            return
    }

    private void r() {
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
            int r1 = r0.size()
            if (r1 <= 0) goto L6f
            com.bykv.j.j.j.j.e r1 = com.bykv.j.j.j.j.e.a()
            r2 = 50010(0xc35a, float:7.0079E-41)
            r1.f(r2, r0)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r5.cw
            if (r1 == 0) goto L6f
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()
            r3 = 40025(0x9c59, float:5.6087E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r3)
            com.bytedance.sdk.openadsdk.i.r r0 = r1.j(r2, r0)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r5.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L6f:
            return
    }

    private void r(android.content.Context r4) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.cw
            if (r0 == 0) goto L31
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40036(0x9c64, float:5.6102E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            com.bytedance.msdk.core.oq.oq r1 = r3.xt
            java.lang.String r1 = r1.w()
            r2 = 50000(0xc350, float:7.0065E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2, r1)
            r1 = 10000(0x2710, float:1.4013E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r1, r4)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r0)
            android.util.SparseArray r4 = r4.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.cw
            com.bytedance.msdk.core.ae.a.a(r0, r4)
        L31:
            return
    }

    private void up() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.cw
            if (r0 == 0) goto L2b
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 40019(0x9c53, float:5.6079E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            com.bytedance.msdk.api.j.xt r1 = r3.j
            java.util.Map r1 = r1.c()
            r2 = 50010(0xc35a, float:7.0079E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2, r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L2b:
            return
    }

    private void xt(android.content.Context r1) {
            r0 = this;
            r0.r()
            r0.r(r1)
            r0.up()
            r0.m()
            r0.cw(r1)
            return
    }

    @Override // com.bytedance.msdk.core.j.j.xt.j
    protected void j(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.cw()
            if (r0 == 0) goto Lf
            com.bytedance.msdk.core.j.j.xt.j.xt.j$1 r0 = new com.bytedance.msdk.core.j.j.xt.j.xt.j$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
        Lf:
            r1.xt(r2)
            return
    }
}
