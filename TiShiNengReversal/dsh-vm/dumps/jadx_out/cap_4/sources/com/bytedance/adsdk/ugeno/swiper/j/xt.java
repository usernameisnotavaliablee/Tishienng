package com.bytedance.adsdk.ugeno.swiper.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.adsdk.ugeno.viewpager.ViewPager.up {
    final float j;
    final float xt;

    public xt() {
            r1 = this;
            r1.<init>()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.j = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.xt = r0
            return
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.up
    public void j(android.view.View r6, float r7) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 >= 0) goto Le
            r3 = 1045220556(0x3e4ccccc, float:0.19999999)
        La:
            float r3 = r3 * r7
            float r3 = r3 + r0
            goto L12
        Le:
            r3 = -1102263092(0xffffffffbe4ccccc, float:-0.19999999)
            goto La
        L12:
            if (r2 >= 0) goto L1a
            r4 = 1056964608(0x3f000000, float:0.5)
        L16:
            float r7 = r7 * r4
            float r7 = r7 + r0
            goto L1d
        L1a:
            r4 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L16
        L1d:
            if (r2 >= 0) goto L32
            int r0 = r6.getWidth()
            float r0 = (float) r0
            r6.setPivotX(r0)
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r6.setPivotY(r0)
            goto L3f
        L32:
            r6.setPivotX(r1)
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r6.setPivotY(r0)
        L3f:
            r6.setScaleX(r3)
            r6.setScaleY(r3)
            float r7 = java.lang.Math.abs(r7)
            r6.setAlpha(r7)
            return
    }
}
