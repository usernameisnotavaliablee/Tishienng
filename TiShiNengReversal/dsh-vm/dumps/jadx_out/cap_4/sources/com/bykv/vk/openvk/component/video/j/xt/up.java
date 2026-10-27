package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    static volatile int ae;
    public static final boolean cw = false;
    public static volatile java.lang.Integer g;
    static volatile com.bykv.vk.openvk.component.video.j.xt.j.xt j;

    /* renamed from: m, reason: collision with root package name */
    static volatile boolean f1726m;
    private static volatile com.bykv.vk.openvk.component.video.j.xt.xt.cw oq;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile android.content.Context qv;

    /* renamed from: r, reason: collision with root package name */
    public static volatile boolean f1727r;
    public static volatile int tl;
    static volatile boolean up;
    static volatile com.bykv.vk.openvk.component.video.j.xt.j.cw xt;


    static {
            boolean r0 = com.bytedance.sdk.component.utils.vl.cw()
            com.bykv.vk.openvk.component.video.j.xt.up.cw = r0
            r0 = 1
            com.bykv.vk.openvk.component.video.j.xt.up.up = r0
            r0 = 0
            com.bykv.vk.openvk.component.video.j.xt.up.ae = r0
            r0 = 3
            com.bykv.vk.openvk.component.video.j.xt.up.tl = r0
            return
    }

    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.xt.cw cw() {
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = com.bykv.vk.openvk.component.video.j.xt.up.oq
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.bykv.vk.openvk.component.video.j.xt.up.qv
            return r0
    }

    public static com.bykv.vk.openvk.component.video.j.xt.j.cw j() {
            com.bykv.vk.openvk.component.video.j.xt.j.cw r0 = com.bykv.vk.openvk.component.video.j.xt.up.xt
            return r0
    }

    public static void j(int r0) {
            com.bykv.vk.openvk.component.video.j.xt.up.ae = r0
            return
    }

    public static void j(com.bykv.vk.openvk.component.video.j.xt.j.cw r2, android.content.Context r3) {
            if (r2 == 0) goto L5d
            if (r3 == 0) goto L5d
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.bykv.vk.openvk.component.video.j.xt.up.qv = r0
            com.bykv.vk.openvk.component.video.j.xt.j.cw r0 = com.bykv.vk.openvk.component.video.j.xt.up.xt
            if (r0 == 0) goto L13
            return
        L13:
            com.bykv.vk.openvk.component.video.j.xt.j.xt r0 = com.bykv.vk.openvk.component.video.j.xt.up.j
            if (r0 == 0) goto L32
            java.io.File r0 = r0.j
            java.lang.String r0 = r0.getAbsolutePath()
            java.io.File r1 = r2.j
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto L32
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "DiskLruCache and DiskCache can't use the same dir"
            r2.<init>(r3)
            throw r2
        L32:
            com.bykv.vk.openvk.component.video.j.xt.up.xt = r2
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r3 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.j(r3)
            com.bykv.vk.openvk.component.video.j.xt.up.oq = r3
            com.bykv.vk.openvk.component.video.j.xt.j.cw r3 = com.bykv.vk.openvk.component.video.j.xt.up.xt
            com.bykv.vk.openvk.component.video.j.xt.up$1 r0 = new com.bykv.vk.openvk.component.video.j.xt.up$1
            r0.<init>()
            r3.j(r0)
            com.bykv.vk.openvk.component.video.j.xt.m r3 = com.bykv.vk.openvk.component.video.j.xt.m.j()
            r3.j(r2)
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = com.bykv.vk.openvk.component.video.j.xt.up.oq
            r3.j(r0)
            com.bykv.vk.openvk.component.video.j.xt.r r3 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            r3.j(r2)
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r2 = com.bykv.vk.openvk.component.video.j.xt.up.oq
            r3.j(r2)
            return
        L5d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "DiskLruCache and Context can't be null !!!"
            r2.<init>(r3)
            throw r2
    }

    public static void j(boolean r0) {
            com.bykv.vk.openvk.component.video.j.xt.up.up = r0
            return
    }

    public static com.bykv.vk.openvk.component.video.j.xt.j.xt xt() {
            com.bykv.vk.openvk.component.video.j.xt.j.xt r0 = com.bykv.vk.openvk.component.video.j.xt.up.j
            return r0
    }

    public static void xt(boolean r0) {
            com.bykv.vk.openvk.component.video.j.xt.up.f1726m = r0
            return
    }
}
