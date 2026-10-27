package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BackendRequest {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.runtime.backends.BackendRequest build();

        public abstract com.google.android.datatransport.runtime.backends.BackendRequest.Builder setEvents(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1);

        public abstract com.google.android.datatransport.runtime.backends.BackendRequest.Builder setExtras(@androidx.annotation.Nullable byte[] r1);
    }

    public BackendRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.backends.BackendRequest.Builder builder() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest$Builder r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendRequest create(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1) {
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r0 = builder()
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r1 = r0.setEvents(r1)
            com.google.android.datatransport.runtime.backends.BackendRequest r1 = r1.build()
            return r1
    }

    public abstract java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> getEvents();

    @androidx.annotation.Nullable
    public abstract byte[] getExtras();
}
