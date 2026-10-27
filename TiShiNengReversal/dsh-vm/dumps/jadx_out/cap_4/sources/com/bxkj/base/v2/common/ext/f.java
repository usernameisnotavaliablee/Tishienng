package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MultipartBody.Part a(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            if (r4 == 0) goto L10
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            okhttp3.MediaType r4 = r1.parse(r4)
            goto L11
        L10:
            r4 = 0
        L11:
            okhttp3.RequestBody r4 = r0.create(r2, r4)
            okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
            if (r3 != 0) goto L1b
            java.lang.String r3 = "file"
        L1b:
            java.lang.String r2 = r2.getName()
            okhttp3.MultipartBody$Part r2 = r0.createFormData(r3, r2, r4)
            return r2
    }

    public static /* synthetic */ okhttp3.MultipartBody.Part b(java.io.File r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = "file"
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = "image/jpg"
        Lc:
            okhttp3.MultipartBody$Part r0 = a(r0, r1, r2)
            return r0
    }
}
