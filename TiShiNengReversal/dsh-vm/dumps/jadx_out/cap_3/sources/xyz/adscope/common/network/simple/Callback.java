package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class Callback<Succeed, Failed> {
    public Callback() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.reflect.Type getFailed() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public java.lang.reflect.Type getSucceed() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public abstract void onCancel();

    public abstract void onEnd();

    public abstract void onException(java.lang.Exception r1);

    public abstract void onResponse(xyz.adscope.common.network.simple.SimpleResponse<Succeed, Failed> r1);

    public abstract void onStart();
}
