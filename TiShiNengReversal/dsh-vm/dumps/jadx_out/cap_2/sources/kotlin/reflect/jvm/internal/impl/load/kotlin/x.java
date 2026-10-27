package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface x {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3);

        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2);

        void c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2);

        void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.Nullable java.lang.Object r2);

        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1);

        void visitEnd();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(@org.jetbrains.annotations.Nullable java.lang.Object r1);

        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1);

        void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2);

        void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r1);

        void visitEnd();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r2);

        void visitEnd();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.e a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull java.lang.String r2);

        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Object r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e extends kotlin.reflect.jvm.internal.impl.load.kotlin.x.c {
        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.load.kotlin.x.a a(int r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r3);
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.name.b c();

    void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r1, @org.jetbrains.annotations.Nullable byte[] r2);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader e();

    void f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.c r1, @org.jetbrains.annotations.Nullable byte[] r2);

    @org.jetbrains.annotations.NotNull
    java.lang.String getLocation();
}
