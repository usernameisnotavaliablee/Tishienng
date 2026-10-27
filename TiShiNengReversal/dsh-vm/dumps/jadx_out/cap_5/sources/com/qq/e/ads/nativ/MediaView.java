package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class MediaView extends android.widget.FrameLayout {
    public MediaView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MediaView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public MediaView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @android.annotation.SuppressLint({"NewApi"})
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isHardwareAccelerated()
            if (r0 != 0) goto Le
            java.lang.String r0 = "硬件加速未开启"
            com.qq.e.comm.util.GDTLogger.w(r0)
        Le:
            return
    }
}
