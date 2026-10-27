package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_ELEMENT"
            r0.<init>(r1)
            kotlinx.coroutines.channels.f.a = r0
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.d<E> a(int r1) {
            r0 = -2
            if (r1 == r0) goto L29
            r0 = -1
            if (r1 == r0) goto L23
            if (r1 == 0) goto L1b
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L13
            kotlinx.coroutines.channels.e r0 = new kotlinx.coroutines.channels.e
            r0.<init>(r1)
            return r0
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported 0 capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L23:
            kotlinx.coroutines.channels.t r1 = new kotlinx.coroutines.channels.t
            r1.<init>()
            return r1
        L29:
            kotlinx.coroutines.channels.e r1 = new kotlinx.coroutines.channels.e
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.j.t0
            int r0 = r0.a()
            r1.<init>(r0)
            return r1
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 b() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.f.a
            return r0
    }
}
