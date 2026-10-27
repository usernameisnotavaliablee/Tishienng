package javax.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.annotation.meta.TypeQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface Nonnull {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnull> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When a(javax.annotation.Nonnull r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.Nonnull r1 = (javax.annotation.Nonnull) r1
                javax.annotation.meta.When r1 = r0.b(r1, r2)
                return r1
        }

        public javax.annotation.meta.When b(javax.annotation.Nonnull r1, java.lang.Object r2) {
                r0 = this;
                if (r2 != 0) goto L5
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
            L5:
                javax.annotation.meta.When r1 = javax.annotation.meta.When.ALWAYS
                return r1
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
