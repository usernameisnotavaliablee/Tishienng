package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface p<T> extends kotlinx.coroutines.flow.i<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(kotlinx.coroutines.flow.internal.p r0, kotlin.coroutines.i r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L18
                r5 = r4 & 1
                if (r5 == 0) goto L8
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L8:
                r5 = r4 & 2
                if (r5 == 0) goto Ld
                r2 = -3
            Ld:
                r4 = r4 & 4
                if (r4 == 0) goto L13
                kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            L13:
                kotlinx.coroutines.flow.i r0 = r0.e(r1, r2, r3)
                return r0
            L18:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: fuse"
                r0.<init>(r1)
                throw r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3);
}
