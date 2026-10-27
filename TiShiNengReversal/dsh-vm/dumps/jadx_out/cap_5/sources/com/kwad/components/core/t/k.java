package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, boolean r2) {
            r0 = 0
            if (r2 == 0) goto L4
            return r0
        L4:
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.b.dD(r1)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            boolean r1 = com.kwad.sdk.core.config.e.Gd()
            return r1
    }

    public static void f(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            r0.<init>(r1)
            r1 = 1
            com.kwad.components.core.e.d.a$a r1 = r0.ao(r1)
            com.kwad.components.core.e.d.a$a r1 = r1.aB(r2)
            com.kwad.components.core.e.d.a.a(r1)
            return
    }
}
