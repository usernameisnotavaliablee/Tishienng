package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private static volatile com.kwad.components.core.c.g NM;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> NL;

    public g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.NL = r0
            return
    }

    private static java.lang.String aw(com.kwad.sdk.core.response.model.AdTemplate r4) {
            long r0 = com.kwad.sdk.core.response.b.e.ee(r4)
            long r2 = com.kwad.sdk.core.response.b.e.ev(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "-"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private static java.lang.String b(com.kwad.components.core.c.h r2) {
            java.lang.String r0 = r2.og()
            java.lang.String r2 = r2.os()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    @androidx.annotation.NonNull
    public static com.kwad.components.core.c.g om() {
            com.kwad.components.core.c.g r0 = com.kwad.components.core.c.g.NM
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.c.g> r0 = com.kwad.components.core.c.g.class
            monitor-enter(r0)
            com.kwad.components.core.c.g r1 = com.kwad.components.core.c.g.NM     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.c.g r1 = new com.kwad.components.core.c.g     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.c.g.NM = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.core.c.g r0 = com.kwad.components.core.c.g.NM
            return r0
    }

    public final boolean a(com.kwad.components.core.c.h r5) {
            r4 = this;
            java.lang.String r5 = b(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "contains key: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdMemCachePool"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> r0 = r4.NL
            boolean r0 = r0.containsKey(r5)
            r2 = 0
            if (r0 != 0) goto L21
            return r2
        L21:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> r0 = r4.NL
            java.lang.Object r5 = r0.get(r5)
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            if (r5 == 0) goto L32
            java.lang.Object r0 = r5.get()
            if (r0 == 0) goto L32
            r2 = 1
        L32:
            if (r2 == 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "contains ad: "
            r0.<init>(r3)
            java.lang.Object r5 = r5.get()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r5)
        L49:
            return r2
    }

    public final void add(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.kwad.components.core.internal.api.a
            if (r0 == 0) goto L19
            r0 = r4
            com.kwad.components.core.internal.api.a r0 = (com.kwad.components.core.internal.api.a) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            java.lang.String r0 = aw(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> r1 = r3.NL
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            r1.put(r0, r2)
        L19:
            return
    }

    public final void av(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            java.lang.String r2 = aw(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> r0 = r1.NL
            r0.remove(r2)
            return
    }
}
