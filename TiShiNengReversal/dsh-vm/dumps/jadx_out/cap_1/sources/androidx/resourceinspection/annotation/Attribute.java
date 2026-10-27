package androidx.resourceinspection.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface Attribute {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IntMap {
        int mask() default 0;

        @androidx.annotation.NonNull
        java.lang.String name();

        int value();
    }

    @androidx.annotation.NonNull
    androidx.resourceinspection.annotation.Attribute.IntMap[] intMapping() default {};

    @androidx.annotation.NonNull
    java.lang.String value();
}
