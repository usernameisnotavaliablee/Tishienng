package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class CreationContextFactory {
    private final android.content.Context applicationContext;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    @javax.inject.Inject
    CreationContextFactory(android.content.Context r1, @com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r2, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r3) {
            r0 = this;
            r0.<init>()
            r0.applicationContext = r1
            r0.wallClock = r2
            r0.monotonicClock = r3
            return
    }

    com.google.android.datatransport.runtime.backends.CreationContext create(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.applicationContext
            com.google.android.datatransport.runtime.time.Clock r1 = r3.wallClock
            com.google.android.datatransport.runtime.time.Clock r2 = r3.monotonicClock
            com.google.android.datatransport.runtime.backends.CreationContext r4 = com.google.android.datatransport.runtime.backends.CreationContext.create(r0, r1, r2, r4)
            return r4
    }
}
