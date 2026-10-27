package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h extends com.kwad.sdk.api.core.fragment.KsFragment implements com.kwad.sdk.m.a.b {
    protected android.view.ViewGroup Wh;
    private final com.kwad.sdk.m.a.a mBackPressDelete;
    protected android.content.Context mContext;
    protected android.view.ViewGroup nY;

    public h() {
            r1 = this;
            r1.<init>()
            com.kwad.sdk.m.a.a r0 = new com.kwad.sdk.m.a.a
            r0.<init>()
            r1.mBackPressDelete = r0
            return
    }

    public final <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.nY
            if (r0 == 0) goto L9
            android.view.View r2 = r0.findViewById(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ID does not reference a View inside this View"
            r2.<init>(r0)
            throw r2
    }

    protected android.view.ViewGroup nj() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean onBackPressed() {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            boolean r0 = r0.onBackPressed()
            return r0
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)     // Catch: java.lang.Throwable -> Le
            android.app.Activity r1 = r0.getActivity()     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)     // Catch: java.lang.Throwable -> Le
            r0.mContext = r1     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    @androidx.annotation.Nullable
    public final android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            android.content.Context r2 = r1.mContext
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.Wh = r3
            android.view.ViewGroup r4 = r1.nY
            if (r4 != 0) goto L27
            android.view.ViewGroup r4 = r1.nj()
            r1.nY = r4
            if (r4 != 0) goto L27
            int r4 = r1.qN()
            if (r4 == 0) goto L27
            int r4 = r1.qN()
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.nY = r2
        L27:
            android.view.ViewGroup r2 = r1.nY
            return r2
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            java.lang.Object r0 = r2.getHost()
            if (r0 == 0) goto L12
            android.content.Context r0 = r2.mContext
            android.view.View r1 = r2.getView()
            com.kwad.components.core.t.g.destroyFragment(r0, r1)
        L12:
            return
    }

    protected int qN() {
            r1 = this;
            r0 = 0
            return r0
    }
}
