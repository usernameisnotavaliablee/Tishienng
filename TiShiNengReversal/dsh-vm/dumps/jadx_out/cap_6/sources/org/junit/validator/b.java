package org.junit.validator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static final java.util.concurrent.ConcurrentHashMap<org.junit.validator.ValidateWith, org.junit.validator.a> a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.junit.validator.b.a = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.junit.validator.a a(org.junit.validator.ValidateWith r5) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<org.junit.validator.ValidateWith, org.junit.validator.a> r0 = org.junit.validator.b.a
            java.lang.Object r1 = r0.get(r5)
            org.junit.validator.a r1 = (org.junit.validator.a) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.Class r1 = r5.value()
            if (r1 == 0) goto L3d
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Exception -> L21
            org.junit.validator.a r2 = (org.junit.validator.a) r2     // Catch: java.lang.Exception -> L21
            r0.putIfAbsent(r5, r2)     // Catch: java.lang.Exception -> L21
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Exception -> L21
            org.junit.validator.a r5 = (org.junit.validator.a) r5     // Catch: java.lang.Exception -> L21
            return r5
        L21:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception received when creating AnnotationValidator class "
            r2.append(r3)
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r5)
            throw r0
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't create validator, value is null in annotation "
            r1.append(r2)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
