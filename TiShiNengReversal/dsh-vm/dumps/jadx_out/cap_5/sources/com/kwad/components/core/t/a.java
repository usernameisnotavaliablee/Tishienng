package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static volatile com.kwad.components.core.t.a YF;
    private com.kwad.sdk.utils.i YB;
    private java.util.List<java.lang.ref.WeakReference<com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener>> YC;
    private boolean YD;
    private boolean YE;


    private a(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.YC = r0
            r0 = 0
            r1.YD = r0
            r1.YE = r0
            r1.init(r2)
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.core.t.a r0) {
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener>> r0 = r0.YC
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.t.a r0, boolean r1) {
            r1 = 1
            r0.YE = r1
            return r1
    }

    public static com.kwad.components.core.t.a aC(@androidx.annotation.NonNull android.content.Context r2) {
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.YF
            if (r0 != 0) goto L21
            java.lang.Class<com.kwad.components.core.t.a> r0 = com.kwad.components.core.t.a.class
            monitor-enter(r0)
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.YF     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            com.kwad.components.core.t.a r1 = new com.kwad.components.core.t.a     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.t.a.YF = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        L21:
            com.kwad.components.core.t.a r2 = com.kwad.components.core.t.a.YF
            return r2
    }

    private void init(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.YD = r0
            com.kwad.sdk.utils.i r0 = new com.kwad.sdk.utils.i
            r0.<init>(r2)
            r1.YB = r0
            com.kwad.components.core.t.a$1 r2 = new com.kwad.components.core.t.a$1
            r2.<init>(r1)
            r0.c(r2)
            return
    }

    public final void a(com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener>> r0 = r2.YC
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public final boolean aQ(boolean r3) {
            r2 = this;
            com.kwad.sdk.utils.i r0 = r2.YB
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 != 0) goto Ld
            boolean r3 = r2.YD
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r3 = 1
            r2.YD = r3
            r2.YE = r1
            boolean r3 = r0.PF()
            return r3
    }

    public final void b(com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener>> r0 = r2.YC
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r1.get()
            if (r1 != r3) goto L6
        L1a:
            r0.remove()
            goto L6
        L1e:
            return
    }

    public final boolean sW() {
            r1 = this;
            boolean r0 = r1.YE
            return r0
    }

    public final boolean sX() {
            r1 = this;
            boolean r0 = r1.YD
            return r0
    }
}
