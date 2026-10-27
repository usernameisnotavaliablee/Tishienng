package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceOutput_Event extends androidx.camera.core.SurfaceOutput.Event {
    private final int eventCode;
    private final androidx.camera.core.SurfaceOutput surfaceOutput;

    AutoValue_SurfaceOutput_Event(int r1, androidx.camera.core.SurfaceOutput r2) {
            r0 = this;
            r0.<init>()
            r0.eventCode = r1
            if (r2 == 0) goto La
            r0.surfaceOutput = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null surfaceOutput"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.SurfaceOutput.Event
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.core.SurfaceOutput$Event r5 = (androidx.camera.core.SurfaceOutput.Event) r5
            int r1 = r4.eventCode
            int r3 = r5.getEventCode()
            if (r1 != r3) goto L20
            androidx.camera.core.SurfaceOutput r1 = r4.surfaceOutput
            androidx.camera.core.SurfaceOutput r5 = r5.getSurfaceOutput()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
            r1 = this;
            int r0 = r1.eventCode
            return r0
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    @androidx.annotation.NonNull
    public androidx.camera.core.SurfaceOutput getSurfaceOutput() {
            r1 = this;
            androidx.camera.core.SurfaceOutput r0 = r1.surfaceOutput
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.eventCode
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.SurfaceOutput r1 = r2.surfaceOutput
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Event{eventCode="
            r0.append(r1)
            int r1 = r2.eventCode
            r0.append(r1)
            java.lang.String r1 = ", surfaceOutput="
            r0.append(r1)
            androidx.camera.core.SurfaceOutput r1 = r2.surfaceOutput
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
