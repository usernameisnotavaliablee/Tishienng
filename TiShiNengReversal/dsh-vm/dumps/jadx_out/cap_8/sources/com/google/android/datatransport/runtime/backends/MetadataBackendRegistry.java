package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.inject.Singleton
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class MetadataBackendRegistry implements com.google.android.datatransport.runtime.backends.BackendRegistry {
    private static final java.lang.String BACKEND_KEY_PREFIX = "backend:";
    private static final java.lang.String TAG = "BackendRegistry";
    private final com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider;
    private final java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> backends;
    private final com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class BackendFactoryProvider {
        private final android.content.Context applicationContext;
        private java.util.Map<java.lang.String, java.lang.String> backendProviders;

        BackendFactoryProvider(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.backendProviders = r0
                r1.applicationContext = r2
                return
        }

        private java.util.Map<java.lang.String, java.lang.String> discover(android.content.Context r9) {
                r8 = this;
                android.os.Bundle r9 = getMetadata(r9)
                if (r9 != 0) goto L9
                java.util.Map r9 = java.util.Collections.EMPTY_MAP
                return r9
            L9:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Set r1 = r9.keySet()
                java.util.Iterator r1 = r1.iterator()
            L16:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L58
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r9.get(r2)
                boolean r4 = r3 instanceof java.lang.String
                if (r4 == 0) goto L16
                java.lang.String r4 = "backend:"
                boolean r4 = r2.startsWith(r4)
                if (r4 == 0) goto L16
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = ","
                r5 = -1
                java.lang.String[] r3 = r3.split(r4, r5)
                int r4 = r3.length
                r5 = 0
            L3d:
                if (r5 >= r4) goto L16
                r6 = r3[r5]
                java.lang.String r6 = r6.trim()
                boolean r7 = r6.isEmpty()
                if (r7 == 0) goto L4c
                goto L55
            L4c:
                r7 = 8
                java.lang.String r7 = r2.substring(r7)
                r0.put(r6, r7)
            L55:
                int r5 = r5 + 1
                goto L3d
            L58:
                return r0
        }

        private java.util.Map<java.lang.String, java.lang.String> getBackendProviders() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.backendProviders
                if (r0 != 0) goto Lc
                android.content.Context r0 = r1.applicationContext
                java.util.Map r0 = r1.discover(r0)
                r1.backendProviders = r0
            Lc:
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.backendProviders
                return r0
        }

        private static android.os.Bundle getMetadata(android.content.Context r4) {
                r0 = 0
                android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
                if (r1 != 0) goto L8
                return r0
            L8:
                android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r3 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
                r4 = 128(0x80, float:1.8E-43)
                android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
                if (r4 != 0) goto L18
                return r0
            L18:
                android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
                return r4
            L1b:
                return r0
        }

        @androidx.annotation.Nullable
        com.google.android.datatransport.runtime.backends.BackendFactory get(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "Could not instantiate %s."
                java.lang.String r1 = "Could not instantiate %s"
                java.util.Map r2 = r7.getBackendProviders()
                java.lang.Object r8 = r2.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                r2 = 0
                if (r8 != 0) goto L12
                return r2
            L12:
                r3 = 0
                r4 = 1
                java.lang.Class r5 = java.lang.Class.forName(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L31 java.lang.InstantiationException -> L39 java.lang.IllegalAccessException -> L41 java.lang.ClassNotFoundException -> L49
                java.lang.Class<com.google.android.datatransport.runtime.backends.BackendFactory> r6 = com.google.android.datatransport.runtime.backends.BackendFactory.class
                java.lang.Class r5 = r5.asSubclass(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L31 java.lang.InstantiationException -> L39 java.lang.IllegalAccessException -> L41 java.lang.ClassNotFoundException -> L49
                java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L31 java.lang.InstantiationException -> L39 java.lang.IllegalAccessException -> L41 java.lang.ClassNotFoundException -> L49
                java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L31 java.lang.InstantiationException -> L39 java.lang.IllegalAccessException -> L41 java.lang.ClassNotFoundException -> L49
                com.google.android.datatransport.runtime.backends.BackendFactory r5 = (com.google.android.datatransport.runtime.backends.BackendFactory) r5     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L31 java.lang.InstantiationException -> L39 java.lang.IllegalAccessException -> L41 java.lang.ClassNotFoundException -> L49
                return r5
            L29:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r8
                java.lang.String.format(r1, r0)
                goto L52
            L31:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r8
                java.lang.String.format(r1, r0)
                goto L52
            L39:
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r3] = r8
                java.lang.String.format(r0, r1)
                goto L52
            L41:
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r3] = r8
                java.lang.String.format(r0, r1)
                goto L52
            L49:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r8
                java.lang.String r8 = "Class %s is not found."
                java.lang.String.format(r8, r0)
            L52:
                return r2
        }
    }

    @javax.inject.Inject
    MetadataBackendRegistry(android.content.Context r2, com.google.android.datatransport.runtime.backends.CreationContextFactory r3) {
            r1 = this;
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider r0 = new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    MetadataBackendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider r2, com.google.android.datatransport.runtime.backends.CreationContextFactory r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.backends = r0
            r1.backendFactoryProvider = r2
            r1.creationContextFactory = r3
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @androidx.annotation.Nullable
    public synchronized com.google.android.datatransport.runtime.backends.TransportBackend get(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r0 = r2.backends     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r0 = r2.backends     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            com.google.android.datatransport.runtime.backends.TransportBackend r3 = (com.google.android.datatransport.runtime.backends.TransportBackend) r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r3
        L13:
            r3 = move-exception
            goto L31
        L15:
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider r0 = r2.backendFactoryProvider     // Catch: java.lang.Throwable -> L13
            com.google.android.datatransport.runtime.backends.BackendFactory r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L20
            monitor-exit(r2)
            r3 = 0
            return r3
        L20:
            com.google.android.datatransport.runtime.backends.CreationContextFactory r1 = r2.creationContextFactory     // Catch: java.lang.Throwable -> L13
            com.google.android.datatransport.runtime.backends.CreationContext r1 = r1.create(r3)     // Catch: java.lang.Throwable -> L13
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.create(r1)     // Catch: java.lang.Throwable -> L13
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r1 = r2.backends     // Catch: java.lang.Throwable -> L13
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r0
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }
}
