package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class IOfflineCompoWrapper {
    protected java.lang.String mOfflinePackageName;

    public IOfflineCompoWrapper(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mOfflinePackageName = r1
            return
    }

    @java.lang.Deprecated
    public abstract android.content.Context unwrapContextIfNeed(android.content.Context r1);

    public abstract android.content.Context wrapContextIfNeed(@androidx.annotation.Nullable android.content.Context r1);

    public abstract android.app.Application wrapGetApplication(android.content.Context r1);

    public abstract android.view.LayoutInflater wrapInflaterIfNeed(android.view.LayoutInflater r1);
}
