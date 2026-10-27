package com.bytedance.adsdk.ugeno.swiper.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bytedance.adsdk.ugeno.viewpager.ViewPager.up {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.up
    public void j(android.view.View r4, float r5) {
            r3 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            int r0 = r4.getWidth()
            float r0 = (float) r0
        La:
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r2 = 1119092736(0x42b40000, float:90.0)
            float r5 = r5 * r2
            r4.setPivotX(r0)
            r4.setPivotY(r1)
            r4.setRotationY(r5)
            return
    }
}
