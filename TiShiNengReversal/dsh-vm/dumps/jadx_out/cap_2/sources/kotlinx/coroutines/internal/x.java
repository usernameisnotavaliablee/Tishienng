package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object d = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CONDITION_FALSE"
            r0.<init>(r1)
            kotlinx.coroutines.internal.x.d = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object a() {
            java.lang.Object r0 = kotlinx.coroutines.internal.x.d
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void b() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void c() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void d() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void e() {
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.y f(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.m0
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.internal.m0 r0 = (kotlinx.coroutines.internal.m0) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.y r0 = r0.a
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
            return r1
    }
}
