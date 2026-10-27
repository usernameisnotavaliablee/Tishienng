package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.a {

    @androidx.annotation.Nullable
    public com.kwad.components.core.page.a.a TK;

    @androidx.annotation.Nullable
    public com.kwad.sdk.core.webview.KsAdWebView.c TL;

    @androidx.annotation.Nullable
    public com.kwad.components.core.page.c.a.f.a TM;

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public com.kwad.components.core.webview.jshandler.b TN;
    public boolean TO;
    public boolean TP;

    @androidx.annotation.NonNull
    public com.kwad.components.core.page.AdWebViewActivityProxy.a Tu;

    @androidx.annotation.NonNull
    public android.view.ViewGroup jI;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.webview.KsAdWebView mAdWebView;
    public boolean mAutoShow;

    @androidx.annotation.NonNull
    public android.content.Context mContext;

    @androidx.annotation.Nullable
    public java.lang.String mPageTitle;

    @androidx.annotation.NonNull
    public java.lang.String mPageUrl;
    public boolean mShowPermission;

    @androidx.annotation.Nullable
    public com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.TO = r0
            r1.TP = r0
            return
    }

    private void aJ(boolean r1) {
            r0 = this;
            r1 = 1
            r0.TP = r1
            return
    }

    public final void a(com.kwad.components.core.page.c.a.f.a r1) {
            r0 = this;
            r0.TM = r1
            return
    }

    public final void a(com.kwad.components.core.webview.jshandler.b r1) {
            r0 = this;
            r0.TN = r1
            r1 = 1
            r0.aJ(r1)
            return
    }

    public final void a(com.kwad.sdk.core.webview.KsAdWebView.c r1) {
            r0 = this;
            r0.TL = r1
            return
    }

    public final void a(boolean r1, android.view.View r2) {
            r0 = this;
            com.kwad.sdk.core.webview.KsAdWebView r2 = r0.mAdWebView
            if (r2 == 0) goto L17
            boolean r2 = r2.canGoBack()
            if (r2 == 0) goto L17
            com.kwad.sdk.core.webview.KsAdWebView r2 = r0.mAdWebView
            r2.goBack()
            if (r1 == 0) goto L1e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.bZ(r1)
            return
        L17:
            com.kwad.components.core.page.a.a r1 = r0.TK
            if (r1 == 0) goto L1e
            r1.qO()
        L1e:
            return
    }

    public final boolean qT() {
            r1 = this;
            boolean r0 = r1.mShowPermission
            return r0
    }

    public final void qY() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.b r0 = r1.TN
            if (r0 == 0) goto L7
            r0.rs()
        L7:
            return
    }

    public final boolean re() {
            r1 = this;
            boolean r0 = r1.TP
            return r0
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            r0 = 0
            r1.TL = r0
            r1.TM = r0
            r1.mWebCardCloseListener = r0
            r1.TN = r0
            return
    }

    public final boolean rf() {
            r1 = this;
            boolean r0 = r1.qT()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public final void setWebCardCloseListener(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.b r1) {
            r0 = this;
            r0.mWebCardCloseListener = r1
            return
    }
}
