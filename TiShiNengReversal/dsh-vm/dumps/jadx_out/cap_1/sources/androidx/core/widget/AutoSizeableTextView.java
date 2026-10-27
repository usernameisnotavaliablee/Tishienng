package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface AutoSizeableTextView {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = false;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.widget.AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE = r0
            return
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull int[] r1, int r2) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);
}
