package xyz.adscope.amps.ad.unified.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSUnifiedRootContainer extends android.widget.FrameLayout {
    public AMPSUnifiedRootContainer(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AMPSUnifiedRootContainer(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public AMPSUnifiedRootContainer(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public AMPSUnifiedRootContainer(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    void insertChannelSpecifiedContainer(android.view.ViewGroup r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L27
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1e
            android.view.View r1 = r3.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r3.removeView(r1)
            r4.addView(r1, r2)
            int r0 = r0 + 1
            goto L7
        L1e:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.addView(r4, r0)
        L27:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            super.removeView(r1)
            return
    }
}
