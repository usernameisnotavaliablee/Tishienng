package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface g<M extends java.lang.reflect.Member> {
    boolean a();

    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.reflect.Type> b();

    M c();

    @org.jetbrains.annotations.Nullable
    java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r1);

    @org.jetbrains.annotations.NotNull
    java.lang.reflect.Type getReturnType();
}
