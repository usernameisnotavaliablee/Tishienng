package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class WebSocketExtensions {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.ws.WebSocketExtensions.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer clientMaxWindowBits;

    @kotlin.jvm.JvmField
    public final boolean clientNoContextTakeover;

    @kotlin.jvm.JvmField
    public final boolean perMessageDeflate;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer serverMaxWindowBits;

    @kotlin.jvm.JvmField
    public final boolean serverNoContextTakeover;

    @kotlin.jvm.JvmField
    public final boolean unknownValues;

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
        public final okhttp3.internal.ws.WebSocketExtensions parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r21) throws java.io.IOException {
                r20 = this;
                r0 = r21
                java.lang.String r1 = "responseHeaders"
                kotlin.jvm.internal.g0.p(r0, r1)
                int r1 = r0.size()
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
            L12:
                if (r4 >= r1) goto Ld6
                java.lang.String r5 = r0.name(r4)
                java.lang.String r12 = "Sec-WebSocket-Extensions"
                r13 = 1
                boolean r5 = kotlin.text.u.a2(r5, r12, r13)
                if (r5 != 0) goto L23
                goto Ld2
            L23:
                java.lang.String r14 = r0.value(r4)
                r5 = 0
            L28:
                int r12 = r14.length()
                if (r5 >= r12) goto Ld2
                r18 = 4
                r19 = 0
                r15 = 44
                r17 = 0
                r16 = r5
                int r5 = okhttp3.internal._UtilCommonKt.delimiterOffset$default(r14, r15, r16, r17, r18, r19)
                r12 = r16
                r15 = 59
                int r2 = okhttp3.internal._UtilCommonKt.delimiterOffset(r14, r15, r12, r5)
                java.lang.String r12 = okhttp3.internal._UtilCommonKt.trimSubstring(r14, r12, r2)
                int r2 = r2 + r13
                java.lang.String r3 = "permessage-deflate"
                boolean r3 = kotlin.text.u.a2(r12, r3, r13)
                if (r3 == 0) goto Lce
                if (r6 == 0) goto L54
                goto L8d
            L54:
                if (r2 >= r5) goto Lca
                int r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r14, r15, r2, r5)
                r6 = 61
                int r6 = okhttp3.internal._UtilCommonKt.delimiterOffset(r14, r6, r2, r3)
                java.lang.String r2 = okhttp3.internal._UtilCommonKt.trimSubstring(r14, r2, r6)
                if (r6 >= r3) goto L73
                int r6 = r6 + 1
                java.lang.String r6 = okhttp3.internal._UtilCommonKt.trimSubstring(r14, r6, r3)
                java.lang.String r12 = "\""
                java.lang.String r6 = kotlin.text.u.E4(r6, r12)
                goto L74
            L73:
                r6 = 0
            L74:
                int r3 = r3 + 1
                java.lang.String r12 = "client_max_window_bits"
                boolean r12 = kotlin.text.u.a2(r2, r12, r13)
                if (r12 == 0) goto L91
                if (r7 == 0) goto L81
                r11 = 1
            L81:
                if (r6 == 0) goto L89
                java.lang.Integer r2 = kotlin.text.u.n1(r6)
                r7 = r2
                goto L8a
            L89:
                r7 = 0
            L8a:
                if (r7 != 0) goto L8f
            L8c:
                r2 = r3
            L8d:
                r11 = 1
                goto L54
            L8f:
                r2 = r3
                goto L54
            L91:
                java.lang.String r12 = "client_no_context_takeover"
                boolean r12 = kotlin.text.u.a2(r2, r12, r13)
                if (r12 == 0) goto La2
                if (r8 == 0) goto L9c
                r11 = 1
            L9c:
                if (r6 == 0) goto L9f
                r11 = 1
            L9f:
                r2 = r3
                r8 = 1
                goto L54
            La2:
                java.lang.String r12 = "server_max_window_bits"
                boolean r12 = kotlin.text.u.a2(r2, r12, r13)
                if (r12 == 0) goto Lb9
                if (r9 == 0) goto Lad
                r11 = 1
            Lad:
                if (r6 == 0) goto Lb5
                java.lang.Integer r2 = kotlin.text.u.n1(r6)
                r9 = r2
                goto Lb6
            Lb5:
                r9 = 0
            Lb6:
                if (r9 != 0) goto L8f
                goto L8c
            Lb9:
                java.lang.String r12 = "server_no_context_takeover"
                boolean r2 = kotlin.text.u.a2(r2, r12, r13)
                if (r2 == 0) goto L8c
                if (r10 == 0) goto Lc4
                r11 = 1
            Lc4:
                if (r6 == 0) goto Lc7
                r11 = 1
            Lc7:
                r2 = r3
                r10 = 1
                goto L54
            Lca:
                r5 = r2
                r6 = 1
                goto L28
            Lce:
                r5 = r2
                r11 = 1
                goto L28
            Ld2:
                int r4 = r4 + 1
                goto L12
            Ld6:
                okhttp3.internal.ws.WebSocketExtensions r5 = new okhttp3.internal.ws.WebSocketExtensions
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r5
        }
    }

    static {
            okhttp3.internal.ws.WebSocketExtensions$Companion r0 = new okhttp3.internal.ws.WebSocketExtensions$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.WebSocketExtensions.Companion = r0
            return
    }

    public WebSocketExtensions() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public WebSocketExtensions(boolean r1, @org.jetbrains.annotations.Nullable java.lang.Integer r2, boolean r3, @org.jetbrains.annotations.Nullable java.lang.Integer r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.perMessageDeflate = r1
            r0.clientMaxWindowBits = r2
            r0.clientNoContextTakeover = r3
            r0.serverMaxWindowBits = r4
            r0.serverNoContextTakeover = r5
            r0.unknownValues = r6
            return
    }

    public /* synthetic */ WebSocketExtensions(boolean r3, java.lang.Integer r4, boolean r5, java.lang.Integer r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.v r10) {
            r2 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L6
            r3 = 0
        L6:
            r10 = r9 & 2
            r1 = 0
            if (r10 == 0) goto Lc
            r4 = r1
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r5 = 0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r6 = r1
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r7 = 0
        L1b:
            r9 = r9 & 32
            if (r9 == 0) goto L27
            r9 = 0
        L20:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L29
        L27:
            r9 = r8
            goto L20
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ okhttp3.internal.ws.WebSocketExtensions copy$default(okhttp3.internal.ws.WebSocketExtensions r0, boolean r1, java.lang.Integer r2, boolean r3, java.lang.Integer r4, boolean r5, boolean r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            boolean r1 = r0.perMessageDeflate
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.Integer r2 = r0.clientMaxWindowBits
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            boolean r3 = r0.clientNoContextTakeover
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            java.lang.Integer r4 = r0.serverMaxWindowBits
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            boolean r5 = r0.serverNoContextTakeover
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            boolean r6 = r0.unknownValues
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okhttp3.internal.ws.WebSocketExtensions r0 = r2.copy(r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean component1() {
            r1 = this;
            boolean r0 = r1.perMessageDeflate
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
            r1 = this;
            java.lang.Integer r0 = r1.clientMaxWindowBits
            return r0
    }

    public final boolean component3() {
            r1 = this;
            boolean r0 = r1.clientNoContextTakeover
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
            r1 = this;
            java.lang.Integer r0 = r1.serverMaxWindowBits
            return r0
    }

    public final boolean component5() {
            r1 = this;
            boolean r0 = r1.serverNoContextTakeover
            return r0
    }

    public final boolean component6() {
            r1 = this;
            boolean r0 = r1.unknownValues
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.ws.WebSocketExtensions copy(boolean r8, @org.jetbrains.annotations.Nullable java.lang.Integer r9, boolean r10, @org.jetbrains.annotations.Nullable java.lang.Integer r11, boolean r12, boolean r13) {
            r7 = this;
            okhttp3.internal.ws.WebSocketExtensions r0 = new okhttp3.internal.ws.WebSocketExtensions
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okhttp3.internal.ws.WebSocketExtensions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            okhttp3.internal.ws.WebSocketExtensions r5 = (okhttp3.internal.ws.WebSocketExtensions) r5
            boolean r1 = r4.perMessageDeflate
            boolean r3 = r5.perMessageDeflate
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.clientMaxWindowBits
            java.lang.Integer r3 = r5.clientMaxWindowBits
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.clientNoContextTakeover
            boolean r3 = r5.clientNoContextTakeover
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.serverMaxWindowBits
            java.lang.Integer r3 = r5.serverMaxWindowBits
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            boolean r1 = r4.serverNoContextTakeover
            boolean r3 = r5.serverNoContextTakeover
            if (r1 == r3) goto L37
            return r2
        L37:
            boolean r1 = r4.unknownValues
            boolean r5 = r5.unknownValues
            if (r1 == r5) goto L3e
            return r2
        L3e:
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.perMessageDeflate
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.clientMaxWindowBits
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.clientNoContextTakeover
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.serverMaxWindowBits
            if (r1 != 0) goto L24
            goto L28
        L24:
            int r2 = r1.hashCode()
        L28:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r3.serverNoContextTakeover
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.unknownValues
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            return r0
    }

    public final boolean noContextTakeover(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            boolean r1 = r0.clientNoContextTakeover
            return r1
        L5:
            boolean r1 = r0.serverNoContextTakeover
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WebSocketExtensions(perMessageDeflate="
            r0.append(r1)
            boolean r1 = r2.perMessageDeflate
            r0.append(r1)
            java.lang.String r1 = ", clientMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.clientMaxWindowBits
            r0.append(r1)
            java.lang.String r1 = ", clientNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.clientNoContextTakeover
            r0.append(r1)
            java.lang.String r1 = ", serverMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.serverMaxWindowBits
            r0.append(r1)
            java.lang.String r1 = ", serverNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.serverNoContextTakeover
            r0.append(r1)
            java.lang.String r1 = ", unknownValues="
            r0.append(r1)
            boolean r1 = r2.unknownValues
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
