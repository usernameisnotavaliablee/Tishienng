package com.google.android.gms.common.internal.safeparcel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface SafeParcelable extends android.os.Parcelable {

    @androidx.annotation.NonNull
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Class {
        @androidx.annotation.NonNull
        java.lang.String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Constructor {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Field {
        @androidx.annotation.NonNull
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @androidx.annotation.NonNull
        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @androidx.annotation.NonNull
        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Indicator {
        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Param {
        int id();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface RemovedParam {
        @androidx.annotation.NonNull
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @androidx.annotation.NonNull
        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface Reserved {
        @androidx.annotation.NonNull
        int[] value();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface VersionField {
        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @androidx.annotation.NonNull
        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
