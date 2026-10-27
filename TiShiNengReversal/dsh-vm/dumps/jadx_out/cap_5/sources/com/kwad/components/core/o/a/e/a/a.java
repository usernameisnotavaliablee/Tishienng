package com.kwad.components.core.o.a.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static final java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.kwad.sdk.core.response.model.AdResultData>> Rx = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.components.core.o.a.e.a.a.Rx = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(int r1, com.kwad.sdk.core.response.model.AdResultData r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.kwad.sdk.core.response.model.AdResultData>> r2 = com.kwad.components.core.o.a.e.a.a.Rx
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r1, r0)
            return
    }

    public static com.kwad.sdk.core.response.model.AdResultData aI(int r1) {
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.kwad.sdk.core.response.model.AdResultData>> r0 = com.kwad.components.core.o.a.e.a.a.Rx
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L1b
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r1.get()
            com.kwad.sdk.core.response.model.AdResultData r1 = (com.kwad.sdk.core.response.model.AdResultData) r1
            return r1
        L1b:
            r1 = 0
            return r1
    }
}
