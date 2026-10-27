package com.kwad.library.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"RestrictedApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d extends androidx.appcompat.view.ContextThemeWrapper implements com.kwad.library.b.c.b {
    private android.content.res.Resources.Theme aqh;
    private int aqi;
    private java.lang.String aqj;
    private final androidx.appcompat.view.ContextThemeWrapper aqk;

    public d(androidx.appcompat.view.ContextThemeWrapper r2, java.lang.String r3) {
            r1 = this;
            int r0 = r2.getThemeResId()
            r1.<init>(r2, r0)
            r1.aqk = r2
            r1.aqj = r3
            java.lang.String r3 = "android.view.ContextThemeWrapper"
            java.lang.String r0 = "getThemeResId"
            java.lang.Object r2 = com.kwad.sdk.utils.z.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L1d
            r1.aqi = r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    public final android.content.Context getApplicationContext() {
            r2 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r2.aqk
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = r2.aqj
            android.content.Context r0 = com.kwad.library.b.c.a.j(r0, r1)
            return r0
    }

    public final android.content.Context getBaseContext() {
            r1 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r1.aqk
            return r0
    }

    public final java.lang.ClassLoader getClassLoader() {
            r2 = this;
            java.lang.ClassLoader r0 = super/*android.content.ContextWrapper*/.getClassLoader()
            java.lang.String r1 = r2.aqj
            java.lang.ClassLoader r0 = com.kwad.library.b.c.a.a(r0, r1)
            return r0
    }

    @Override // com.kwad.library.b.c.b
    public final android.content.Context getDelegatedContext() {
            r1 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r1.aqk
            return r0
    }

    public final android.content.res.Resources getResources() {
            r2 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r2.aqk
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r2.aqj
            android.content.res.Resources r0 = com.kwad.library.b.c.a.a(r0, r1)
            return r0
    }

    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r1.aqk
            java.lang.Object r0 = r0.getSystemService(r2)
            java.lang.Object r2 = com.kwad.library.b.c.a.wrapSystemService(r0, r2, r1)
            return r2
    }

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

    public final void registerComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r1.aqk
            r0.registerComponentCallbacks(r2)
            return
    }

    public final void setTheme(int r1) {
            r0 = this;
            r0.aqi = r1
            super.setTheme(r1)
            return
    }

    public final void unregisterComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            androidx.appcompat.view.ContextThemeWrapper r0 = r1.aqk
            r0.unregisterComponentCallbacks(r2)
            return
    }
}
