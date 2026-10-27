package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class StatusLine {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.StatusLine.Companion Companion = null;

    @kotlin.jvm.JvmField
    public final int code;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String message;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Protocol protocol;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http.StatusLine get(@org.jetbrains.annotations.NotNull okhttp3.Response r4) {
                r3 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r4, r0)
                okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r1 = r4.protocol()
                int r2 = r4.code()
                java.lang.String r4 = r4.message()
                r0.<init>(r1, r2, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http.StatusLine parse(@org.jetbrains.annotations.NotNull java.lang.String r10) throws java.io.IOException {
                r9 = this;
                java.lang.String r0 = "statusLine"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "HTTP/1."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = kotlin.text.u.H2(r10, r0, r1, r2, r3)
                r4 = 4
                r5 = 32
                java.lang.String r6 = "Unexpected status line: "
                if (r0 == 0) goto L61
                int r0 = r10.length()
                r1 = 9
                if (r0 < r1) goto L4c
                r0 = 8
                char r0 = r10.charAt(r0)
                if (r0 != r5) goto L4c
                r0 = 7
                char r0 = r10.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 == 0) goto L49
                r2 = 1
                if (r0 != r2) goto L34
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                goto L79
            L34:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            L49:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                goto L79
            L4c:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            L61:
                java.lang.String r0 = "ICY "
                boolean r0 = kotlin.text.u.H2(r10, r0, r1, r2, r3)
                if (r0 == 0) goto L6d
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                r1 = 4
                goto L79
            L6d:
                java.lang.String r0 = "SOURCETABLE "
                boolean r0 = kotlin.text.u.H2(r10, r0, r1, r2, r3)
                if (r0 == 0) goto Lf0
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                r1 = 12
            L79:
                int r2 = r10.length()
                int r3 = r1 + 3
                if (r2 < r3) goto Ldb
                java.lang.String r2 = r10.substring(r1, r3)
                java.lang.String r7 = "substring(...)"
                kotlin.jvm.internal.g0.o(r2, r7)
                java.lang.Integer r2 = kotlin.text.u.n1(r2)
                if (r2 == 0) goto Lc6
                int r2 = r2.intValue()
                int r8 = r10.length()
                if (r8 <= r3) goto Lbe
                char r3 = r10.charAt(r3)
                if (r3 != r5) goto La9
                int r1 = r1 + r4
                java.lang.String r10 = r10.substring(r1)
                kotlin.jvm.internal.g0.o(r10, r7)
                goto Lc0
            La9:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            Lbe:
                java.lang.String r10 = ""
            Lc0:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                r1.<init>(r0, r2, r10)
                return r1
            Lc6:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            Ldb:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            Lf0:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
        }
    }

    static {
            okhttp3.internal.http.StatusLine$Companion r0 = new okhttp3.internal.http.StatusLine$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.StatusLine.Companion = r0
            return
    }

    public StatusLine(@org.jetbrains.annotations.NotNull okhttp3.Protocol r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.protocol = r2
            r1.code = r3
            r1.message = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Protocol r1 = r3.protocol
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
            if (r1 != r2) goto L11
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L16:
            r1 = 32
            r0.append(r1)
            int r2 = r3.code
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.message
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
