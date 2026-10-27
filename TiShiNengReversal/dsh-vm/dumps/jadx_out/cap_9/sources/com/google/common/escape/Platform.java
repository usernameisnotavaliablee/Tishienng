package com.google.common.escape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Platform {
    private static final java.lang.ThreadLocal<char[]> DEST_TL = null;


    static {
            com.google.common.escape.Platform$1 r0 = new com.google.common.escape.Platform$1
            r0.<init>()
            com.google.common.escape.Platform.DEST_TL = r0
            return
    }

    private Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    static char[] charBufferFromThreadLocal() {
            java.lang.ThreadLocal<char[]> r0 = com.google.common.escape.Platform.DEST_TL
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            return r0
    }
}
