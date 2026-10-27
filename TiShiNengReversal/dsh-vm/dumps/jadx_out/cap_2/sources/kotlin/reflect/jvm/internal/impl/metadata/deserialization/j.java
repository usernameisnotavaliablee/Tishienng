package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.a b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j c = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> a;

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
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable r3) {
                r2 = this;
                java.lang.String r0 = "table"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r3.getRequirementCount()
                if (r0 != 0) goto L10
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r3 = r2.b()
                return r3
            L10:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.j
                java.util.List r3 = r3.getRequirementList()
                java.lang.String r1 = "getRequirementList(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.a()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b = r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.j
            java.util.List r1 = kotlin.collections.f0.J()
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.c = r0
            return
    }

    private j(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* synthetic */ j(java.util.List r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.deserialization.j a() {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement b(int r2) {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r0 = r1.a
            java.lang.Object r2 = kotlin.collections.f0.b3(r0, r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r2
            return r2
    }
}
