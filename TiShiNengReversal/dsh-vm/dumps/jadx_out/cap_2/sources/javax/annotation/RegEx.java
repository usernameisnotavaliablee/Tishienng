package javax.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.annotation.Syntax("RegEx")
@javax.annotation.meta.TypeQualifierNickname
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface RegEx {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.RegEx> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When a(javax.annotation.RegEx r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.RegEx r1 = (javax.annotation.RegEx) r1
                javax.annotation.meta.When r1 = r0.b(r1, r2)
                return r1
        }

        public javax.annotation.meta.When b(javax.annotation.RegEx r1, java.lang.Object r2) {
                r0 = this;
                boolean r1 = r2 instanceof java.lang.String
                if (r1 != 0) goto L7
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
            L7:
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.regex.PatternSyntaxException -> Lf
                java.util.regex.Pattern.compile(r2)     // Catch: java.util.regex.PatternSyntaxException -> Lf
                javax.annotation.meta.When r1 = javax.annotation.meta.When.ALWAYS
                return r1
            Lf:
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
