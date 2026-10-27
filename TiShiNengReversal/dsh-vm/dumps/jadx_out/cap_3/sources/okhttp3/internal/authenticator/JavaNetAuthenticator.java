package okhttp3.internal.authenticator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class JavaNetAuthenticator implements okhttp3.Authenticator {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Dns defaultDns;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }

        public WhenMappings() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public JavaNetAuthenticator() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public JavaNetAuthenticator(@org.jetbrains.annotations.NotNull okhttp3.Dns r2) {
            r1 = this;
            java.lang.String r0 = "defaultDns"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.defaultDns = r2
            return
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.Dns r1 = okhttp3.Dns.SYSTEM
        L6:
            r0.<init>(r1)
            return
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy r3, okhttp3.HttpUrl r4, okhttp3.Dns r5) throws java.io.IOException {
            r2 = this;
            java.net.Proxy$Type r0 = r3.type()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 1
            if (r0 != r1) goto L22
            java.lang.String r3 = r4.host()
            java.util.List r3 = r5.lookup(r3)
            java.lang.Object r3 = kotlin.collections.f0.G2(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
        L22:
            java.net.SocketAddress r3 = r3.address()
            java.lang.String r4 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.InetAddress r3 = r3.getAddress()
            java.lang.String r4 = "getAddress(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r19, @org.jetbrains.annotations.NotNull okhttp3.Response r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "response"
            r2 = r20
            kotlin.jvm.internal.g0.p(r2, r1)
            java.util.List r1 = r2.challenges()
            okhttp3.Request r3 = r2.request()
            okhttp3.HttpUrl r4 = r3.url()
            int r2 = r2.code()
            r5 = 407(0x197, float:5.7E-43)
            r6 = 1
            if (r2 != r5) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            if (r19 == 0) goto L29
            java.net.Proxy r5 = r19.proxy()
            if (r5 != 0) goto L2b
        L29:
            java.net.Proxy r5 = java.net.Proxy.NO_PROXY
        L2b:
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Le5
            java.lang.Object r7 = r1.next()
            okhttp3.Challenge r7 = (okhttp3.Challenge) r7
            java.lang.String r8 = "Basic"
            java.lang.String r9 = r7.scheme()
            boolean r8 = kotlin.text.u.a2(r8, r9, r6)
            if (r8 != 0) goto L48
            goto L2f
        L48:
            if (r19 == 0) goto L56
            okhttp3.Address r8 = r19.address()
            if (r8 == 0) goto L56
            okhttp3.Dns r8 = r8.dns()
            if (r8 != 0) goto L58
        L56:
            okhttp3.Dns r8 = r0.defaultDns
        L58:
            if (r2 == 0) goto L8b
            java.net.SocketAddress r9 = r5.address()
            java.lang.String r10 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.g0.n(r9, r10)
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = r9.getHostName()
            kotlin.jvm.internal.g0.m(r5)
            java.net.InetAddress r11 = r0.connectToInetAddress(r5, r4, r8)
            int r12 = r9.getPort()
            java.lang.String r13 = r4.scheme()
            java.lang.String r14 = r7.realm()
            java.lang.String r15 = r7.scheme()
            java.net.URL r16 = r4.url()
            java.net.Authenticator$RequestorType r17 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lb0
        L8b:
            java.lang.String r9 = r4.host()
            kotlin.jvm.internal.g0.m(r5)
            java.net.InetAddress r10 = r0.connectToInetAddress(r5, r4, r8)
            int r11 = r4.port()
            java.lang.String r12 = r4.scheme()
            java.lang.String r13 = r7.realm()
            java.lang.String r14 = r7.scheme()
            java.net.URL r15 = r4.url()
            java.net.Authenticator$RequestorType r16 = java.net.Authenticator.RequestorType.SERVER
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r9, r10, r11, r12, r13, r14, r15, r16)
        Lb0:
            if (r8 == 0) goto L2f
            if (r2 == 0) goto Lb7
            java.lang.String r1 = "Proxy-Authorization"
            goto Lb9
        Lb7:
            java.lang.String r1 = "Authorization"
        Lb9:
            java.lang.String r2 = r8.getUserName()
            java.lang.String r4 = "getUserName(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            char[] r4 = r8.getPassword()
            java.lang.String r5 = "getPassword(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.nio.charset.Charset r4 = r7.charset()
            java.lang.String r2 = okhttp3.Credentials.basic(r2, r5, r4)
            okhttp3.Request$Builder r3 = r3.newBuilder()
            okhttp3.Request$Builder r1 = r3.header(r1, r2)
            okhttp3.Request r1 = r1.build()
            return r1
        Le5:
            r1 = 0
            return r1
    }
}
