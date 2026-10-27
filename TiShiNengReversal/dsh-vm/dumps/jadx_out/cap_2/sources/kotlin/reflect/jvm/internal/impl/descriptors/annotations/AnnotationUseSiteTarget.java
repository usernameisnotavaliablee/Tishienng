package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum AnnotationUseSiteTarget extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget ALL = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget FIELD = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget FILE = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_GETTER = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_SETTER = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget RECEIVER = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget SETTER_PARAMETER = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String renderName;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] $values() {
            r0 = 10
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[r0]
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.ALL
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FILE
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER
            r2 = 6
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER
            r2 = 7
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER
            r2 = 8
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD
            r2 = 9
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r4 = 1
            r5 = 0
            java.lang.String r1 = "ALL"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.ALL = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r5 = 1
            r6 = 0
            java.lang.String r2 = "FIELD"
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD = r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r6 = 1
            r7 = 0
            java.lang.String r3 = "FILE"
            r4 = 2
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FILE = r2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r7 = 1
            r8 = 0
            java.lang.String r4 = "PROPERTY"
            r5 = 3
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY = r3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r1 = 4
            java.lang.String r2 = "get"
            java.lang.String r3 = "PROPERTY_GETTER"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r1 = 5
            java.lang.String r2 = "set"
            java.lang.String r3 = "PROPERTY_SETTER"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r8 = 1
            r9 = 0
            java.lang.String r5 = "RECEIVER"
            r6 = 6
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER = r4
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r1 = 7
            java.lang.String r2 = "param"
            java.lang.String r3 = "CONSTRUCTOR_PARAMETER"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r1 = 8
            java.lang.String r2 = "setparam"
            java.lang.String r3 = "SETTER_PARAMETER"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget
            r1 = 9
            java.lang.String r2 = "delegate"
            java.lang.String r3 = "PROPERTY_DELEGATE_FIELD"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.$ENTRIES = r0
            return
    }

    AnnotationUseSiteTarget(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 != 0) goto Ld
            java.lang.String r1 = r0.name()
            java.lang.String r3 = e4.a.f(r1)
        Ld:
            r0.renderName = r3
            return
    }

    /* synthetic */ AnnotationUseSiteTarget(java.lang.String r1, int r2, java.lang.String r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget> r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] values() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRenderName() {
            r1 = this;
            java.lang.String r0 = r1.renderName
            return r0
    }
}
