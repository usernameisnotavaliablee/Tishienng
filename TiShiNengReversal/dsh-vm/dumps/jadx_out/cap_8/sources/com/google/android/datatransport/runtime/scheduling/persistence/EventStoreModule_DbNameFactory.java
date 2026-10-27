package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class EventStoreModule_DbNameFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.String> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory
                r0.<init>()
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory access$000() {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public EventStoreModule_DbNameFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory create() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.access$000()
            return r0
    }

    public static java.lang.String dbName() {
            java.lang.String r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.dbName()
            java.lang.String r1 = "Cannot return null from a non-@Nullable @Provides method"
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.lang.String r0 = r1.m57get()
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.lang.String m57get() {
            r1 = this;
            java.lang.String r0 = dbName()
            return r0
    }
}
