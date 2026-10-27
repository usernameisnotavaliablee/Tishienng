package com.kwad.components.core.m;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.mvp.a {
    public java.util.List<com.kwad.components.core.m.a.a> Rt;

    @androidx.annotation.NonNull
    private final com.kwad.components.core.m.b<?> Ru;

    @androidx.annotation.NonNull
    public final android.content.Context mContext;

    @androidx.annotation.NonNull
    public final android.view.View mRootView;

    public a(com.kwad.components.core.m.b<?> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Rt = r0
            r1.Ru = r2
            android.content.Context r0 = r2.mContext
            r1.mContext = r0
            android.view.View r2 = r2.mRootView
            r1.mRootView = r2
            return
    }

    @java.lang.Deprecated
    public final android.app.Activity getActivity() {
            r1 = this;
            com.kwad.components.core.m.b<?> r0 = r1.Ru
            android.app.Activity r0 = r0.getActivity()
            return r0
    }

    public final void iz() {
            r1 = this;
            com.kwad.components.core.m.b<?> r0 = r1.Ru
            r0.finish()
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public void release() {
            r1 = this;
            java.util.List<com.kwad.components.core.m.a.a> r0 = r1.Rt
            r0.clear()
            return
    }
}
