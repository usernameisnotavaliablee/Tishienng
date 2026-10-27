package com.bykv.vk.openvk.component.video.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.xt.xt> j = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.j.xt.cw.j = r0
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void j(android.content.Context r3, com.bykv.vk.openvk.component.video.api.cw.r r4, com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j r5) {
            java.lang.Class<com.bykv.vk.openvk.component.video.j.j.xt.cw> r0 = com.bykv.vk.openvk.component.video.j.j.xt.cw.class
            monitor-enter(r0)
            if (r4 != 0) goto Le
            java.lang.String r3 = " url、dir and hash is must property   in VideoInfoModel"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r3 = move-exception
            goto L3f
        Le:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc
            r2 = 23
            if (r1 < r2) goto L37
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.xt.xt> r1 = com.bykv.vk.openvk.component.video.j.j.xt.cw.j     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = r4.i()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> Lc
            com.bykv.vk.openvk.component.video.j.j.xt.xt r2 = (com.bykv.vk.openvk.component.video.j.j.xt.xt) r2     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L34
            com.bykv.vk.openvk.component.video.j.j.xt.xt r2 = new com.bykv.vk.openvk.component.video.j.j.xt.xt     // Catch: java.lang.Throwable -> Lc
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = r4.i()     // Catch: java.lang.Throwable -> Lc
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> Lc
            r4.m()     // Catch: java.lang.Throwable -> Lc
            r4.i()     // Catch: java.lang.Throwable -> Lc
        L34:
            r2.j(r5)     // Catch: java.lang.Throwable -> Lc
        L37:
            r4.m()     // Catch: java.lang.Throwable -> Lc
            r4.i()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public static synchronized void j(com.bykv.vk.openvk.component.video.api.cw.r r3) {
            java.lang.Class<com.bykv.vk.openvk.component.video.j.j.xt.cw> r0 = com.bykv.vk.openvk.component.video.j.j.xt.cw.class
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1c
            r2 = 23
            if (r1 < r2) goto L24
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.xt.xt> r1 = com.bykv.vk.openvk.component.video.j.j.xt.cw.j     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r3.i()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L1c
            com.bykv.vk.openvk.component.video.j.j.xt.xt r1 = (com.bykv.vk.openvk.component.video.j.j.xt.xt) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            r2 = 1
            r1.j(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            r3.m()     // Catch: java.lang.Throwable -> L1c
            r3.i()     // Catch: java.lang.Throwable -> L1c
        L24:
            monitor-exit(r0)
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }
}
