package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n1803#2,3:405\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n21#1:405,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,404:1\n*E\n"})
    public static final class a<T> implements kotlin.jvm.functions.Function1<T, java.lang.Boolean> {
        final /* synthetic */ int a;

        public a(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        public final java.lang.Boolean a(java.lang.Enum r3) {
                r2 = this;
                int r0 = r2.a
                kotlin.text.h r3 = (kotlin.text.h) r3
                int r1 = r3.getMask()
                r0 = r0 & r1
                int r3 = r3.getValue()
                if (r0 != r3) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    public static final /* synthetic */ kotlin.text.p a(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            kotlin.text.p r0 = f(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ kotlin.text.p b(java.util.regex.Matcher r0, java.lang.CharSequence r1) {
            kotlin.text.p r0 = h(r0, r1)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.m c(java.util.regex.MatchResult r0) {
            kotlin.ranges.m r0 = i(r0)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.m d(java.util.regex.MatchResult r0, int r1) {
            kotlin.ranges.m r0 = j(r0, r1)
            return r0
    }

    public static final /* synthetic */ int e(java.lang.Iterable r0) {
            int r0 = k(r0)
            return r0
    }

    private static final kotlin.text.p f(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            kotlin.text.q r1 = new kotlin.text.q
            r1.<init>(r0, r2)
            return r1
    }

    private static final /* synthetic */ <T extends java.lang.Enum<T> & kotlin.text.h> java.util.Set<T> g(int r2) {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.jvm.internal.g0.w()
            kotlin.text.t$a r1 = new kotlin.text.t$a
            r1.<init>(r2)
            kotlin.collections.f0.S0(r0, r1)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    private static final kotlin.text.p h(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            boolean r0 = r1.matches()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            kotlin.text.q r0 = new kotlin.text.q
            r0.<init>(r1, r2)
            return r0
    }

    private static final kotlin.ranges.m i(java.util.regex.MatchResult r1) {
            int r0 = r1.start()
            int r1 = r1.end()
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r0, r1)
            return r1
    }

    private static final kotlin.ranges.m j(java.util.regex.MatchResult r1, int r2) {
            int r0 = r1.start(r2)
            int r1 = r1.end(r2)
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r0, r1)
            return r1
    }

    private static final int k(java.lang.Iterable<? extends kotlin.text.h> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            kotlin.text.h r1 = (kotlin.text.h) r1
            int r1 = r1.getValue()
            r0 = r0 | r1
            goto L5
        L17:
            return r0
    }
}
