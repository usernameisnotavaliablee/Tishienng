package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface TypeConverters {
    androidx.room.BuiltInTypeConverters builtInTypeConverters() default @androidx.room.BuiltInTypeConverters;

    java.lang.Class<?>[] value() default {};
}
