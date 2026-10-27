package com.kwad.components.core.r;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.webview.tachikoma.d.e {
    protected com.kwad.components.core.webview.tachikoma.f.c Yd;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.core.r.b a(com.kwad.components.core.r.b r1, android.app.Activity r2, com.kwad.components.core.webview.tachikoma.f.c r3) {
            if (r2 == 0) goto L15
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L9
            goto L15
        L9:
            r1.Yd = r3
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "webTKCloseDialog"
            r1.show(r2, r3)
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static com.kwad.components.core.r.b a(com.kwad.components.core.webview.tachikoma.d.e.b r3) {
            com.kwad.components.core.r.b r0 = new com.kwad.components.core.r.b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.iu()
            r0.mAdResultData = r1
            java.lang.String r1 = r3.getTemplateId()
            r0.AI = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "templateId"
            java.lang.String r3 = r3.getTemplateId()
            r1.putString(r2, r3)
            r0.setArguments(r1)
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e
    public final com.kwad.components.core.webview.tachikoma.d.b ku() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = super.ku()
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e
    public final com.kwad.components.core.webview.tachikoma.d.c kv() {
            r1 = this;
            com.kwad.components.core.r.c r0 = new com.kwad.components.core.r.c
            r0.<init>()
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e, android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            super.onDismiss(r1)
            com.kwad.components.core.webview.tachikoma.f.c r1 = r0.Yd
            if (r1 == 0) goto La
            r1.hi()
        La:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e, android.app.Fragment
    public final void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            com.kwad.components.core.webview.tachikoma.f.c r1 = r0.Yd
            if (r1 == 0) goto La
            r1.ha()
        La:
            return
    }
}
