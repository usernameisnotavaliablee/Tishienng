package androidx.dynamicanimation.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class FloatPropertyCompat<T> {
    final java.lang.String mPropertyName;


    public FloatPropertyCompat(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mPropertyName = r1
            return
    }

    @androidx.annotation.RequiresApi(24)
    public static <T> androidx.dynamicanimation.animation.FloatPropertyCompat<T> createFloatPropertyCompat(android.util.FloatProperty<T> r2) {
            androidx.dynamicanimation.animation.FloatPropertyCompat$1 r0 = new androidx.dynamicanimation.animation.FloatPropertyCompat$1
            java.lang.String r1 = androidx.dynamicanimation.animation.a.a(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public abstract float getValue(T r1);

    public abstract void setValue(T r1, float r2);
}
