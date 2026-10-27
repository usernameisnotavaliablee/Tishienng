package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class EventStoreModule_SchemaVersionFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.Integer> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory
                r0.<init>()
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory access$000() {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public EventStoreModule_SchemaVersionFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory create() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.access$000()
            return r0
    }

    public static int schemaVersion() {
            int r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.schemaVersion()
            return r0
    }

    public java.lang.Integer get() {
            r1 = this;
            int r0 = schemaVersion()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m58get() {
            r1 = this;
            java.lang.Integer r0 = r1.get()
            return r0
    }
}
