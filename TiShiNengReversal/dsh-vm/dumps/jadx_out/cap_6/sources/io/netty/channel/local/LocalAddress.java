package io.netty.channel.local;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class LocalAddress extends java.net.SocketAddress implements java.lang.Comparable<io.netty.channel.local.LocalAddress> {
    public static final io.netty.channel.local.LocalAddress ANY = null;
    private static final long serialVersionUID = 4644331421130916435L;
    private final java.lang.String id;
    private final java.lang.String strVal;

    static {
            io.netty.channel.local.LocalAddress r0 = new io.netty.channel.local.LocalAddress
            java.lang.String r1 = "ANY"
            r0.<init>(r1)
            io.netty.channel.local.LocalAddress.ANY = r0
            return
    }

    LocalAddress(io.netty.channel.Channel r6) {
            r5 = this;
            r5.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "local:E"
            r0.append(r1)
            int r6 = r6.hashCode()
            long r1 = (long) r6
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 | r3
            java.lang.String r6 = java.lang.Long.toHexString(r1)
            r0.append(r6)
            r6 = 7
            r1 = 58
            r0.setCharAt(r6, r1)
            r6 = 6
            java.lang.String r6 = r0.substring(r6)
            r5.id = r6
            java.lang.String r6 = r0.toString()
            r5.strVal = r6
            return
    }

    public LocalAddress(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L31
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = r3.toLowerCase()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L29
            r2.id = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "local:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.strVal = r3
            return
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty id"
            r3.<init>(r0)
            throw r3
        L31:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "id"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.local.LocalAddress r2) {
            r1 = this;
            java.lang.String r0 = r1.id
            java.lang.String r2 = r2.id
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.local.LocalAddress r1) {
            r0 = this;
            io.netty.channel.local.LocalAddress r1 = (io.netty.channel.local.LocalAddress) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.local.LocalAddress
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.id
            io.netty.channel.local.LocalAddress r2 = (io.netty.channel.local.LocalAddress) r2
            java.lang.String r2 = r2.id
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.id
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String id() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.strVal
            return r0
    }
}
