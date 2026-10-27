package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DomainNameMapping<V> implements io.netty.util.Mapping<java.lang.String, V> {
    final V defaultValue;
    private final java.util.Map<java.lang.String, V> map;
    private final java.util.Map<java.lang.String, V> unmodifiableMap;

    @java.lang.Deprecated
    public DomainNameMapping(int r2, V r3) {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    @java.lang.Deprecated
    public DomainNameMapping(V r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r2)
            return
    }

    DomainNameMapping(java.util.Map<java.lang.String, V> r2, V r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "defaultValue"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.defaultValue = r3
            r1.map = r2
            if (r2 == 0) goto L14
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.unmodifiableMap = r2
            return
    }

    static boolean matches(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "*."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L23
            r0 = 2
            int r1 = r4.length()
            r2 = 0
            boolean r0 = r3.regionMatches(r0, r4, r2, r1)
            r1 = 1
            if (r0 != 0) goto L22
            int r0 = r3.length()
            int r0 = r0 - r1
            boolean r3 = io.netty.util.internal.StringUtil.commonSuffixOfLength(r4, r3, r0)
            if (r3 == 0) goto L21
            goto L22
        L21:
            return r2
        L22:
            return r1
        L23:
            boolean r3 = r3.equals(r4)
            return r3
    }

    private static boolean needsNormalization(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L15
            char r3 = r5.charAt(r2)
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L12
            r5 = 1
            return r5
        L12:
            int r2 = r2 + 1
            goto L6
        L15:
            return r1
    }

    static java.lang.String normalizeHostname(java.lang.String r1) {
            boolean r0 = needsNormalization(r1)
            if (r0 == 0) goto Lb
            r0 = 1
            java.lang.String r1 = java.net.IDN.toASCII(r1, r0)
        Lb:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            return r1
    }

    @java.lang.Deprecated
    public io.netty.util.DomainNameMapping<V> add(java.lang.String r3, V r4) {
            r2 = this;
            java.util.Map<java.lang.String, V> r0 = r2.map
            java.lang.String r1 = "hostname"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = normalizeHostname(r3)
            java.lang.String r1 = "output"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            r0.put(r3, r4)
            return r2
    }

    public java.util.Map<java.lang.String, V> asMap() {
            r1 = this;
            java.util.Map<java.lang.String, V> r0 = r1.unmodifiableMap
            return r0
    }

    @Override // io.netty.util.Mapping
    public /* bridge */ /* synthetic */ java.lang.Object map(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.map2(r1)
            return r1
    }

    /* renamed from: map, reason: avoid collision after fix types in other method */
    public V map2(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L2d
            java.lang.String r4 = normalizeHostname(r4)
            java.util.Map<java.lang.String, V> r0 = r3.map
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = matches(r2, r4)
            if (r2 == 0) goto L10
            java.lang.Object r4 = r1.getValue()
            return r4
        L2d:
            V r4 = r3.defaultValue
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(default: "
            r0.append(r1)
            V r1 = r2.defaultValue
            r0.append(r1)
            java.lang.String r1 = ", map: "
            r0.append(r1)
            java.util.Map<java.lang.String, V> r1 = r2.map
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
