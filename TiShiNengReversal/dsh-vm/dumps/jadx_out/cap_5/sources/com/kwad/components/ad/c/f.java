package com.kwad.components.ad.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.core.widget.a.b {
    public f(@androidx.annotation.NonNull android.view.View r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.kwad.components.core.widget.a.b, com.kwad.components.core.widget.a.a
    public final boolean ae() {
            r1 = this;
            com.kwad.sdk.core.c.b.Ho()
            boolean r0 = com.kwad.sdk.core.c.b.isEnable()
            if (r0 == 0) goto L1c
            com.kwad.sdk.core.c.b.Ho()
            boolean r0 = com.kwad.sdk.core.c.b.isAppOnForeground()
            if (r0 == 0) goto L1a
            boolean r0 = super.ae()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
        L1c:
            boolean r0 = super.ae()
            return r0
    }
}
