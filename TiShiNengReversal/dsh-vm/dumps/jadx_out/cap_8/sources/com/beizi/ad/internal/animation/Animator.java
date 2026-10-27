package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Animator extends android.widget.ViewAnimator {
    private com.beizi.ad.internal.animation.f a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.animation.h f6622b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.animation.g f6623c;

    /* renamed from: d, reason: collision with root package name */
    private long f6624d;

    public Animator(android.content.Context r1, com.beizi.ad.internal.animation.h r2, com.beizi.ad.internal.animation.g r3, long r4) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            r0.f6622b = r2
            r0.f6623c = r3
            r0.f6624d = r4
            com.beizi.ad.internal.animation.f r1 = com.beizi.ad.internal.animation.a.a(r2, r4, r3)
            r0.a = r1
            r0.setAnimation()
            return
    }

    @Override // android.view.View
    public void clearAnimation() {
            r1 = this;
            r0 = 0
            r1.setInAnimation(r0)
            r1.setOutAnimation(r0)
            return
    }

    public com.beizi.ad.internal.animation.g getTransitionDirection() {
            r1 = this;
            com.beizi.ad.internal.animation.g r0 = r1.f6623c
            return r0
    }

    public long getTransitionDuration() {
            r2 = this;
            long r0 = r2.f6624d
            return r0
    }

    public com.beizi.ad.internal.animation.h getTransitionType() {
            r1 = this;
            com.beizi.ad.internal.animation.h r0 = r1.f6622b
            return r0
    }

    public void setAnimation() {
            r1 = this;
            com.beizi.ad.internal.animation.f r0 = r1.a
            if (r0 == 0) goto L14
            android.view.animation.Animation r0 = r0.a()
            r1.setInAnimation(r0)
            com.beizi.ad.internal.animation.f r0 = r1.a
            android.view.animation.Animation r0 = r0.b()
            r1.setOutAnimation(r0)
        L14:
            return
    }

    public void setTransitionDirection(com.beizi.ad.internal.animation.g r4) {
            r3 = this;
            com.beizi.ad.internal.animation.g r0 = r3.f6623c
            if (r0 == r4) goto L13
            r3.f6623c = r4
            com.beizi.ad.internal.animation.h r0 = r3.f6622b
            long r1 = r3.f6624d
            com.beizi.ad.internal.animation.f r4 = com.beizi.ad.internal.animation.a.a(r0, r1, r4)
            r3.a = r4
            r3.setAnimation()
        L13:
            return
    }

    public void setTransitionDuration(long r4) {
            r3 = this;
            long r0 = r3.f6624d
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L15
            r3.f6624d = r4
            com.beizi.ad.internal.animation.h r0 = r3.f6622b
            com.beizi.ad.internal.animation.g r1 = r3.f6623c
            com.beizi.ad.internal.animation.f r4 = com.beizi.ad.internal.animation.a.a(r0, r4, r1)
            r3.a = r4
            r3.setAnimation()
        L15:
            return
    }

    public void setTransitionType(com.beizi.ad.internal.animation.h r4) {
            r3 = this;
            com.beizi.ad.internal.animation.h r0 = r3.f6622b
            if (r0 == r4) goto L13
            r3.f6622b = r4
            long r0 = r3.f6624d
            com.beizi.ad.internal.animation.g r2 = r3.f6623c
            com.beizi.ad.internal.animation.f r4 = com.beizi.ad.internal.animation.a.a(r4, r0, r2)
            r3.a = r4
            r3.setAnimation()
        L13:
            return
    }
}
