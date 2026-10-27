package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum FileWriteMode extends java.lang.Enum<com.google.common.io.FileWriteMode> {
    private static final /* synthetic */ com.google.common.io.FileWriteMode[] $VALUES = null;
    public static final com.google.common.io.FileWriteMode APPEND = null;

    static {
            com.google.common.io.FileWriteMode r0 = new com.google.common.io.FileWriteMode
            java.lang.String r1 = "APPEND"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.io.FileWriteMode.APPEND = r0
            r1 = 1
            com.google.common.io.FileWriteMode[] r1 = new com.google.common.io.FileWriteMode[r1]
            r1[r2] = r0
            com.google.common.io.FileWriteMode.$VALUES = r1
            return
    }

    FileWriteMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.io.FileWriteMode valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.io.FileWriteMode> r0 = com.google.common.io.FileWriteMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.io.FileWriteMode r1 = (com.google.common.io.FileWriteMode) r1
            return r1
    }

    public static com.google.common.io.FileWriteMode[] values() {
            com.google.common.io.FileWriteMode[] r0 = com.google.common.io.FileWriteMode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.io.FileWriteMode[] r0 = (com.google.common.io.FileWriteMode[]) r0
            return r0
    }
}
