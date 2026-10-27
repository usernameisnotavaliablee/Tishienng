package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.t implements kotlin.reflect.jvm.internal.impl.builtins.c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c.a o = null;
    private final boolean n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r12, @org.jetbrains.annotations.NotNull java.io.InputStream r13, boolean r14) {
                r9 = this;
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "module"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "inputStream"
                kotlin.jvm.internal.g0.p(r13, r0)
                kotlin.Pair r13 = y3.c.a(r13)
                java.lang.Object r0 = r13.component1()
                r5 = r0
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r5
                java.lang.Object r13 = r13.component2()
                r6 = r13
                y3.a r6 = (y3.a) r6
                if (r5 == 0) goto L33
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c
                r8 = 0
                r2 = r10
                r3 = r11
                r4 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r1
            L33:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "Kotlin built-in definition format version is not supported: expected "
                r11.append(r12)
                y3.a r12 = y3.a.h
                r11.append(r12)
                java.lang.String r12 = ", actual "
                r11.append(r12)
                r11.append(r6)
                java.lang.String r12 = ". Please update Kotlin"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c.o = r0
            return
    }

    private c(kotlin.reflect.jvm.internal.impl.name.c r8, kotlin.reflect.jvm.internal.impl.storage.n r9, kotlin.reflect.jvm.internal.impl.descriptors.f0 r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment r11, y3.a r12, boolean r13) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.n = r13
            return
    }

    public /* synthetic */ c(kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.reflect.jvm.internal.impl.storage.n r2, kotlin.reflect.jvm.internal.impl.descriptors.f0 r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment r4, y3.a r5, boolean r6, kotlin.jvm.internal.v r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "builtins package fragment for "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.d()
            r0.append(r1)
            java.lang.String r1 = " from "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
