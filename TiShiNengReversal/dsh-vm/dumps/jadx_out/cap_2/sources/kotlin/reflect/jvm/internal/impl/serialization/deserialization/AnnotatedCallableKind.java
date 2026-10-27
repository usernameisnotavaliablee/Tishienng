package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum AnnotatedCallableKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind> {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind FUNCTION = null;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind PROPERTY = null;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind PROPERTY_GETTER = null;
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind PROPERTY_SETTER = null;

    static {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind
            java.lang.String r1 = "FUNCTION"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind
            java.lang.String r3 = "PROPERTY"
            r4 = 1
            r1.<init>(r3, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind
            java.lang.String r5 = "PROPERTY_GETTER"
            r6 = 2
            r3.<init>(r5, r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind
            java.lang.String r7 = "PROPERTY_SETTER"
            r8 = 3
            r5.<init>(r7, r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER = r5
            r7 = 4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.$VALUES = r7
            return
    }

    AnnotatedCallableKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind> r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] values() {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[]) r0
            return r0
    }
}
