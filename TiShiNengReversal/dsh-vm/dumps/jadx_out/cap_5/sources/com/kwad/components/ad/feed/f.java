package com.kwad.components.ad.feed;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String l(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            boolean r1 = com.kwad.components.core.c.b.oc()
            if (r1 == 0) goto L27
            boolean r2 = r2.fromCache
            if (r2 == 0) goto L15
            java.lang.String r2 = "【cache】"
            goto L17
        L15:
            java.lang.String r2 = ""
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
        L27:
            return r0
    }
}
