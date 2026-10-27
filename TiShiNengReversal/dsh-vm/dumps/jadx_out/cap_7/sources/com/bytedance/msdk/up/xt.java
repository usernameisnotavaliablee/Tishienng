package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static volatile com.bytedance.msdk.up.xt j;
    private java.util.List<com.bytedance.msdk.up.xt.j> xt;

    public static class j {
        private com.bytedance.msdk.up.r j;
        private org.json.JSONObject xt;

        public j(com.bytedance.msdk.up.r r1, org.json.JSONObject r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        public com.bytedance.msdk.up.r j() {
                r1 = this;
                com.bytedance.msdk.up.r r0 = r1.j
                return r0
        }

        public org.json.JSONObject xt() {
                r1 = this;
                org.json.JSONObject r0 = r1.xt
                return r0
        }
    }

    private xt() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.xt = r0
            return
    }

    public static com.bytedance.msdk.up.xt j() {
            com.bytedance.msdk.up.xt r0 = com.bytedance.msdk.up.xt.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.up.xt> r0 = com.bytedance.msdk.up.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.up.xt r1 = com.bytedance.msdk.up.xt.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.up.xt r1 = new com.bytedance.msdk.up.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.up.xt.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.up.xt r0 = com.bytedance.msdk.up.xt.j
            return r0
    }

    public void cw() {
            r2 = this;
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "--==-- 清空埋点辅助模块"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            java.util.List<com.bytedance.msdk.up.xt$j> r0 = r2.xt
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    public void j(com.bytedance.msdk.up.r r3, org.json.JSONObject r4) {
            r2 = this;
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "--==-- 保存到埋点辅助模块"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            java.util.List<com.bytedance.msdk.up.xt$j> r0 = r2.xt
            com.bytedance.msdk.up.xt$j r1 = new com.bytedance.msdk.up.xt$j
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public java.util.List<com.bytedance.msdk.up.xt.j> xt() {
            r1 = this;
            java.util.List<com.bytedance.msdk.up.xt$j> r0 = r1.xt
            return r0
    }
}
