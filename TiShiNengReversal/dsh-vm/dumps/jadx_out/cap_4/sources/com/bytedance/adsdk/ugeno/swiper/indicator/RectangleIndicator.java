package com.bytedance.adsdk.ugeno.swiper.indicator;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RectangleIndicator extends com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator {
    public RectangleIndicator(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator
    public android.graphics.drawable.Drawable xt(int r3) {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            r0.setColor(r3)
            return r0
    }
}
