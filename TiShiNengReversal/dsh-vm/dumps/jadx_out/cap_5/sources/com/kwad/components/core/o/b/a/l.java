package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l extends com.kwad.components.offline.api.core.api.IOfflineCompoWrapper {
    public l(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IOfflineCompoWrapper
    public final android.content.Context unwrapContextIfNeed(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = com.kwad.library.b.c.a.unwrapContextIfNeed(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IOfflineCompoWrapper
    public final android.content.Context wrapContextIfNeed(@androidx.annotation.Nullable android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r1.mOfflinePackageName
            android.content.Context r2 = com.kwad.library.b.c.a.j(r2, r0)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.api.IOfflineCompoWrapper
    public final android.app.Application wrapGetApplication(android.content.Context r1) {
            r0 = this;
            android.app.Application r1 = com.kwad.sdk.o.m.Ta()
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IOfflineCompoWrapper
    public final android.view.LayoutInflater wrapInflaterIfNeed(android.view.LayoutInflater r2) {
            r1 = this;
            java.lang.String r0 = r1.mOfflinePackageName
            android.view.LayoutInflater r2 = com.kwad.library.b.c.a.a(r2, r0)
            return r2
    }
}
