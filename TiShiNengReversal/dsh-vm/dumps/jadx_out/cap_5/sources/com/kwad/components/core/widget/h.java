package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends android.view.ViewOutlineProvider {
    private float ajn;

    private h(float r1) {
            r0 = this;
            r0.<init>()
            r0.ajn = r1
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public static void b(android.view.View r1, float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            r2 = 0
            r1.setOutlineProvider(r2)
            r2 = 0
            r1.setClipToOutline(r2)
            return
        Le:
            com.kwad.components.core.widget.h r0 = new com.kwad.components.core.widget.h
            r0.<init>(r2)
            r1.setOutlineProvider(r0)
            r2 = 1
            r1.setClipToOutline(r2)
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r7, android.graphics.Outline r8) {
            r6 = this;
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            float r5 = r6.ajn
            r1 = 0
            r2 = 0
            r0 = r8
            r0.setRoundRect(r1, r2, r3, r4, r5)
            return
    }
}
