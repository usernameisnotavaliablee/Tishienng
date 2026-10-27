package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EnvironmentCompat {

    @java.lang.Deprecated
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getExternalStorageState(java.io.File r0) {
                java.lang.String r0 = android.os.Environment.getExternalStorageState(r0)
                return r0
        }
    }

    private EnvironmentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String getStorageState(@androidx.annotation.NonNull java.io.File r0) {
            java.lang.String r0 = androidx.core.os.EnvironmentCompat.Api21Impl.getExternalStorageState(r0)
            return r0
    }
}
