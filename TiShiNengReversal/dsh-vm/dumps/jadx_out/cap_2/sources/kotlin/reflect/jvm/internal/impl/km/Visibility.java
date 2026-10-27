package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum Visibility extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.Visibility> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.Visibility[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility INTERNAL = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility LOCAL = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PRIVATE = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PRIVATE_TO_THIS = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PROTECTED = null;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PUBLIC = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.d flag;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.Visibility[] $values() {
            r0 = 6
            kotlin.reflect.jvm.internal.impl.km.Visibility[] r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility[r0]
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.INTERNAL
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.PRIVATE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.PROTECTED
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.PUBLIC
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.PRIVATE_TO_THIS
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.LOCAL
            r2 = 5
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "INTERNAL"
            r2 = 0
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.INTERNAL = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "PRIVATE"
            r2 = 1
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.PRIVATE = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "PROTECTED"
            r2 = 2
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.PROTECTED = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "PUBLIC"
            r2 = 3
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.PUBLIC = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "PRIVATE_TO_THIS"
            r2 = 4
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.PRIVATE_TO_THIS = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility r0 = new kotlin.reflect.jvm.internal.impl.km.Visibility
            java.lang.String r1 = "LOCAL"
            r2 = 5
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.Visibility.LOCAL = r0
            kotlin.reflect.jvm.internal.impl.km.Visibility[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.Visibility.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.Visibility.$ENTRIES = r0
            return
    }

    Visibility(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            kotlin.reflect.jvm.internal.impl.km.internal.d r2 = new kotlin.reflect.jvm.internal.impl.km.internal.d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            java.lang.String r0 = "VISIBILITY"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.<init>(r3, r4)
            r1.flag = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.reflect.jvm.internal.impl.km.Visibility> getEntries() {
            kotlin.enums.a r0 = kotlin.reflect.jvm.internal.impl.km.Visibility.$ENTRIES
            return r0
    }

    public static kotlin.reflect.jvm.internal.impl.km.Visibility valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.Visibility> r0 = kotlin.reflect.jvm.internal.impl.km.Visibility.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.Visibility r1 = (kotlin.reflect.jvm.internal.impl.km.Visibility) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.Visibility[] values() {
            kotlin.reflect.jvm.internal.impl.km.Visibility[] r0 = kotlin.reflect.jvm.internal.impl.km.Visibility.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.Visibility[] r0 = (kotlin.reflect.jvm.internal.impl.km.Visibility[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.internal.d getFlag$kotlin_metadata() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.d r0 = r1.flag
            return r0
    }
}
