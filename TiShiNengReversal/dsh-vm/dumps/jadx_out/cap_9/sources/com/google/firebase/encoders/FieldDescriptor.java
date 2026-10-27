package com.google.firebase.encoders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FieldDescriptor {
    private final java.lang.String name;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> properties;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.firebase.encoders.FieldDescriptor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private final java.lang.String name;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> properties;

        Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.properties = r0
                r1.name = r2
                return
        }

        @androidx.annotation.NonNull
        public com.google.firebase.encoders.FieldDescriptor build() {
                r4 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = new com.google.firebase.encoders.FieldDescriptor
                java.lang.String r1 = r4.name
                java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r4.properties
                if (r2 != 0) goto Lb
                java.util.Map r2 = java.util.Collections.EMPTY_MAP
                goto L16
            Lb:
                java.util.HashMap r2 = new java.util.HashMap
                java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.properties
                r2.<init>(r3)
                java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            L16:
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public <T extends java.lang.annotation.Annotation> com.google.firebase.encoders.FieldDescriptor.Builder withProperty(@androidx.annotation.NonNull T r3) {
                r2 = this;
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r2.properties
                if (r0 != 0) goto Lb
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.properties = r0
            Lb:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r2.properties
                java.lang.Class r1 = r3.annotationType()
                r0.put(r1, r3)
                return r2
        }
    }

    private FieldDescriptor(java.lang.String r1, java.util.Map<java.lang.Class<?>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.properties = r2
            return
    }

    /* synthetic */ FieldDescriptor(java.lang.String r1, java.util.Map r2, com.google.firebase.encoders.FieldDescriptor.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.firebase.encoders.FieldDescriptor.Builder builder(@androidx.annotation.NonNull java.lang.String r1) {
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = new com.google.firebase.encoders.FieldDescriptor$Builder
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.firebase.encoders.FieldDescriptor of(@androidx.annotation.NonNull java.lang.String r2) {
            com.google.firebase.encoders.FieldDescriptor r0 = new com.google.firebase.encoders.FieldDescriptor
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.<init>(r2, r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.encoders.FieldDescriptor
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.encoders.FieldDescriptor r5 = (com.google.firebase.encoders.FieldDescriptor) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r4.properties
            java.util.Map<java.lang.Class<?>, java.lang.Object> r5 = r5.properties
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @androidx.annotation.NonNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @androidx.annotation.Nullable
    public <T extends java.lang.annotation.Annotation> T getProperty(@androidx.annotation.NonNull java.lang.Class<T> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.properties
            java.lang.Object r2 = r0.get(r2)
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.properties
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FieldDescriptor{name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", properties="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.properties
            java.util.Collection r1 = r1.values()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
