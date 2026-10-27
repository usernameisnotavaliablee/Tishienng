package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class g extends android.app.AlertDialog {
    protected android.view.ViewGroup CC;
    public android.app.Activity mActivity;
    protected final android.content.Context mContext;

    protected g(android.app.Activity r1) {
            r0 = this;
            r0.<init>(r1)
            r0.setOwnerActivity(r1)
            r0.mActivity = r1
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            r0.mContext = r1
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    @androidx.annotation.CallSuper
    public void dismiss() {
            r1 = this;
            android.app.Activity r0 = r1.mActivity
            if (r0 != 0) goto L5
            goto Lb
        L5:
            com.kwad.sdk.o.m.n(r0)     // Catch: java.lang.Throwable -> L8
        L8:
            super.dismiss()     // Catch: java.lang.Throwable -> Lc
        Lb:
            return
        Lc:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            return
    }

    protected float dv() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    protected android.view.ViewGroup dw() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.CC
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            android.view.View r2 = super.findViewById(r2)
            return r2
    }

    @androidx.annotation.LayoutRes
    protected abstract int getLayoutId();

    protected abstract void h(android.view.View r1);

    protected boolean oX() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r3 = r2.getLayoutId()     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            android.content.Context r3 = r2.mContext     // Catch: java.lang.Throwable -> L19
            int r0 = r2.getLayoutId()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            android.view.View r3 = com.kwad.sdk.o.m.inflate(r3, r0, r1)     // Catch: java.lang.Throwable -> L19
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> L19
            r2.CC = r3     // Catch: java.lang.Throwable -> L19
            goto L21
        L19:
            r3 = move-exception
            goto L7c
        L1b:
            android.view.ViewGroup r3 = r2.dw()     // Catch: java.lang.Throwable -> L19
            r2.CC = r3     // Catch: java.lang.Throwable -> L19
        L21:
            android.view.ViewGroup r3 = r2.CC     // Catch: java.lang.Throwable -> L19
            r2.setContentView(r3)     // Catch: java.lang.Throwable -> L19
            boolean r3 = r2.oX()     // Catch: java.lang.Throwable -> L19
            r2.setCanceledOnTouchOutside(r3)     // Catch: java.lang.Throwable -> L19
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L19
            android.view.View r3 = r3.getDecorView()     // Catch: java.lang.Throwable -> L19
            r0 = 0
            r3.setPadding(r0, r0, r0, r0)     // Catch: java.lang.Throwable -> L19
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L19
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L19
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r3.setBackgroundDrawable(r1)     // Catch: java.lang.Throwable -> L19
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L19
            r0 = 131072(0x20000, float:1.83671E-40)
            r3.clearFlags(r0)     // Catch: java.lang.Throwable -> L19
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L19
            android.view.WindowManager$LayoutParams r3 = r3.getAttributes()     // Catch: java.lang.Throwable -> L19
            r0 = -1
            r3.width = r0     // Catch: java.lang.Throwable -> L19
            r3.height = r0     // Catch: java.lang.Throwable -> L19
            float r0 = r2.dv()     // Catch: java.lang.Throwable -> L19
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            float r0 = r2.dv()     // Catch: java.lang.Throwable -> L19
            r3.dimAmount = r0     // Catch: java.lang.Throwable -> L19
        L6b:
            android.view.Window r0 = r2.getWindow()     // Catch: java.lang.Throwable -> L19
            r0.setAttributes(r3)     // Catch: java.lang.Throwable -> L19
            r3 = 1
            r2.setCancelable(r3)     // Catch: java.lang.Throwable -> L19
            android.view.ViewGroup r3 = r2.CC     // Catch: java.lang.Throwable -> L19
            r2.h(r3)     // Catch: java.lang.Throwable -> L19
            return
        L7c:
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bk()
            if (r0 == 0) goto L8d
            com.kwad.components.core.d.a.reportSdkCaughtException(r3)
            r2.dismiss()
            return
        L8d:
            throw r3
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    protected void onStart() {
            r1 = this;
            super.onStart()
            r0 = 0
            r1.setTitle(r0)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r3) {
            r2 = this;
            super.setContentView(r3)
            android.content.Context r0 = r2.mContext
            r1 = 0
            android.view.View r3 = com.kwad.sdk.o.m.inflate(r0, r3, r1)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.CC = r3
            return
    }
}
