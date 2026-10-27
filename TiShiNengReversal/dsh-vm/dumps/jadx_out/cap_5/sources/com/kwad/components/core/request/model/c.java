package com.kwad.components.core.request.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.sdk.core.b {
    public long XI;
    public long photoId;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.b
    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "photoId"
            long r2 = r4.photoId
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "authorId"
            long r2 = r4.XI
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            return r0
    }
}
