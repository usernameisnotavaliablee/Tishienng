package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class k implements com.kwad.components.offline.api.core.api.IOfflineCompoLogcat {
    k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void d(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.kwad.sdk.core.d.c.d(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void e(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.kwad.sdk.core.d.c.e(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void e(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            com.kwad.sdk.core.d.c.e(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void i(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.kwad.sdk.core.d.c.i(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IOfflineCompoLogcat
    public final boolean isLoggable() {
            r1 = this;
            boolean r0 = com.kwad.sdk.core.d.c.aEb
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void printStackTrace(java.lang.Throwable r1) {
            r0 = this;
            com.kwad.sdk.core.d.c.printStackTrace(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void printStackTraceOnly(java.lang.Throwable r1) {
            r0 = this;
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void v(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.kwad.sdk.core.d.c.v(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void v(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L6
            com.kwad.sdk.core.d.c.T(r1, r2)
            return
        L6:
            com.kwad.sdk.core.d.c.v(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void w(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.kwad.sdk.core.d.c.w(r1, r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILogcat
    public final void w(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto Lc
            java.lang.Boolean r3 = com.kwad.components.core.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            com.kwad.sdk.core.d.c.w(r1, r2)
            return
    }
}
