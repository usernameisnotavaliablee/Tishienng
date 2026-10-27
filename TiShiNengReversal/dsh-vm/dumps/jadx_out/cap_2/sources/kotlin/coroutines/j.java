package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalStdlibApi
    @org.jetbrains.annotations.Nullable
    public static final <E extends kotlin.coroutines.i.b> E a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.coroutines.b
            r1 = 0
            if (r0 == 0) goto L27
            kotlin.coroutines.b r3 = (kotlin.coroutines.b) r3
            kotlin.coroutines.i$c r0 = r2.getKey()
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L26
            kotlin.coroutines.i$b r2 = r3.b(r2)
            boolean r3 = androidx.activity.k.a(r2)
            if (r3 == 0) goto L26
            return r2
        L26:
            return r1
        L27:
            kotlin.coroutines.i$c r0 = r2.getKey()
            if (r0 != r3) goto L2e
            return r2
        L2e:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalStdlibApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.i b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof kotlin.coroutines.b
            if (r0 == 0) goto L23
            kotlin.coroutines.b r2 = (kotlin.coroutines.b) r2
            kotlin.coroutines.i$c r0 = r1.getKey()
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L22
            kotlin.coroutines.i$b r2 = r2.b(r1)
            if (r2 == 0) goto L22
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L22:
            return r1
        L23:
            kotlin.coroutines.i$c r0 = r1.getKey()
            if (r0 != r2) goto L2b
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L2b:
            return r1
    }
}
