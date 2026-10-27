package com.bykv.vk.openvk.component.video.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static java.lang.String cw = null;
    public static boolean j = false;

    /* renamed from: m, reason: collision with root package name */
    private static int f1672m = 1;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f1673r;
    private static com.bytedance.sdk.component.xt.j.vl up;
    private static android.content.Context xt;

    static {
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.sdk.component.xt.j.vl cw() {
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.up
            if (r0 != 0) goto L21
            com.bytedance.sdk.component.xt.j.vl$j r0 = new com.bytedance.sdk.component.xt.j.vl$j
            java.lang.String r1 = "v_config"
            r0.<init>(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 10000(0x2710, double:4.9407E-320)
            com.bytedance.sdk.component.xt.j.vl$j r0 = r0.j(r2, r1)
            com.bytedance.sdk.component.xt.j.vl$j r0 = r0.xt(r2, r1)
            com.bytedance.sdk.component.xt.j.vl$j r0 = r0.cw(r2, r1)
            com.bytedance.sdk.component.xt.j.vl r0 = r0.j()
            com.bykv.vk.openvk.component.video.api.cw.up = r0
        L21:
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.up
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.bykv.vk.openvk.component.video.api.cw.xt
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = com.bykv.vk.openvk.component.video.api.cw.cw
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2b
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L27
            android.content.Context r1 = getContext()     // Catch: java.lang.Throwable -> L27
            java.io.File r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "ttad_dir"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L20
            r0.mkdirs()     // Catch: java.lang.Throwable -> L27
        L20:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.openvk.component.video.api.cw.cw = r0     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2b:
            java.lang.String r0 = com.bykv.vk.openvk.component.video.api.cw.cw
            return r0
    }

    public static void j(android.content.Context r0, java.lang.String r1) {
            com.bykv.vk.openvk.component.video.api.cw.xt = r0
            com.bykv.vk.openvk.component.video.api.cw.cw = r1
            return
    }

    public static void j(com.bytedance.sdk.component.xt.j.vl r0) {
            com.bykv.vk.openvk.component.video.api.cw.up = r0
            return
    }

    public static void j(boolean r0) {
            com.bykv.vk.openvk.component.video.api.cw.f1673r = r0
            return
    }

    public static boolean r() {
            boolean r0 = com.bykv.vk.openvk.component.video.api.cw.j
            return r0
    }

    public static int up() {
            int r0 = com.bykv.vk.openvk.component.video.api.cw.f1672m
            return r0
    }

    public static boolean xt() {
            boolean r0 = com.bykv.vk.openvk.component.video.api.cw.f1673r
            return r0
    }
}
