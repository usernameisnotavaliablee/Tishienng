package androidx.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@kotlin.Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface InspectableProperty {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface EnumEntry {
        java.lang.String name();

        int value();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface FlagEntry {
        int mask() default 0;

        java.lang.String name();

        int target();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ValueType extends java.lang.Enum<androidx.annotation.InspectableProperty.ValueType> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] $VALUES = null;
        public static final androidx.annotation.InspectableProperty.ValueType COLOR = null;
        public static final androidx.annotation.InspectableProperty.ValueType GRAVITY = null;
        public static final androidx.annotation.InspectableProperty.ValueType INFERRED = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_ENUM = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_FLAG = null;
        public static final androidx.annotation.InspectableProperty.ValueType NONE = null;
        public static final androidx.annotation.InspectableProperty.ValueType RESOURCE_ID = null;

        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] $values() {
                r0 = 7
                androidx.annotation.InspectableProperty$ValueType[] r0 = new androidx.annotation.InspectableProperty.ValueType[r0]
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.NONE
                r2 = 0
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.INFERRED
                r2 = 1
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.INT_ENUM
                r2 = 2
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.INT_FLAG
                r2 = 3
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.COLOR
                r2 = 4
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.GRAVITY
                r2 = 5
                r0[r2] = r1
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.RESOURCE_ID
                r2 = 6
                r0[r2] = r1
                return r0
        }

        static {
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.NONE = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INFERRED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INFERRED = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INT_ENUM"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INT_ENUM = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INT_FLAG"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INT_FLAG = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "COLOR"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.COLOR = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "GRAVITY"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.GRAVITY = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "RESOURCE_ID"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.RESOURCE_ID = r0
                androidx.annotation.InspectableProperty$ValueType[] r0 = $values()
                androidx.annotation.InspectableProperty.ValueType.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.annotation.InspectableProperty.ValueType.$ENTRIES = r0
                return
        }

        ValueType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.annotation.InspectableProperty.ValueType> getEntries() {
                kotlin.enums.a r0 = androidx.annotation.InspectableProperty.ValueType.$ENTRIES
                return r0
        }

        public static androidx.annotation.InspectableProperty.ValueType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.InspectableProperty$ValueType> r0 = androidx.annotation.InspectableProperty.ValueType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.InspectableProperty$ValueType r1 = (androidx.annotation.InspectableProperty.ValueType) r1
                return r1
        }

        public static androidx.annotation.InspectableProperty.ValueType[] values() {
                androidx.annotation.InspectableProperty$ValueType[] r0 = androidx.annotation.InspectableProperty.ValueType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.InspectableProperty$ValueType[] r0 = (androidx.annotation.InspectableProperty.ValueType[]) r0
                return r0
        }
    }

    int attributeId() default 0;

    androidx.annotation.InspectableProperty.EnumEntry[] enumMapping() default {};

    androidx.annotation.InspectableProperty.FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    java.lang.String name() default "";

    androidx.annotation.InspectableProperty.ValueType valueType() default androidx.annotation.InspectableProperty.ValueType.INFERRED;
}
