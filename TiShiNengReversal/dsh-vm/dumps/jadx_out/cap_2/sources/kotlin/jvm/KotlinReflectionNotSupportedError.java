package kotlin.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class KotlinReflectionNotSupportedError extends java.lang.Error {
    public KotlinReflectionNotSupportedError() {
            r1 = this;
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            return
    }

    public KotlinReflectionNotSupportedError(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KotlinReflectionNotSupportedError(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KotlinReflectionNotSupportedError(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
