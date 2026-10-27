package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ComponentDiscovery<T> {
    private static final java.lang.String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final java.lang.String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final java.lang.String TAG = "ComponentDiscovery";
    private final T context;
    private final com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> retriever;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.firebase.components.ComponentDiscovery$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MetadataRegistrarNameRetriever implements com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<android.content.Context> {
        private final java.lang.Class<? extends android.app.Service> discoveryService;

        private MetadataRegistrarNameRetriever(java.lang.Class<? extends android.app.Service> r1) {
                r0 = this;
                r0.<init>()
                r0.discoveryService = r1
                return
        }

        /* synthetic */ MetadataRegistrarNameRetriever(java.lang.Class r1, com.google.firebase.components.ComponentDiscovery.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private android.os.Bundle getMetadata(android.content.Context r5) {
                r4 = this;
                r0 = 0
                android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                if (r1 != 0) goto L8
                return r0
            L8:
                android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                java.lang.Class<? extends android.app.Service> r3 = r4.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                r2.<init>(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                r5 = 128(0x80, float:1.8E-43)
                android.content.pm.ServiceInfo r5 = r1.getServiceInfo(r2, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                if (r5 != 0) goto L1d
                java.lang.Class<? extends android.app.Service> r5 = r4.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                java.util.Objects.toString(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                return r0
            L1d:
                android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
                return r5
            L20:
                return r0
        }

        /* renamed from: retrieve, reason: avoid collision after fix types in other method */
        public java.util.List<java.lang.String> retrieve2(android.content.Context r6) {
                r5 = this;
                android.os.Bundle r6 = r5.getMetadata(r6)
                if (r6 != 0) goto L9
                java.util.List r6 = java.util.Collections.EMPTY_LIST
                return r6
            L9:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Set r1 = r6.keySet()
                java.util.Iterator r1 = r1.iterator()
            L16:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L40
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r6.get(r2)
                java.lang.String r4 = "com.google.firebase.components.ComponentRegistrar"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L16
                java.lang.String r3 = "com.google.firebase.components:"
                boolean r3 = r2.startsWith(r3)
                if (r3 == 0) goto L16
                r3 = 31
                java.lang.String r2 = r2.substring(r3)
                r0.add(r2)
                goto L16
            L40:
                return r0
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public /* bridge */ /* synthetic */ java.util.List retrieve(android.content.Context r1) {
                r0 = this;
                android.content.Context r1 = (android.content.Context) r1
                java.util.List r1 = r0.retrieve2(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    interface RegistrarNameRetriever<T> {
        java.util.List<java.lang.String> retrieve(T r1);
    }

    @androidx.annotation.VisibleForTesting
    ComponentDiscovery(T r1, com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.retriever = r2
            return
    }

    public static com.google.firebase.components.ComponentDiscovery<android.content.Context> forContext(android.content.Context r3, java.lang.Class<? extends android.app.Service> r4) {
            com.google.firebase.components.ComponentDiscovery r0 = new com.google.firebase.components.ComponentDiscovery
            com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever r1 = new com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever
            r2 = 0
            r1.<init>(r4, r2)
            r0.<init>(r3, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.firebase.components.ComponentRegistrar instantiate(java.lang.String r9) {
            java.lang.String r0 = "Could not instantiate %s."
            java.lang.String r1 = "Could not instantiate %s"
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            java.lang.Class<com.google.firebase.components.ComponentRegistrar> r6 = com.google.firebase.components.ComponentRegistrar.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            if (r6 == 0) goto L26
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            java.lang.Object r5 = r5.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            com.google.firebase.components.ComponentRegistrar r5 = (com.google.firebase.components.ComponentRegistrar) r5     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            return r5
        L1e:
            r0 = move-exception
            goto L3b
        L20:
            r0 = move-exception
            goto L49
        L22:
            r1 = move-exception
            goto L57
        L24:
            r1 = move-exception
            goto L65
        L26:
            com.google.firebase.components.InvalidRegistrarException r5 = new com.google.firebase.components.InvalidRegistrarException     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            java.lang.String r6 = "Class %s is not an instance of %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            r7[r3] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            java.lang.String r8 = "com.google.firebase.components.ComponentRegistrar"
            r7[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            r5.<init>(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L73
        L3b:
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r9
            java.lang.String r9 = java.lang.String.format(r1, r2)
            r4.<init>(r9, r0)
            throw r4
        L49:
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r9
            java.lang.String r9 = java.lang.String.format(r1, r2)
            r4.<init>(r9, r0)
            throw r4
        L57:
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r9
            java.lang.String r9 = java.lang.String.format(r0, r2)
            r4.<init>(r9, r1)
            throw r4
        L65:
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r9
            java.lang.String r9 = java.lang.String.format(r0, r2)
            r4.<init>(r9, r1)
            throw r4
        L73:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r9
            java.lang.String r9 = "Class %s is not an found."
            java.lang.String.format(r9, r0)
            return r4
    }

    static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$discoverLazy$0(java.lang.String r0) {
            com.google.firebase.components.ComponentRegistrar r0 = instantiate(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.util.List<com.google.firebase.components.ComponentRegistrar> discover() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever<T> r1 = r3.retriever
            T r2 = r3.context
            java.util.List r1 = r1.retrieve(r2)
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.firebase.components.ComponentRegistrar r2 = instantiate(r2)     // Catch: com.google.firebase.components.InvalidRegistrarException -> L27
            if (r2 == 0) goto L11
            r0.add(r2)     // Catch: com.google.firebase.components.InvalidRegistrarException -> L27
            goto L11
        L27:
            goto L11
        L29:
            return r0
    }

    public java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> discoverLazy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever<T> r1 = r3.retriever
            T r2 = r3.context
            java.util.List r1 = r1.retrieve(r2)
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.firebase.inject.Provider r2 = com.google.firebase.components.ComponentDiscovery$$Lambda$1.lambdaFactory$(r2)
            r0.add(r2)
            goto L11
        L25:
            return r0
    }
}
