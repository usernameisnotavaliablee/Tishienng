package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class nt {
    private static final com.bytedance.embedapplog.y j = null;
    private static final java.util.Map<java.lang.String, java.lang.String> xt = null;

    static {
            com.bytedance.embedapplog.y r0 = new com.bytedance.embedapplog.y
            r0.<init>()
            com.bytedance.embedapplog.nt.j = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.embedapplog.nt.xt = r0
            return
    }

    public nt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bytedance.embedapplog.nt.xt
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.bytedance.embedapplog.y r1 = com.bytedance.embedapplog.nt.j
            java.lang.String r1 = r1.j(r2)
            if (r1 == 0) goto L16
            r0.put(r2, r1)
        L16:
            return r1
    }
}
