package org.jetbrains.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public @interface Nls {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Capitalization extends java.lang.Enum<org.jetbrains.annotations.Nls.Capitalization> {
        private static final /* synthetic */ org.jetbrains.annotations.Nls.Capitalization[] $VALUES = null;
        public static final org.jetbrains.annotations.Nls.Capitalization NotSpecified = null;
        public static final org.jetbrains.annotations.Nls.Capitalization Sentence = null;
        public static final org.jetbrains.annotations.Nls.Capitalization Title = null;

        static {
                org.jetbrains.annotations.Nls$Capitalization r0 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r1 = "NotSpecified"
                r2 = 0
                r0.<init>(r1, r2)
                org.jetbrains.annotations.Nls.Capitalization.NotSpecified = r0
                org.jetbrains.annotations.Nls$Capitalization r1 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r3 = "Title"
                r4 = 1
                r1.<init>(r3, r4)
                org.jetbrains.annotations.Nls.Capitalization.Title = r1
                org.jetbrains.annotations.Nls$Capitalization r3 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r5 = "Sentence"
                r6 = 2
                r3.<init>(r5, r6)
                org.jetbrains.annotations.Nls.Capitalization.Sentence = r3
                r5 = 3
                org.jetbrains.annotations.Nls$Capitalization[] r5 = new org.jetbrains.annotations.Nls.Capitalization[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                org.jetbrains.annotations.Nls.Capitalization.$VALUES = r5
                return
        }

        Capitalization(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.jetbrains.annotations.Nls.Capitalization valueOf(java.lang.String r1) {
                java.lang.Class<org.jetbrains.annotations.Nls$Capitalization> r0 = org.jetbrains.annotations.Nls.Capitalization.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.jetbrains.annotations.Nls$Capitalization r1 = (org.jetbrains.annotations.Nls.Capitalization) r1
                return r1
        }

        public static org.jetbrains.annotations.Nls.Capitalization[] values() {
                org.jetbrains.annotations.Nls$Capitalization[] r0 = org.jetbrains.annotations.Nls.Capitalization.$VALUES
                java.lang.Object r0 = r0.clone()
                org.jetbrains.annotations.Nls$Capitalization[] r0 = (org.jetbrains.annotations.Nls.Capitalization[]) r0
                return r0
        }
    }

    org.jetbrains.annotations.Nls.Capitalization capitalization() default org.jetbrains.annotations.Nls.Capitalization.NotSpecified;
}
