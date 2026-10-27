package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class r {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static android.content.Context cw;
    private static java.lang.String j;
    private static android.content.res.Resources xt;

    static {
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int cw(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "id"
            int r1 = j(r1, r2, r0)
            return r1
    }

    public static int j(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "raw"
            int r1 = j(r1, r2, r0)
            return r1
    }

    private static int j(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = com.bytedance.adsdk.ugeno.m.r.xt
            if (r0 != 0) goto La
            android.content.res.Resources r0 = r1.getResources()
            com.bytedance.adsdk.ugeno.m.r.xt = r0
        La:
            android.content.res.Resources r0 = com.bytedance.adsdk.ugeno.m.r.xt
            java.lang.String r1 = j(r1)
            int r1 = r0.getIdentifier(r2, r3, r1)
            return r1
    }

    private static java.lang.String j(android.content.Context r1) {
            java.lang.String r0 = com.bytedance.adsdk.ugeno.m.r.j
            if (r0 != 0) goto La
            java.lang.String r1 = r1.getPackageName()
            com.bytedance.adsdk.ugeno.m.r.j = r1
        La:
            java.lang.String r1 = com.bytedance.adsdk.ugeno.m.r.j
            return r1
    }

    public static int xt(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "drawable"
            int r1 = j(r1, r2, r0)
            return r1
    }
}
