package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class SimpleCallback<V> extends xyz.adscope.common.network.simple.Callback<V, java.lang.String> {
    public SimpleCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.network.simple.Callback
    public java.lang.reflect.Type getFailed() {
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
    }

    @Override // xyz.adscope.common.network.simple.Callback
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

    @Override // xyz.adscope.common.network.simple.Callback
    public void onCancel() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.common.network.simple.Callback
    public void onEnd() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.common.network.simple.Callback
    public void onException(java.lang.Exception r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.common.network.simple.Callback
    public void onStart() {
            r0 = this;
            return
    }
}
