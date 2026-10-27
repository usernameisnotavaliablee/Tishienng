package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_StateObservable_ErrorWrapper extends androidx.camera.core.impl.StateObservable.ErrorWrapper {
    private final java.lang.Throwable error;

    AutoValue_StateObservable_ErrorWrapper(java.lang.Throwable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.error = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null error"
            r2.<init>(r0)
            throw r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper
            if (r0 == 0) goto L15
            androidx.camera.core.impl.StateObservable$ErrorWrapper r2 = (androidx.camera.core.impl.StateObservable.ErrorWrapper) r2
            java.lang.Throwable r0 = r1.error
            java.lang.Throwable r2 = r2.getError()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    @androidx.annotation.NonNull
    public java.lang.Throwable getError() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Throwable r0 = r2.error
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ErrorWrapper{error="
            r0.append(r1)
            java.lang.Throwable r1 = r2.error
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
