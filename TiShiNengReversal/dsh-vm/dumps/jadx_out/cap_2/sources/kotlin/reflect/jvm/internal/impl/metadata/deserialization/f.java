package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {
    @org.jetbrains.annotations.Nullable
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<M, T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "extension"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasExtension(r2)
            if (r0 == 0) goto L15
            java.lang.Object r1 = r1.getExtension(r2)
            return r1
        L15:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<M, java.util.List<T>> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "extension"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.getExtensionCount(r2)
            if (r3 >= r0) goto L15
            java.lang.Object r1 = r1.getExtension(r2, r3)
            return r1
        L15:
            r1 = 0
            return r1
    }
}
