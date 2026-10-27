package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class i extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.core.j.c {
    private static long nA = 400;
    private com.kwad.components.ad.splashscreen.e.a Gy;
    private android.os.Vibrator gZ;


    static {
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    private void ms() {
            r3 = this;
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            if (r0 == 0) goto L28
            com.kwad.components.ad.splashscreen.e.a r1 = r3.Gy
            if (r1 != 0) goto L18
            com.kwad.components.ad.splashscreen.presenter.i$1 r0 = new com.kwad.components.ad.splashscreen.presenter.i$1
            android.content.Context r1 = r3.getContext()
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r0.<init>(r3, r1, r2)
            r3.Gy = r0
            goto L1d
        L18:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1.setAdTemplate(r0)
        L1d:
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            if (r0 == 0) goto L28
            com.kwad.components.ad.splashscreen.e.a r1 = r3.Gy
            r0.b(r1)
        L28:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            if (r0 != 0) goto L8
            return
        L8:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mp()
            r1.mn()
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L1d
            r1.ms()
        L1d:
            r1.mo()
            r1.fM()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            boolean r0 = r0.Fv
            if (r0 != 0) goto L9
            r1.mq()
        L9:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r0 = this;
            r0.mr()
            return
    }

    protected abstract void fM();

    protected abstract void i(int r1, java.lang.String r2);

    protected abstract void initView();

    protected abstract void mn();

    protected abstract void mo();

    protected abstract void mp();

    protected abstract void mq();

    protected abstract void mr();

    protected final void mt() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L10
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r2.gZ = r0
        L10:
            android.content.Context r0 = r2.getContext()
            android.os.Vibrator r1 = r2.gZ
            com.kwad.sdk.utils.bw.a(r0, r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onCreate() {
            r0 = this;
            super.onCreate()
            r0.initView()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 == 0) goto Le
            com.kwad.sdk.core.j.a r0 = r0.Fs
            if (r0 == 0) goto Le
            r0.b(r2)
        Le:
            r2.mr()
            android.content.Context r0 = r2.getContext()
            android.os.Vibrator r1 = r2.gZ
            com.kwad.sdk.utils.bw.b(r0, r1)
            return
    }
}
