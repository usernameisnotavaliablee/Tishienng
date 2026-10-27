package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class r implements com.kwad.components.offline.api.core.api.IZipper {
    r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final boolean unZip(java.io.InputStream r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.ce.unZip(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final boolean zip(java.io.File r1, java.io.File r2) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.ce.zip(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final void zipFile(java.io.File r1) {
            r0 = this;
            com.kwad.sdk.utils.ce.zipFile(r1)
            return
    }
}
