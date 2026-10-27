package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface b1 extends kotlinx.coroutines.z0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.b1 r0, long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                java.lang.Object r0 = kotlinx.coroutines.z0.a.a(r0, r1, r3)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                if (r0 != r1) goto Lb
                return r0
            Lb:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.j1 b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.b1 r0, long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
                kotlinx.coroutines.j1 r0 = kotlinx.coroutines.z0.a.b(r0, r1, r3, r4)
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    java.lang.String h(long r1);
}
