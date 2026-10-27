package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class n {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r2 = 0
            c(r1, r0, r2)
            return
    }

    public static void b(android.content.Context r1, java.util.List<java.lang.String> r2) {
            r0 = 0
            c(r1, r2, r0)
            return
    }

    public static void c(android.content.Context r3, java.util.List<java.lang.String> r4, int r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r1 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r3, r1)
            int r1 = r4.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r4 = r4.toArray(r1)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r1 = "is_show_save_button"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L33
            android.app.Activity r3 = (android.app.Activity) r3
            int r4 = com.bxkj.base.R.anim.zoom_ente
            int r5 = com.bxkj.base.R.anim.zoom_exit
            r3.overridePendingTransition(r4, r5)
        L33:
            return
    }
}
