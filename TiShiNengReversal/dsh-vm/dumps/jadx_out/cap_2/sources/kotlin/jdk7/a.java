package kotlin.jdk7;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "AutoCloseableKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAutoCloseableJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloseableJVM.kt\nkotlin/jdk7/AutoCloseableKt$AutoCloseable$1\n*L\n1#1,49:1\n*E\n"})
    /* renamed from: kotlin.jdk7.a$a, reason: collision with other inner class name */
    public static final class C0020a implements java.lang.AutoCloseable {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        public C0020a(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
                r1 = this;
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.a
                r0.invoke()
                return
        }
    }

    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.internal.InlineOnly
    private static final java.lang.AutoCloseable a(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            java.lang.String r0 = "closeAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.jdk7.a$a r0 = new kotlin.jdk7.a$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "2.0")
    public static /* synthetic */ void b() {
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.PublishedApi
    public static final void c(@org.jetbrains.annotations.Nullable java.lang.AutoCloseable r0, @org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            androidx.core.provider.c.a(r0)
            return
        L8:
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            kotlin.l.a(r1, r0)
        L10:
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final <T extends java.lang.AutoCloseable, R> R d(T r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r0)
            r1 = 0
            c(r2, r1)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L15:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            c(r2, r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }
}
