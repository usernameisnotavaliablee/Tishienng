package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class i extends com.kwad.sdk.api.proxy.IFragmentActivityProxy {
    private final com.kwad.sdk.m.a.a mBackPressDelete;
    public android.content.Context mContext;
    private final com.kwad.components.core.proxy.a.a mPageMonitor;
    public android.view.View mRootView;

    public i() {
            r2 = this;
            r2.<init>()
            com.kwad.components.core.proxy.a.a r0 = new com.kwad.components.core.proxy.a.a
            r1 = 0
            r0.<init>(r1)
            r2.mPageMonitor = r0
            com.kwad.sdk.m.a.a r0 = new com.kwad.sdk.m.a.a
            r0.<init>()
            r2.mBackPressDelete = r0
            return
    }

    public void addBackPressable(com.kwad.sdk.m.a.b r2) {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            r0.addBackPressable(r2)
            return
    }

    public void addBackPressable(com.kwad.sdk.m.a.b r2, int r3) {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            r0.addBackPressable(r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            android.view.View r0 = r1.mRootView
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            android.view.View r2 = super.findViewById(r2)
            return r2
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = super.getIntent()
            com.kwad.components.core.t.m.c(r0)
            return r0
    }

    protected abstract java.lang.String getPageName();

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onBackPressed() {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            boolean r0 = r0.onBackPressed()
            if (r0 != 0) goto Lb
            super.onBackPressed()
        Lb:
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.Bn()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            r3.finish()     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            goto L47
        L10:
            super.onCreate(r4)     // Catch: java.lang.Throwable -> Le
            android.app.Activity r4 = r3.getActivity()     // Catch: java.lang.Throwable -> Le
            int r0 = com.kwad.sdk.R.style.Theme_AppCompat_Light_NoActionBar     // Catch: java.lang.Throwable -> Le
            r4.setTheme(r0)     // Catch: java.lang.Throwable -> Le
            android.app.Activity r4 = r3.getActivity()     // Catch: java.lang.Throwable -> Le
            android.content.Context r4 = com.kwad.sdk.o.m.wrapContextIfNeed(r4)     // Catch: java.lang.Throwable -> Le
            r3.mContext = r4     // Catch: java.lang.Throwable -> Le
            android.content.Intent r4 = r3.getIntent()     // Catch: java.lang.Throwable -> Le
            r0 = 0
            if (r4 == 0) goto L34
            java.lang.String r2 = "key_start_time"
            long r0 = r4.getLongExtra(r2, r0)     // Catch: java.lang.Throwable -> Le
        L34:
            com.kwad.components.core.proxy.a.a r4 = r3.mPageMonitor     // Catch: java.lang.Throwable -> Le
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> Le
            r4.aC(r2)     // Catch: java.lang.Throwable -> Le
            com.kwad.components.core.proxy.a.a r4 = r3.mPageMonitor     // Catch: java.lang.Throwable -> Le
            r4.L(r0)     // Catch: java.lang.Throwable -> Le
            return
        L47:
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bk()
            if (r0 == 0) goto L58
            com.kwad.components.core.d.a.reportSdkCaughtException(r4)
            r3.finish()
            return
        L58:
            throw r4
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r2 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> Lf
            android.app.Activity r0 = r2.getActivity()     // Catch: java.lang.Throwable -> Lf
            android.view.Window r1 = r2.getWindow()     // Catch: java.lang.Throwable -> Lf
            com.kwad.components.core.t.g.destroyActivity(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r1 = this;
            super.onResume()     // Catch: java.lang.Throwable -> Lc
            com.kwad.components.core.proxy.a.a r0 = r1.mPageMonitor     // Catch: java.lang.Throwable -> Lc
            r1.getActivity()     // Catch: java.lang.Throwable -> Lc
            r0.sd()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
            return
    }

    public void removeBackPressable(com.kwad.sdk.m.a.b r2) {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            r0.removeBackPressable(r2)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void setContentView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            r1 = 0
            android.view.View r3 = com.kwad.sdk.o.m.inflate(r0, r3, r1)
            r2.mRootView = r3
            super.setContentView(r3)
            return
    }
}
