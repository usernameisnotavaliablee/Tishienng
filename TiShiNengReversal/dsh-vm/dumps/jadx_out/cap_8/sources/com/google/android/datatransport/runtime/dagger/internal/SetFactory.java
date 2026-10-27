package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SetFactory<T> implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.Set<T>> {
    private static final com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.Set<java.lang.Object>> EMPTY_FACTORY = null;
    private final java.util.List<javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
    private final java.util.List<javax.inject.Provider<T>> individualProviders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.SetFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.List<javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
        private final java.util.List<javax.inject.Provider<T>> individualProviders;

        static {
                return
        }

        private Builder(int r1, int r2) {
                r0 = this;
                r0.<init>()
                java.util.List r1 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.presizedList(r1)
                r0.individualProviders = r1
                java.util.List r1 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.presizedList(r2)
                r0.collectionProviders = r1
                return
        }

        /* synthetic */ Builder(int r1, int r2, com.google.android.datatransport.runtime.dagger.internal.SetFactory.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public com.google.android.datatransport.runtime.dagger.internal.SetFactory.Builder<T> addCollectionProvider(javax.inject.Provider<? extends java.util.Collection<? extends T>> r2) {
                r1 = this;
                java.util.List<javax.inject.Provider<java.util.Collection<T>>> r0 = r1.collectionProviders
                r0.add(r2)
                return r1
        }

        public com.google.android.datatransport.runtime.dagger.internal.SetFactory.Builder<T> addProvider(javax.inject.Provider<? extends T> r2) {
                r1 = this;
                java.util.List<javax.inject.Provider<T>> r0 = r1.individualProviders
                r0.add(r2)
                return r1
        }

        public com.google.android.datatransport.runtime.dagger.internal.SetFactory<T> build() {
                r4 = this;
                com.google.android.datatransport.runtime.dagger.internal.SetFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.SetFactory
                java.util.List<javax.inject.Provider<T>> r1 = r4.individualProviders
                java.util.List<javax.inject.Provider<java.util.Collection<T>>> r2 = r4.collectionProviders
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            com.google.android.datatransport.runtime.dagger.internal.Factory r0 = com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.create(r0)
            com.google.android.datatransport.runtime.dagger.internal.SetFactory.EMPTY_FACTORY = r0
            return
    }

    private SetFactory(java.util.List<javax.inject.Provider<T>> r1, java.util.List<javax.inject.Provider<java.util.Collection<T>>> r2) {
            r0 = this;
            r0.<init>()
            r0.individualProviders = r1
            r0.collectionProviders = r2
            return
    }

    /* synthetic */ SetFactory(java.util.List r1, java.util.List r2, com.google.android.datatransport.runtime.dagger.internal.SetFactory.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.SetFactory.Builder<T> builder(int r2, int r3) {
            com.google.android.datatransport.runtime.dagger.internal.SetFactory$Builder r0 = new com.google.android.datatransport.runtime.dagger.internal.SetFactory$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.Set<T>> empty() {
            com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.Set<java.lang.Object>> r0 = com.google.android.datatransport.runtime.dagger.internal.SetFactory.EMPTY_FACTORY
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.Set r0 = r1.m51get()
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.util.Set<T> m51get() {
            r7 = this;
            java.util.List<javax.inject.Provider<T>> r0 = r7.individualProviders
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<javax.inject.Provider<java.util.Collection<T>>> r2 = r7.collectionProviders
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<javax.inject.Provider<java.util.Collection<T>>> r2 = r7.collectionProviders
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L19:
            if (r4 >= r2) goto L34
            java.util.List<javax.inject.Provider<java.util.Collection<T>>> r5 = r7.collectionProviders
            java.lang.Object r5 = r5.get(r4)
            javax.inject.Provider r5 = (javax.inject.Provider) r5
            java.lang.Object r5 = r5.get()
            java.util.Collection r5 = (java.util.Collection) r5
            int r6 = r5.size()
            int r0 = r0 + r6
            r1.add(r5)
            int r4 = r4 + 1
            goto L19
        L34:
            java.util.HashSet r0 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.newHashSetWithExpectedSize(r0)
            java.util.List<javax.inject.Provider<T>> r2 = r7.individualProviders
            int r2 = r2.size()
            r4 = 0
        L3f:
            if (r4 >= r2) goto L57
            java.util.List<javax.inject.Provider<T>> r5 = r7.individualProviders
            java.lang.Object r5 = r5.get(r4)
            javax.inject.Provider r5 = (javax.inject.Provider) r5
            java.lang.Object r5 = r5.get()
            java.lang.Object r5 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L3f
        L57:
            int r2 = r1.size()
        L5b:
            if (r3 >= r2) goto L7c
            java.lang.Object r4 = r1.get(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r4 = r4.iterator()
        L67:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()
            java.lang.Object r5 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r5)
            r0.add(r5)
            goto L67
        L79:
            int r3 = r3 + 1
            goto L5b
        L7c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
