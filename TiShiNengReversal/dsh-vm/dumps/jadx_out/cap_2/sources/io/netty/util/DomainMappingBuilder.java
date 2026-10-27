package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DomainMappingBuilder<V> {
    private final io.netty.util.DomainNameMappingBuilder<V> builder;

    public DomainMappingBuilder(int r2, V r3) {
            r1 = this;
            r1.<init>()
            io.netty.util.DomainNameMappingBuilder r0 = new io.netty.util.DomainNameMappingBuilder
            r0.<init>(r2, r3)
            r1.builder = r0
            return
    }

    public DomainMappingBuilder(V r2) {
            r1 = this;
            r1.<init>()
            io.netty.util.DomainNameMappingBuilder r0 = new io.netty.util.DomainNameMappingBuilder
            r0.<init>(r2)
            r1.builder = r0
            return
    }

    public io.netty.util.DomainMappingBuilder<V> add(java.lang.String r2, V r3) {
            r1 = this;
            io.netty.util.DomainNameMappingBuilder<V> r0 = r1.builder
            r0.add(r2, r3)
            return r1
    }

    public io.netty.util.DomainNameMapping<V> build() {
            r1 = this;
            io.netty.util.DomainNameMappingBuilder<V> r0 = r1.builder
            io.netty.util.DomainNameMapping r0 = r0.build()
            return r0
    }
}
