package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Verify {
    private Verify() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void verify(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            r0.<init>()
            throw r0
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, char r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, char r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, char r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, char r3, long r4) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, char r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, int r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, int r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, int r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, int r3, long r4) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, long r3) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r4)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, long r3, char r5) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Character r4 = java.lang.Character.valueOf(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, long r3, int r5) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r1, long r2, long r4) {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r1 = com.google.common.base.Strings.lenientFormat(r1, r4)
            r0.<init>(r1)
            throw r0
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, long r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            r3 = 1
            r4[r3] = r5
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r4)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, char r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, int r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, long r4) {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r1 = new com.google.common.base.VerifyException
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
            if (r2 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r2 = new com.google.common.base.VerifyException
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            r4 = 3
            r0[r4] = r7
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static void verify(boolean r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.common.base.VerifyException r0 = new com.google.common.base.VerifyException
            java.lang.String r1 = com.google.common.base.Strings.lenientFormat(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> T verifyNotNull(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "expected a non-null reference"
            java.lang.Object r2 = verifyNotNull(r2, r1, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> T verifyNotNull(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... r3) {
            if (r1 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            verify(r0, r2, r3)
            return r1
    }
}
