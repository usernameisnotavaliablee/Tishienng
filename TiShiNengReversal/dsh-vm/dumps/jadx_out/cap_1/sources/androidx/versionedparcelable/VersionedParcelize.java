package androidx.versionedparcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface VersionedParcelize {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    java.lang.Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    java.lang.String jetifyAs() default "";
}
