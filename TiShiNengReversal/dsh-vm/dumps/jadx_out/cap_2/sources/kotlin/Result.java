package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.jvm.JvmInline
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Result<T> implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.Result.a Companion = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Failure implements java.io.Serializable {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable exception;

        public Failure(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.exception = r2
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.Result.Failure
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.exception
                kotlin.Result$Failure r2 = (kotlin.Result.Failure) r2
                java.lang.Throwable r2 = r2.exception
                boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.exception
                int r0 = r0.hashCode()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failure("
                r0.append(r1)
                java.lang.Throwable r1 = r2.exception
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.internal.InlineOnly
        @kotlin.jvm.JvmName(name = "failure")
        private final <T> java.lang.Object a(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r2 = kotlin.g0.a(r2)
                java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
                return r2
        }

        @kotlin.internal.InlineOnly
        @kotlin.jvm.JvmName(name = "success")
        private final <T> java.lang.Object b(T r1) {
                r0 = this;
                java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
                return r1
        }
    }

    static {
            kotlin.Result$a r0 = new kotlin.Result$a
            r1 = 0
            r0.<init>(r1)
            kotlin.Result.Companion = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ Result(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.Result m10boximpl(java.lang.Object r1) {
            kotlin.Result r0 = new kotlin.Result
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m11constructorimpl(@org.jetbrains.annotations.Nullable java.lang.Object r0) {
            return r0
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12equalsimpl(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.Result
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r3 = r3.m20unboximpl()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13equalsimpl0(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m14exceptionOrNullimpl(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L9
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1
            java.lang.Throwable r1 = r1.exception
            return r1
        L9:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    /* renamed from: getOrNull-impl, reason: not valid java name */
    private static final T m15getOrNullimpl(java.lang.Object r1) {
            boolean r0 = m17isFailureimpl(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getValue$annotations() {
            return
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16hashCodeimpl(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.hashCode()
            return r0
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m17isFailureimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlin.Result.Failure
            return r0
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m18isSuccessimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlin.Result.Failure
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m19toStringimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlin.Result.Failure
            if (r0 == 0) goto Lb
            kotlin.Result$Failure r2 = (kotlin.Result.Failure) r2
            java.lang.String r2 = r2.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Success("
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r2 = m12equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            int r0 = m16hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.String r0 = m19toStringimpl(r0)
            return r0
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m20unboximpl() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }
}
