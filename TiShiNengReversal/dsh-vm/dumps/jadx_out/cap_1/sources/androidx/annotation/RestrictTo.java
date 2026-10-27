package androidx.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PACKAGE})
@kotlin.annotation.MustBeDocumented
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FILE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface RestrictTo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Scope extends java.lang.Enum<androidx.annotation.RestrictTo.Scope> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] $VALUES = null;

        @kotlin.Deprecated(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final androidx.annotation.RestrictTo.Scope GROUP_ID = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP_PREFIX = null;
        public static final androidx.annotation.RestrictTo.Scope SUBCLASSES = null;
        public static final androidx.annotation.RestrictTo.Scope TESTS = null;

        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] $values() {
                r0 = 6
                androidx.annotation.RestrictTo$Scope[] r0 = new androidx.annotation.RestrictTo.Scope[r0]
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.LIBRARY
                r2 = 0
                r0[r2] = r1
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP
                r2 = 1
                r0[r2] = r1
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX
                r2 = 2
                r0[r2] = r1
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.GROUP_ID
                r2 = 3
                r0[r2] = r1
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.TESTS
                r2 = 4
                r0[r2] = r1
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.SUBCLASSES
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY_GROUP"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY_GROUP_PREFIX"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "GROUP_ID"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.GROUP_ID = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "TESTS"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.TESTS = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "SUBCLASSES"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.SUBCLASSES = r0
                androidx.annotation.RestrictTo$Scope[] r0 = $values()
                androidx.annotation.RestrictTo.Scope.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.annotation.RestrictTo.Scope.$ENTRIES = r0
                return
        }

        Scope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.annotation.RestrictTo.Scope> getEntries() {
                kotlin.enums.a r0 = androidx.annotation.RestrictTo.Scope.$ENTRIES
                return r0
        }

        public static androidx.annotation.RestrictTo.Scope valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.RestrictTo$Scope> r0 = androidx.annotation.RestrictTo.Scope.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.RestrictTo$Scope r1 = (androidx.annotation.RestrictTo.Scope) r1
                return r1
        }

        public static androidx.annotation.RestrictTo.Scope[] values() {
                androidx.annotation.RestrictTo$Scope[] r0 = androidx.annotation.RestrictTo.Scope.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.RestrictTo$Scope[] r0 = (androidx.annotation.RestrictTo.Scope[]) r0
                return r0
        }
    }

    androidx.annotation.RestrictTo.Scope[] value();
}
