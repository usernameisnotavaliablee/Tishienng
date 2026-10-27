package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChannelGroupException extends io.netty.channel.ChannelException implements java.lang.Iterable<java.util.Map.Entry<io.netty.channel.Channel, java.lang.Throwable>> {
    private static final long serialVersionUID = -4093064295562629453L;
    private final java.util.Collection<java.util.Map.Entry<io.netty.channel.Channel, java.lang.Throwable>> failed;

    public ChannelGroupException(java.util.Collection<java.util.Map.Entry<io.netty.channel.Channel, java.lang.Throwable>> r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L1a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L12
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r2)
            r1.failed = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "causes must be non empty"
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "causes"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<io.netty.channel.Channel, java.lang.Throwable>> iterator() {
            r1 = this;
            java.util.Collection<java.util.Map$Entry<io.netty.channel.Channel, java.lang.Throwable>> r0 = r1.failed
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
