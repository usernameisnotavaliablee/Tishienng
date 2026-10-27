package com.bxkj.student.v2.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class CommitResult<T> {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer code;

    @org.jetbrains.annotations.Nullable
    private final T data;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String exerciseRecordId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String msg;

    public CommitResult(@org.jetbrains.annotations.Nullable java.lang.Integer r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable T r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.msg = r2
            r0.data = r3
            r0.exerciseRecordId = r4
            return
    }

    private final T component3() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.common.data.CommitResult copy$default(com.bxkj.student.v2.common.data.CommitResult r0, java.lang.Integer r1, java.lang.String r2, java.lang.Object r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.Integer r1 = r0.code
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.msg
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            T r3 = r0.data
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.exerciseRecordId
        L18:
            com.bxkj.student.v2.common.data.CommitResult r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T apiData() {
            r3 = this;
            java.lang.Integer r0 = r3.code
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            if (r0 != 0) goto Ld
            T r0 = r3.data
            return r0
        Ld:
            com.bxkj.base.v2.http.exception.ApiException r0 = new com.bxkj.base.v2.http.exception.ApiException
            java.lang.Integer r1 = r3.code
            java.lang.String r2 = r3.msg
            r0.<init>(r1, r2)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.msg
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.exerciseRecordId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.common.data.CommitResult<T> copy(@org.jetbrains.annotations.Nullable java.lang.Integer r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable T r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            r1 = this;
            com.bxkj.student.v2.common.data.CommitResult r0 = new com.bxkj.student.v2.common.data.CommitResult
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bxkj.student.v2.common.data.CommitResult
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.bxkj.student.v2.common.data.CommitResult r5 = (com.bxkj.student.v2.common.data.CommitResult) r5
            java.lang.Integer r1 = r4.code
            java.lang.Integer r3 = r5.code
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.msg
            java.lang.String r3 = r5.msg
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            T r1 = r4.data
            T r3 = r5.data
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.exerciseRecordId
            java.lang.String r5 = r5.exerciseRecordId
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExerciseRecordId() {
            r1 = this;
            java.lang.String r0 = r1.exerciseRecordId
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMsg() {
            r1 = this;
            java.lang.String r0 = r1.msg
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.code
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.msg
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            T r2 = r3.data
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.exerciseRecordId
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r2.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            java.lang.Integer r0 = r6.code
            java.lang.String r1 = r6.msg
            T r2 = r6.data
            java.lang.String r3 = r6.exerciseRecordId
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CommitResult(code="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", msg="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", data="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", exerciseRecordId="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
