package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u0 {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.l
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            return r3
        L9:
            r0 = 64
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r1.append(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = b(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L33:
            java.lang.Throwable r2 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r2 != 0) goto L3a
            goto L58
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = b(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L58:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }
}
