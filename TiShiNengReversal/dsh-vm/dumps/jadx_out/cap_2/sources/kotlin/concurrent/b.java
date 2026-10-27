package kotlin.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ThreadsKt")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends java.lang.Thread {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        a(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.a
                r0.invoke()
                return
        }
    }

    @kotlin.internal.InlineOnly
    private static final <T> T a(java.lang.ThreadLocal<T> r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L18
            java.lang.Object r2 = r2.invoke()
            r1.set(r2)
            return r2
        L18:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Thread b(boolean r1, boolean r2, @org.jetbrains.annotations.Nullable java.lang.ClassLoader r3, @org.jetbrains.annotations.Nullable java.lang.String r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r6) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.concurrent.b$a r0 = new kotlin.concurrent.b$a
            r0.<init>(r6)
            if (r2 == 0) goto L10
            r2 = 1
            r0.setDaemon(r2)
        L10:
            if (r5 <= 0) goto L15
            r0.setPriority(r5)
        L15:
            if (r4 == 0) goto L1a
            r0.setName(r4)
        L1a:
            if (r3 == 0) goto L1f
            r0.setContextClassLoader(r3)
        L1f:
            if (r1 == 0) goto L24
            r0.start()
        L24:
            return r0
    }

    public static /* synthetic */ java.lang.Thread c(boolean r1, boolean r2, java.lang.ClassLoader r3, java.lang.String r4, int r5, kotlin.jvm.functions.Function0 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r1 = 1
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto La
            r2 = 0
        La:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L10
            r3 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L15
            r4 = r0
        L15:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r5 = -1
            r7 = r6
            r6 = -1
        L1c:
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L24
        L21:
            r7 = r6
            r6 = r5
            goto L1c
        L24:
            java.lang.Thread r1 = b(r2, r3, r4, r5, r6, r7)
            return r1
    }
}
