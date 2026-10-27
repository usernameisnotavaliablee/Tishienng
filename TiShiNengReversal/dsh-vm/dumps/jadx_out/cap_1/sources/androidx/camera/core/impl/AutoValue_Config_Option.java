package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Config_Option<T> extends androidx.camera.core.impl.Config.Option<T> {
    private final java.lang.String id;
    private final java.lang.Object token;
    private final java.lang.Class<T> valueClass;

    AutoValue_Config_Option(java.lang.String r1, java.lang.Class<T> r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.id = r1
            if (r2 == 0) goto Le
            r0.valueClass = r2
            r0.token = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null valueClass"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null id"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.Config.Option
            r2 = 0
            if (r1 == 0) goto L39
            androidx.camera.core.impl.Config$Option r5 = (androidx.camera.core.impl.Config.Option) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.getId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
            java.lang.Class<T> r1 = r4.valueClass
            java.lang.Class r3 = r5.getValueClass()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
            java.lang.Object r1 = r4.token
            if (r1 != 0) goto L2e
            java.lang.Object r5 = r5.getToken()
            if (r5 != 0) goto L39
            goto L38
        L2e:
            java.lang.Object r5 = r5.getToken()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L39
        L38:
            return r0
        L39:
            return r2
    }

    @Override // androidx.camera.core.impl.Config.Option
    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    @Override // androidx.camera.core.impl.Config.Option
    @androidx.annotation.Nullable
    public java.lang.Object getToken() {
            r1 = this;
            java.lang.Object r0 = r1.token
            return r0
    }

    @Override // androidx.camera.core.impl.Config.Option
    @androidx.annotation.NonNull
    public java.lang.Class<T> getValueClass() {
            r1 = this;
            java.lang.Class<T> r0 = r1.valueClass
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.id
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Class<T> r2 = r3.valueClass
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Object r1 = r3.token
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            int r1 = r1.hashCode()
        L1f:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Option{id="
            r0.append(r1)
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ", valueClass="
            r0.append(r1)
            java.lang.Class<T> r1 = r2.valueClass
            r0.append(r1)
            java.lang.String r1 = ", token="
            r0.append(r1)
            java.lang.Object r1 = r2.token
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
