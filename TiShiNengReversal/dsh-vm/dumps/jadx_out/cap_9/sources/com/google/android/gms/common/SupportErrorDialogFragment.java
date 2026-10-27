package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SupportErrorDialogFragment extends androidx.fragment.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;

    @androidx.annotation.Nullable
    private android.app.Dialog zac;

    public SupportErrorDialogFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(@androidx.annotation.NonNull android.app.Dialog r1) {
            r0 = 0
            com.google.android.gms.common.SupportErrorDialogFragment r1 = newInstance(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(@androidx.annotation.NonNull android.app.Dialog r2, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r3) {
            com.google.android.gms.common.SupportErrorDialogFragment r0 = new com.google.android.gms.common.SupportErrorDialogFragment
            r0.<init>()
            java.lang.String r1 = "Cannot display null dialog"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnCancelListener(r1)
            r2.setOnDismissListener(r1)
            r0.zaa = r2
            if (r3 == 0) goto L1a
            r0.zab = r3
        L1a:
            return r0
    }

    public void onCancel(@androidx.annotation.NonNull android.content.DialogInterface r2) {
            r1 = this;
            android.content.DialogInterface$OnCancelListener r0 = r1.zab
            if (r0 == 0) goto L7
            r0.onCancel(r2)
        L7:
            return
    }

    @androidx.annotation.NonNull
    public android.app.Dialog onCreateDialog(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = r1.zaa
            if (r2 != 0) goto L23
            r2 = 0
            r1.setShowsDialog(r2)
            android.app.Dialog r2 = r1.zac
            if (r2 != 0) goto L21
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r0 = r1.getContext()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.Context r0 = (android.content.Context) r0
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            r1.zac = r2
        L21:
            android.app.Dialog r2 = r1.zac
        L23:
            return r2
    }

    public void show(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.Nullable java.lang.String r2) {
            r0 = this;
            super.show(r1, r2)
            return
    }
}
