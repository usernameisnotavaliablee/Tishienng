package okhttp3.internal.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PublicSuffixDatabase {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> PREVAILING_RULE = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString WILDCARD_LABEL = null;

    @org.jetbrains.annotations.NotNull
    private static okhttp3.internal.publicsuffix.PublicSuffixDatabase instance;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.publicsuffix.PublicSuffixList publicSuffixList;

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

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion r0, okio.ByteString r1, okio.ByteString[] r2, int r3) {
                java.lang.String r0 = r0.binarySearch(r1, r2, r3)
                return r0
        }

        private final java.lang.String binarySearch(okio.ByteString r18, okio.ByteString[] r19, int r20) {
                r17 = this;
                r0 = r18
                r1 = r19
                int r2 = r0.size()
                r4 = 0
            L9:
                if (r4 >= r2) goto La6
                int r5 = r4 + r2
                int r5 = r5 / 2
            Lf:
                r6 = 10
                r7 = -1
                if (r5 <= r7) goto L1d
                byte r8 = r0.getByte(r5)
                if (r8 == r6) goto L1d
                int r5 = r5 + (-1)
                goto Lf
            L1d:
                int r8 = r5 + 1
                r9 = 1
                r10 = 1
            L21:
                int r11 = r8 + r10
                byte r12 = r0.getByte(r11)
                if (r12 == r6) goto L2c
                int r10 = r10 + 1
                goto L21
            L2c:
                int r6 = r11 - r8
                r12 = r20
                r10 = 0
                r13 = 0
                r14 = 0
            L33:
                r15 = 255(0xff, float:3.57E-43)
                if (r10 == 0) goto L3b
                r10 = 46
                r3 = 0
                goto L4a
            L3b:
                r3 = r1[r12]
                byte r3 = r3.getByte(r13)
                int r3 = okhttp3.internal._UtilCommonKt.and(r3, r15)
                r16 = r10
                r10 = r3
                r3 = r16
            L4a:
                int r7 = r8 + r14
                byte r7 = r0.getByte(r7)
                int r7 = okhttp3.internal._UtilCommonKt.and(r7, r15)
                int r10 = r10 - r7
                if (r10 != 0) goto L73
                int r14 = r14 + 1
                int r13 = r13 + 1
                if (r14 == r6) goto L73
                r7 = r1[r12]
                int r7 = r7.size()
                if (r7 != r13) goto L70
                int r3 = r1.length
                int r3 = r3 - r9
                if (r12 != r3) goto L6a
                goto L73
            L6a:
                int r12 = r12 + 1
                r7 = -1
                r10 = 1
                r13 = -1
                goto L33
            L70:
                r10 = r3
                r7 = -1
                goto L33
            L73:
                if (r10 >= 0) goto L77
            L75:
                r2 = r5
                goto L9
            L77:
                if (r10 <= 0) goto L7c
            L79:
                int r4 = r11 + 1
                goto L9
            L7c:
                int r3 = r6 - r14
                r7 = r1[r12]
                int r7 = r7.size()
                int r7 = r7 - r13
                int r12 = r12 + 1
                int r9 = r1.length
            L88:
                if (r12 >= r9) goto L94
                r10 = r1[r12]
                int r10 = r10.size()
                int r7 = r7 + r10
                int r12 = r12 + 1
                goto L88
            L94:
                if (r7 >= r3) goto L97
                goto L75
            L97:
                if (r7 <= r3) goto L9a
                goto L79
            L9a:
                int r6 = r6 + r8
                okio.ByteString r0 = r0.substring(r8, r6)
                java.nio.charset.Charset r1 = kotlin.text.e.b
                java.lang.String r0 = r0.string(r1)
                return r0
            La6:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
                r1 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$getInstance$cp()
                return r0
        }

        public final void resetForTests$okhttp() {
                r2 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
                okhttp3.internal.publicsuffix.PublicSuffixList$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixList.Companion
                okhttp3.internal.publicsuffix.PublicSuffixList r1 = okhttp3.internal.publicsuffix.PublicSuffixList_androidKt.getDefault(r1)
                r0.<init>(r1)
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$setInstance$cp(r0)
                return
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = 42
            r3 = 0
            r1[r3] = r2
            okio.ByteString r0 = r0.of(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL = r0
            java.lang.String r0 = "*"
            java.util.List r0 = kotlin.collections.f0.l(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            okhttp3.internal.publicsuffix.PublicSuffixList$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixList.Companion
            okhttp3.internal.publicsuffix.PublicSuffixList r1 = okhttp3.internal.publicsuffix.PublicSuffixList_androidKt.getDefault(r1)
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    public PublicSuffixDatabase(@org.jetbrains.annotations.NotNull okhttp3.internal.publicsuffix.PublicSuffixList r2) {
            r1 = this;
            java.lang.String r0 = "publicSuffixList"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.publicSuffixList = r2
            return
    }

    public static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixDatabase access$getInstance$cp() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            return r0
    }

    public static final /* synthetic */ void access$setInstance$cp(okhttp3.internal.publicsuffix.PublicSuffixDatabase r0) {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r15) {
            r14 = this;
            okhttp3.internal.publicsuffix.PublicSuffixList r0 = r14.publicSuffixList
            r0.ensureLoaded()
            int r0 = r15.size()
            okio.ByteString[] r1 = new okio.ByteString[r0]
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r0) goto L20
            okio.ByteString$Companion r4 = okio.ByteString.Companion
            java.lang.Object r5 = r15.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            okio.ByteString r4 = r4.encodeUtf8(r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto Ld
        L20:
            r15 = 0
        L21:
            r3 = 0
            if (r15 >= r0) goto L36
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixList r5 = r14.publicSuffixList
            okio.ByteString r5 = r5.getBytes()
            java.lang.String r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r4, r5, r1, r15)
            if (r4 == 0) goto L33
            goto L37
        L33:
            int r15 = r15 + 1
            goto L21
        L36:
            r4 = r3
        L37:
            r15 = 1
            if (r0 <= r15) goto L5c
            java.lang.Object r5 = r1.clone()
            okio.ByteString[] r5 = (okio.ByteString[]) r5
            int r6 = r5.length
            int r6 = r6 - r15
            r7 = 0
        L43:
            if (r7 >= r6) goto L5c
            okio.ByteString r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r5[r7] = r8
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixList r9 = r14.publicSuffixList
            okio.ByteString r9 = r9.getBytes()
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r8, r9, r5, r7)
            if (r8 == 0) goto L59
            r9 = r8
            goto L5d
        L59:
            int r7 = r7 + 1
            goto L43
        L5c:
            r9 = r3
        L5d:
            if (r9 == 0) goto L76
            int r0 = r0 - r15
            r5 = 0
        L61:
            if (r5 >= r0) goto L76
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixList r7 = r14.publicSuffixList
            okio.ByteString r7 = r7.getExceptionBytes()
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r6, r7, r1, r5)
            if (r6 == 0) goto L73
            r3 = r6
            goto L76
        L73:
            int r5 = r5 + 1
            goto L61
        L76:
            r0 = 46
            if (r3 == 0) goto L98
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = 33
            r1.append(r4)
            r1.append(r3)
            java.lang.String r5 = r1.toString()
            char[] r6 = new char[r15]
            r6[r2] = r0
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            java.util.List r15 = kotlin.text.u.l5(r5, r6, r7, r8, r9, r10)
            return r15
        L98:
            if (r4 != 0) goto L9f
            if (r9 != 0) goto L9f
            java.util.List<java.lang.String> r15 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r15
        L9f:
            if (r4 == 0) goto Lb0
            r3 = r4
            char[] r4 = new char[r15]
            r4[r2] = r0
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r1 = kotlin.text.u.l5(r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto Lb4
        Lb0:
            java.util.List r1 = kotlin.collections.f0.J()
        Lb4:
            if (r9 == 0) goto Lc6
            char[] r15 = new char[r15]
            r15[r2] = r0
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            r8 = r9
            r9 = r15
            java.util.List r15 = kotlin.text.u.l5(r8, r9, r10, r11, r12, r13)
            if (r15 != 0) goto Lca
        Lc6:
            java.util.List r15 = kotlin.collections.f0.J()
        Lca:
            int r0 = r1.size()
            int r2 = r15.size()
            if (r0 <= r2) goto Ld5
            return r1
        Ld5:
            return r15
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String r8) {
            r7 = this;
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 46
            r3 = 0
            r2[r3] = r1
            r5 = 6
            r6 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = kotlin.text.u.l5(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = kotlin.collections.f0.u3(r8)
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L20
            java.util.List r8 = kotlin.collections.f0.h2(r8, r0)
        L20:
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEffectiveTldPlusOne(@org.jetbrains.annotations.NotNull java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "domain"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r11)
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r0 = r10.splitDomain(r0)
            java.util.List r1 = r10.findMatchingRule(r0)
            int r2 = r0.size()
            int r3 = r1.size()
            r4 = 33
            r5 = 0
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 == r4) goto L2f
            r11 = 0
            return r11
        L2f:
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 != r4) goto L45
            int r0 = r0.size()
            int r1 = r1.size()
        L43:
            int r0 = r0 - r1
            goto L50
        L45:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + 1
            goto L43
        L50:
            java.util.List r11 = r10.splitDomain(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.sequences.m r11 = kotlin.collections.f0.E1(r11)
            kotlin.sequences.m r1 = kotlin.sequences.p.J0(r11, r0)
            r8 = 62
            r9 = 0
            java.lang.String r2 = "."
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.sequences.p.H1(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }
}
