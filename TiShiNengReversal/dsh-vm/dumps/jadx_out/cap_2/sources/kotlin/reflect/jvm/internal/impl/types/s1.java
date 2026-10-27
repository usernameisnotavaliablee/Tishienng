package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface s1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t1 a(kotlin.reflect.jvm.internal.impl.types.s1 r1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, kotlin.reflect.jvm.internal.impl.types.w1 r3, kotlin.reflect.jvm.internal.impl.descriptors.k r4, int r5, java.lang.Object r6) {
                if (r6 != 0) goto L12
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L8
                r3 = r0
            L8:
                r5 = r5 & 4
                if (r5 == 0) goto Ld
                r4 = r0
            Ld:
                kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.a(r2, r3, r4)
                return r1
            L12:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Super calls with default arguments not supported in this target, function: toAttributes"
                r1.<init>(r2)
                throw r1
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.types.t1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r3);
}
