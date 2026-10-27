package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ProtocolFamilyConverter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.socket.nio.ProtocolFamilyConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$socket$InternetProtocolFamily = null;

        static {
                io.netty.channel.socket.InternetProtocolFamily[] r0 = io.netty.channel.socket.InternetProtocolFamily.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.socket.nio.ProtocolFamilyConverter.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily = r0
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv4     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.socket.nio.ProtocolFamilyConverter.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv6     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private ProtocolFamilyConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.net.ProtocolFamily convert(io.netty.channel.socket.InternetProtocolFamily r1) {
            int[] r0 = io.netty.channel.socket.nio.ProtocolFamilyConverter.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 != r0) goto L13
            java.net.StandardProtocolFamily r1 = io.netty.channel.socket.nio.r.a()
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L19:
            java.net.StandardProtocolFamily r1 = io.netty.channel.socket.nio.q.a()
            return r1
    }
}
