package com.kwad.components.ad.widget.tailframe.appbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TailFrameBarAppPortraitVertical extends com.kwad.components.ad.widget.tailframe.appbar.a {
    public TailFrameBarAppPortraitVertical(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TailFrameBarAppPortraitVertical(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TailFrameBarAppPortraitVertical(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.widget.tailframe.appbar.a
    public int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_video_tf_bar_app_portrait_vertical
            return r0
    }

    @Override // com.kwad.components.ad.widget.tailframe.appbar.a
    public final void j(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r4)
            if (r0 == 0) goto L2a
            android.view.View r0 = r3.GD
            android.content.Context r1 = r3.getContext()
            int r2 = com.kwad.sdk.R.color.ksad_translucent
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setBackgroundColor(r1)
            android.widget.TextView r0 = r3.nr
            java.lang.String r1 = "#FFFFFF"
            int r2 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r3.MU
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            goto L35
        L2a:
            android.view.View r0 = r3.GD
            java.lang.String r1 = "#E6FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
        L35:
            super.j(r4)
            return
    }
}
