package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v1 {
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static /* synthetic */ void a() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.Executor b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.t1
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.t1 r0 = (kotlinx.coroutines.t1) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L13
            java.util.concurrent.Executor r0 = r0.t()
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            kotlinx.coroutines.f1 r0 = new kotlinx.coroutines.f1
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.m0 c(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.f1
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.f1 r0 = (kotlinx.coroutines.f1) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            kotlinx.coroutines.m0 r0 = r0.a
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            kotlinx.coroutines.u1 r0 = new kotlinx.coroutines.u1
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.t1 d(@org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r1) {
            kotlinx.coroutines.u1 r0 = new kotlinx.coroutines.u1
            r0.<init>(r1)
            return r0
    }
}
