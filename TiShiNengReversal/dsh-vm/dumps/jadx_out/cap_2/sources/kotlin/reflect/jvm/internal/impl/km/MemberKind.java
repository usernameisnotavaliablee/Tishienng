package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum MemberKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.MemberKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.MemberKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind DECLARATION = null;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind DELEGATION = null;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind FAKE_OVERRIDE = null;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind SYNTHESIZED = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.d flag;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.MemberKind[] $values() {
            r0 = 4
            kotlin.reflect.jvm.internal.impl.km.MemberKind[] r0 = new kotlin.reflect.jvm.internal.impl.km.MemberKind[r0]
            kotlin.reflect.jvm.internal.impl.km.MemberKind r1 = kotlin.reflect.jvm.internal.impl.km.MemberKind.DECLARATION
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.MemberKind r1 = kotlin.reflect.jvm.internal.impl.km.MemberKind.FAKE_OVERRIDE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.MemberKind r1 = kotlin.reflect.jvm.internal.impl.km.MemberKind.DELEGATION
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.MemberKind r1 = kotlin.reflect.jvm.internal.impl.km.MemberKind.SYNTHESIZED
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.MemberKind r0 = new kotlin.reflect.jvm.internal.impl.km.MemberKind
            java.lang.String r1 = "DECLARATION"
            r2 = 0
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.MemberKind.DECLARATION = r0
            kotlin.reflect.jvm.internal.impl.km.MemberKind r0 = new kotlin.reflect.jvm.internal.impl.km.MemberKind
            java.lang.String r1 = "FAKE_OVERRIDE"
            r2 = 1
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.MemberKind.FAKE_OVERRIDE = r0
            kotlin.reflect.jvm.internal.impl.km.MemberKind r0 = new kotlin.reflect.jvm.internal.impl.km.MemberKind
            java.lang.String r1 = "DELEGATION"
            r2 = 2
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.MemberKind.DELEGATION = r0
            kotlin.reflect.jvm.internal.impl.km.MemberKind r0 = new kotlin.reflect.jvm.internal.impl.km.MemberKind
            java.lang.String r1 = "SYNTHESIZED"
            r2 = 3
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.MemberKind.SYNTHESIZED = r0
            kotlin.reflect.jvm.internal.impl.km.MemberKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.MemberKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.MemberKind.$ENTRIES = r0
            return
    }

    MemberKind(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            kotlin.reflect.jvm.internal.impl.km.internal.d r2 = new kotlin.reflect.jvm.internal.impl.km.internal.d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.p
            java.lang.String r0 = "MEMBER_KIND"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.<init>(r3, r4)
            r1.flag = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.reflect.jvm.internal.impl.km.MemberKind> getEntries() {
            kotlin.enums.a r0 = kotlin.reflect.jvm.internal.impl.km.MemberKind.$ENTRIES
            return r0
    }

    public static kotlin.reflect.jvm.internal.impl.km.MemberKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.MemberKind> r0 = kotlin.reflect.jvm.internal.impl.km.MemberKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.MemberKind r1 = (kotlin.reflect.jvm.internal.impl.km.MemberKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.MemberKind[] values() {
            kotlin.reflect.jvm.internal.impl.km.MemberKind[] r0 = kotlin.reflect.jvm.internal.impl.km.MemberKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.MemberKind[] r0 = (kotlin.reflect.jvm.internal.impl.km.MemberKind[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.internal.d getFlag$kotlin_metadata() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.d r0 = r1.flag
            return r0
    }
}
