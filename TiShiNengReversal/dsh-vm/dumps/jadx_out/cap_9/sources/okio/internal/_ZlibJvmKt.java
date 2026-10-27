package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class _ZlibJvmKt {
    private static final int DEFAULT_COMPRESSION = -1;

    @org.jetbrains.annotations.NotNull
    private static final byte[] EMPTY_BYTE_ARRAY = null;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            okio.internal._ZlibJvmKt.EMPTY_BYTE_ARRAY = r0
            return
    }

    public _ZlibJvmKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final long datePartsToEpochMillis(int r7, int r8, int r9, int r10, int r11, int r12) {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>()
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            int r2 = r8 + (-1)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.set(r1, r2, r3, r4, r5, r6)
            java.util.Date r7 = r0.getTime()
            long r7 = r7.getTime()
            return r7
    }

    public static final int getDEFAULT_COMPRESSION() {
            int r0 = okio.internal._ZlibJvmKt.DEFAULT_COMPRESSION
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getEMPTY_BYTE_ARRAY() {
            byte[] r0 = okio.internal._ZlibJvmKt.EMPTY_BYTE_ARRAY
            return r0
    }
}
