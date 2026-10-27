package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.adsdk.ugeno.r.j {

    static class j implements com.bytedance.adsdk.ugeno.r.j.InterfaceC0191j {
        private com.bytedance.adsdk.xt.xt.j j;
        private java.lang.String xt;

        private j(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.xt = r1
                com.bytedance.adsdk.xt.xt.j r1 = com.bytedance.adsdk.xt.xt.j.j(r1)
                r0.j = r1
                return
        }

        public static com.bytedance.adsdk.xt.cw.j j(java.lang.String r1) {
                com.bytedance.adsdk.xt.cw$j r0 = new com.bytedance.adsdk.xt.cw$j
                r0.<init>(r1)
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.r.j.InterfaceC0191j
        public java.lang.Object j(org.json.JSONObject r2) {
                r1 = this;
                com.bytedance.adsdk.xt.xt.j r0 = r1.j
                if (r0 != 0) goto L7
                java.lang.String r2 = r1.xt
                return r2
            L7:
                java.lang.Object r2 = r0.j(r2)
                boolean r0 = r2 instanceof java.lang.String
                if (r0 == 0) goto L10
                return r2
            L10:
                boolean r0 = r2 instanceof com.bytedance.adsdk.xt.xt.j.j
                if (r0 == 0) goto L1f
                com.bytedance.adsdk.xt.xt.j.j r2 = (com.bytedance.adsdk.xt.xt.j.j) r2
                java.lang.Object r2 = com.bytedance.adsdk.xt.qv.j(r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                return r2
            L1f:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                return r2
        }
    }

    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.r.j
    public com.bytedance.adsdk.ugeno.r.j.InterfaceC0191j j(java.lang.String r1) {
            r0 = this;
            com.bytedance.adsdk.xt.cw$j r1 = com.bytedance.adsdk.xt.cw.j.j(r1)
            return r1
    }
}
