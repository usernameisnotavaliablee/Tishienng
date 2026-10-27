package androidx.tracing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TraceApi18Impl {
    private TraceApi18Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginSection(@androidx.annotation.NonNull java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }
}
