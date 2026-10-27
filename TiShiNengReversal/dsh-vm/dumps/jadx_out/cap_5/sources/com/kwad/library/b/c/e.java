package com.kwad.library.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class e extends android.content.ContextWrapper implements com.kwad.library.b.c.b {
    private android.content.res.Resources.Theme aqh;
    private int aqi;
    private java.lang.String aqj;
    private final android.content.Context mContext;

    e(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = -1
            r1.aqi = r0
            r1.mContext = r2
            r1.aqj = r3
            int r2 = com.kwad.library.b.c.a.getThemeResId(r2)
            r1.aqi = r2
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.Context getApplicationContext() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = r2.aqj
            android.content.Context r0 = com.kwad.library.b.c.a.j(r0, r1)
            return r0
    }

    @Override // android.content.ContextWrapper
    public final android.content.Context getBaseContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.ClassLoader getClassLoader() {
            r2 = this;
            java.lang.ClassLoader r0 = super.getClassLoader()
            java.lang.String r1 = r2.aqj
            java.lang.ClassLoader r0 = com.kwad.library.b.c.a.a(r0, r1)
            return r0
    }

    @Override // com.kwad.library.b.c.b
    public final android.content.Context getDelegatedContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r2.aqj
            android.content.res.Resources r0 = com.kwad.library.b.c.a.a(r0, r1)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = super.getSystemService(r2)
            java.lang.Object r2 = com.kwad.library.b.c.a.wrapSystemService(r0, r2, r1)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r4 = this;
            android.content.res.Resources$Theme r0 = super.getTheme()     // Catch: java.lang.Exception -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            android.content.res.Resources$Theme r1 = r4.aqh
            if (r1 == 0) goto Lc
            if (r1 != r0) goto L16
        Lc:
            int r2 = r4.aqi
            java.lang.String r3 = r4.aqj
            android.content.res.Resources$Theme r0 = com.kwad.library.b.c.a.a(r0, r1, r2, r3)
            r4.aqh = r0
        L16:
            android.content.res.Resources$Theme r0 = r4.aqh
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void registerComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r0.registerComponentCallbacks(r2)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r1) {
            r0 = this;
            r0.aqi = r1
            super.setTheme(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r0.unregisterComponentCallbacks(r2)
            return
    }
}
