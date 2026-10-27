package cn.bluemobi.dylan.http.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DialogOnDismissListener implements android.content.DialogInterface.OnDismissListener {
    private rx.m subscribe;

    public DialogOnDismissListener(rx.m r1) {
            r0 = this;
            r0.<init>()
            r0.subscribe = r1
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            rx.m r1 = r0.subscribe
            if (r1 == 0) goto Lf
            boolean r1 = r1.isUnsubscribed()
            if (r1 != 0) goto Lf
            rx.m r1 = r0.subscribe
            r1.unsubscribe()
        Lf:
            return
    }
}
