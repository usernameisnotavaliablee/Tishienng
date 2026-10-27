package com.bumptech.glide.load;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class HttpException extends java.io.IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int r2) {
            r1 = this;
            java.lang.String r0 = "Http request failed"
            r1.<init>(r0, r2)
            return
    }

    @java.lang.Deprecated
    public HttpException(java.lang.String r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public HttpException(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpException(java.lang.String r2, int r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ", status code: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2, r4)
            r1.statusCode = r3
            return
    }

    public int getStatusCode() {
            r1 = this;
            int r0 = r1.statusCode
            return r0
    }
}
