package com.kwad.components.offline.api.core.model;

import com.kwad.components.offline.api.core.model.IOfflineCompoJsonParse;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class BaseOfflineCompoJsonParse<T extends com.kwad.components.offline.api.core.model.IOfflineCompoJsonParse> implements com.kwad.components.offline.api.core.model.IOfflineCompoJsonParse {
    public BaseOfflineCompoJsonParse() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void parseJson(T r1, org.json.JSONObject r2);

    @Override // com.kwad.components.offline.api.core.model.IOfflineCompoJsonParse
    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
            r0 = this;
            r0.parseJson(r0, r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.model.IOfflineCompoJsonParse
    public org.json.JSONObject toJson() {
            r1 = this;
            org.json.JSONObject r0 = r1.toJson(r1)
            return r0
    }

    public abstract org.json.JSONObject toJson(T r1);

    public abstract org.json.JSONObject toJson(T r1, org.json.JSONObject r2);
}
