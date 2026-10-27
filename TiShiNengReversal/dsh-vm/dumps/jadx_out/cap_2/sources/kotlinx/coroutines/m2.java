package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m2 {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 d = null;
    private static final int e = -1;
    private static final int f = 0;
    private static final int g = 1;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 h = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.m1 i = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.m1 j = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "COMPLETING_ALREADY"
            r0.<init>(r1)
            kotlinx.coroutines.m2.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1)
            kotlinx.coroutines.m2.b = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1)
            kotlinx.coroutines.m2.c = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1)
            kotlinx.coroutines.m2.d = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "SEALED"
            r0.<init>(r1)
            kotlinx.coroutines.m2.h = r0
            kotlinx.coroutines.m1 r0 = new kotlinx.coroutines.m1
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.m2.i = r0
            kotlinx.coroutines.m1 r0 = new kotlinx.coroutines.m1
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.m2.j = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 a() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 b() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.c
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.m1 c() {
            kotlinx.coroutines.m1 r0 = kotlinx.coroutines.m2.j
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.m1 d() {
            kotlinx.coroutines.m1 r0 = kotlinx.coroutines.m2.i
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 e() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.h
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 f() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object g(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.y1
            if (r0 == 0) goto Lc
            kotlinx.coroutines.z1 r0 = new kotlinx.coroutines.z1
            kotlinx.coroutines.y1 r1 = (kotlinx.coroutines.y1) r1
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object h(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.z1
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.z1 r0 = (kotlinx.coroutines.z1) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            kotlinx.coroutines.y1 r0 = r0.a
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            return r1
    }
}
