package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class c implements com.kwad.components.offline.api.core.api.IEncrypt {
    c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final java.lang.String getFileMD5(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.a.getFileMD5(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final byte[] getFileMD5Digest(java.io.File r1) {
            r0 = this;
            byte[] r1 = com.kwad.sdk.utils.a.getFileMD5Digest(r1)     // Catch: java.io.IOException -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final java.lang.String getFileSha256(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.bf.ac(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final java.lang.String getMD5(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.al.md5(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final java.lang.String getResponseData(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.core.a.d.getResponseData(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final java.lang.String getSha256(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.bf.hj(r1)
            return r1
    }
}
