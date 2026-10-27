package com.bykv.vk.openvk.component.video.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r implements com.bykv.vk.openvk.component.video.j.xt.up.xt {
    private com.bytedance.sdk.component.xt.j.vl j;

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.cw()
            r1.j = r0
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.xt
    public com.bykv.vk.openvk.component.video.j.xt.up.j j(com.bykv.vk.openvk.component.video.j.xt.up.up r7) throws java.io.IOException {
            r6 = this;
            com.bytedance.sdk.component.xt.j.ws$j r0 = new com.bytedance.sdk.component.xt.j.ws$j
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.up     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L34
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L11
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L36
            java.lang.String r2 = ""
            goto L36
        L34:
            r7 = move-exception
            goto L70
        L36:
            r0.xt(r3, r2)     // Catch: java.lang.Throwable -> L34
            goto L11
        L3a:
            java.lang.String r1 = r7.xt     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.ws$j r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.ws$j r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.ws r0 = r0.xt()     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.vl r1 = r6.j     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.xt r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.xt.j.av r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "NetworkSoureVolleyImpl"
            int r2 = r0.cw()     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "response code = "
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L34
            r4 = 1
            r3[r4] = r2     // Catch: java.lang.Throwable -> L34
            com.bykv.vk.openvk.component.video.api.m.cw.j(r1, r3)     // Catch: java.lang.Throwable -> L34
            com.bykv.vk.openvk.component.video.j.xt.up.m r1 = new com.bykv.vk.openvk.component.video.j.xt.up.m     // Catch: java.lang.Throwable -> L34
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L34
            return r1
        L70:
            com.bytedance.sdk.component.utils.vl.j(r7)
            r7 = 0
            return r7
    }
}
