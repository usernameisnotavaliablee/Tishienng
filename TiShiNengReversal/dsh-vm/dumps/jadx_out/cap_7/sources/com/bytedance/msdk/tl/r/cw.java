package com.bytedance.msdk.tl.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    public static java.util.Map<java.lang.String, java.lang.Object> j;

    public static class j implements com.bytedance.sdk.component.xt.j.g {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        private com.bytedance.sdk.component.xt.j.ws xt(com.bytedance.sdk.component.xt.j.g.j r7) {
                r6 = this;
                java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L6a
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L6a
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L6a
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L6a
                java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L6a
                java.lang.String r3 = "request"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L6a
                r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.cw.xt.s r1 = (com.bytedance.sdk.component.cw.xt.s) r1     // Catch: java.lang.Throwable -> L6a
                java.util.Map<java.lang.String, java.lang.Object> r3 = com.bytedance.msdk.tl.r.cw.j     // Catch: java.lang.Throwable -> L6a
                java.lang.String r4 = "case_id"
                java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.xt.j.ws r4 = r7.j()     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.xt.j.ae r4 = r4.xt()     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.xt.j.ae$j r4 = r4.ae()     // Catch: java.lang.Throwable -> L6a
                java.lang.String r5 = "b4oil169.fn.bytedance.net"
                com.bytedance.sdk.component.xt.j.ae$j r4 = r4.xt(r5)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r5 = "http"
                com.bytedance.sdk.component.xt.j.ae$j r4 = r4.j(r5)     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.xt.j.ae r4 = r4.xt()     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.cw.xt.s$j r1 = r1.m()     // Catch: java.lang.Throwable -> L6a
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.cw.xt.s$j r1 = r1.j(r4)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r4 = "case-id"
                com.bytedance.sdk.component.cw.xt.s$j r1 = r1.xt(r4, r3)     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.cw.xt.s r1 = r1.j()     // Catch: java.lang.Throwable -> L6a
                r2.set(r0, r1)     // Catch: java.lang.Throwable -> L6a
                com.bytedance.sdk.component.xt.j.ws r7 = r7.j()     // Catch: java.lang.Throwable -> L6a
                return r7
            L6a:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                com.bytedance.sdk.component.xt.j.ws r7 = r7.j()
                return r7
        }

        @Override // com.bytedance.sdk.component.xt.j.g
        public com.bytedance.sdk.component.xt.j.av j(com.bytedance.sdk.component.xt.j.g.j r4) throws java.io.IOException {
                r3 = this;
                com.bytedance.sdk.component.xt.j.ws r0 = r4.j()
                com.bytedance.sdk.component.xt.j.ae r1 = r0.xt()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "/api/ad/union/mediation/config"
                boolean r2 = r1.contains(r2)
                if (r2 != 0) goto L1c
                java.lang.String r2 = "/api/ad/union/mediation/exchange"
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L20
            L1c:
                com.bytedance.sdk.component.xt.j.ws r0 = r3.xt(r4)
            L20:
                com.bytedance.sdk.component.xt.j.av r4 = r4.j(r0)
                return r4
        }
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(java.util.Map r0) {
            com.bytedance.msdk.tl.r.cw.j = r0
            return
    }

    public static boolean j() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            return r0
    }
}
