package com.kwad.components.core.internal.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {

    @androidx.annotation.NonNull
    private java.util.List<com.kwad.components.core.internal.api.b> Ri;
    private boolean Rj;
    private boolean Rk;

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.Ri = r0
            r0 = 0
            r1.Rj = r0
            r1.Rk = r0
            return
    }

    public final void a(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.core.internal.api.b> r0 = r1.Ri
            r0.add(r2)
            return
    }

    public final void b(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.core.internal.api.b> r0 = r1.Ri
            r0.remove(r2)
            return
    }

    public final void h(com.kwad.components.core.internal.api.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyAdEnter: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", hadNotifiedEnter: "
            r0.append(r1)
            boolean r1 = r2.Rk
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KsAdListenerHolder"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r2.Rk
            if (r0 == 0) goto L22
            return
        L22:
            java.util.List<com.kwad.components.core.internal.api.b> r0 = r2.Ri
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.internal.api.b r1 = (com.kwad.components.core.internal.api.b) r1
            r1.c(r3)
            goto L28
        L38:
            r3 = 1
            r2.Rk = r3
            return
    }

    public final void i(com.kwad.components.core.internal.api.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyAdExit: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", hadNotifiedExit: "
            r0.append(r1)
            boolean r1 = r2.Rj
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KsAdListenerHolder"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r2.Rj
            if (r0 == 0) goto L22
            return
        L22:
            java.util.List<com.kwad.components.core.internal.api.b> r0 = r2.Ri
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.internal.api.b r1 = (com.kwad.components.core.internal.api.b) r1
            r1.d(r3)
            goto L28
        L38:
            r3 = 1
            r2.Rj = r3
            return
    }
}
