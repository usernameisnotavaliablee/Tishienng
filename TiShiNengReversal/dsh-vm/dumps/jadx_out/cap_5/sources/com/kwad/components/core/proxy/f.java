package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class f extends com.kwad.sdk.api.proxy.IActivityProxy implements com.kwad.components.core.proxy.a.c {
    private static final java.lang.String FRAGMENTS_TAG = "android:fragments";
    public static final java.lang.String KEY_START_TIME = "key_start_time";
    private final com.kwad.sdk.m.a.a mBackPressDelete;
    public android.content.Context mContext;
    private boolean mHasCallFinish;
    private final com.kwad.components.core.proxy.a.a mPageMonitor;
    public android.view.View mRootView;

    public f() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.proxy.a.a r0 = new com.kwad.components.core.proxy.a.a
            r0.<init>(r1)
            r1.mPageMonitor = r0
            com.kwad.sdk.m.a.a r0 = new com.kwad.sdk.m.a.a
            r0.<init>()
            r1.mBackPressDelete = r0
            return
    }

    private void disableFragmentRestore(android.os.Bundle r2) {
            r1 = this;
            if (r2 == 0) goto L11
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bk()
            if (r0 == 0) goto L11
            java.lang.String r0 = "android:fragments"
            r2.remove(r0)
        L11:
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

    protected boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r1) {
            r0 = this;
            r1 = 1
            return r1
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
    @androidx.annotation.CallSuper
    public void finish() {
            r1 = this;
            boolean r0 = r1.mHasCallFinish
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.mHasCallFinish = r0
            super.finish()
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = super.getIntent()
            com.kwad.components.core.t.m.c(r0)
            return r0
    }

    @androidx.annotation.LayoutRes
    protected abstract int getLayoutId();

    protected abstract java.lang.String getPageName();

    protected abstract void initData();

    protected abstract void initView();

    protected boolean needAdaptionScreen() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.CallSuper
    protected void onActivityCreate() {
            r0 = this;
            return
    }

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
    @androidx.annotation.CallSuper
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.Bn()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.kwad.components.core.proxy.a.a r5 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r0 = com.kwad.components.core.proxy.PageCreateStage.ERROR_SDK_NOT_INIT     // Catch: java.lang.Throwable -> L15
            r5.a(r0)     // Catch: java.lang.Throwable -> L15
            r4.finish()     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r5 = move-exception
            goto La9
        L18:
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.START_ON_CREATE     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            super.onCreate(r5)     // Catch: java.lang.Throwable -> L15
            android.app.Activity r0 = r4.getActivity()     // Catch: java.lang.Throwable -> L15
            r1 = 16973838(0x103000e, float:2.406094E-38)
            r0.setTheme(r1)     // Catch: java.lang.Throwable -> L15
            android.app.Activity r0 = r4.getActivity()     // Catch: java.lang.Throwable -> L15
            android.content.Context r0 = com.kwad.sdk.o.m.wrapContextIfNeed(r0)     // Catch: java.lang.Throwable -> L15
            r4.mContext = r0     // Catch: java.lang.Throwable -> L15
            android.content.Intent r0 = r4.getIntent()     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.a.a r1 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r2 = com.kwad.components.core.proxy.PageCreateStage.START_CHECK_INTENT     // Catch: java.lang.Throwable -> L15
            r1.a(r2)     // Catch: java.lang.Throwable -> L15
            boolean r1 = r4.checkIntentData(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L52
            com.kwad.components.core.proxy.a.a r5 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r0 = com.kwad.components.core.proxy.PageCreateStage.ERROR_CHECK_INTENT     // Catch: java.lang.Throwable -> L15
            r5.a(r0)     // Catch: java.lang.Throwable -> L15
            r4.finish()     // Catch: java.lang.Throwable -> L15
            return
        L52:
            android.view.Window r1 = r4.getWindow()     // Catch: java.lang.Throwable -> L15
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1.setFlags(r2, r2)     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto L65
            java.lang.String r3 = "key_start_time"
            long r1 = r0.getLongExtra(r3, r1)     // Catch: java.lang.Throwable -> L15
        L65:
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r4.getPageName()     // Catch: java.lang.Throwable -> L15
            r0.aC(r3)     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            r0.L(r1)     // Catch: java.lang.Throwable -> L15
            int r0 = r4.getLayoutId()     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.a.a r1 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r2 = com.kwad.components.core.proxy.PageCreateStage.START_SET_CONTENT_VIEW     // Catch: java.lang.Throwable -> L15
            r1.a(r2)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L83
            r4.setContentView(r0)     // Catch: java.lang.Throwable -> L15
        L83:
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.START_INIT_DATA     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            r4.initData()     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.START_INIT_VIEW     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            r4.initView()     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.END_INIT_VIEW     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.rV()     // Catch: java.lang.Throwable -> L15
            r0.a(r4, r5)     // Catch: java.lang.Throwable -> L15
            r4.onActivityCreate()     // Catch: java.lang.Throwable -> L15
            goto Lc3
        La9:
            r4.onCreateCaughtException(r5)
            com.kwad.components.core.proxy.a.a r0 = r4.mPageMonitor
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.ERROR_CAUGHT_EXCEPTION
            r0.a(r1)
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bk()
            if (r0 == 0) goto Lcb
            com.kwad.components.core.d.a.reportSdkCaughtException(r5)
            r4.finish()
        Lc3:
            com.kwad.components.core.proxy.a.a r5 = r4.mPageMonitor
            com.kwad.components.core.proxy.PageCreateStage r0 = com.kwad.components.core.proxy.PageCreateStage.END_ON_CREATE
            r5.a(r0)
            return
        Lcb:
            throw r5
    }

    protected void onCreateCaughtException(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    public void onCreateStageChange(com.kwad.components.core.proxy.PageCreateStage r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r1 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> Lb
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.rV()     // Catch: java.lang.Throwable -> Lb
            r0.g(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r1 = this;
            super.onPause()     // Catch: java.lang.Throwable -> Lb
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.rV()     // Catch: java.lang.Throwable -> Lb
            r0.f(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onPreCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            com.kwad.components.core.proxy.a.a r0 = r3.mPageMonitor     // Catch: java.lang.Throwable -> L39
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.START_ON_PRE_CREATE     // Catch: java.lang.Throwable -> L39
            r0.a(r1)     // Catch: java.lang.Throwable -> L39
            super.onPreCreate(r4)     // Catch: java.lang.Throwable -> L39
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.Bk()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L2e
            boolean r0 = r3.needAdaptionScreen()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2a
            r1 = 27
            if (r0 > r1) goto L2e
            android.app.Activity r0 = r3.getActivity()     // Catch: java.lang.Throwable -> L2a
            r1 = 1
            r2 = 0
            com.kwad.components.core.t.d.a(r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)     // Catch: java.lang.Throwable -> L39
        L2e:
            r3.disableFragmentRestore(r4)     // Catch: java.lang.Throwable -> L39
            com.kwad.components.core.proxy.a.a r4 = r3.mPageMonitor     // Catch: java.lang.Throwable -> L39
            com.kwad.components.core.proxy.PageCreateStage r0 = com.kwad.components.core.proxy.PageCreateStage.END_ON_PRE_CREATE     // Catch: java.lang.Throwable -> L39
            r4.a(r0)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r4 = move-exception
            com.kwad.components.core.proxy.a.a r0 = r3.mPageMonitor
            com.kwad.components.core.proxy.PageCreateStage r1 = com.kwad.components.core.proxy.PageCreateStage.ERROR_START_ACTIVITY
            r0.a(r1)
            com.kwad.components.core.exception.KSAdPreCreateException r0 = new com.kwad.components.core.exception.KSAdPreCreateException
            java.lang.String r1 = "ksad_pre_create_exception"
            r0.<init>(r1, r4)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onResume() {
            r1 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.proxy.a.a r0 = r1.mPageMonitor     // Catch: java.lang.Throwable -> L13
            r1.getActivity()     // Catch: java.lang.Throwable -> L13
            r0.sd()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.rV()     // Catch: java.lang.Throwable -> L13
            r0.e(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            super.onSaveInstanceState(r1)
            r0.disableFragmentRestore(r1)
            return
    }

    public void removeBackPressable(com.kwad.sdk.m.a.b r2) {
            r1 = this;
            com.kwad.sdk.m.a.a r0 = r1.mBackPressDelete
            r0.removeBackPressable(r2)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void setContentView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            android.view.View r3 = com.kwad.sdk.o.m.inflate(r0, r3, r1)     // Catch: java.lang.Throwable -> Ld
            r2.mRootView = r3     // Catch: java.lang.Throwable -> Ld
            super.setContentView(r3)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }
}
