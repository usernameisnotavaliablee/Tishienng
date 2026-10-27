package com.scwang.smartrefresh.header.waveswipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AnimationImageView extends android.widget.ImageView {
    private android.view.animation.Animation.AnimationListener a;

    public AnimationImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public void onAnimationEnd() {
            r2 = this;
            super.onAnimationEnd()
            android.view.animation.Animation$AnimationListener r0 = r2.a
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationEnd(r1)
        Le:
            return
    }

    @Override // android.view.View
    public void onAnimationStart() {
            r2 = this;
            super.onAnimationStart()
            android.view.animation.Animation$AnimationListener r0 = r2.a
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationStart(r1)
        Le:
            return
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
