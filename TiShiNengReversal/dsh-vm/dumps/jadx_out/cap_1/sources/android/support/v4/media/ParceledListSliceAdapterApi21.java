package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ParceledListSliceAdapterApi21 {
    private static java.lang.reflect.Constructor sConstructor;

    static {
            java.lang.String r0 = "android.content.pm.ParceledListSlice"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L14
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L14
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L14
            android.support.v4.media.ParceledListSliceAdapterApi21.sConstructor = r0     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    private ParceledListSliceAdapterApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Object newInstance(java.util.List<android.media.browse.MediaBrowser.MediaItem> r3) {
            java.lang.reflect.Constructor r0 = android.support.v4.media.ParceledListSliceAdapterApi21.sConstructor     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = 0
            return r3
    }
}
