package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum ResolvedAddressTypes extends java.lang.Enum<io.netty.resolver.ResolvedAddressTypes> {
    private static final /* synthetic */ io.netty.resolver.ResolvedAddressTypes[] $VALUES = null;
    public static final io.netty.resolver.ResolvedAddressTypes IPV4_ONLY = null;
    public static final io.netty.resolver.ResolvedAddressTypes IPV4_PREFERRED = null;
    public static final io.netty.resolver.ResolvedAddressTypes IPV6_ONLY = null;
    public static final io.netty.resolver.ResolvedAddressTypes IPV6_PREFERRED = null;

    static {
            io.netty.resolver.ResolvedAddressTypes r0 = new io.netty.resolver.ResolvedAddressTypes
            java.lang.String r1 = "IPV4_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.resolver.ResolvedAddressTypes.IPV4_ONLY = r0
            io.netty.resolver.ResolvedAddressTypes r1 = new io.netty.resolver.ResolvedAddressTypes
            java.lang.String r3 = "IPV6_ONLY"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.resolver.ResolvedAddressTypes.IPV6_ONLY = r1
            io.netty.resolver.ResolvedAddressTypes r3 = new io.netty.resolver.ResolvedAddressTypes
            java.lang.String r5 = "IPV4_PREFERRED"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.resolver.ResolvedAddressTypes.IPV4_PREFERRED = r3
            io.netty.resolver.ResolvedAddressTypes r5 = new io.netty.resolver.ResolvedAddressTypes
            java.lang.String r7 = "IPV6_PREFERRED"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.resolver.ResolvedAddressTypes.IPV6_PREFERRED = r5
            r7 = 4
            io.netty.resolver.ResolvedAddressTypes[] r7 = new io.netty.resolver.ResolvedAddressTypes[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            io.netty.resolver.ResolvedAddressTypes.$VALUES = r7
            return
    }

    ResolvedAddressTypes(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.resolver.ResolvedAddressTypes valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.resolver.ResolvedAddressTypes> r0 = io.netty.resolver.ResolvedAddressTypes.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.resolver.ResolvedAddressTypes r1 = (io.netty.resolver.ResolvedAddressTypes) r1
            return r1
    }

    public static io.netty.resolver.ResolvedAddressTypes[] values() {
            io.netty.resolver.ResolvedAddressTypes[] r0 = io.netty.resolver.ResolvedAddressTypes.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.resolver.ResolvedAddressTypes[] r0 = (io.netty.resolver.ResolvedAddressTypes[]) r0
            return r0
    }
}
