package io.reactivex.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface SchedulerSupport {
    public static final java.lang.String COMPUTATION = "io.reactivex:computation";
    public static final java.lang.String CUSTOM = "custom";
    public static final java.lang.String IO = "io.reactivex:io";
    public static final java.lang.String NEW_THREAD = "io.reactivex:new-thread";
    public static final java.lang.String NONE = "none";
    public static final java.lang.String TRAMPOLINE = "io.reactivex:trampoline";

    java.lang.String value();
}
