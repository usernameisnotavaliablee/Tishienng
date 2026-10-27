package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e0 {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String a = "kotlinx.coroutines.fast.service.loader";
    private static final boolean b = false;

    static {
            return
    }

    private static final kotlinx.coroutines.internal.f0 a(java.lang.Throwable r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            throw r0
        L3:
            e()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    static /* synthetic */ kotlinx.coroutines.internal.f0 b(java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            kotlinx.coroutines.internal.f0 r1 = a(r1, r2)
            return r1
    }

    private static /* synthetic */ void c() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final boolean d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p2 r0) {
            kotlinx.coroutines.p2 r0 = r0.t()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.f0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void e() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.p2 f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.c0 r0, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlinx.coroutines.internal.c0> r1) {
            kotlinx.coroutines.p2 r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r1 = move-exception
            java.lang.String r0 = r0.b()
            kotlinx.coroutines.internal.f0 r0 = a(r1, r0)
            return r0
    }
}
