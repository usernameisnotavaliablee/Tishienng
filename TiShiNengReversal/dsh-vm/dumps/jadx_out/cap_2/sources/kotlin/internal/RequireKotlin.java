package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@kotlin.SinceKotlin(version = "1.2")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(kotlin.internal.RequireKotlin.Container.class)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface RequireKotlin {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.TYPEALIAS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        kotlin.internal.RequireKotlin[] value();
    }

    int errorCode() default -1;

    kotlin.DeprecationLevel level() default kotlin.DeprecationLevel.ERROR;

    java.lang.String message() default "";

    java.lang.String version();

    kotlin.internal.RequireKotlinVersionKind versionKind() default kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION;
}
