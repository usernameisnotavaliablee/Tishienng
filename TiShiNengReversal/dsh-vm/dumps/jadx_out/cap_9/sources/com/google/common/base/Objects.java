package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Objects extends com.google.common.base.ExtraObjectsMethodsForWeb {
    private Objects() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equal(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static int hashCode(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
