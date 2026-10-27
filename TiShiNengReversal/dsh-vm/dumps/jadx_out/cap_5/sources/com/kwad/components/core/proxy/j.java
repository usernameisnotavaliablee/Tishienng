package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class j extends android.app.DialogFragment {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private int a(android.app.FragmentTransaction r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "mDismissed"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L14
            com.kwad.sdk.utils.z.a(r3, r0, r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "mShownByMe"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L14
            com.kwad.sdk.utils.z.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "mViewDestroyed"
            com.kwad.sdk.utils.z.a(r3, r0, r1)     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L18:
            android.app.FragmentTransaction r4 = r4.add(r3, r5)
            int r4 = r4.commitAllowingStateLoss()
            return r4
    }

    protected abstract android.view.View a(android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2);

    @Override // android.app.DialogFragment
    public void dismiss() {
            r1 = this;
            android.app.Activity r0 = r1.getActivity()     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L16
            android.app.Activity r0 = r1.getActivity()     // Catch: java.lang.Exception -> L14
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Exception -> L14
            if (r0 != 0) goto L16
            super.dismissAllowingStateLoss()     // Catch: java.lang.Exception -> L14
            return
        L14:
            r0 = move-exception
            goto L20
        L16:
            android.app.Activity r0 = r1.getActivity()     // Catch: java.lang.Exception -> L14
            if (r0 != 0) goto L1f
            super.dismissAllowingStateLoss()     // Catch: java.lang.Exception -> L14
        L1f:
            return
        L20:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }

    @Override // android.app.Fragment
    @androidx.annotation.Nullable
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = super.getContext()
            android.content.Context r0 = com.kwad.sdk.o.m.wrapContextIfNeed(r0)
            return r0
    }

    public final boolean isShowing() {
            r1 = this;
            android.app.Dialog r0 = r1.getDialog()
            if (r0 == 0) goto Lb
            boolean r0 = r0.isShowing()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(android.content.Context r1) {
            r0 = this;
            com.kwad.sdk.n.checkInitSDK(r1)
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            super.onAttach(r1)
            return
    }

    @Override // android.app.Fragment
    @androidx.annotation.Nullable
    public final android.view.View onCreateView(android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            android.content.Context r2 = r2.getContext()
            android.content.Context r2 = com.kwad.sdk.o.m.wrapContextIfNeed(r2)
            android.view.LayoutInflater r2 = com.kwad.sdk.o.m.eq(r2)
            android.app.Dialog r4 = r1.getDialog()
            r0 = 1
            r4.requestWindowFeature(r0)
            android.view.View r2 = r1.a(r2, r3)
            return r2
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @androidx.annotation.NonNull
    public android.view.LayoutInflater onGetLayoutInflater(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = super.onGetLayoutInflater(r1)
            android.content.Context r1 = r1.getContext()
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            android.view.LayoutInflater r1 = com.kwad.sdk.o.m.eq(r1)
            return r1
    }

    @Override // android.app.DialogFragment
    public int show(android.app.FragmentTransaction r1, java.lang.String r2) {
            r0 = this;
            int r1 = super.show(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            int r1 = r0.a(r1, r2)
            return r1
    }

    @Override // android.app.DialogFragment
    public void show(android.app.FragmentManager r4, java.lang.String r5) {
            r3 = this;
            super.show(r4, r5)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            java.lang.String r0 = "showAllowingStateLoss"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L13
            r2 = 1
            r1[r2] = r5     // Catch: java.lang.Throwable -> L13
            com.kwad.sdk.utils.z.callMethod(r3, r0, r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            android.app.FragmentTransaction r4 = r4.beginTransaction()
            r3.a(r4, r5)
            return
    }
}
