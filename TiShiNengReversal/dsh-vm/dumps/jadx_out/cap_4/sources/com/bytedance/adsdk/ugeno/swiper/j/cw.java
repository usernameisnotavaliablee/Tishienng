package com.bytedance.adsdk.ugeno.swiper.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.adsdk.ugeno.viewpager.ViewPager.up {
    private java.lang.String j;

    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.up
    public void j(android.view.View r4, float r5) {
            r3 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L26
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            r4.setAlpha(r0)
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r2 = -r5
            float r0 = r0 * r2
            r4.setTranslationX(r0)
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r5
            r4.setTranslationY(r0)
            goto L29
        L26:
            r4.setAlpha(r1)
        L29:
            java.lang.String r0 = r3.j
            java.lang.String r2 = "cube"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L52
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            int r0 = r4.getHeight()
            float r1 = (float) r0
        L3c:
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r5 = r5 * r2
            r4.setPivotX(r0)
            r4.setPivotY(r1)
            r4.setRotationX(r5)
        L52:
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }
}
