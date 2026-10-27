package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements com.beizi.ad.internal.animation.f {
    private android.view.animation.Animation a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.animation.Animation f6625b;

    public b(long r2) {
            r1 = this;
            r1.<init>()
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r1.a(r0, r2)
            r1.b(r0, r2)
            return
    }

    private void a(android.view.animation.Interpolator r4, long r5) {
            r3 = this;
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2)
            r3.a = r0
            r0.setDuration(r5)
            android.view.animation.Animation r5 = r3.a
            r5.setInterpolator(r4)
            return
    }

    private void b(android.view.animation.Interpolator r4, long r5) {
            r3 = this;
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2)
            r3.f6625b = r0
            r0.setDuration(r5)
            android.view.animation.Animation r5 = r3.f6625b
            r5.setInterpolator(r4)
            return
    }

    @Override // com.beizi.ad.internal.animation.f
    public android.view.animation.Animation a() {
            r1 = this;
            android.view.animation.Animation r0 = r1.a
            return r0
    }

    @Override // com.beizi.ad.internal.animation.f
    public android.view.animation.Animation b() {
            r1 = this;
            android.view.animation.Animation r0 = r1.f6625b
            return r0
    }
}
