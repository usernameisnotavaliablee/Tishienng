package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class CreationContext {
    private static final java.lang.String DEFAULT_BACKEND_NAME = "cct";

    public CreationContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context r2, com.google.android.datatransport.runtime.time.Clock r3, com.google.android.datatransport.runtime.time.Clock r4) {
            com.google.android.datatransport.runtime.backends.AutoValue_CreationContext r0 = new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext
            java.lang.String r1 = "cct"
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context r1, com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.time.Clock r3, java.lang.String r4) {
            com.google.android.datatransport.runtime.backends.AutoValue_CreationContext r0 = new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public abstract android.content.Context getApplicationContext();

    @androidx.annotation.NonNull
    public abstract java.lang.String getBackendName();

    public abstract com.google.android.datatransport.runtime.time.Clock getMonotonicClock();

    public abstract com.google.android.datatransport.runtime.time.Clock getWallClock();
}
