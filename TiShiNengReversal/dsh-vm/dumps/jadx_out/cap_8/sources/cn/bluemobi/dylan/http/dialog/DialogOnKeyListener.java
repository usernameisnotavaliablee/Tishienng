package cn.bluemobi.dylan.http.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DialogOnKeyListener implements android.content.DialogInterface.OnKeyListener {
    private boolean canCancel;
    private cn.bluemobi.dylan.http.dialog.LoadingDialog dialog;

    public DialogOnKeyListener(cn.bluemobi.dylan.http.dialog.LoadingDialog r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.dialog = r1
            r0.canCancel = r2
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 4
            if (r2 != r1) goto L18
            boolean r1 = r0.canCancel
            if (r1 == 0) goto L16
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r0.dialog
            if (r1 == 0) goto L16
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L16
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r0.dialog
            r1.dismiss()
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }
}
