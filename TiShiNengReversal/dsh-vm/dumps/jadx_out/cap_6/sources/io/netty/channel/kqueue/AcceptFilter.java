package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class AcceptFilter {
    static final io.netty.channel.kqueue.AcceptFilter PLATFORM_UNSUPPORTED = null;
    private final java.lang.String filterArgs;
    private final java.lang.String filterName;

    static {
            io.netty.channel.kqueue.AcceptFilter r0 = new io.netty.channel.kqueue.AcceptFilter
            java.lang.String r1 = ""
            r0.<init>(r1, r1)
            io.netty.channel.kqueue.AcceptFilter.PLATFORM_UNSUPPORTED = r0
            return
    }

    public AcceptFilter(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "filterName"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.filterName = r2
            java.lang.String r2 = "filterArgs"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.filterArgs = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.channel.kqueue.AcceptFilter
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.channel.kqueue.AcceptFilter r5 = (io.netty.channel.kqueue.AcceptFilter) r5
            java.lang.String r1 = r4.filterName
            java.lang.String r3 = r5.filterName
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            java.lang.String r1 = r4.filterArgs
            java.lang.String r5 = r5.filterArgs
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public java.lang.String filterArgs() {
            r1 = this;
            java.lang.String r0 = r1.filterArgs
            return r0
    }

    public java.lang.String filterName() {
            r1 = this;
            java.lang.String r0 = r1.filterName
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.filterName
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.String r1 = r2.filterArgs
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.filterName
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = r2.filterArgs
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
