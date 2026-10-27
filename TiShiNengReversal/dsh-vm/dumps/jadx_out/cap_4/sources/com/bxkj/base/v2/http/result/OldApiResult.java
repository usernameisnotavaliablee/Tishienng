package com.bxkj.base.v2.http.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class OldApiResult<T> {

    @org.jetbrains.annotations.Nullable
    private final T data;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer returnCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String returnMsg;

    public OldApiResult(@org.jetbrains.annotations.Nullable java.lang.Integer r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable T r3) {
            r0 = this;
            r0.<init>()
            r0.returnCode = r1
            r0.returnMsg = r2
            r0.data = r3
            return
    }

    public static /* synthetic */ com.bxkj.base.v2.http.result.OldApiResult copy$default(com.bxkj.base.v2.http.result.OldApiResult r0, java.lang.Integer r1, java.lang.String r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.Integer r1 = r0.returnCode
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.returnMsg
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            T r3 = r0.data
        L12:
            com.bxkj.base.v2.http.result.OldApiResult r0 = r0.copy(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T apiData() {
            r3 = this;
            java.lang.Integer r0 = r3.returnCode
            if (r0 == 0) goto Lf
            int r0 = r0.intValue()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto Lf
            T r0 = r3.data
            return r0
        Lf:
            com.bxkj.base.v2.http.exception.ApiException r0 = new com.bxkj.base.v2.http.exception.ApiException
            java.lang.Integer r1 = r3.returnCode
            java.lang.String r2 = r3.returnMsg
            r0.<init>(r1, r2)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
            r1 = this;
            java.lang.Integer r0 = r1.returnCode
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.returnMsg
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T component3() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.http.result.OldApiResult<T> copy(@org.jetbrains.annotations.Nullable java.lang.Integer r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable T r4) {
            r1 = this;
            com.bxkj.base.v2.http.result.OldApiResult r0 = new com.bxkj.base.v2.http.result.OldApiResult
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bxkj.base.v2.http.result.OldApiResult
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.bxkj.base.v2.http.result.OldApiResult r5 = (com.bxkj.base.v2.http.result.OldApiResult) r5
            java.lang.Integer r1 = r4.returnCode
            java.lang.Integer r3 = r5.returnCode
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.returnMsg
            java.lang.String r3 = r5.returnMsg
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            T r1 = r4.data
            T r5 = r5.data
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T getData() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getReturnCode() {
            r1 = this;
            java.lang.Integer r0 = r1.returnCode
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReturnMsg() {
            r1 = this;
            java.lang.String r0 = r1.returnMsg
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.returnCode
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.returnMsg
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            T r2 = r3.data
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r2.hashCode()
        L23:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            java.lang.Integer r0 = r5.returnCode
            java.lang.String r1 = r5.returnMsg
            T r2 = r5.data
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "OldApiResult(returnCode="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", returnMsg="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", data="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
