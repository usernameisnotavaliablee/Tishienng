package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends android.view.ViewOutlineProvider {
    private float a;

    public f(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View r4, android.graphics.Outline r5) {
            r3 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.getGlobalVisibleRect(r0)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r0.right
            int r2 = r0.left
            int r1 = r1 - r2
            int r2 = r0.bottom
            int r0 = r0.top
            int r2 = r2 - r0
            r0 = 0
            r4.<init>(r0, r0, r1, r2)
            float r0 = r3.a
            r5.setRoundRect(r4, r0)
            return
    }
}
