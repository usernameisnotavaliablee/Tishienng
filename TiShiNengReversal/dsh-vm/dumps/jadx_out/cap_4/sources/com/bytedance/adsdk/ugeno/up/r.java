package com.bytedance.adsdk.ugeno.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private static java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.xt> j;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.adsdk.ugeno.up.r.j = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.ugeno.up.xt j(java.lang.String r1) {
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.xt> r0 = com.bytedance.adsdk.ugeno.up.r.j
            java.lang.Object r1 = r0.get(r1)
            com.bytedance.adsdk.ugeno.up.xt r1 = (com.bytedance.adsdk.ugeno.up.xt) r1
            return r1
    }

    public static void j(java.util.List<com.bytedance.adsdk.ugeno.up.xt> r3) {
            if (r3 == 0) goto L25
            int r0 = r3.size()
            if (r0 > 0) goto L9
            goto L25
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            com.bytedance.adsdk.ugeno.up.xt r0 = (com.bytedance.adsdk.ugeno.up.xt) r0
            if (r0 == 0) goto Ld
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.xt> r1 = com.bytedance.adsdk.ugeno.up.r.j
            java.lang.String r2 = r0.j()
            r1.put(r2, r0)
            goto Ld
        L25:
            return
    }
}
