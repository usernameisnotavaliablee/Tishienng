package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g extends androidx.recyclerview.widget.RecyclerView {
    private boolean Vd;

    public g(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public g(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public g(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    protected void removeDetachedView(android.view.View r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.Vd
            if (r0 != 0) goto L8
            super.removeDetachedView(r2, r3)
            return
        L8:
            super.removeDetachedView(r2, r3)
            return
    }

    public void setIngoreTmpDetachedFlag(boolean r1) {
            r0 = this;
            r0.Vd = r1
            return
    }
}
