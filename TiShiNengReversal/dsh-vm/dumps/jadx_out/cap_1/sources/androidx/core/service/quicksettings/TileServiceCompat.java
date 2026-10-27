package androidx.core.service.quicksettings;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TileServiceCompat {
    private static androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper sTileServiceWrapper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void startActivityAndCollapse(android.service.quicksettings.TileService r0, android.content.Intent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void startActivityAndCollapse(android.service.quicksettings.TileService r0, android.app.PendingIntent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface TileServiceWrapper {
        void startActivityAndCollapse(android.app.PendingIntent r1);

        void startActivityAndCollapse(android.content.Intent r1);
    }

    private TileServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static void clearTileServiceWrapper() {
            r0 = 0
            androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static void setTileServiceWrapper(@androidx.annotation.NonNull androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper r0) {
            androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper = r0
            return
    }

    public static void startActivityAndCollapse(@androidx.annotation.NonNull android.service.quicksettings.TileService r2, @androidx.annotation.NonNull androidx.core.service.quicksettings.PendingIntentActivityWrapper r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1a
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            if (r0 == 0) goto L12
            android.app.PendingIntent r2 = r3.getPendingIntent()
            r0.startActivityAndCollapse(r2)
            return
        L12:
            android.app.PendingIntent r3 = r3.getPendingIntent()
            androidx.core.service.quicksettings.TileServiceCompat.Api34Impl.startActivityAndCollapse(r2, r3)
            return
        L1a:
            r1 = 24
            if (r0 < r1) goto L31
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            if (r0 == 0) goto L2a
            android.content.Intent r2 = r3.getIntent()
            r0.startActivityAndCollapse(r2)
            return
        L2a:
            android.content.Intent r3 = r3.getIntent()
            androidx.core.service.quicksettings.TileServiceCompat.Api24Impl.startActivityAndCollapse(r2, r3)
        L31:
            return
    }
}
