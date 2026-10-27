package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @org.jetbrains.annotations.Nullable
        public static java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r2 = r1.b(r2)
                if (r2 != 0) goto L10
                java.lang.String r1 = r1.getDescription()
                return r1
            L10:
                r1 = 0
                return r1
        }
    }

    @org.jetbrains.annotations.Nullable
    java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1);

    boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1);

    @org.jetbrains.annotations.NotNull
    java.lang.String getDescription();
}
