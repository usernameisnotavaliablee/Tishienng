package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TemplateTypeUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType = null;

        static {
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    private TemplateTypeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalZeroShutterLag.class})
    public static int getCaptureConfigTemplateType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r2, int r3) {
            int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L13
            r3 = 3
            if (r2 == r0) goto L12
            if (r2 == r3) goto L12
            return r1
        L12:
            return r3
        L13:
            if (r3 != r0) goto L17
            r2 = 5
            return r2
        L17:
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalZeroShutterLag.class})
    public static int getSessionConfigTemplateType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r2, int r3) {
            int[] r0 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L13
            r3 = 3
            if (r2 == r0) goto L12
            if (r2 == r3) goto L12
            return r1
        L12:
            return r3
        L13:
            if (r3 != r0) goto L17
            r2 = 5
            return r2
        L17:
            return r1
    }
}
