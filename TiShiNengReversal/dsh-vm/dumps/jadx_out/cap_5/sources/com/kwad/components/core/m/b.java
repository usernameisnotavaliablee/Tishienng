package com.kwad.components.core.m;

import com.kwad.components.core.m.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b<T extends com.kwad.components.core.m.a> extends com.kwad.components.core.proxy.f {
    public T mCallerContext;
    protected com.kwad.sdk.mvp.Presenter mPresenter;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private void notifyOnCreate() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            if (r0 != 0) goto L5
            goto L1b
        L5:
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.m.a.a r1 = (com.kwad.components.core.m.a.a) r1
            r1.gY()
            goto Lb
        L1b:
            return
    }

    private void notifyOnDestroy() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            if (r0 != 0) goto L5
            goto L1b
        L5:
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.m.a.a r1 = (com.kwad.components.core.m.a.a) r1
            r1.gZ()
            goto Lb
        L1b:
            return
    }

    private void notifyOnPause() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            if (r0 != 0) goto L5
            goto L1b
        L5:
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.m.a.a r1 = (com.kwad.components.core.m.a.a) r1
            r1.d(r2)
            goto Lb
        L1b:
            return
    }

    private void notifyOnResume() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            if (r0 != 0) goto L5
            goto L1b
        L5:
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.m.a.a r1 = (com.kwad.components.core.m.a.a) r1
            r1.c(r2)
            goto Lb
        L1b:
            return
    }

    public void initMVP() {
            r2 = this;
            com.kwad.components.core.m.a r0 = r2.onCreateCallerContext()
            r2.mCallerContext = r0
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            if (r0 != 0) goto L15
            com.kwad.sdk.mvp.Presenter r0 = r2.onCreatePresenter()
            r2.mPresenter = r0
            android.view.View r1 = r2.mRootView
            r0.K(r1)
        L15:
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            T extends com.kwad.components.core.m.a r1 = r2.mCallerContext
            r0.n(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    @androidx.annotation.CallSuper
    public void onActivityCreate() {
            r1 = this;
            super.onActivityCreate()     // Catch: java.lang.Throwable -> La
            r1.initMVP()     // Catch: java.lang.Throwable -> La
            r1.notifyOnCreate()     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    protected abstract T onCreateCallerContext();

    protected abstract com.kwad.sdk.mvp.Presenter onCreatePresenter();

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onDestroy() {
            r1 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> Le
            r1.notifyOnDestroy()     // Catch: java.lang.Throwable -> Le
            T extends com.kwad.components.core.m.a r0 = r1.mCallerContext     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0.release()     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L18
        L10:
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L17
            r0.destroy()     // Catch: java.lang.Throwable -> Le
        L17:
            return
        L18:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onPause() {
            r1 = this;
            super.onPause()     // Catch: java.lang.Throwable -> L7
            r1.notifyOnPause()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    @androidx.annotation.CallSuper
    public void onResume() {
            r1 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L7
            r1.notifyOnResume()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }
}
