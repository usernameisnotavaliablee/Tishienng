package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AndroidLogKt {
    public AndroidLogKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ int access$getAndroidLevel(java.util.logging.LogRecord r0) {
            int r0 = getAndroidLevel(r0)
            return r0
    }

    private static final int getAndroidLevel(java.util.logging.LogRecord r3) {
            java.util.logging.Level r0 = r3.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r2 = r1.intValue()
            if (r0 <= r2) goto L12
            r3 = 5
            return r3
        L12:
            java.util.logging.Level r3 = r3.getLevel()
            int r3 = r3.intValue()
            int r0 = r1.intValue()
            if (r3 != r0) goto L22
            r3 = 4
            return r3
        L22:
            r3 = 3
            return r3
    }
}
