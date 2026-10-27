package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class TypedOptions<T> extends kotlin.collections.d<T> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    public static final okio.TypedOptions.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<T> list;

    @org.jetbrains.annotations.NotNull
    private final okio.Options options;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final <T> okio.TypedOptions<T> of(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> r7) {
                r5 = this;
                java.lang.String r0 = "values"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "encode"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.util.List r6 = kotlin.collections.f0.a6(r6)
                okio.Options$Companion r0 = okio.Options.Companion
                int r1 = r6.size()
                okio.ByteString[] r2 = new okio.ByteString[r1]
                r3 = 0
            L17:
                if (r3 >= r1) goto L26
                java.lang.Object r4 = r6.get(r3)
                java.lang.Object r4 = r7.invoke(r4)
                r2[r3] = r4
                int r3 = r3 + 1
                goto L17
            L26:
                okio.Options r7 = r0.of(r2)
                okio.TypedOptions r0 = new okio.TypedOptions
                r0.<init>(r6, r7)
                return r0
        }
    }

    static {
            okio.TypedOptions$Companion r0 = new okio.TypedOptions$Companion
            r1 = 0
            r0.<init>(r1)
            okio.TypedOptions.Companion = r0
            return
    }

    public TypedOptions(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull okio.Options r3) {
            r1 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.options = r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            r1.list = r2
            int r2 = r2.size()
            int r3 = r3.size()
            if (r2 != r3) goto L22
            return
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            r2.<init>(r3)
            throw r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final <T> okio.TypedOptions<T> of(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> r2) {
            okio.TypedOptions$Companion r0 = okio.TypedOptions.Companion
            okio.TypedOptions r1 = r0.of(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public T get(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getList$okio() {
            r1 = this;
            java.util.List<T> r0 = r1.list
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Options getOptions$okio() {
            r1 = this;
            okio.Options r0 = r1.options
            return r0
    }

    public int getSize() {
            r1 = this;
            java.util.List<T> r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
