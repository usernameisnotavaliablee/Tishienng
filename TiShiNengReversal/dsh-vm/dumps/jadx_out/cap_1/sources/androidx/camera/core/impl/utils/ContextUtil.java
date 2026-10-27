package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContextUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        static android.content.Context createAttributionContext(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable java.lang.String r1) {
                android.content.Context r0 = r0.createAttributionContext(r1)
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static java.lang.String getAttributionTag(@androidx.annotation.NonNull android.content.Context r0) {
                java.lang.String r0 = r0.getAttributionTag()
                return r0
        }
    }

    private ContextUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Context getApplicationContext(@androidx.annotation.NonNull android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L15
            java.lang.String r3 = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getAttributionTag(r3)
            if (r3 == 0) goto L15
            android.content.Context r3 = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.createAttributionContext(r0, r3)
            return r3
        L15:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.app.Application getApplicationFromContext(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.Context r1 = getApplicationContext(r1)
        L4:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto Lf
            android.app.Application r1 = (android.app.Application) r1
            return r1
        Lf:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = getBaseContext(r1)
            goto L4
        L16:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context getBaseContext(@androidx.annotation.NonNull android.content.ContextWrapper r3) {
            android.content.Context r0 = r3.getBaseContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L15
            java.lang.String r3 = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getAttributionTag(r3)
            if (r3 == 0) goto L15
            android.content.Context r3 = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.createAttributionContext(r0, r3)
            return r3
        L15:
            return r0
    }
}
