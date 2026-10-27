package com.google.android.material.color;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ColorContrastOptions {

    @androidx.annotation.StyleRes
    private final int highContrastThemeOverlayResourceId;

    @androidx.annotation.StyleRes
    private final int mediumContrastThemeOverlayResourceId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.material.color.ColorContrastOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {

        @androidx.annotation.StyleRes
        private int highContrastThemeOverlayResourceId;

        @androidx.annotation.StyleRes
        private int mediumContrastThemeOverlayResourceId;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.color.ColorContrastOptions.Builder r0) {
                int r0 = r0.mediumContrastThemeOverlayResourceId
                return r0
        }

        static /* synthetic */ int access$100(com.google.android.material.color.ColorContrastOptions.Builder r0) {
                int r0 = r0.highContrastThemeOverlayResourceId
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.material.color.ColorContrastOptions build() {
                r2 = this;
                com.google.android.material.color.ColorContrastOptions r0 = new com.google.android.material.color.ColorContrastOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.ColorContrastOptions.Builder setHighContrastThemeOverlay(@androidx.annotation.StyleRes int r1) {
                r0 = this;
                r0.highContrastThemeOverlayResourceId = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.ColorContrastOptions.Builder setMediumContrastThemeOverlay(@androidx.annotation.StyleRes int r1) {
                r0 = this;
                r0.mediumContrastThemeOverlayResourceId = r1
                return r0
        }
    }

    private ColorContrastOptions(com.google.android.material.color.ColorContrastOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.material.color.ColorContrastOptions.Builder.access$000(r2)
            r1.mediumContrastThemeOverlayResourceId = r0
            int r2 = com.google.android.material.color.ColorContrastOptions.Builder.access$100(r2)
            r1.highContrastThemeOverlayResourceId = r2
            return
    }

    /* synthetic */ ColorContrastOptions(com.google.android.material.color.ColorContrastOptions.Builder r1, com.google.android.material.color.ColorContrastOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.StyleRes
    public int getHighContrastThemeOverlay() {
            r1 = this;
            int r0 = r1.highContrastThemeOverlayResourceId
            return r0
    }

    @androidx.annotation.StyleRes
    public int getMediumContrastThemeOverlay() {
            r1 = this;
            int r0 = r1.mediumContrastThemeOverlayResourceId
            return r0
    }
}
