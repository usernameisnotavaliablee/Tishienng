package com.jmolsmobile.landscapevideocapture.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PrepareCameraException extends java.lang.Exception {
    private static final java.lang.String LOG_PREFIX = "Unable to unlock camera - ";
    private static final java.lang.String MESSAGE = "Unable to use camera for recording";
    private static final long serialVersionUID = 6305923762266448674L;

    public PrepareCameraException() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            java.lang.String r0 = "VideoCapture_Exception"
            java.lang.String r1 = "Unable to unlock camera - Unable to use camera for recording"
            com.jmolsmobile.landscapevideocapture.b.b(r0, r1)
            java.lang.String r0 = "Unable to use camera for recording"
            return r0
    }
}
