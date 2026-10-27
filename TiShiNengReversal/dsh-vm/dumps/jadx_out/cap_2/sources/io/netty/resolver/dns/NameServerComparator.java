package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NameServerComparator implements java.util.Comparator<java.net.InetSocketAddress>, java.io.Serializable {
    private static final long serialVersionUID = 8372151874317596185L;
    private final java.lang.Class<? extends java.net.InetAddress> preferredAddressType;

    public NameServerComparator(java.lang.Class<? extends java.net.InetAddress> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "preferredAddressType"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.preferredAddressType = r2
            return
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.net.InetSocketAddress r1, java.net.InetSocketAddress r2) {
            r0 = this;
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.net.InetSocketAddress r5, java.net.InetSocketAddress r6) {
            r4 = this;
            boolean r0 = r5.equals(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5.isUnresolved()
            r2 = 1
            r3 = -1
            if (r0 != 0) goto L3b
            boolean r0 = r6.isUnresolved()
            if (r0 != 0) goto L3b
            java.net.InetAddress r0 = r5.getAddress()
            java.lang.Class r0 = r0.getClass()
            java.net.InetAddress r6 = r6.getAddress()
            java.lang.Class r6 = r6.getClass()
            if (r0 != r6) goto L29
            return r1
        L29:
            java.lang.Class<? extends java.net.InetAddress> r6 = r4.preferredAddressType
            java.net.InetAddress r5 = r5.getAddress()
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L3a
            return r3
        L3a:
            return r2
        L3b:
            boolean r0 = r5.isUnresolved()
            if (r0 == 0) goto L48
            boolean r6 = r6.isUnresolved()
            if (r6 == 0) goto L48
            return r1
        L48:
            boolean r5 = r5.isUnresolved()
            if (r5 == 0) goto L4f
            return r2
        L4f:
            return r3
    }
}
