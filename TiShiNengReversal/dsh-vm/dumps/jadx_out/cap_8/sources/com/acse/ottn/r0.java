package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r0 extends android.app.ProgressDialog {
    public android.content.Context a;

    public r0(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r1
            return
    }

    public r0(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r1
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r0 = this;
            super.dismiss()
            return
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.content.Context r3 = r2.getContext()
            int r0 = com.acse.ottn.R.layout.customprogressdialog
            r1 = 0
            android.view.View r3 = android.view.View.inflate(r3, r0, r1)
            r2.setContentView(r3)
            return
    }

    @Override // android.app.Dialog
    public void show() {
            r0 = this;
            super.show()
            return
    }
}
