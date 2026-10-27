package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements com.beizi.ad.AdActivity.a {
    private android.app.Activity a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.view.AdWebView f6620b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.view.f f6621c;

    public c(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6621c = r0
            r1.a = r2
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void a() {
            r2 = this;
            android.widget.FrameLayout r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenContainer()
            if (r0 == 0) goto L66
            com.beizi.ad.internal.view.f r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenImplementation()
            if (r0 != 0) goto Ld
            goto L66
        Ld:
            android.widget.FrameLayout r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenContainer()
            com.beizi.ad.internal.h.u.a(r0)
            android.app.Activity r0 = r2.a
            android.widget.FrameLayout r1 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenContainer()
            r0.setContentView(r1)
            android.widget.FrameLayout r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenContainer()
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r0 = r0 instanceof com.beizi.ad.internal.view.AdWebView
            if (r0 == 0) goto L36
            android.widget.FrameLayout r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenContainer()
            android.view.View r0 = r0.getChildAt(r1)
            com.beizi.ad.internal.view.AdWebView r0 = (com.beizi.ad.internal.view.AdWebView) r0
            r2.f6620b = r0
        L36:
            com.beizi.ad.internal.view.AdWebView r0 = r2.f6620b
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L4d
            com.beizi.ad.internal.view.AdWebView r0 = r2.f6620b
            android.content.Context r0 = r0.getContext()
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0
            android.app.Activity r1 = r2.a
            r0.setBaseContext(r1)
        L4d:
            com.beizi.ad.internal.view.f r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenImplementation()
            r2.f6621c = r0
            android.app.Activity r1 = r2.a
            r0.a(r1)
            com.beizi.ad.internal.view.AdWebView$b r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenListener()
            if (r0 == 0) goto L65
            com.beizi.ad.internal.view.AdWebView$b r0 = com.beizi.ad.internal.view.AdViewImpl.getMRAIDFullscreenListener()
            r0.a()
        L65:
            return
        L66:
            android.app.Activity r0 = r2.a
            r0.finish()
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
            r2 = this;
            com.beizi.ad.internal.view.f r0 = r2.f6621c
            r1 = 0
            if (r0 == 0) goto Ld
            r0.a(r1)
            com.beizi.ad.internal.view.f r0 = r2.f6621c
            r0.a()
        Ld:
            r2.f6621c = r1
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public android.webkit.WebView f() {
            r1 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r1.f6620b
            return r0
    }
}
