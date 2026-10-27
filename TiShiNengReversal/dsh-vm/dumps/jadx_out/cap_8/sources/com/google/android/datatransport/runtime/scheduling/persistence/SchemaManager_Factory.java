package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SchemaManager_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> {
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<java.lang.String> dbNameProvider;
    private final javax.inject.Provider<java.lang.Integer> schemaVersionProvider;

    public SchemaManager_Factory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<java.lang.String> r2, javax.inject.Provider<java.lang.Integer> r3) {
            r0 = this;
            r0.<init>()
            r0.contextProvider = r1
            r0.dbNameProvider = r2
            r0.schemaVersionProvider = r3
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory create(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<java.lang.String> r2, javax.inject.Provider<java.lang.Integer> r3) {
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager newInstance(android.content.Context r1, java.lang.String r2, int r3) {
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager get() {
            r3 = this;
            javax.inject.Provider<android.content.Context> r0 = r3.contextProvider
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            javax.inject.Provider<java.lang.String> r1 = r3.dbNameProvider
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            javax.inject.Provider<java.lang.Integer> r2 = r3.schemaVersionProvider
            java.lang.Object r2 = r2.get()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = newInstance(r0, r1, r2)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m61get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = r1.get()
            return r0
    }
}
