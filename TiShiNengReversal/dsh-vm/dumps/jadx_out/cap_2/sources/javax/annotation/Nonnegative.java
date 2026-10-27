package javax.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.Number.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface Nonnegative {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnegative> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When a(javax.annotation.Nonnegative r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.Nonnegative r1 = (javax.annotation.Nonnegative) r1
                javax.annotation.meta.When r1 = r0.b(r1, r2)
                return r1
        }

        public javax.annotation.meta.When b(javax.annotation.Nonnegative r4, java.lang.Object r5) {
                r3 = this;
                boolean r4 = r5 instanceof java.lang.Number
                if (r4 != 0) goto L7
                javax.annotation.meta.When r4 = javax.annotation.meta.When.NEVER
                return r4
            L7:
                java.lang.Number r5 = (java.lang.Number) r5
                boolean r4 = r5 instanceof java.lang.Long
                if (r4 == 0) goto L18
                long r4 = r5.longValue()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto L3e
                goto L3b
            L18:
                boolean r4 = r5 instanceof java.lang.Double
                if (r4 == 0) goto L27
                double r4 = r5.doubleValue()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto L3e
                goto L3b
            L27:
                boolean r4 = r5 instanceof java.lang.Float
                if (r4 == 0) goto L35
                float r4 = r5.floatValue()
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L3e
                goto L3b
            L35:
                int r4 = r5.intValue()
                if (r4 >= 0) goto L3e
            L3b:
                javax.annotation.meta.When r4 = javax.annotation.meta.When.NEVER
                return r4
            L3e:
                javax.annotation.meta.When r4 = javax.annotation.meta.When.ALWAYS
                return r4
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
