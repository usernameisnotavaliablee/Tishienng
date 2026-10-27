package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static final java.lang.String j = null;
    private static final java.lang.String xt = null;


    public interface j<T> {
        void j(int r1, java.lang.String r2);

        void j(T r1);
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "tt_derive"
            r0.<init>(r1)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r3 = "lottie"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r4 = "anim_img"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.xt.j = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r1 = "anim_video"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.xt.xt = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r2) {
            com.bytedance.sdk.component.adexpress.j.j.j r0 = com.bytedance.sdk.component.adexpress.j.j.j.j()
            com.bytedance.sdk.component.adexpress.j.j.cw r0 = r0.cw()
            boolean r0 = r0.vl()
            java.lang.String r1 = com.bytedance.adsdk.lottie.up.xt.j
            java.io.File r2 = com.bytedance.sdk.component.utils.m.j(r2, r0, r1)
            java.lang.String r2 = r2.getAbsolutePath()
            return r2
    }

    public static void j(java.lang.String r2, android.content.Context r3, com.bytedance.adsdk.lottie.up.xt.j<java.io.File> r4) {
            if (r3 == 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            goto L37
        L9:
            com.bytedance.sdk.component.adexpress.j.j.j r0 = com.bytedance.sdk.component.adexpress.j.j.j.j()
            com.bytedance.sdk.component.adexpress.j.j.cw r0 = r0.cw()
            com.bytedance.sdk.component.g.xt.xt r0 = r0.r()
            if (r0 != 0) goto L20
            if (r4 == 0) goto L3f
            r2 = 3
            java.lang.String r3 = "exec is null"
            r4.j(r2, r3)
            return
        L20:
            java.lang.String r3 = j(r3)
            java.lang.String r1 = com.bytedance.sdk.component.utils.up.xt(r2)
            r0.j(r2)
            r0.j(r3, r1)
            com.bytedance.adsdk.lottie.up.xt$1 r2 = new com.bytedance.adsdk.lottie.up.xt$1
            r2.<init>(r4, r3, r1)
            r0.j(r2)
            return
        L37:
            if (r4 == 0) goto L3f
            r2 = 2
            java.lang.String r3 = "url is empty"
            r4.j(r2, r3)
        L3f:
            return
    }

    public static java.lang.String xt(android.content.Context r2) {
            com.bytedance.sdk.component.adexpress.j.j.j r0 = com.bytedance.sdk.component.adexpress.j.j.j.j()
            com.bytedance.sdk.component.adexpress.j.j.cw r0 = r0.cw()
            boolean r0 = r0.vl()
            java.lang.String r1 = com.bytedance.adsdk.lottie.up.xt.xt
            java.io.File r2 = com.bytedance.sdk.component.utils.m.j(r2, r0, r1)
            java.lang.String r2 = r2.getAbsolutePath()
            return r2
    }
}
