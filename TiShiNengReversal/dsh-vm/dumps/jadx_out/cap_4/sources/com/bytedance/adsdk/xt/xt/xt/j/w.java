package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w extends com.bytedance.adsdk.xt.xt.xt.j.i {

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> f2073r = null;


    static {
            com.bytedance.adsdk.xt.xt.xt.j.w$1 r0 = new com.bytedance.adsdk.xt.xt.xt.j.w$1
            r0.<init>()
            com.bytedance.adsdk.xt.xt.xt.j.w.f2073r = r0
            return
    }

    public w() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.cw r0 = com.bytedance.adsdk.xt.xt.r.cw.qv
            r1.<init>(r0)
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r4) {
            r3 = this;
            com.bytedance.adsdk.xt.xt.xt.j r0 = r3.j
            java.lang.Object r0 = r0.j(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.bytedance.adsdk.xt.xt.xt.j r2 = r3.xt
            java.lang.Object r4 = r2.j(r4)
            if (r4 != 0) goto L13
            return r1
        L13:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L25
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L1c
            goto L25
        L1c:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r4 = com.bytedance.adsdk.xt.xt.up.j.tl.j(r0, r4)
            return r4
        L25:
            java.lang.ThreadLocal<java.lang.StringBuilder> r1 = com.bytedance.adsdk.xt.xt.xt.j.w.f2073r
            java.lang.Object r1 = r1.get()
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0 = 0
            r1.setLength(r0)
            return r4
    }
}
