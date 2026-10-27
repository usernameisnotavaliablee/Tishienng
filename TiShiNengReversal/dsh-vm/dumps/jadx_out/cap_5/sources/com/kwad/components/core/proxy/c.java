package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.components.core.proxy.a {
    private final java.lang.ref.WeakReference<android.app.Activity> We;
    private com.kwad.components.core.proxy.launchdialog.d Wf;
    private com.kwad.components.core.proxy.launchdialog.d Wg;

    public c(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.We = r0
            return
    }

    public final void a(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.d r0 = r1.Wg
            r1.Wf = r0
            com.kwad.components.core.proxy.launchdialog.d r0 = new com.kwad.components.core.proxy.launchdialog.d
            r0.<init>(r2)
            r1.Wg = r0
            return
    }

    public final boolean c(android.app.Activity r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.ref.WeakReference<android.app.Activity> r1 = r2.We
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto Lf
            goto L1c
        Lf:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.We
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            return r0
    }

    @Override // com.kwad.components.core.proxy.a
    public final java.lang.String getPageName() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.We
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.We
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r0 = r0.toString()
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.proxy.a
    public final com.kwad.components.core.proxy.launchdialog.d rT() {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.d r0 = r1.Wf
            return r0
    }

    @Override // com.kwad.components.core.proxy.a
    public final com.kwad.components.core.proxy.launchdialog.d rU() {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.d r0 = r1.Wg
            return r0
    }
}
