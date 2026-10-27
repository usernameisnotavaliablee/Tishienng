package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class PersistedEvent {
    public PersistedEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent create(long r1, com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.runtime.EventInternal r4) {
            com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent r0 = new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent
            r0.<init>(r1, r3, r4)
            return r0
    }

    public abstract com.google.android.datatransport.runtime.EventInternal getEvent();

    public abstract long getId();

    public abstract com.google.android.datatransport.runtime.TransportContext getTransportContext();
}
