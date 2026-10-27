package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Dependency {
    private final java.lang.Class<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(java.lang.Class<?> r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null dependency anInterface."
            java.lang.Object r2 = com.google.firebase.components.Preconditions.checkNotNull(r2, r0)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.anInterface = r2
            r1.type = r3
            r1.injection = r4
            return
    }

    public static com.google.firebase.components.Dependency deferred(java.lang.Class<?> r3) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2)
            return r0
    }

    private static java.lang.String describeInjection(int r3) {
            if (r3 == 0) goto L25
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 != r0) goto Lb
            java.lang.String r3 = "deferred"
            return r3
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported injection: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            java.lang.String r3 = "provider"
            return r3
        L25:
            java.lang.String r3 = "direct"
            return r3
    }

    public static com.google.firebase.components.Dependency optional(java.lang.Class<?> r2) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    public static com.google.firebase.components.Dependency optionalProvider(java.lang.Class<?> r3) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static com.google.firebase.components.Dependency required(java.lang.Class<?> r3) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static com.google.firebase.components.Dependency requiredProvider(java.lang.Class<?> r2) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 1
            r0.<init>(r2, r1, r1)
            return r0
    }

    public static com.google.firebase.components.Dependency setOf(java.lang.Class<?> r3) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 2
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static com.google.firebase.components.Dependency setOfProvider(java.lang.Class<?> r3) {
            com.google.firebase.components.Dependency r0 = new com.google.firebase.components.Dependency
            r1 = 2
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.firebase.components.Dependency
            r1 = 0
            if (r0 == 0) goto L1b
            com.google.firebase.components.Dependency r4 = (com.google.firebase.components.Dependency) r4
            java.lang.Class<?> r0 = r3.anInterface
            java.lang.Class<?> r2 = r4.anInterface
            if (r0 != r2) goto L1b
            int r0 = r3.type
            int r2 = r4.type
            if (r0 != r2) goto L1b
            int r0 = r3.injection
            int r4 = r4.injection
            if (r0 != r4) goto L1b
            r4 = 1
            return r4
        L1b:
            return r1
    }

    public java.lang.Class<?> getInterface() {
            r1 = this;
            java.lang.Class<?> r0 = r1.anInterface
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Class<?> r0 = r3.anInterface
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.type
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.injection
            r0 = r0 ^ r1
            return r0
    }

    public boolean isDeferred() {
            r2 = this;
            int r0 = r2.injection
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isDirectInjection() {
            r1 = this;
            int r0 = r1.injection
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isRequired() {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isSet() {
            r2 = this;
            int r0 = r2.type
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency{anInterface="
            r0.<init>(r1)
            java.lang.Class<?> r1 = r3.anInterface
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.type
            r2 = 1
            if (r1 != r2) goto L19
            java.lang.String r1 = "required"
            goto L20
        L19:
            if (r1 != 0) goto L1e
            java.lang.String r1 = "optional"
            goto L20
        L1e:
            java.lang.String r1 = "set"
        L20:
            r0.append(r1)
            java.lang.String r1 = ", injection="
            r0.append(r1)
            int r1 = r3.injection
            java.lang.String r1 = describeInjection(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
