package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ImmutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> delegate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.reflect.ImmutableTypeToInstanceMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<com.google.common.reflect.TypeToken<? extends B>, B> mapBuilder;

        private Builder() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
                r1.mapBuilder = r0
                return
        }

        /* synthetic */ Builder(com.google.common.reflect.ImmutableTypeToInstanceMap.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.common.reflect.ImmutableTypeToInstanceMap<B> build() {
                r3 = this;
                com.google.common.reflect.ImmutableTypeToInstanceMap r0 = new com.google.common.reflect.ImmutableTypeToInstanceMap
                com.google.common.collect.ImmutableMap$Builder<com.google.common.reflect.TypeToken<? extends B>, B> r1 = r3.mapBuilder
                com.google.common.collect.ImmutableMap r1 = r1.build()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(com.google.common.reflect.TypeToken<T> r2, T r3) {
                r1 = this;
                com.google.common.collect.ImmutableMap$Builder<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.mapBuilder
                com.google.common.reflect.TypeToken r2 = r2.rejectTypeVariables()
                r0.put(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(java.lang.Class<T> r2, T r3) {
                r1 = this;
                com.google.common.collect.ImmutableMap$Builder<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.mapBuilder
                com.google.common.reflect.TypeToken r2 = com.google.common.reflect.TypeToken.of(r2)
                r0.put(r2, r3)
                return r1
        }
    }

    private ImmutableTypeToInstanceMap(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    /* synthetic */ ImmutableTypeToInstanceMap(com.google.common.collect.ImmutableMap r1, com.google.common.reflect.ImmutableTypeToInstanceMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> builder() {
            com.google.common.reflect.ImmutableTypeToInstanceMap$Builder r0 = new com.google.common.reflect.ImmutableTypeToInstanceMap$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap<B> of() {
            com.google.common.reflect.ImmutableTypeToInstanceMap r0 = new com.google.common.reflect.ImmutableTypeToInstanceMap
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
            r0.<init>(r1)
            return r0
    }

    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
            r1 = this;
            com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> r1) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = r1.rejectTypeVariables()
            java.lang.Object r1 = r0.trustedGet(r1)
            return r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(java.lang.Class<T> r1) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = com.google.common.reflect.TypeToken.of(r1)
            java.lang.Object r1 = r0.trustedGet(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public B put(com.google.common.reflect.TypeToken<? extends B> r1, B r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = (com.google.common.reflect.TypeToken) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> r1, T r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public <T extends B> T putInstance(java.lang.Class<T> r1, T r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
