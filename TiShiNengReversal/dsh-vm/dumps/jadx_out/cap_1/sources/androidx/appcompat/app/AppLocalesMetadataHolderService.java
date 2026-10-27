package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppLocalesMetadataHolderService extends android.app.Service {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getDisabledComponentFlag() {
                r0 = 512(0x200, float:7.17E-43)
                return r0
        }
    }

    public AppLocalesMetadataHolderService() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.pm.ServiceInfo getServiceInfo(@androidx.annotation.NonNull android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            int r0 = androidx.appcompat.app.AppLocalesMetadataHolderService.Api24Impl.getDisabledComponentFlag()
            r0 = r0 | 128(0x80, float:1.8E-43)
            goto Lf
        Ld:
            r0 = 640(0x280, float:8.97E-43)
        Lf:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Class<androidx.appcompat.app.AppLocalesMetadataHolderService> r3 = androidx.appcompat.app.AppLocalesMetadataHolderService.class
            r2.<init>(r4, r3)
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)
            return r4
    }

    @Override // android.app.Service
    @androidx.annotation.NonNull
    public android.os.IBinder onBind(@androidx.annotation.NonNull android.content.Intent r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
