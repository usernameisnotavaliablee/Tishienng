package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Defaults {
    private static final java.lang.Double DOUBLE_DEFAULT = null;
    private static final java.lang.Float FLOAT_DEFAULT = null;

    static {
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.google.common.base.Defaults.DOUBLE_DEFAULT = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.google.common.base.Defaults.FLOAT_DEFAULT = r0
            return
    }

    private Defaults() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T defaultValue(java.lang.Class<T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto La
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        La:
            java.lang.Class r0 = java.lang.Character.TYPE
            r1 = 0
            if (r2 != r0) goto L14
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L14:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto L1d
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L1d:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L26
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L26:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L2f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L2f:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L3a
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L3a:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L41
            java.lang.Float r2 = com.google.common.base.Defaults.FLOAT_DEFAULT
            return r2
        L41:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L48
            java.lang.Double r2 = com.google.common.base.Defaults.DOUBLE_DEFAULT
            return r2
        L48:
            r2 = 0
            return r2
    }
}
