package com.bxkj.base.v2.http.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ApiException extends java.lang.RuntimeException {

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer code;

    @org.jetbrains.annotations.Nullable
    private java.lang.String message;

    public ApiException(@org.jetbrains.annotations.Nullable java.lang.Integer r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.message = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.Nullable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public final void setCode(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.code = r1
            return
    }

    public void setMessage(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.message = r1
            return
    }
}
