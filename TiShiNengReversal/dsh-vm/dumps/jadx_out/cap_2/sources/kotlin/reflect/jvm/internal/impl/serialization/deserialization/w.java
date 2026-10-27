package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface w {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.w {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.w.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.w.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.w
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r5) {
                r1 = this;
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "flexibleId"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "lowerBound"
                kotlin.jvm.internal.g0.p(r4, r2)
                java.lang.String r2 = "upperBound"
                kotlin.jvm.internal.g0.p(r5, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "This method should not be used."
                r2.<init>(r3)
                throw r2
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r4);
}
