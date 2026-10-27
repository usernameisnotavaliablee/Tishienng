package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface Fts4 {
    java.lang.Class<?> contentEntity() default java.lang.Object.class;

    java.lang.String languageId() default "";

    androidx.room.FtsOptions.MatchInfo matchInfo() default androidx.room.FtsOptions.MatchInfo.FTS4;

    java.lang.String[] notIndexed() default {};

    androidx.room.FtsOptions.Order order() default androidx.room.FtsOptions.Order.ASC;

    int[] prefix() default {};

    java.lang.String tokenizer() default "simple";

    java.lang.String[] tokenizerArgs() default {};
}
