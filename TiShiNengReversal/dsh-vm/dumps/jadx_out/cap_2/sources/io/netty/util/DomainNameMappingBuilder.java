package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DomainNameMappingBuilder<V> {
    private final V defaultValue;
    private final java.util.Map<java.lang.String, V> map;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.DomainNameMappingBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ImmutableDomainNameMapping<V> extends io.netty.util.DomainNameMapping<V> {
        private static final int REPR_CONST_PART_LENGTH = 46;
        private static final java.lang.String REPR_HEADER = "ImmutableDomainNameMapping(default: ";
        private static final java.lang.String REPR_MAP_CLOSING = "})";
        private static final java.lang.String REPR_MAP_OPENING = ", map: {";
        private final java.lang.String[] domainNamePatterns;
        private final java.util.Map<java.lang.String, V> map;
        private final V[] values;

        static {
                return
        }

        private ImmutableDomainNameMapping(V r5, java.util.Map<java.lang.String, V> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0, r5)
                java.util.Set r5 = r6.entrySet()
                int r0 = r5.size()
                java.lang.String[] r1 = new java.lang.String[r0]
                r4.domainNamePatterns = r1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r4.values = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                int r6 = r6.size()
                r0.<init>(r6)
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L22:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L4a
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = io.netty.util.DomainNameMapping.normalizeHostname(r2)
                java.lang.Object r1 = r1.getValue()
                java.lang.String[] r3 = r4.domainNamePatterns
                r3[r6] = r2
                V[] r3 = r4.values
                r3[r6] = r1
                r0.put(r2, r1)
                int r6 = r6 + 1
                goto L22
            L4a:
                java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
                r4.map = r5
                return
        }

        /* synthetic */ ImmutableDomainNameMapping(java.lang.Object r1, java.util.Map r2, io.netty.util.DomainNameMappingBuilder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private java.lang.StringBuilder appendMapping(java.lang.StringBuilder r3, int r4) {
                r2 = this;
                java.lang.String[] r0 = r2.domainNamePatterns
                r0 = r0[r4]
                V[] r1 = r2.values
                r4 = r1[r4]
                java.lang.String r4 = r4.toString()
                java.lang.StringBuilder r3 = appendMapping(r3, r0, r4)
                return r3
        }

        private static java.lang.StringBuilder appendMapping(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                r0.append(r2)
                return r0
        }

        private static int estimateBufferSize(int r3, int r4, int r5) {
                int r0 = io.netty.util.DomainNameMappingBuilder.ImmutableDomainNameMapping.REPR_CONST_PART_LENGTH
                int r0 = r0 + r3
                int r5 = r5 * r4
                double r3 = (double) r5
                r1 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                double r3 = r3 * r1
                int r3 = (int) r3
                int r0 = r0 + r3
                return r0
        }

        @Override // io.netty.util.DomainNameMapping
        @java.lang.Deprecated
        public io.netty.util.DomainNameMapping<V> add(java.lang.String r1, V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Immutable DomainNameMapping does not support modification after initial creation"
                r1.<init>(r2)
                throw r1
        }

        @Override // io.netty.util.DomainNameMapping
        public java.util.Map<java.lang.String, V> asMap() {
                r1 = this;
                java.util.Map<java.lang.String, V> r0 = r1.map
                return r0
        }

        @Override // io.netty.util.DomainNameMapping, io.netty.util.Mapping
        public /* bridge */ /* synthetic */ java.lang.Object map(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.map2(r1)
                return r1
        }

        @Override // io.netty.util.DomainNameMapping
        /* renamed from: map, reason: avoid collision after fix types in other method */
        public V map2(java.lang.String r4) {
                r3 = this;
                if (r4 == 0) goto L1e
                java.lang.String r4 = io.netty.util.DomainNameMapping.normalizeHostname(r4)
                java.lang.String[] r0 = r3.domainNamePatterns
                int r0 = r0.length
                r1 = 0
            La:
                if (r1 >= r0) goto L1e
                java.lang.String[] r2 = r3.domainNamePatterns
                r2 = r2[r1]
                boolean r2 = io.netty.util.DomainNameMapping.matches(r2, r4)
                if (r2 == 0) goto L1b
                V[] r4 = r3.values
                r4 = r4[r1]
                return r4
            L1b:
                int r1 = r1 + 1
                goto La
            L1e:
                V r4 = r3.defaultValue
                return r4
        }

        @Override // io.netty.util.DomainNameMapping
        public java.lang.String toString() {
                r9 = this;
                V r0 = r9.defaultValue
                java.lang.String r0 = r0.toString()
                java.lang.String[] r1 = r9.domainNamePatterns
                int r2 = r1.length
                java.lang.String r3 = "})"
                java.lang.String r4 = ", map: {"
                java.lang.String r5 = "ImmutableDomainNameMapping(default: "
                if (r2 != 0) goto L27
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                r1.append(r0)
                r1.append(r4)
                r1.append(r3)
                java.lang.String r0 = r1.toString()
                return r0
            L27:
                r6 = 0
                r1 = r1[r6]
                V[] r7 = r9.values
                r6 = r7[r6]
                java.lang.String r6 = r6.toString()
                int r7 = r1.length()
                int r8 = r6.length()
                int r7 = r7 + r8
                int r7 = r7 + 3
                int r8 = r0.length()
                int r7 = estimateBufferSize(r8, r2, r7)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r7)
                r8.append(r5)
                r8.append(r0)
                r8.append(r4)
                appendMapping(r8, r1, r6)
                r0 = 1
            L57:
                if (r0 >= r2) goto L64
                java.lang.String r1 = ", "
                r8.append(r1)
                r9.appendMapping(r8, r0)
                int r0 = r0 + 1
                goto L57
            L64:
                r8.append(r3)
                java.lang.String r0 = r8.toString()
                return r0
        }
    }

    public DomainNameMappingBuilder(int r2, V r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "defaultValue"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.defaultValue = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            r1.map = r3
            return
    }

    public DomainNameMappingBuilder(V r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r2)
            return
    }

    public io.netty.util.DomainNameMappingBuilder<V> add(java.lang.String r3, V r4) {
            r2 = this;
            java.util.Map<java.lang.String, V> r0 = r2.map
            java.lang.String r1 = "hostname"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.String r1 = "output"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            r0.put(r3, r4)
            return r2
    }

    public io.netty.util.DomainNameMapping<V> build() {
            r4 = this;
            io.netty.util.DomainNameMappingBuilder$ImmutableDomainNameMapping r0 = new io.netty.util.DomainNameMappingBuilder$ImmutableDomainNameMapping
            V r1 = r4.defaultValue
            java.util.Map<java.lang.String, V> r2 = r4.map
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
