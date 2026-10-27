package com.kwad.components.core.e.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.core.proxy.j {
    private com.kwad.components.core.e.d.a.C0073a PT;
    private android.app.Activity mActivity;


    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.app.Activity r1, com.kwad.components.core.e.d.a.C0073a r2) {
            if (r1 == 0) goto L17
            if (r2 != 0) goto L5
            goto L17
        L5:
            com.kwad.components.core.e.e.e r0 = new com.kwad.components.core.e.e.e
            r0.<init>()
            r0.PT = r2
            r0.mActivity = r1
            android.app.FragmentManager r1 = r1.getFragmentManager()
            java.lang.String r2 = "second_confirm_dialog"
            r0.show(r1, r2)
        L17:
            return
    }

    @Override // com.kwad.components.core.proxy.j
    public final android.view.View a(android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3) {
            r1 = this;
            android.app.Dialog r2 = r1.getDialog()
            android.view.Window r2 = r2.getWindow()
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r0 = 0
            r3.<init>(r0)
            r2.setBackgroundDrawable(r3)
            android.app.Dialog r2 = r1.getDialog()
            r2.setCanceledOnTouchOutside(r0)
            android.app.Dialog r2 = r1.getDialog()
            com.kwad.components.core.e.e.e$1 r3 = new com.kwad.components.core.e.e.e$1
            r3.<init>(r1)
            r2.setOnKeyListener(r3)
            com.kwad.components.core.e.e.a r2 = new com.kwad.components.core.e.e.a
            android.app.Activity r3 = r1.mActivity
            com.kwad.components.core.e.d.a$a r0 = r1.PT
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // android.app.DialogFragment
    @androidx.annotation.NonNull
    public final android.app.Dialog onCreateDialog(android.os.Bundle r4) {
            r3 = this;
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.pY()
            r0.pZ()
            com.kwad.components.core.e.d.a$a r0 = r3.PT
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r1 = 229(0xe5, float:3.21E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)
            android.app.Dialog r4 = super.onCreateDialog(r4)
            return r4
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            super.onDismiss(r1)
            com.kwad.components.core.e.e.g r1 = com.kwad.components.core.e.e.g.pY()
            r1.qa()
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r0 = this;
            super.onResume()
            return
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
            r0 = this;
            super.onStart()
            return
    }
}
