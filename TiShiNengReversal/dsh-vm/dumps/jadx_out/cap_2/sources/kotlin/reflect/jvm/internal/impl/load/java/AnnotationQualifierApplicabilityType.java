package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum AnnotationQualifierApplicabilityType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType FIELD = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_PARAMETER = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_USE = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType VALUE_PARAMETER = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String javaTarget;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] $values() {
            r0 = 6
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[r0]
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.VALUE_PARAMETER
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER
            r2 = 5
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            r1 = 0
            java.lang.String r2 = "METHOD"
            java.lang.String r3 = "METHOD_RETURN_TYPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            r1 = 1
            java.lang.String r2 = "PARAMETER"
            java.lang.String r3 = "VALUE_PARAMETER"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.VALUE_PARAMETER = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            java.lang.String r1 = "FIELD"
            r2 = 2
            r0.<init>(r1, r2, r1)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            r1 = 3
            java.lang.String r2 = "TYPE_USE"
            r0.<init>(r2, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            java.lang.String r1 = "TYPE_PARAMETER_BOUNDS"
            r3 = 4
            r0.<init>(r1, r3, r2)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType
            java.lang.String r1 = "TYPE_PARAMETER"
            r2 = 5
            r0.<init>(r1, r2, r1)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER = r0
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.$ENTRIES = r0
            return
    }

    AnnotationQualifierApplicabilityType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaTarget = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJavaTarget() {
            r1 = this;
            java.lang.String r0 = r1.javaTarget
            return r0
    }
}
